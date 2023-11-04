/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IuEscritorio;

import Modelo.AccesoException;
import Modelo.Crupier;
import Modelo.Fachada;
import Modelo.Usuario;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sabrina
 */
public class LoginCrupierDialog extends LoginDialog {
    
    public LoginCrupierDialog(Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("aplicacion para Crupiers");
    }

    @Override
    protected Usuario loginUsuario(String cedula, String password) {
        try {
            return Fachada.getInstancia().loginCrupier(cedula, password);
        } catch (AccesoException ex) {
            Logger.getLogger(LoginCrupierDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void ejecutarCasoUsoInicial(Usuario usuario) {
        new IniciarMesaDialog((java.awt.Frame) this.getParent(), false, (Crupier) usuario).setVisible(true);
    }
    
}
