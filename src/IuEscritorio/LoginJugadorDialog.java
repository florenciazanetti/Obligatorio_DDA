/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IuEscritorio;

import Controlador.ControladorLoginJugador;
import Modelo.Jugador;
import Modelo.Usuario;
import java.awt.Frame;
import javax.swing.JOptionPane;
/**
 *
 * @author sabrina
 */
public class LoginJugadorDialog extends LoginGenericoDialog {

    public LoginJugadorDialog(Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Aplicación para Jugadores");
        super.usarControlador(new ControladorLoginJugador(this));
    }

    @Override
    public void ejecutarCasoInicial(Usuario u) {
        new UnirseAMesaDialog((java.awt.Frame) this.getParent(), false, (Jugador) u).setVisible(true);
    }

    @Override
    public void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "No se puede realizar el login", JOptionPane.ERROR_MESSAGE);        
    }

    @Override
    public void salir() {
        this.dispose();
    } 
}
