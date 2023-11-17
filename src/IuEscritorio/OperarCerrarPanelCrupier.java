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
import Modelo.MesaRuletaException;
import Modelo.Ronda;
import Modelo.TipoApuesta;
import Vista.VistaOperarCerrarMesa;
import componente.PanelRuleta;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sabrina
 */
public class OperarCerrarPanelCrupier extends javax.swing.JFrame implements VistaOperarCerrarMesa {

    private ControladorOperarCerrarMesa controlador ;
    private TipoApuesta[] tipoApuesta;
    private Mesa mesa;
    private PanelRuleta panel;
    
    public OperarCerrarPanelCrupier(Crupier crupier, TipoApuesta[] tipoApuesta, Mesa mesa) {
        this.mesa = mesa; 
        this.controlador = new ControladorOperarCerrarMesa(crupier, mesa, this);
        this.tipoApuesta = tipoApuesta;
        initComponents();
        ocultarBotones();
        mostrarBotones();
        actualizarEstadoBotones();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablaJugadores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInfoRondas = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaUltimosLanzamientos = new javax.swing.JList<>();
        panelRuleta = new componente.PanelRuleta();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaJugadores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaJugadores);

        jLabel1.setText("Ultimos Lanzamientos:");

        jLabel2.setText("$");

        balanceMesa.setText("Balance de mesa");

        jLabel3.setText("Ronda");

        numRonda.setText("numRonda");

        jLabel4.setText("Ruleta");

        numRuleta.setText("numRuleta");

        btnCerrarMesa.setText("Cerrar mesa");
        btnCerrarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarMesaActionPerformed(evt);
            }
        });

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

        tablaInfoRondas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ronda", "Bce Anterior", "Apuestas", "Recolección", "Liquidación", "Bce Posterior"
            }
        ));
        tablaInfoRondas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tablaInfoRondas);

        jScrollPane3.setViewportView(tablaUltimosLanzamientos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(numSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(78, 78, 78)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 202, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(panelRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void montoApuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoApuestasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoApuestasActionPerformed

    private void btnLanzarPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanzarPagarActionPerformed
      lanzarPagar();
    }//GEN-LAST:event_btnLanzarPagarActionPerformed

    private void btnCerrarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarMesaActionPerformed
        cerrarMesa();
    }//GEN-LAST:event_btnCerrarMesaActionPerformed

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
    private javax.swing.JTextField montoApuestas;
    private javax.swing.JTextField numApuesta;
    private javax.swing.JTextField numRonda;
    private javax.swing.JTextField numRuleta;
    private javax.swing.JTextField numSorteado;
    private componente.PanelRuleta panelRuleta;
    private javax.swing.JTable tablaInfoRondas;
    private javax.swing.JTable tablaJugadores;
    private javax.swing.JList<Integer> tablaUltimosLanzamientos;
    // End of variables declaration//GEN-END:variables

    private void cerrarMesa(){
        try {
            controlador.cerrarMesa(mesa.getMesaId());
        } catch (MesaRuletaException ex) {
            Logger.getLogger(OperarCerrarPanelCrupier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void lanzarPagar(){
        int montoTotalApostado = 0;
        int cantidadApuestas = 0;
        int numeroRonda = Integer.parseInt(numRonda.getText());
        int balance = Integer.parseInt(balanceMesa.getText());
        String efectos = (String) comboEfectos.getSelectedItem();
        actualizarEstadoBotones();
        mesa.bloquearMesa();
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

    @Override
    public void pausarRuleta() {
         panel.pausar();
    }

    @Override
    public void reanudarRuleta() {
        panel.reanudar();
    }
    
    @Override
    public void mostrarDatosMesa(int saldo, int rondaId, int mesaId, ArrayList<EfectoSorteo> efectos) {
        numRonda.setText(rondaId + "");
        numRuleta.setText(mesaId + "");
        balanceMesa.setText(saldo + "");
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (EfectoSorteo ef : efectos) {
            model.addElement(ef.getNombre());
        }
        comboEfectos.setModel(model);
    }

    @Override
    public void ultimoNumeroSorteado(int ultimo) {
        numSorteado.setText(String.valueOf(ultimo));
    }

    @Override
    public void mostrarJugadoresYSaldo(ArrayList<Jugador> jugadores) {
        DefaultTableModel modelo = (DefaultTableModel) tablaJugadores.getModel();
        modelo.setRowCount(0); // Limpia todas las filas existentes en la tabla

        for (Jugador jugador : jugadores) {
            String nombreJugador = jugador.getNombreCompleto(); 
            int saldo = jugador.getSaldo(); 
            modelo.addRow(new Object[]{nombreJugador, saldo});
        }
    }

     @Override
    public void mostrarMensajeDeError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void mostrarListaUltimosLanzamientos(List<Integer> ultimosLanzamientos) {
        DefaultListModel<Integer> lista = new DefaultListModel<>();
            for (Integer numero : ultimosLanzamientos) {
                lista.addElement(numero);
            }
            tablaUltimosLanzamientos.setModel(lista);
        }

    @Override
    public void mostrarDatosRonda(ArrayList<Ronda> rondas) {
        DefaultTableModel modelo = (DefaultTableModel) tablaInfoRondas.getModel();
        modelo.setRowCount(0); // Limpia todas las filas existentes en la tabla
        int balanceAnteriorAlSorteo = 0;
        for(Ronda ronda: rondas){
            int numeroRonda = ronda.getRondaId();
            int montoTotalApuestasPerdidas = ronda.getMontoTotalPerdido();
            int montoTotalApuestasPagadas = ronda.getMontoTotalPagado();
            int balancePosteriorAlSorteo = ronda.getBalancePosterior();
            modelo.addRow(new Object[]{numeroRonda, balanceAnteriorAlSorteo, montoTotalApuestasPerdidas, montoTotalApuestasPagadas, balancePosteriorAlSorteo });
            balanceAnteriorAlSorteo = balancePosteriorAlSorteo;
        }
    }

    @Override
    public void ocultarNumeroSorteado() {
        numSorteado.setText("N/A");
    }


    @Override
    public void mostrarMontoApostado(int montoTotalApostado) {
        montoApuestas.setText(String.valueOf(montoTotalApostado));
    }

    @Override
    public void obtenerCdadApuestasPorRonda(int montoTotalApostado) {
        numApuesta.setText(String.valueOf(montoTotalApostado));
    }
    
}

