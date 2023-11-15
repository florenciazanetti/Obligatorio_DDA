/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sabrina
 */
public class OperarYCerrarFrame extends javax.swing.JFrame implements VistaOperarCerrarMesa {

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
        int balance = Integer.parseInt(numBalance.getText());
        String efectos = (String) comboEfectoSorteo.getSelectedItem();
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

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLanzarPagar = new javax.swing.JButton();
        comboEfectoSorteo = new javax.swing.JComboBox<>();
        btnCerrarMesa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCrupier = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaJugadorSaldo = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        numBalance = new java.awt.TextField();
        cdadApuestas = new javax.swing.JTextField();
        montoApuestas = new javax.swing.JTextField();
        numRonda = new javax.swing.JTextField();
        numRuleta = new javax.swing.JTextField();
        numSorteado = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        ultimosLanzam = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel8.setText("Monto:");
        getContentPane().add(jLabel8);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Ronda");
        getContentPane().add(jLabel2);

        btnLanzarPagar.setText("lanzar/pagar");
        btnLanzarPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanzarPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLanzarPagar);

        comboEfectoSorteo.setModel(JComboBox<EfectoSorteo> comboBoxEfectoSorteo = new JComboBox<>(););
        getContentPane().add(comboEfectoSorteo);

        btnCerrarMesa.setText("cerrar mesa");
        btnCerrarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarMesaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarMesa);

        tablaCrupier.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        tablaCrupier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ronda", "Balance anterior", "Apuestas", "Recolección", "Liquidacion", "Balance posterior"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaCrupier);

        getContentPane().add(jScrollPane2);

        jLabel9.setText("$-");
        getContentPane().add(jLabel9);

        tablaJugadorSaldo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaJugadorSaldo);

        getContentPane().add(jScrollPane3);

        jLabel5.setText("Ultimos lanzamientos");
        getContentPane().add(jLabel5);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Ruleta");
        getContentPane().add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("#");
        getContentPane().add(jLabel4);

        jLabel7.setText("Apuestas:");
        getContentPane().add(jLabel7);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("#");
        getContentPane().add(jLabel1);

        numBalance.setText("textField1");
        numBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numBalanceActionPerformed(evt);
            }
        });
        getContentPane().add(numBalance);

        cdadApuestas.setText("num Apuestas");
        getContentPane().add(cdadApuestas);

        montoApuestas.setText("monto Apuestas");
        getContentPane().add(montoApuestas);

        numRonda.setText("num Ronda");
        getContentPane().add(numRonda);

        numRuleta.setText("num Ruleta");
        getContentPane().add(numRuleta);

        numSorteado.setText("num sorteado");
        getContentPane().add(numSorteado);

        jScrollPane4.setViewportView(ultimosLanzam);

        getContentPane().add(jScrollPane4);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarMesaActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres cerrar la mesa?", "Confirmar Cierre", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                cerrarMesa();
            }
    }//GEN-LAST:event_btnCerrarMesaActionPerformed

    private void numBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numBalanceActionPerformed

    private void btnLanzarPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanzarPagarActionPerformed
         if (btnLanzarPagar.getText().equals("Lanzar")) {
            lanzarPagar();
         }
    }//GEN-LAST:event_btnLanzarPagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarMesa;
    private javax.swing.JButton btnLanzarPagar;
    private javax.swing.JTextField cdadApuestas;
    private javax.swing.JComboBox<String> comboEfectoSorteo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField montoApuestas;
    private java.awt.TextField numBalance;
    private javax.swing.JTextField numRonda;
    private javax.swing.JTextField numRuleta;
    private javax.swing.JTextField numSorteado;
    private javax.swing.JTable tablaCrupier;
    private javax.swing.JTable tablaJugadorSaldo;
    private javax.swing.JList<Integer> ultimosLanzam;
    // End of variables declaration//GEN-END:variables
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
    public void mostrarListaUltimosLanzamientos(ArrayList<Integer> ultimosLanzamientos) {
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

    @Override
    public void pausarJuego() {
        panel.pausar();
    }

    @Override
    public void reanudarJuego() {
        panel.reanudar();
    }

    private void incializar() {
        controlador.inicializar();
    }

    @Override
    public void mostrarListaUltimosLanzamientos(List<Integer> ultimosLanzamientos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ocultarNumeroSorteado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pausarRuleta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void reanudarRuleta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
   



  
}
