/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IuEscritorio;

import Controlador.ControladorOperarCerrarMesa;
import Modelo.Crupier;
import Modelo.EfectoSorteo;
import Modelo.Jugador;
import Modelo.Mesa;
import Modelo.Ronda;
import Modelo.TipoApuesta;
import Vista.VistaOperarCerrarMesa;
import componente.PanelRuleta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sabrina
 */
public class OperarCerrar extends javax.swing.JFrame implements VistaOperarCerrarMesa {

    private ControladorOperarCerrarMesa controlador ;
    private TipoApuesta[] tipoApuesta;
    private Mesa mesa;
    private PanelRuleta panel;
    
    public OperarYCerrarFrame(Crupier crupier, TipoApuesta[] tipoApuesta, Mesa mesa) {
        this.mesa = mesa; 
        this.controlador = new ControladorOperarCerrarMesa(crupier, mesa, this);
        this.tipoApuesta = tipoApuesta;
        initComponents();
        incializar();
        ocultarBotones();
        mostrarBotones();
        actualizarEstadoBotones();
    }

    private void cerrarMesa(){
        controlador.cerrarMesa(mesa.getMesaId());
    }
    
    private void lanzarPagar(){
        int montoTotalApostado = 0;
        int cantidadApuestas = 0;
        int numeroRonda = Integer.parseInt(numRonda.getText());
        int balance = Integer.parseInt(balanceMesa.getText());
        String efectos = (String) comboEfectos.getSelectedItem();
        actualizarEstadoBotones();
        controlador.lanzarPagar(numeroRonda, balance, montoTotalApostado, cantidadApuestas, mesa, efectos);
    }

    
    private void actualizarEstadoBotones() {
        if (mesa.estaBloqueada()) {
            btnLanzarPagar.setEnabled(false);
            btnCerrarMesa.setEnabled(true);
        } else {
            btnLanzarPagar.setEnabled(true);
            btnCerrarMesa.setEnabled(false);
        }
    }
    
    private void ocultarBotones(){
        panel.setVisible(PanelRuleta.PRIMERA_COLUMNA, false);
        panel.setVisible(PanelRuleta.SEGUNDA_COLUMNA, false);
        panel.setVisible(PanelRuleta.TERCERA_COLUMNA, false);
        panel.setVisible(PanelRuleta.MAYOR, false);
        panel.setVisible(PanelRuleta.MENOR, false);
        panel.setVisible(PanelRuleta.COMPUESTO, false);
        panel.setVisible(PanelRuleta.PRIMO, false);
        panel.setVisible(PanelRuleta.IMPAR, false);
        panel.setVisible(PanelRuleta.PAR, false);
        panel.setVisible(PanelRuleta.ROJO, false);
        panel.setVisible(PanelRuleta.NEGRO, false);
        panel.setVisible(PanelRuleta.PRIMERA_DOCENA, false);
        panel.setVisible(PanelRuleta.SEGUNDA_DOCENA, false);
        panel.setVisible(PanelRuleta.TERCERA_DOCENA, false);
    }
    
