/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AccesoException;
import Modelo.Fachada;
import Modelo.Jugador;
import Vista.VistaLogin;

/**
 *
 * @author sabrina
 */
public class ControladorLoginJugador extends ControladorLoginGenerico {

    public ControladorLoginJugador(VistaLogin vista) {
         super(vista);
    } 

    @Override
    public void loginUsuario(String cedula, String password) {
        try {
            Jugador jugador = Fachada.getInstancia().loginJugador(cedula, password);
            this.vista.ejecutarCasoInicial(jugador);
        } catch (AccesoException ex) {
            this.vista.mostrarMensajeError(ex.getMessage());
        }   
    }
}
