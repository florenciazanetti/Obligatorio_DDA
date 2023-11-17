/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IuEscritorio;

import Modelo.AccesoException;
import Modelo.Crupier;
import Modelo.Fachada;
import Modelo.MesaRuletaException;
import Modelo.Usuario;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sabrina
 */
public class LoginCrupierDialog extends LoginGenericoDialog {
    
    public LoginCrupierDialog(Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Aplicacion para Crupiers");
    }

    @Override
    public void ejecutarCasoInicial(Usuario u) {
       new IniciarMesaDialog((java.awt.Frame) this.getParent(), false, (Crupier) u).setVisible(true);
    }

    @Override
    public void mostrarMensajeError(String mensaje) {
       JOptionPane.showMessageDialog(this, mensaje, "No se puede realizar login", JOptionPane.ERROR_MESSAGE);        
    }

    @Override
    public void salir() {
        this.dispose();
    }    
}
