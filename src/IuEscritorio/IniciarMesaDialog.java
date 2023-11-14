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
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author flore
 */
 public class IniciarMesaDialog extends javax.swing.JDialog implements VistaIniciarMesa {
    
    private ControladorIniciarMesa controlador;
    private Mesa mesa;
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



// En tu método para iniciar la mesa
    private void iniciarMesa() {
        Map<String, TipoApuesta> nombreATipoMap = new HashMap<>();
        ArrayList<TipoApuesta> tiposSeleccionados = new ArrayList<>();
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            if ((Boolean) modeloTabla.getValueAt(i, 1)) {
                String nombreTipoApuesta = (String) modeloTabla.getValueAt(i, 0);
                TipoApuesta tipo = nombreATipoMap.get(nombreTipoApuesta);
                if (tipo != null) {
                    tiposSeleccionados.add(tipo);
                }
            }
        }
        controlador.iniciarMesaConSeleccion(tiposSeleccionados);
}
    
    @Override
    public ArrayList<TipoApuesta> obtenerTiposApuestaSeleccionados() {
        ArrayList<TipoApuesta> tiposSeleccionados = new ArrayList<>();
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            if ((Boolean) modeloTabla.getValueAt(i, 1)) {
                String nombreTipoApuesta = (String) modeloTabla.getValueAt(i, 0);
                TipoApuesta tipo = controlador.getTipoApuestaPorNombre(nombreTipoApuesta);
                if (tipo != null) {
                    tiposSeleccionados.add(tipo);
                }
            }
        }
        return tiposSeleccionados;
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
    public void ejecutarSiguienteCasoUso(Crupier crupier, TipoApuesta[] tiposApuesta, Mesa mesa) {
       new OperarYCerrarFrame(crupier, tiposApuesta, mesa).setVisible(true);

    }
    
    @Override
    public void mostrarTiposDeApuestas(ArrayList<TipoApuesta> tiposApuestas, String apuestaDirecta) {
        modeloTabla.setRowCount(0); // Limpiar la tabla antes de añadir nuevos datos
        for (TipoApuesta tipo : tiposApuestas) {
            boolean seleccionado = tipo.getNombre().equals(apuestaDirecta); // Seleccionar siempre "Apuesta Directa"
            modeloTabla.addRow(new Object[]{tipo.getNombre(), seleccionado});
        }
    // Opcional: Hacer que la fila de "Apuesta Directa" sea no editable si lo deseas
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTablaTipoApuestas = new javax.swing.JTable();
        btnIniciarMesa1 = new javax.swing.JButton();

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

        btnIniciarMesa1.setText("Iniciar");
        btnIniciarMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarMesa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(btnIniciarMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIniciarMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaTablaTipoApuestasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listaTablaTipoApuestasAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_listaTablaTipoApuestasAncestorAdded

    private void btnIniciarMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarMesa1ActionPerformed
      iniciarMesa();
    }//GEN-LAST:event_btnIniciarMesa1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarMesa1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaTablaTipoApuestas;
    // End of variables declaration//GEN-END:variables



    


   

  
    
  
  


  

}