    private void mostrarBotones(){
        for (TipoApuesta tipoApuesta : this.tipoApuesta) {
        switch (tipoApuesta.getNombre()) {
            case "Primera Dicena":
                panel.setVisible(PanelRuleta.PRIMERA_DOCENA, true);
                break;
            case "Segunda Docena":
               panel.setVisible(PanelRuleta.SEGUNDA_DOCENA, true);
                    break;
            case "Tercera Docena":
               panel.setVisible(PanelRuleta.TERCERA_DOCENA, true);
                    break;
            case "Rojo":
                panel.setVisible(PanelRuleta.ROJO, true);
                    break;
            case "Negro":
               panel.setVisible(PanelRuleta.NEGRO, true);
                    break;
            default:
                break;
        }
    }
        
         @Override
    public void mostrarDatosMesa(int saldo, int rondaId, int mesaId, ArrayList<EfectoSorteo> efectos) {
        numBalance.setText(saldo + "");
        numRonda.setText(rondaId + "");
        numRuleta.setText(mesaId + "");
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (EfectoSorteo ef : efectos) {
            model.addElement(ef.getNombre());
        }
        comboEfectoSorteo.setModel(model);
}

    
    @Override
    public void mostrarDatosDeRonda(ArrayList<Ronda> rondas) {
        DefaultTableModel modelo = (DefaultTableModel) tablaCrupier.getModel();
        modelo.setRowCount(0); // Limpia todas las filas existentes en la tabla
        int balanceAnteriorAlSorteo = 0;
        for(Ronda ronda: rondas){
            int numeroRonda = ronda.getRondaId();
            int montoTotalApuestasPerdidas = ronda.getMontoTotalPerdido();
            int montoTotalApuestasPagadas = ronda.getMontoTotalPagado();
            int balancePosteriorAlSorteo = ronda.getBalancePosterior();
           // int montoTotalApuestas = (ronda.getMontoTotalApostado());
            modelo.addRow(new Object[]{numeroRonda, balanceAnteriorAlSorteo, montoTotalApuestasPerdidas, montoTotalApuestasPagadas, balancePosteriorAlSorteo });
        
            // Actualiza el balance anterior para la próxima ronda
            balanceAnteriorAlSorteo = balancePosteriorAlSorteo;
        }
    
    }

    @Override
    public void mostrarListaUltimosLanzamientos(List<Integer> ultimosLanzamientos) {
         DefaultListModel<Integer> modelo = new DefaultListModel<>();
        for(Integer lanzamiento : ultimosLanzamientos) {
            modelo.addElement(lanzamiento);
        }
        ultimosLanzam.setModel(modelo);
    }

    @Override
    public void mostrarMensajeDeError(String message) {
     JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void ultimoNumeroSorteado(int numeroSorteado) {
       numSorteado.setText(String.valueOf(numeroSorteado));
   }

    @Override
    public void mostrarJugadoresYSaldo(ArrayList<Jugador> jugadores) {
         DefaultTableModel modelo = (DefaultTableModel) tablaJugadorSaldo.getModel();
        modelo.setRowCount(0);

        for(Jugador jugador : jugadores) {
            Object[] fila = new Object[]{jugador.getCedula(), jugador.getSaldo()};
            modelo.addRow(fila);
        }
        
    }


    private void incializar() {
        controlador.inicializar();
    }

    @Override
    public void ocultarNumeroSorteado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pausarRuleta() {
         panel.pausar();
    }

    @Override
    public void reanudarRuleta() {
        panel.reanudar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInfoRondas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaLanzamientos = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        balanceMesa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        numRonda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        numRuleta = new javax.swing.JTextField();
        btnCerrarMesa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        numApuesta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        montoApuestas = new javax.swing.JTextField();
        comboEfectos = new javax.swing.JComboBox<>();
        btnLanzarPagar = new javax.swing.JButton();
        numSorteado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaInfoRondas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ronda", "Balance Ant", "Monto Apuestas", "Apuestas perdidas", "Apuestas pagadas", "Balance post"
            }
        ));
        jScrollPane1.setViewportView(tablaInfoRondas);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Jugador", "Saldo"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setText("Ultimos Lanzamientos:");

        tablaLanzamientos.setModel(new javax.swing.AbstractListModel<Integer>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(tablaLanzamientos);

        jLabel2.setText("$");

        balanceMesa.setText("Balance de mesa");

        jLabel3.setText("Ronda");

        numRonda.setText("numRonda");

        jLabel4.setText("Ruleta");

        numRuleta.setText("numRuleta");

        btnCerrarMesa.setText("Cerrar mesa");

        jLabel5.setText("Apuestas");

        numApuesta.setText("numApuesta");

        jLabel6.setText("Monto");

        montoApuestas.setText("montoApuestas");
        montoApuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montoApuestasActionPerformed(evt);
            }
        });

        comboEfectos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnLanzarPagar.setText("Lanzar/Pagar");
        btnLanzarPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanzarPagarActionPerformed(evt);
            }
        });

        numSorteado.setText("Numero Sorteado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(balanceMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numRonda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCerrarMesa))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(montoApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboEfectos, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnLanzarPagar)
                                .addGap(41, 41, 41)
                                .addComponent(numSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 8, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(balanceMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(numRonda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(numRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarMesa))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(numApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(montoApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEfectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLanzarPagar)
                    .addComponent(numSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void montoApuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoApuestasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoApuestasActionPerformed

    private void btnLanzarPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanzarPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLanzarPagarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OperarCerrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperarCerrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperarCerrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperarCerrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperarCerrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField balanceMesa;
    private javax.swing.JButton btnCerrarMesa;
    private javax.swing.JButton btnLanzarPagar;
    private javax.swing.JComboBox<String> comboEfectos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField montoApuestas;
    private javax.swing.JTextField numApuesta;
    private javax.swing.JTextField numRonda;
    private javax.swing.JTextField numRuleta;
    private javax.swing.JTextField numSorteado;
    private javax.swing.JTable tablaInfoRondas;
    private javax.swing.JList<Integer> tablaLanzamientos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarDatosMesa(int saldo, int rondaId, int mesaId, ArrayList<EfectoSorteo> efectos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarDatosDeRonda(ArrayList<Ronda> rondas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarMensajeDeError(String message) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ultimoNumeroSorteado(int ultimo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarJugadoresYSaldo(ArrayList<Jugador> jugadores) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pausarJuego() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void reanudarJuego() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
