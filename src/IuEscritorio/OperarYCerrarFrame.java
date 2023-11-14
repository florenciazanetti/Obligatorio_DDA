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
import Modelo.ModoAleatorioCompleto;
import Modelo.Ronda;
import Modelo.TipoApuesta;
import Vista.VistaOperarCerrarMesa;
import componente.PanelRuleta;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
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
    
    public OperarYCerrarFrame(Crupier crupier, TipoApuesta[] tipoApuesta, Mesa mesa) {
        this.mesa = mesa; 
        this.controlador = new ControladorOperarCerrarMesa(crupier, mesa, this);
        this.tipoApuesta = tipoApuesta;
        initComponents();
        inicializar();
        inicializarEfectoSorteo(); 
        ocultarBotones();
        mostrarBotones();
    }

    private void cerrarMesa(){
        controlador.cerrarMesa(mesa.getMesaId());
    }
    
    private int lanzar(){
        controlador.lanzar();
    }
    
    private void pagar(){
        controlador.pagar();
    }
    
    private void ocultarBotones(){
        r.setVisible(PanelRuleta.PRIMERA_COLUMNA, false);
        r.setVisible(PanelRuleta.SEGUNDA_COLUMNA, false);
        r.setVisible(PanelRuleta.TERCERA_COLUMNA, false);
         r.setVisible(PanelRuleta.MAYOR, false);
        r.setVisible(PanelRuleta.MENOR, false);
        r.setVisible(PanelRuleta.COMPUESTO, false);
        r.setVisible(PanelRuleta.PRIMO, false);
        r.setVisible(PanelRuleta.IMPAR, false);
        r.setVisible(PanelRuleta.PAR, false);
        r.setVisible(PanelRuleta.ROJO, false);
        r.setVisible(PanelRuleta.NEGRO, false);
        r.setVisible(PanelRuleta.PRIMERA_DOCENA, false);
        r.setVisible(PanelRuleta.SEGUNDA_DOCENA, false);
        r.setVisible(PanelRuleta.TERCERA_DOCENA, false);
    }
    
    private void mostrarBotones(){
        for (TipoApuesta tipoApuesta : this.tipoApuesta) {
        switch (tipoApuesta.getNombre()) {
            case "Primera Dicena":
                r.setVisible(PanelRuleta.PRIMERA_DOCENA, true);
                break;
            case "Segunda Docena":
               r.setVisible(PanelRuleta.SEGUNDA_DOCENA, true);
                    break;
            case "Tercera Docena":
               r.setVisible(PanelRuleta.TERCERA_DOCENA, true);
                    break;
            case "Rojo":
                r.setVisible(PanelRuleta.ROJO, true);
                    break;
            case "Negro":
               r.setVisible(PanelRuleta.NEGRO, true);
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
        r = new componente.PanelRuleta();
        jScrollPane4 = new javax.swing.JScrollPane();
        ultimosLanzam = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel8.setText("Monto:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Ronda");

        btnLanzarPagar.setText("jButton1");
        btnLanzarPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanzarPagarActionPerformed(evt);
            }
        });

        comboEfectoSorteo.setModel(JComboBox<EfectoSorteo> comboBoxEfectoSorteo = new JComboBox<>(););

        btnCerrarMesa.setText("jButton2");
        btnCerrarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarMesaActionPerformed(evt);
            }
        });

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

        jLabel9.setText("$-");

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

        jLabel5.setText("Ultimos lanzamientos");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Ruleta");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("#");

        jLabel7.setText("Apuestas:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("#");

        numBalance.setText("textField1");
        numBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numBalanceActionPerformed(evt);
            }
        });

        cdadApuestas.setText("jTextField1");

        montoApuestas.setText("jTextField1");

        numRonda.setText("jTextField1");

        numRuleta.setText("jTextField1");

        numSorteado.setText("jTextField1");

        jScrollPane4.setViewportView(ultimosLanzam);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(cdadApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(montoApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(numBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(355, 355, 355)
                .addComponent(numRonda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                .addComponent(numRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel7)
                                    .addGap(108, 108, 108)
                                    .addComponent(jLabel8)))
                            .addGap(157, 157, 157)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(comboEfectoSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(btnLanzarPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(106, 106, 106)
                                    .addComponent(btnCerrarMesa)))
                            .addGap(59, 59, 59))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(40, 40, 40)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(numBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numRonda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdadApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(montoApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(btnCerrarMesa)
                        .addComponent(jLabel9)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(comboEfectoSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(btnLanzarPagar)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)))
        );

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
            lanzar();
        } else {
            pagar();
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
    private componente.PanelRuleta r;
    private javax.swing.JTable tablaCrupier;
    private javax.swing.JTable tablaJugadorSaldo;
    private javax.swing.JList<Integer> ultimosLanzam;
    // End of variables declaration//GEN-END:variables
    
    private void inicializarEfectoSorteo() {
        /*for (EfectoSorteo efecto : EfectoSorteo) {
            comboEfectoSorteo.addItem(efecto);
        }*/
}

    
    public void inicializar(){
        int balanceSaldo = Integer.parseInt(numBalance.getText());
        int nroDeRonda = Integer.parseInt(numRonda.getText());
        int montoTotalApuestas = Integer.parseInt(montoApuestas.getText());
        int cantidadApuestas = Integer.parseInt(cdadApuestas.getText());
        EfectoSorteo efecto = (EfectoSorteo) comboEfectoSorteo.getSelectedItem();
        int numeroSorteado = Integer.parseInt(numSorteado.getText());
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
            int montoTotalApuestas = (ronda.getMontoTotalApostado());
            modelo.addRow(new Object[]{numeroRonda, balanceAnteriorAlSorteo, montoTotalApuestas, montoTotalApuestasPerdidas, montoTotalApuestasPagadas, balancePosteriorAlSorteo });
        
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

  
   



  
}
