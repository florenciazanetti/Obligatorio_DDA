/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Common.Observable;
import Common.Observador;
import Modelo.AccesoException;
import Modelo.Crupier;
import Modelo.Fachada;
import Vista.VistaLogin;
import java.util.logging.Level;

/**
 *
 * @author sabrina
 */
public class ControladorLoginCrupier extends ControladorLoginGenerico {
      private VistaLogin vista;

    public ControladorLoginCrupier(VistaLogin vista) {
        super(vista);
    } 
    
    @Override
    public void loginUsuario(String cedula, String password) {
        try {
            Crupier crupier = Fachada.getInstancia().loginCrupier(cedula, password);
            this.vista.ejecutarCasoInicial(crupier);
        } catch (AccesoException ex) {
            this.vista.mostrarMensajeError(ex.getMessage());
        }
    }
}
