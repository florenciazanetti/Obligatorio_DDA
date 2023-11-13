/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package IuEscritorio;


import Vista.VistaIniciarMesa;
import Controlador.ControladorIniciarMesa;
import java.util.ArrayList;
import Modelo.Crupier;
import Modelo.Mesa;
import Modelo.TipoApuesta;
import Modelo.Usuario;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author flore
 */
 public class IniciarMesaDialog extends javax.swing.JDialog implements VistaIniciarMesa {
    
  private ControladorIniciarMesa controlador;
    private DefaultTableModel modeloTabla;

    public IniciarMesaDialog(java.awt.Frame parent, boolean modal, Crupier crupier){
        super(parent, modal);
        initComponents();
        controlador = new ControladorIniciarMesa(crupier, this);
        setTitle("Aplicación Crupier - Iniciar Mesa");
        setLocationRelativeTo(null);
      JTable listaTablaTipoApuestas = new JTable();

        // Crear un modelo de tabla personalizado
        modeloTabla = new DefaultTableModel(new Object[]{"Tipo de Apuesta", "Seleccionado"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Hacer que la celda de "Apuesta Directa" no sea editable
                if (column == 1 && getValueAt(row, 0).equals("Apuesta Directa")) {
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };
        listaTablaTipoApuestas.setModel(modeloTabla);
    }

    @Override
    public void mostrarTiposDeApuestas(ArrayList<TipoApuesta> tiposApuestas) {
        modeloTabla.setRowCount(0); // Limpiar la tabla antes de añadir filas nuevas
        for (TipoApuesta ta : tiposApuestas) {
            boolean seleccionado = ta.getNombre().equals("Apuesta Directa"); // Seleccionar siempre "Apuesta Directa"
            modeloTabla.addRow(new Object[]{ta.getNombre(), seleccionado});
        }
    }

    private void iniciarMesa() {
        ArrayList<TipoApuesta> tiposSeleccionados = new ArrayList<>();
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            if ((Boolean) modeloTabla.getValueAt(i, 1)) {
                String nombreTipoApuesta = (String) modeloTabla.getValueAt(i, 0);
                tiposSeleccionados.add(TipoApuesta.valueOf(nombreTipoApuesta));
            }
        }
        controlador.iniciarMesaConSeleccion(tiposSeleccionados);
    }

    @Override
    public void cerrarVentana() {
        setVisible(false);
        dispose();
    }

    @Override
    public void cerrarPantallaConfiguracion() {
        setVisible(false);
        dispose();
        // Otras acciones necesarias para cerrar la configuración
    }

    @Override
    public void volverALaPantallaDeLogin() {
        setVisible(false);
        dispose();
        // Implementar la lógica para volver al login
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    private void cancel() {
        controlador.volverALaPantallaDeLogin();
    }

    @Override
    public void ejecutarSiguienteCasoUso(Crupier crupier, ArrayList<TipoApuesta> tiposApuesta) {
       new OperarCerrarJDialog(crupier, tiposApuesta).setVisible(true);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTablaTipoApuestas = new javax.swing.JTable();
        btnIniciarMesa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Aplicacion Crupier - Iniciar Mesa ");

        listaTablaTipoApuestas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Tipo de apuestas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaTablaTipoApuestas.setColumnSelectionAllowed(true);
        listaTablaTipoApuestas.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        listaTablaTipoApuestas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                listaTablaTipoApuestasAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(listaTablaTipoApuestas);
        listaTablaTipoApuestas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        btnIniciarMesa.setText("Iniciar");
        btnIniciarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarMesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 105, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(btnIniciarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnIniciarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarMesaActionPerformed
    ArrayList<TipoApuesta> tiposSeleccionados = new ArrayList<>();
    for (int i = 0; i < modeloTabla.getRowCount(); i++) {
        if ((Boolean) modeloTabla.getValueAt(i, 1)) {
            String nombreTipoApuesta = (String) modeloTabla.getValueAt(i, 0);
            tiposSeleccionados.add(TipoApuesta.valueOf(nombreTipoApuesta));
        }
    }
    controlador.iniciarMesaConSeleccion(tiposSeleccionados);
}

    }//GEN-LAST:event_btnIniciarMesaActionPerformed

    private void listaTablaTipoApuestasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listaTablaTipoApuestasAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_listaTablaTipoApuestasAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaTablaTipoApuestas;
    // End of variables declaration//GEN-END:variables
    


   

  
    
  
  


  

}
