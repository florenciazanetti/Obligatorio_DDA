/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IuEscritorio;

import Modelo.AccesoException;
import Modelo.Fachada;
import Modelo.Jugador;
import Modelo.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Frame;
/**
 *
 * @author sabrina
 */
public class LoginJugadorDialog extends LoginDialog{

    public LoginJugadorDialog(Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Aplicación para Jugadores");
    }

    @Override
    protected Usuario loginUsuario(String cedula, String password) {
        try {
            return Fachada.getInstancia().loginJugador(cedula, password );
        } catch (AccesoException ex) {
            Logger.getLogger(LoginJugadorDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void ejecutarCasoUsoInicial(Usuario usuario) {
        new UnirseAMesaDialog((java.awt.Frame) this.getParent(), false, (Jugador) usuario).setVisible(true);
    }
    
}
