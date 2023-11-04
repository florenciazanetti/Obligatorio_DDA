/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package IuEscritorio;

import Controlador.ControladorOperarCerrarMesa;
import Modelo.Crupier;
import java.util.List;
import java.util.ArrayList;
import Modelo.EfectoSorteo;
import Modelo.Jugador;
import Modelo.Mesa;
import Modelo.Ronda;
import Vista.VistaOperarCerrarMesa;
import javax.swing.JComboBox;
/**
 *
 * @author sabrina
 */
public class OperarCerrarJDialog extends javax.swing.JDialog implements VistaOperarCerrarMesa {
    
    private ControladorOperarCerrarMesa controlador ;
    private EfectoSorteo efectoSorteo;
    private List<Escuchador> handlers;
     
    public OperarCerrarJDialog(java.awt.Frame parent, boolean modal, Crupier crupier) {
        super(parent, modal);
        initComponents();
    }

    
    private void cerrarMesa(){
        controlador.cerrarMesa();
    }
    
    private int lanzar(){
        return ;
    }
    
    private void pagar(){
    }
    
    @Override
    public void mostrarBalanceDeMesa(int balanceMesa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarNumeroDeRonda(int numeroDeRonda) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarNumeroDeRuleta(int numeroRuleta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarListaDeEfectos(ArrayList<EfectoSorteo> efectos) {
      for (EfectoSorteo ef : efectos) {
            comboBoxEfectoSorteo.addItem(ef);
        }
    }
    @Override
    public void mostrarCantidadApuestas(int cantidadApuestas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarMontoTotalApostado(int montoTotal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void motrarMesaConDistribucionApuestasAcadaTipoDeApuestas(Mesa mesaConDistribucionApuestas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarListaUltimosLanzamientos(ArrayList<Ronda> ultimosLanzamientos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarRondasEfectuadas(ArrayList<Ronda> rondasEfectuadas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     @Override
    public void mostrarMensajeDeError(String message) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarNumeroSorteado(int numSorteado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarRondas(Mesa mesa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarJugadoresEnLaMesa(ArrayList<Jugador> jugadoresMesa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saldoDeJugadores(int saldo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

      @Override
    public void mostrarBalanceDeMesa(double balanceMesa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     private void triggerCellSelected(int universalCellCode) {
        handlers.forEach(h -> h.celdaSeleccionada(universalCellCode));
    }

  

    public interface Escuchador {

        public void celdaSeleccionada(int universalCellCode);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        b_0 = new javax.swing.JButton();
        b_2 = new javax.swing.JButton();
        b_1 = new javax.swing.JButton();
        b_3 = new javax.swing.JButton();
        b_4 = new javax.swing.JButton();
        b_5 = new javax.swing.JButton();
        b_6 = new javax.swing.JButton();
        b_7 = new javax.swing.JButton();
        b_8 = new javax.swing.JButton();
        b_9 = new javax.swing.JButton();
        b_10 = new javax.swing.JButton();
        b_11 = new javax.swing.JButton();
        b_12 = new javax.swing.JButton();
        b_13 = new javax.swing.JButton();
        b_14 = new javax.swing.JButton();
        b_15 = new javax.swing.JButton();
        b_16 = new javax.swing.JButton();
        b_17 = new javax.swing.JButton();
        b_18 = new javax.swing.JButton();
        b_19 = new javax.swing.JButton();
        b_20 = new javax.swing.JButton();
        b_21 = new javax.swing.JButton();
        b_22 = new javax.swing.JButton();
        b_23 = new javax.swing.JButton();
        b_24 = new javax.swing.JButton();
        b_25 = new javax.swing.JButton();
        b_26 = new javax.swing.JButton();
        b_27 = new javax.swing.JButton();
        b_28 = new javax.swing.JButton();
        b_29 = new javax.swing.JButton();
        b_30 = new javax.swing.JButton();
        b_31 = new javax.swing.JButton();
        b_32 = new javax.swing.JButton();
        b_33 = new javax.swing.JButton();
        b_34 = new javax.swing.JButton();
        b_35 = new javax.swing.JButton();
        b_36 = new javax.swing.JButton();
        b_3c = new javax.swing.JButton();
        b_2c = new javax.swing.JButton();
        b_1c = new javax.swing.JButton();
        b_1d = new javax.swing.JButton();
        b_2d = new javax.swing.JButton();
        b_3d = new javax.swing.JButton();
        b_par = new javax.swing.JButton();
        b_impar = new javax.swing.JButton();
        b_negro = new javax.swing.JButton();
        b_rojo = new javax.swing.JButton();
        b_mayor = new javax.swing.JButton();
        b_menor = new javax.swing.JButton();
        b_primo = new javax.swing.JButton();
        b_compuesto = new javax.swing.JButton();
        c3 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        c9 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        c8 = new javax.swing.JLabel();
        c10 = new javax.swing.JLabel();
        c11 = new javax.swing.JLabel();
        c12 = new javax.swing.JLabel();
        c13 = new javax.swing.JLabel();
        c14 = new javax.swing.JLabel();
        c15 = new javax.swing.JLabel();
        c16 = new javax.swing.JLabel();
        c17 = new javax.swing.JLabel();
        c18 = new javax.swing.JLabel();
        c19 = new javax.swing.JLabel();
        c20 = new javax.swing.JLabel();
        c21 = new javax.swing.JLabel();
        c22 = new javax.swing.JLabel();
        c23 = new javax.swing.JLabel();
        c24 = new javax.swing.JLabel();
        c25 = new javax.swing.JLabel();
        c26 = new javax.swing.JLabel();
        c27 = new javax.swing.JLabel();
        c28 = new javax.swing.JLabel();
        c29 = new javax.swing.JLabel();
        c30 = new javax.swing.JLabel();
        c31 = new javax.swing.JLabel();
        c32 = new javax.swing.JLabel();
        c33 = new javax.swing.JLabel();
        c34 = new javax.swing.JLabel();
        c35 = new javax.swing.JLabel();
        c36 = new javax.swing.JLabel();
        c1d = new javax.swing.JLabel();
        c2d = new javax.swing.JLabel();
        c3d = new javax.swing.JLabel();
        cp = new javax.swing.JLabel();
        ci = new javax.swing.JLabel();
        cmen = new javax.swing.JLabel();
        cmay = new javax.swing.JLabel();
        cn = new javax.swing.JLabel();
        cr = new javax.swing.JLabel();
        c1c = new javax.swing.JLabel();
        c2c = new javax.swing.JLabel();
        c3c = new javax.swing.JLabel();
        cprimo = new javax.swing.JLabel();
        ccompuesto = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c0 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboEfectoSorteo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCrupier = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaJugadorSaldo = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ultimosLanzamientos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnLanzarPagar = new javax.swing.JButton();
        numRonda = new javax.swing.JTextField();
        btnCerrarMesa = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        montoBalance = new java.awt.Label();
        montoApuestas = new java.awt.Label();
        cantApuestas = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("#");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Ronda");

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel2.setFocusable(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_0.setBackground(new java.awt.Color(0, 153, 0));
        b_0.setForeground(new java.awt.Color(255, 255, 255));
        b_0.setText("0");
        b_0.setBorder(null);
        b_0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_0.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_0ActionPerformed(evt);
            }
        });
        jPanel2.add(b_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 40, 160));

        b_2.setBackground(new java.awt.Color(51, 51, 51));
        b_2.setForeground(new java.awt.Color(255, 255, 255));
        b_2.setText("2");
        b_2.setBorder(null);
        b_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_2.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_2ActionPerformed(evt);
            }
        });
        jPanel2.add(b_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 40, 30));

        b_1.setBackground(new java.awt.Color(153, 0, 0));
        b_1.setForeground(new java.awt.Color(255, 255, 255));
        b_1.setText("1");
        b_1.setBorder(null);
        b_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_1.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_1ActionPerformed(evt);
            }
        });
        jPanel2.add(b_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 134, 40, 30));

        b_3.setBackground(new java.awt.Color(153, 0, 0));
        b_3.setForeground(new java.awt.Color(255, 255, 255));
        b_3.setText("3");
        b_3.setBorder(null);
        b_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_3.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_3ActionPerformed(evt);
            }
        });
        jPanel2.add(b_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 6, 40, 30));

        b_4.setBackground(new java.awt.Color(51, 51, 51));
        b_4.setForeground(new java.awt.Color(255, 255, 255));
        b_4.setText("4");
        b_4.setBorder(null);
        b_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_4.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_4ActionPerformed(evt);
            }
        });
        jPanel2.add(b_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 134, 40, 30));

        b_5.setBackground(new java.awt.Color(153, 0, 0));
        b_5.setForeground(new java.awt.Color(255, 255, 255));
        b_5.setText("5");
        b_5.setBorder(null);
        b_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_5.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_5ActionPerformed(evt);
            }
        });
        jPanel2.add(b_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 40, 30));

        b_6.setBackground(new java.awt.Color(51, 51, 51));
        b_6.setForeground(new java.awt.Color(255, 255, 255));
        b_6.setText("6");
        b_6.setBorder(null);
        b_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_6.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_6ActionPerformed(evt);
            }
        });
        jPanel2.add(b_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 6, 40, 30));

        b_7.setBackground(new java.awt.Color(153, 0, 0));
        b_7.setForeground(new java.awt.Color(255, 255, 255));
        b_7.setText("7");
        b_7.setBorder(null);
        b_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_7.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_7ActionPerformed(evt);
            }
        });
        jPanel2.add(b_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 134, 40, 30));

        b_8.setBackground(new java.awt.Color(51, 51, 51));
        b_8.setForeground(new java.awt.Color(255, 255, 255));
        b_8.setText("8");
        b_8.setBorder(null);
        b_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_8.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_8ActionPerformed(evt);
            }
        });
        jPanel2.add(b_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 40, 30));

        b_9.setBackground(new java.awt.Color(153, 0, 0));
        b_9.setForeground(new java.awt.Color(255, 255, 255));
        b_9.setText("9");
        b_9.setBorder(null);
        b_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_9.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_9ActionPerformed(evt);
            }
        });
        jPanel2.add(b_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 6, 40, 30));

        b_10.setBackground(new java.awt.Color(51, 51, 51));
        b_10.setForeground(new java.awt.Color(255, 255, 255));
        b_10.setText("10");
        b_10.setBorder(null);
        b_10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_10.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_10ActionPerformed(evt);
            }
        });
        jPanel2.add(b_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 134, 40, 30));

        b_11.setBackground(new java.awt.Color(51, 51, 51));
        b_11.setForeground(new java.awt.Color(255, 255, 255));
        b_11.setText("11");
        b_11.setBorder(null);
        b_11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_11.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_11ActionPerformed(evt);
            }
        });
        jPanel2.add(b_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 40, 30));

        b_12.setBackground(new java.awt.Color(153, 0, 0));
        b_12.setForeground(new java.awt.Color(255, 255, 255));
        b_12.setText("12");
        b_12.setBorder(null);
        b_12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_12.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_12ActionPerformed(evt);
            }
        });
        jPanel2.add(b_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 6, 40, 30));

        b_13.setBackground(new java.awt.Color(51, 51, 51));
        b_13.setForeground(new java.awt.Color(255, 255, 255));
        b_13.setText("13");
        b_13.setBorder(null);
        b_13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_13.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_13ActionPerformed(evt);
            }
        });
        jPanel2.add(b_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 134, 40, 30));

        b_14.setBackground(new java.awt.Color(153, 0, 0));
        b_14.setForeground(new java.awt.Color(255, 255, 255));
        b_14.setText("14");
        b_14.setBorder(null);
        b_14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_14.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_14ActionPerformed(evt);
            }
        });
        jPanel2.add(b_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 40, 30));

        b_15.setBackground(new java.awt.Color(51, 51, 51));
        b_15.setForeground(new java.awt.Color(255, 255, 255));
        b_15.setText("15");
        b_15.setBorder(null);
        b_15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_15.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_15ActionPerformed(evt);
            }
        });
        jPanel2.add(b_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 6, 40, 30));

        b_16.setBackground(new java.awt.Color(153, 0, 0));
        b_16.setForeground(new java.awt.Color(255, 255, 255));
        b_16.setText("16");
        b_16.setBorder(null);
        b_16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_16.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_16ActionPerformed(evt);
            }
        });
        jPanel2.add(b_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 134, 40, 30));

        b_17.setBackground(new java.awt.Color(51, 51, 51));
        b_17.setForeground(new java.awt.Color(255, 255, 255));
        b_17.setText("17");
        b_17.setBorder(null);
        b_17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_17.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_17ActionPerformed(evt);
            }
        });
        jPanel2.add(b_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 40, 30));

        b_18.setBackground(new java.awt.Color(153, 0, 0));
        b_18.setForeground(new java.awt.Color(255, 255, 255));
        b_18.setText("18");
        b_18.setBorder(null);
        b_18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_18.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_18ActionPerformed(evt);
            }
        });
        jPanel2.add(b_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 6, 40, 30));

        b_19.setBackground(new java.awt.Color(153, 0, 0));
        b_19.setForeground(new java.awt.Color(255, 255, 255));
        b_19.setText("19");
        b_19.setBorder(null);
        b_19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_19.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_19ActionPerformed(evt);
            }
        });
        jPanel2.add(b_19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 134, 40, 30));

        b_20.setBackground(new java.awt.Color(51, 51, 51));
        b_20.setForeground(new java.awt.Color(255, 255, 255));
        b_20.setText("20");
        b_20.setBorder(null);
        b_20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_20.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_20ActionPerformed(evt);
            }
        });
        jPanel2.add(b_20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 40, 30));

        b_21.setBackground(new java.awt.Color(153, 0, 0));
        b_21.setForeground(new java.awt.Color(255, 255, 255));
        b_21.setText("21");
        b_21.setBorder(null);
        b_21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_21.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_21ActionPerformed(evt);
            }
        });
        jPanel2.add(b_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 6, 40, 30));

        b_22.setBackground(new java.awt.Color(51, 51, 51));
        b_22.setForeground(new java.awt.Color(255, 255, 255));
        b_22.setText("22");
        b_22.setBorder(null);
        b_22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_22.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_22ActionPerformed(evt);
            }
        });
        jPanel2.add(b_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 134, 40, 30));

        b_23.setBackground(new java.awt.Color(153, 0, 0));
        b_23.setForeground(new java.awt.Color(255, 255, 255));
        b_23.setText("23");
        b_23.setBorder(null);
        b_23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_23.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_23ActionPerformed(evt);
            }
        });
        jPanel2.add(b_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 40, 30));

        b_24.setBackground(new java.awt.Color(51, 51, 51));
        b_24.setForeground(new java.awt.Color(255, 255, 255));
        b_24.setText("24");
        b_24.setBorder(null);
        b_24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_24.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_24ActionPerformed(evt);
            }
        });
        jPanel2.add(b_24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 6, 40, 30));

        b_25.setBackground(new java.awt.Color(153, 0, 0));
        b_25.setForeground(new java.awt.Color(255, 255, 255));
        b_25.setText("25");
        b_25.setBorder(null);
        b_25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_25.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_25ActionPerformed(evt);
            }
        });
        jPanel2.add(b_25, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 134, 40, 30));

        b_26.setBackground(new java.awt.Color(51, 51, 51));
        b_26.setForeground(new java.awt.Color(255, 255, 255));
        b_26.setText("26");
        b_26.setBorder(null);
        b_26.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_26.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_26ActionPerformed(evt);
            }
        });
        jPanel2.add(b_26, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 40, 30));

        b_27.setBackground(new java.awt.Color(153, 0, 0));
        b_27.setForeground(new java.awt.Color(255, 255, 255));
        b_27.setText("27");
        b_27.setBorder(null);
        b_27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_27.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_27ActionPerformed(evt);
            }
        });
        jPanel2.add(b_27, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 6, 40, 30));

        b_28.setBackground(new java.awt.Color(51, 51, 51));
        b_28.setForeground(new java.awt.Color(255, 255, 255));
        b_28.setText("28");
        b_28.setBorder(null);
        b_28.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_28.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_28ActionPerformed(evt);
            }
        });
        jPanel2.add(b_28, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 134, 40, 30));

        b_29.setBackground(new java.awt.Color(51, 51, 51));
        b_29.setForeground(new java.awt.Color(255, 255, 255));
        b_29.setText("29");
        b_29.setBorder(null);
        b_29.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_29.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_29ActionPerformed(evt);
            }
        });
        jPanel2.add(b_29, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 40, 30));

        b_30.setBackground(new java.awt.Color(153, 0, 0));
        b_30.setForeground(new java.awt.Color(255, 255, 255));
        b_30.setText("30");
        b_30.setBorder(null);
        b_30.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_30.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_30ActionPerformed(evt);
            }
        });
        jPanel2.add(b_30, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 6, 40, 30));

        b_31.setBackground(new java.awt.Color(51, 51, 51));
        b_31.setForeground(new java.awt.Color(255, 255, 255));
        b_31.setText("31");
        b_31.setBorder(null);
        b_31.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_31.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_31ActionPerformed(evt);
            }
        });
        jPanel2.add(b_31, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 134, 40, 30));

        b_32.setBackground(new java.awt.Color(153, 0, 0));
        b_32.setForeground(new java.awt.Color(255, 255, 255));
        b_32.setText("32");
        b_32.setBorder(null);
        b_32.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_32.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_32ActionPerformed(evt);
            }
        });
        jPanel2.add(b_32, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 40, 30));

        b_33.setBackground(new java.awt.Color(51, 51, 51));
        b_33.setForeground(new java.awt.Color(255, 255, 255));
        b_33.setText("33");
        b_33.setBorder(null);
        b_33.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_33.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_33ActionPerformed(evt);
            }
        });
        jPanel2.add(b_33, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 6, 40, 30));

        b_34.setBackground(new java.awt.Color(153, 0, 0));
        b_34.setForeground(new java.awt.Color(255, 255, 255));
        b_34.setText("34");
        b_34.setBorder(null);
        b_34.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_34.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_34ActionPerformed(evt);
            }
        });
        jPanel2.add(b_34, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 134, 40, 30));

        b_35.setBackground(new java.awt.Color(51, 51, 51));
        b_35.setForeground(new java.awt.Color(255, 255, 255));
        b_35.setText("35");
        b_35.setBorder(null);
        b_35.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_35.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_35ActionPerformed(evt);
            }
        });
        jPanel2.add(b_35, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 40, 30));

        b_36.setBackground(new java.awt.Color(153, 0, 0));
        b_36.setForeground(new java.awt.Color(255, 255, 255));
        b_36.setText("36");
        b_36.setBorder(null);
        b_36.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_36.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_36ActionPerformed(evt);
            }
        });
        jPanel2.add(b_36, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 6, 40, 30));

        b_3c.setText("3 col.");
        b_3c.setBorder(null);
        b_3c.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_3c.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_3c.setPreferredSize(new java.awt.Dimension(47, 25));
        b_3c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_3cActionPerformed(evt);
            }
        });
        jPanel2.add(b_3c, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 5, 70, 30));

        b_2c.setText("2 col.");
        b_2c.setBorder(null);
        b_2c.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_2c.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_2c.setPreferredSize(new java.awt.Dimension(47, 35));
        b_2c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_2cActionPerformed(evt);
            }
        });
        jPanel2.add(b_2c, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 70, 30));

        b_1c.setText("1 col.");
        b_1c.setBorder(null);
        b_1c.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_1c.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_1c.setPreferredSize(new java.awt.Dimension(47, 35));
        b_1c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_1cActionPerformed(evt);
            }
        });
        jPanel2.add(b_1c, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 134, 70, 30));

        b_1d.setText("1 doc.");
        b_1d.setBorder(null);
        b_1d.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_1d.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_1d.setPreferredSize(new java.awt.Dimension(47, 30));
        b_1d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_1dActionPerformed(evt);
            }
        });
        jPanel2.add(b_1d, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 198, 190, 30));

        b_2d.setText("2 doc.");
        b_2d.setBorder(null);
        b_2d.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_2d.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_2d.setPreferredSize(new java.awt.Dimension(47, 30));
        b_2d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_2dActionPerformed(evt);
            }
        });
        jPanel2.add(b_2d, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 198, 190, 30));

        b_3d.setText("3 doc.");
        b_3d.setBorder(null);
        b_3d.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_3d.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_3d.setPreferredSize(new java.awt.Dimension(47, 30));
        b_3d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_3dActionPerformed(evt);
            }
        });
        jPanel2.add(b_3d, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 198, 190, 30));

        b_par.setText("Pares");
        b_par.setBorder(null);
        b_par.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_par.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_par.setPreferredSize(new java.awt.Dimension(47, 30));
        b_par.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_parActionPerformed(evt);
            }
        });
        jPanel2.add(b_par, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 262, 90, 30));

        b_impar.setText("Impares");
        b_impar.setBorder(null);
        b_impar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_impar.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_impar.setPreferredSize(new java.awt.Dimension(47, 30));
        b_impar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_imparActionPerformed(evt);
            }
        });
        jPanel2.add(b_impar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 262, 90, 30));

        b_negro.setBackground(new java.awt.Color(51, 51, 51));
        b_negro.setForeground(new java.awt.Color(255, 255, 255));
        b_negro.setBorder(null);
        b_negro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_negro.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_negro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_negroActionPerformed(evt);
            }
        });
        jPanel2.add(b_negro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 262, 90, 30));

        b_rojo.setBackground(new java.awt.Color(153, 0, 0));
        b_rojo.setForeground(new java.awt.Color(255, 255, 255));
        b_rojo.setBorder(null);
        b_rojo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_rojo.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_rojoActionPerformed(evt);
            }
        });
        jPanel2.add(b_rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 262, 90, 30));

        b_mayor.setText("Mayores");
        b_mayor.setBorder(null);
        b_mayor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_mayor.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_mayor.setPreferredSize(new java.awt.Dimension(35, 30));
        b_mayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mayorActionPerformed(evt);
            }
        });
        jPanel2.add(b_mayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 262, 90, 30));

        b_menor.setText("Menores");
        b_menor.setBorder(null);
        b_menor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_menor.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_menor.setPreferredSize(new java.awt.Dimension(35, 30));
        b_menor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_menorActionPerformed(evt);
            }
        });
        jPanel2.add(b_menor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 262, 90, 30));

        b_primo.setText("Primos");
        b_primo.setBorder(null);
        b_primo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_primo.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_primo.setPreferredSize(new java.awt.Dimension(35, 30));
        b_primo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_primoActionPerformed(evt);
            }
        });
        jPanel2.add(b_primo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 198, 70, 30));

        b_compuesto.setText("Compuestos");
        b_compuesto.setBorder(null);
        b_compuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_compuesto.setMargin(new java.awt.Insets(2, 0, 3, 0));
        b_compuesto.setPreferredSize(new java.awt.Dimension(35, 30));
        b_compuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_compuestoActionPerformed(evt);
            }
        });
        jPanel2.add(b_compuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 262, 70, 30));

        c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c3.setText("500");
        c3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c3.setIconTextGap(0);
        c3.setMaximumSize(new java.awt.Dimension(80, 80));
        c3.setMinimumSize(new java.awt.Dimension(80, 80));
        c3.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 24, 40, 40));

        c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c6.setText("500");
        c6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c6.setIconTextGap(0);
        c6.setMaximumSize(new java.awt.Dimension(80, 80));
        c6.setMinimumSize(new java.awt.Dimension(80, 80));
        c6.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 24, 40, 40));

        c9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c9.setText("500");
        c9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c9.setIconTextGap(0);
        c9.setMaximumSize(new java.awt.Dimension(80, 80));
        c9.setMinimumSize(new java.awt.Dimension(80, 80));
        c9.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 24, 40, 40));

        c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c4.setText("500");
        c4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c4.setIconTextGap(0);
        c4.setMaximumSize(new java.awt.Dimension(80, 80));
        c4.setMinimumSize(new java.awt.Dimension(80, 80));
        c4.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 152, 40, 40));

        c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c5.setText("500");
        c5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c5.setIconTextGap(0);
        c5.setMaximumSize(new java.awt.Dimension(80, 80));
        c5.setMinimumSize(new java.awt.Dimension(80, 80));
        c5.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 88, 40, 40));

        c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c7.setText("500");
        c7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c7.setIconTextGap(0);
        c7.setMaximumSize(new java.awt.Dimension(80, 80));
        c7.setMinimumSize(new java.awt.Dimension(80, 80));
        c7.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 152, 40, 40));

        c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c8.setText("500");
        c8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c8.setIconTextGap(0);
        c8.setMaximumSize(new java.awt.Dimension(80, 80));
        c8.setMinimumSize(new java.awt.Dimension(80, 80));
        c8.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 88, 40, 40));

        c10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c10.setText("500");
        c10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c10.setIconTextGap(0);
        c10.setMaximumSize(new java.awt.Dimension(80, 80));
        c10.setMinimumSize(new java.awt.Dimension(80, 80));
        c10.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c10, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 152, 40, 40));

        c11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c11.setText("500");
        c11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c11.setIconTextGap(0);
        c11.setMaximumSize(new java.awt.Dimension(80, 80));
        c11.setMinimumSize(new java.awt.Dimension(80, 80));
        c11.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c11, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 88, 40, 40));

        c12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c12.setText("500");
        c12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c12.setIconTextGap(0);
        c12.setMaximumSize(new java.awt.Dimension(80, 80));
        c12.setMinimumSize(new java.awt.Dimension(80, 80));
        c12.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c12, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 24, 40, 40));

        c13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c13.setText("500");
        c13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c13.setIconTextGap(0);
        c13.setMaximumSize(new java.awt.Dimension(80, 80));
        c13.setMinimumSize(new java.awt.Dimension(80, 80));
        c13.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c13, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 152, 40, 40));

        c14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c14.setText("500");
        c14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c14.setIconTextGap(0);
        c14.setMaximumSize(new java.awt.Dimension(80, 80));
        c14.setMinimumSize(new java.awt.Dimension(80, 80));
        c14.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c14, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 88, 40, 40));

        c15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c15.setText("500");
        c15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c15.setIconTextGap(0);
        c15.setMaximumSize(new java.awt.Dimension(80, 80));
        c15.setMinimumSize(new java.awt.Dimension(80, 80));
        c15.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c15, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 24, 40, 40));

        c16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c16.setText("500");
        c16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c16.setIconTextGap(0);
        c16.setMaximumSize(new java.awt.Dimension(80, 80));
        c16.setMinimumSize(new java.awt.Dimension(80, 80));
        c16.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c16, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 152, 40, 40));

        c17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c17.setText("500");
        c17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c17.setIconTextGap(0);
        c17.setMaximumSize(new java.awt.Dimension(80, 80));
        c17.setMinimumSize(new java.awt.Dimension(80, 80));
        c17.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c17, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 88, 40, 40));

        c18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c18.setText("500");
        c18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c18.setIconTextGap(0);
        c18.setMaximumSize(new java.awt.Dimension(80, 80));
        c18.setMinimumSize(new java.awt.Dimension(80, 80));
        c18.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c18, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 24, 40, 40));

        c19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c19.setText("500");
        c19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c19.setIconTextGap(0);
        c19.setMaximumSize(new java.awt.Dimension(80, 80));
        c19.setMinimumSize(new java.awt.Dimension(80, 80));
        c19.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c19, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 152, 40, 40));

        c20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c20.setText("500");
        c20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c20.setIconTextGap(0);
        c20.setMaximumSize(new java.awt.Dimension(80, 80));
        c20.setMinimumSize(new java.awt.Dimension(80, 80));
        c20.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c20, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 88, 40, 40));

        c21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c21.setText("500");
        c21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c21.setIconTextGap(0);
        c21.setMaximumSize(new java.awt.Dimension(80, 80));
        c21.setMinimumSize(new java.awt.Dimension(80, 80));
        c21.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c21, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 24, 40, 40));

        c22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c22.setText("500");
        c22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c22.setIconTextGap(0);
        c22.setMaximumSize(new java.awt.Dimension(80, 80));
        c22.setMinimumSize(new java.awt.Dimension(80, 80));
        c22.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c22, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 152, 40, 40));

        c23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c23.setText("500");
        c23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c23.setIconTextGap(0);
        c23.setMaximumSize(new java.awt.Dimension(80, 80));
        c23.setMinimumSize(new java.awt.Dimension(80, 80));
        c23.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c23, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 88, 40, 40));

        c24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c24.setText("500");
        c24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c24.setIconTextGap(0);
        c24.setMaximumSize(new java.awt.Dimension(80, 80));
        c24.setMinimumSize(new java.awt.Dimension(80, 80));
        c24.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c24, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 24, 40, 40));

        c25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c25.setText("500");
        c25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c25.setIconTextGap(0);
        c25.setMaximumSize(new java.awt.Dimension(80, 80));
        c25.setMinimumSize(new java.awt.Dimension(80, 80));
        c25.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c25, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 152, 40, 40));

        c26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c26.setText("500");
        c26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c26.setIconTextGap(0);
        c26.setMaximumSize(new java.awt.Dimension(80, 80));
        c26.setMinimumSize(new java.awt.Dimension(80, 80));
        c26.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c26, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 88, 40, 40));

        c27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c27.setText("500");
        c27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c27.setIconTextGap(0);
        c27.setMaximumSize(new java.awt.Dimension(80, 80));
        c27.setMinimumSize(new java.awt.Dimension(80, 80));
        c27.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c27, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 24, 40, 40));

        c28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c28.setText("500");
        c28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c28.setIconTextGap(0);
        c28.setMaximumSize(new java.awt.Dimension(80, 80));
        c28.setMinimumSize(new java.awt.Dimension(80, 80));
        c28.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c28, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 152, 40, 40));

        c29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c29.setText("500");
        c29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c29.setIconTextGap(0);
        c29.setMaximumSize(new java.awt.Dimension(80, 80));
        c29.setMinimumSize(new java.awt.Dimension(80, 80));
        c29.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c29, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 88, 40, 40));

        c30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c30.setText("500");
        c30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c30.setIconTextGap(0);
        c30.setMaximumSize(new java.awt.Dimension(80, 80));
        c30.setMinimumSize(new java.awt.Dimension(80, 80));
        c30.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c30, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 24, 40, 40));

        c31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c31.setText("500");
        c31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c31.setIconTextGap(0);
        c31.setMaximumSize(new java.awt.Dimension(80, 80));
        c31.setMinimumSize(new java.awt.Dimension(80, 80));
        c31.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c31, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 152, 40, 40));

        c32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c32.setText("500");
        c32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c32.setIconTextGap(0);
        c32.setMaximumSize(new java.awt.Dimension(80, 80));
        c32.setMinimumSize(new java.awt.Dimension(80, 80));
        c32.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c32, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 88, 40, 40));

        c33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c33.setText("500");
        c33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c33.setIconTextGap(0);
        c33.setMaximumSize(new java.awt.Dimension(80, 80));
        c33.setMinimumSize(new java.awt.Dimension(80, 80));
        c33.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c33, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 24, 40, 40));

        c34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c34.setText("500");
        c34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c34.setIconTextGap(0);
        c34.setMaximumSize(new java.awt.Dimension(80, 80));
        c34.setMinimumSize(new java.awt.Dimension(80, 80));
        c34.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c34, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 152, 40, 40));

        c35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c35.setText("500");
        c35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c35.setIconTextGap(0);
        c35.setMaximumSize(new java.awt.Dimension(80, 80));
        c35.setMinimumSize(new java.awt.Dimension(80, 80));
        c35.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c35, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 88, 40, 40));

        c36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c36.setText("500");
        c36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c36.setIconTextGap(0);
        c36.setMaximumSize(new java.awt.Dimension(80, 80));
        c36.setMinimumSize(new java.awt.Dimension(80, 80));
        c36.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c36, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 24, 40, 40));

        c1d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c1d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c1d.setText("500");
        c1d.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c1d.setIconTextGap(0);
        c1d.setMaximumSize(new java.awt.Dimension(80, 80));
        c1d.setMinimumSize(new java.awt.Dimension(80, 80));
        c1d.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c1d, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 216, 40, 40));

        c2d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c2d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c2d.setText("500");
        c2d.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c2d.setIconTextGap(0);
        c2d.setMaximumSize(new java.awt.Dimension(80, 80));
        c2d.setMinimumSize(new java.awt.Dimension(80, 80));
        c2d.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c2d, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 216, 40, 40));

        c3d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c3d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c3d.setText("500");
        c3d.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c3d.setIconTextGap(0);
        c3d.setMaximumSize(new java.awt.Dimension(80, 80));
        c3d.setMinimumSize(new java.awt.Dimension(80, 80));
        c3d.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c3d, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 216, 40, 40));

        cp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        cp.setText("500");
        cp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cp.setIconTextGap(0);
        cp.setMaximumSize(new java.awt.Dimension(80, 80));
        cp.setMinimumSize(new java.awt.Dimension(80, 80));
        cp.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 280, 40, 40));

        ci.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        ci.setText("500");
        ci.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ci.setIconTextGap(0);
        ci.setMaximumSize(new java.awt.Dimension(80, 80));
        ci.setMinimumSize(new java.awt.Dimension(80, 80));
        ci.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 280, 40, 40));

        cmen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cmen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        cmen.setText("500");
        cmen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmen.setIconTextGap(0);
        cmen.setMaximumSize(new java.awt.Dimension(80, 80));
        cmen.setMinimumSize(new java.awt.Dimension(80, 80));
        cmen.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(cmen, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 280, 40, 40));

        cmay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cmay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        cmay.setText("500");
        cmay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmay.setIconTextGap(0);
        cmay.setMaximumSize(new java.awt.Dimension(80, 80));
        cmay.setMinimumSize(new java.awt.Dimension(80, 80));
        cmay.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(cmay, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 280, 40, 40));

        cn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        cn.setText("500");
        cn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cn.setIconTextGap(0);
        cn.setMaximumSize(new java.awt.Dimension(80, 80));
        cn.setMinimumSize(new java.awt.Dimension(80, 80));
        cn.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 280, 40, 40));

        cr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        cr.setText("500");
        cr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cr.setIconTextGap(0);
        cr.setMaximumSize(new java.awt.Dimension(80, 80));
        cr.setMinimumSize(new java.awt.Dimension(80, 80));
        cr.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(cr, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 280, 40, 40));

        c1c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c1c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c1c.setText("500");
        c1c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c1c.setIconTextGap(0);
        c1c.setMaximumSize(new java.awt.Dimension(80, 80));
        c1c.setMinimumSize(new java.awt.Dimension(80, 80));
        c1c.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c1c, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 152, 40, 40));

        c2c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c2c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c2c.setText("500");
        c2c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c2c.setIconTextGap(0);
        c2c.setMaximumSize(new java.awt.Dimension(80, 80));
        c2c.setMinimumSize(new java.awt.Dimension(80, 80));
        c2c.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c2c, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 88, 40, 40));

        c3c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c3c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c3c.setText("500");
        c3c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c3c.setIconTextGap(0);
        c3c.setMaximumSize(new java.awt.Dimension(80, 80));
        c3c.setMinimumSize(new java.awt.Dimension(80, 80));
        c3c.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c3c, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 24, 40, 40));

        cprimo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cprimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        cprimo.setText("500");
        cprimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cprimo.setIconTextGap(0);
        cprimo.setMaximumSize(new java.awt.Dimension(80, 80));
        cprimo.setMinimumSize(new java.awt.Dimension(80, 80));
        cprimo.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(cprimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 216, 40, 40));

        ccompuesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ccompuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        ccompuesto.setText("500");
        ccompuesto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ccompuesto.setIconTextGap(0);
        ccompuesto.setMaximumSize(new java.awt.Dimension(80, 80));
        ccompuesto.setMinimumSize(new java.awt.Dimension(80, 80));
        ccompuesto.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(ccompuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 280, 40, 40));

        c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c2.setText("500");
        c2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c2.setIconTextGap(0);
        c2.setMaximumSize(new java.awt.Dimension(80, 80));
        c2.setMinimumSize(new java.awt.Dimension(80, 80));
        c2.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 88, 40, 40));

        c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c1.setText("500");
        c1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c1.setIconTextGap(0);
        c1.setMaximumSize(new java.awt.Dimension(80, 80));
        c1.setMinimumSize(new java.awt.Dimension(80, 80));
        c1.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 152, 40, 40));

        c0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente/coin.gif"))); // NOI18N
        c0.setText("500");
        c0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c0.setIconTextGap(0);
        c0.setMaximumSize(new java.awt.Dimension(80, 80));
        c0.setMinimumSize(new java.awt.Dimension(80, 80));
        c0.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(c0, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 152, 40, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("#");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Ronda");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("#");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Ruleta");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        comboEfectoSorteo.setModel(JComboBox<EfectoSorteo> comboBoxEfectoSorteo = new JComboBox<>(););

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

        ultimosLanzamientos.setText("jLabel7");

        jLabel7.setText("Apuestas:");

        jLabel8.setText("Monto:");

        btnLanzarPagar.setText("jButton1");

        numRonda.setText("jTextField1");

        btnCerrarMesa.setText("jButton2");

        jLabel9.setText("$-");

        montoBalance.setText("label1");

        montoApuestas.setText("label1");

        cantApuestas.setText("label2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ultimosLanzamientos))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(montoBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(montoApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numRonda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrarMesa)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(numRonda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCerrarMesa)
                        .addComponent(jLabel9))
                    .addComponent(montoBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboEfectoSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(btnLanzarPagar)
                            .addComponent(montoApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(ultimosLanzamientos))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_compuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_compuestoActionPerformed
        triggerCellSelected(50);
    }//GEN-LAST:event_b_compuestoActionPerformed

    private void b_primoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_primoActionPerformed
        triggerCellSelected(49);
    }//GEN-LAST:event_b_primoActionPerformed

    private void b_menorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_menorActionPerformed
        triggerCellSelected(45);
    }//GEN-LAST:event_b_menorActionPerformed

    private void b_mayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mayorActionPerformed
        triggerCellSelected(46);
    }//GEN-LAST:event_b_mayorActionPerformed

    private void b_rojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_rojoActionPerformed
        triggerCellSelected(43);
    }//GEN-LAST:event_b_rojoActionPerformed

    private void b_negroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_negroActionPerformed
        triggerCellSelected(44);
    }//GEN-LAST:event_b_negroActionPerformed

    private void b_imparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_imparActionPerformed
        triggerCellSelected(48);
    }//GEN-LAST:event_b_imparActionPerformed

    private void b_parActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_parActionPerformed
        triggerCellSelected(47);
    }//GEN-LAST:event_b_parActionPerformed

    private void b_3dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_3dActionPerformed
        triggerCellSelected(42);
    }//GEN-LAST:event_b_3dActionPerformed

    private void b_2dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_2dActionPerformed
        triggerCellSelected(41);
    }//GEN-LAST:event_b_2dActionPerformed

    private void b_1dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_1dActionPerformed
        triggerCellSelected(40);
    }//GEN-LAST:event_b_1dActionPerformed

    private void b_1cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_1cActionPerformed
        triggerCellSelected(39);
    }//GEN-LAST:event_b_1cActionPerformed

    private void b_2cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_2cActionPerformed
        triggerCellSelected(38);
    }//GEN-LAST:event_b_2cActionPerformed

    private void b_3cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_3cActionPerformed
        triggerCellSelected(37);
    }//GEN-LAST:event_b_3cActionPerformed

    private void b_36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_36ActionPerformed
        triggerCellSelected(36);
    }//GEN-LAST:event_b_36ActionPerformed

    private void b_35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_35ActionPerformed
        triggerCellSelected(35);
    }//GEN-LAST:event_b_35ActionPerformed

    private void b_34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_34ActionPerformed
        triggerCellSelected(34);
    }//GEN-LAST:event_b_34ActionPerformed

    private void b_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_33ActionPerformed
        triggerCellSelected(33);
    }//GEN-LAST:event_b_33ActionPerformed

    private void b_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_32ActionPerformed
        triggerCellSelected(32);
    }//GEN-LAST:event_b_32ActionPerformed

    private void b_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_31ActionPerformed
        triggerCellSelected(31);
    }//GEN-LAST:event_b_31ActionPerformed

    private void b_30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_30ActionPerformed
        triggerCellSelected(30);
    }//GEN-LAST:event_b_30ActionPerformed

    private void b_29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_29ActionPerformed
        triggerCellSelected(29);
    }//GEN-LAST:event_b_29ActionPerformed

    private void b_28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_28ActionPerformed
        triggerCellSelected(28);
    }//GEN-LAST:event_b_28ActionPerformed

    private void b_27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_27ActionPerformed
        triggerCellSelected(27);
    }//GEN-LAST:event_b_27ActionPerformed

    private void b_26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_26ActionPerformed
        triggerCellSelected(26);
    }//GEN-LAST:event_b_26ActionPerformed

    private void b_25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_25ActionPerformed
        triggerCellSelected(25);
    }//GEN-LAST:event_b_25ActionPerformed

    private void b_24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_24ActionPerformed
        triggerCellSelected(24);
    }//GEN-LAST:event_b_24ActionPerformed

    private void b_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_23ActionPerformed
        triggerCellSelected(23);
    }//GEN-LAST:event_b_23ActionPerformed

    private void b_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_22ActionPerformed
        triggerCellSelected(22);
    }//GEN-LAST:event_b_22ActionPerformed

    private void b_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_21ActionPerformed
        triggerCellSelected(21);
    }//GEN-LAST:event_b_21ActionPerformed

    private void b_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_20ActionPerformed
        triggerCellSelected(20);
    }//GEN-LAST:event_b_20ActionPerformed

    private void b_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_19ActionPerformed
        triggerCellSelected(19);
    }//GEN-LAST:event_b_19ActionPerformed

    private void b_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_18ActionPerformed
        triggerCellSelected(18);
    }//GEN-LAST:event_b_18ActionPerformed

    private void b_17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_17ActionPerformed
        triggerCellSelected(17);
    }//GEN-LAST:event_b_17ActionPerformed

    private void b_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_16ActionPerformed
        triggerCellSelected(16);
    }//GEN-LAST:event_b_16ActionPerformed

    private void b_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_15ActionPerformed
        triggerCellSelected(15);
    }//GEN-LAST:event_b_15ActionPerformed

    private void b_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_14ActionPerformed
        triggerCellSelected(14);
    }//GEN-LAST:event_b_14ActionPerformed

    private void b_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_13ActionPerformed
        triggerCellSelected(13);
    }//GEN-LAST:event_b_13ActionPerformed

    private void b_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_12ActionPerformed
        triggerCellSelected(12);
    }//GEN-LAST:event_b_12ActionPerformed

    private void b_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_11ActionPerformed
        triggerCellSelected(11);
    }//GEN-LAST:event_b_11ActionPerformed

    private void b_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_10ActionPerformed
        triggerCellSelected(10);
    }//GEN-LAST:event_b_10ActionPerformed

    private void b_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_9ActionPerformed
        triggerCellSelected(9);
    }//GEN-LAST:event_b_9ActionPerformed

    private void b_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_8ActionPerformed
        triggerCellSelected(8);
    }//GEN-LAST:event_b_8ActionPerformed

    private void b_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_7ActionPerformed
        triggerCellSelected(7);
    }//GEN-LAST:event_b_7ActionPerformed

    private void b_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_6ActionPerformed
        triggerCellSelected(6);
    }//GEN-LAST:event_b_6ActionPerformed

    private void b_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_5ActionPerformed
        triggerCellSelected(5);
    }//GEN-LAST:event_b_5ActionPerformed

    private void b_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_4ActionPerformed
        triggerCellSelected(4);
    }//GEN-LAST:event_b_4ActionPerformed

    private void b_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_3ActionPerformed
        triggerCellSelected(3);
    }//GEN-LAST:event_b_3ActionPerformed

    private void b_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_1ActionPerformed
        triggerCellSelected(1);
    }//GEN-LAST:event_b_1ActionPerformed

    private void b_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_2ActionPerformed
        triggerCellSelected(2);
    }//GEN-LAST:event_b_2ActionPerformed

    private void b_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_0ActionPerformed
        triggerCellSelected(0);
    }//GEN-LAST:event_b_0ActionPerformed

   
  JComboBox<EfectoSorteo> comboBoxEfectoSorteo = new JComboBox<>();
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_0;
    private javax.swing.JButton b_1;
    private javax.swing.JButton b_10;
    private javax.swing.JButton b_11;
    private javax.swing.JButton b_12;
    private javax.swing.JButton b_13;
    private javax.swing.JButton b_14;
    private javax.swing.JButton b_15;
    private javax.swing.JButton b_16;
    private javax.swing.JButton b_17;
    private javax.swing.JButton b_18;
    private javax.swing.JButton b_19;
    private javax.swing.JButton b_1c;
    private javax.swing.JButton b_1d;
    private javax.swing.JButton b_2;
    private javax.swing.JButton b_20;
    private javax.swing.JButton b_21;
    private javax.swing.JButton b_22;
    private javax.swing.JButton b_23;
    private javax.swing.JButton b_24;
    private javax.swing.JButton b_25;
    private javax.swing.JButton b_26;
    private javax.swing.JButton b_27;
    private javax.swing.JButton b_28;
    private javax.swing.JButton b_29;
    private javax.swing.JButton b_2c;
    private javax.swing.JButton b_2d;
    private javax.swing.JButton b_3;
    private javax.swing.JButton b_30;
    private javax.swing.JButton b_31;
    private javax.swing.JButton b_32;
    private javax.swing.JButton b_33;
    private javax.swing.JButton b_34;
    private javax.swing.JButton b_35;
    private javax.swing.JButton b_36;
    private javax.swing.JButton b_3c;
    private javax.swing.JButton b_3d;
    private javax.swing.JButton b_4;
    private javax.swing.JButton b_5;
    private javax.swing.JButton b_6;
    private javax.swing.JButton b_7;
    private javax.swing.JButton b_8;
    private javax.swing.JButton b_9;
    private javax.swing.JButton b_compuesto;
    private javax.swing.JButton b_impar;
    private javax.swing.JButton b_mayor;
    private javax.swing.JButton b_menor;
    private javax.swing.JButton b_negro;
    private javax.swing.JButton b_par;
    private javax.swing.JButton b_primo;
    private javax.swing.JButton b_rojo;
    private javax.swing.JButton btnCerrarMesa;
    private javax.swing.JButton btnLanzarPagar;
    private javax.swing.JLabel c0;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c10;
    private javax.swing.JLabel c11;
    private javax.swing.JLabel c12;
    private javax.swing.JLabel c13;
    private javax.swing.JLabel c14;
    private javax.swing.JLabel c15;
    private javax.swing.JLabel c16;
    private javax.swing.JLabel c17;
    private javax.swing.JLabel c18;
    private javax.swing.JLabel c19;
    private javax.swing.JLabel c1c;
    private javax.swing.JLabel c1d;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c20;
    private javax.swing.JLabel c21;
    private javax.swing.JLabel c22;
    private javax.swing.JLabel c23;
    private javax.swing.JLabel c24;
    private javax.swing.JLabel c25;
    private javax.swing.JLabel c26;
    private javax.swing.JLabel c27;
    private javax.swing.JLabel c28;
    private javax.swing.JLabel c29;
    private javax.swing.JLabel c2c;
    private javax.swing.JLabel c2d;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c30;
    private javax.swing.JLabel c31;
    private javax.swing.JLabel c32;
    private javax.swing.JLabel c33;
    private javax.swing.JLabel c34;
    private javax.swing.JLabel c35;
    private javax.swing.JLabel c36;
    private javax.swing.JLabel c3c;
    private javax.swing.JLabel c3d;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c6;
    private javax.swing.JLabel c7;
    private javax.swing.JLabel c8;
    private javax.swing.JLabel c9;
    private java.awt.Label cantApuestas;
    private javax.swing.JLabel ccompuesto;
    private javax.swing.JLabel ci;
    private javax.swing.JLabel cmay;
    private javax.swing.JLabel cmen;
    private javax.swing.JLabel cn;
    private javax.swing.JComboBox<String> comboEfectoSorteo;
    private javax.swing.JLabel cp;
    private javax.swing.JLabel cprimo;
    private javax.swing.JLabel cr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label montoApuestas;
    private java.awt.Label montoBalance;
    private javax.swing.JTextField numRonda;
    private javax.swing.JTable tablaCrupier;
    private javax.swing.JTable tablaJugadorSaldo;
    private javax.swing.JLabel ultimosLanzamientos;
    // End of variables declaration//GEN-END:variables
}
