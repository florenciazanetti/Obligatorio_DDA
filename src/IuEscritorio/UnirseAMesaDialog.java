/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package IuEscritorio;

import Controlador.ControladorUnirseAMesa;
import Modelo.Jugador;
import Modelo.Mesa;
import Vista.VistaUnirseAMesa;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author flore
 */
public class UnirseAMesaDialog extends javax.swing.JDialog implements VistaUnirseAMesa {
    
    private ControladorUnirseAMesa controlador;
    /**
     * Creates new form UnirseAMesaDialog
     */
    public UnirseAMesaDialog(java.awt.Frame parent, boolean modal, Jugador jugador) {
        super(parent, modal);
        initComponents();
    }
    public UnirseAMesaDialog(Jugador jugador, Mesa mesa) {
        initComponents();
        controlador = new ControladorUnirseAMesa(jugador, mesa, this);
        setTitle("Unirse a Mesa");   
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnUnirseAmesa = new javax.swing.JButton();
        btnLogOff = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaMesasAbiertas = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Aplicación Jugador - Unirse a Mesa");

        btnUnirseAmesa.setText("Unirse");
        btnUnirseAmesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirseAmesaActionPerformed(evt);
            }
        });

        btnLogOff.setText("Lof Off");
        btnLogOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOffActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listaMesasAbiertas);

        jLabel2.setText("Mesas Abiertas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnUnirseAmesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOff)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 335, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUnirseAmesa)
                            .addComponent(btnLogOff))
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnirseAmesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirseAmesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUnirseAmesaActionPerformed

    private void btnLogOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOffActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnLogOffActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOff;
    private javax.swing.JButton btnUnirseAmesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaMesasAbiertas;
    // End of variables declaration//GEN-END:variables

   
       
    
    
    private void logOut(){
    
    }

    //@Override
   // public void mostrarMesasAbiertas(ArrayList<Mesa> mesasAbiertas) {
       
        //DefaultTableModel model = (DefaultTableModel) tablaMesasAbiertas.getModel();
        
        //model.addColumn("Tipos de Apuesta");
        //tablaMesasAbiertas.setModel(model);
        
        //for(Mesa mesa : mesasAbiertas){
            //Object[] rowData = {mesa.getMesaId()};
            //model.addRow(rowData);
        //}
    //}
    
    @Override
    public void mostrarMesasAbiertas(ArrayList<Mesa> mesasAbiertas) {
        if (!mesasAbiertas.isEmpty()) {
            listaMesasAbiertas.setListData((String[]) mesasAbiertas.toArray());
        } else {
            listaMesasAbiertas.setListData((String[]) new ArrayList<Mesa>().toArray());
        }
    }
    
    public btnUnirseAmesa(){
        
    }
}

  
