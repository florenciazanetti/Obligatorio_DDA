/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package IuEscritorio;

import Common.Observable;
import Common.Observador;
import Controlador.ControladorUnirseAMesa;
import Modelo.Eventos;
import Modelo.Fachada;
import Modelo.Jugador;
import Modelo.Mesa;
import Vista.VistaUnirseAMesa;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author flore
 */
public class UnirseAMesaDialog extends javax.swing.JDialog implements VistaUnirseAMesa {
    
    private ControladorUnirseAMesa controlador;
    private Jugador jugador;
    
    public UnirseAMesaDialog(java.awt.Frame parent, boolean modal, Jugador jugador) {
        initComponents();
        controlador = new ControladorUnirseAMesa(jugador, this);
        setTitle("Unirse a Mesa");   
        setLocationRelativeTo(null);
        controlador.cargarMesasAbiertas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnUnirseAmesa = new javax.swing.JButton();
        btnLogOff = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        listaMesasAbiertas = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Aplicación Jugador - Unirse a Mesa");

        btnUnirseAmesa.setText("Unirse");
        btnUnirseAmesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirseAmesaActionPerformed(evt);
            }
        });

        btnLogOff.setText("Log Off");
        btnLogOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOffActionPerformed(evt);
            }
        });

        jLabel2.setText("Mesas Abiertas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnUnirseAmesa)
                        .addGap(82, 82, 82)
                        .addComponent(btnLogOff))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(listaMesasAbiertas, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaMesasAbiertas, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUnirseAmesa)
                    .addComponent(btnLogOff))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnirseAmesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirseAmesaActionPerformed
        unirseAMesaSeleccionada();
    }//GEN-LAST:event_btnUnirseAmesaActionPerformed

    private void btnLogOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOffActionPerformed
        logOut();
        
    }//GEN-LAST:event_btnLogOffActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOff;
    private javax.swing.JButton btnUnirseAmesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<Mesa> listaMesasAbiertas;
    // End of variables declaration//GEN-END:variables

   private void unirseAMesaSeleccionada() {
        Mesa mesaSeleccionada = listaMesasAbiertas.getSelectedValue();
        if (mesaSeleccionada != null) {
          boolean sePuedeUnirAMesa = controlador.unirJugadorAMesa(mesaSeleccionada, jugador);
          if(sePuedeUnirAMesa){
              new JugarAbandonarPanelJugador(jugador, mesaSeleccionada).setVisible(true);
           } else {
            JOptionPane.showMessageDialog(this, "Seleccione una mesa para unirse.");
            }
        }
    }
   
    @Override
    public void logOut(){
        jugador.setConectado(false);
       //Fachada.getInstancia().logout(jugador);
         this.dispose();
    }
    
    @Override
    public void mostrarMesasAbiertas(ArrayList<Mesa> mesasAbiertas) {
        DefaultListModel<Mesa> model = new DefaultListModel<>();
        for (Mesa mesa : mesasAbiertas) {
            model.addElement(mesa);
        }
        listaMesasAbiertas.setModel(model);
    }
   
    @Override
    public void mostrarMensajeError(String mensaje) {
         JOptionPane.showMessageDialog(this, mensaje);
    }
    
}

  
