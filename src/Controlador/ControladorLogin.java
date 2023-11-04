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
import Modelo.Jugador;
import Modelo.Mesa;
import Modelo.Usuario;
import Vista.VistaIniciarMesa;
import Vista.VistaLogin;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sabrina
 */
public class ControladorLogin {
      private VistaLogin vista;

    public ControladorLogin(VistaLogin vista) {
        this.vista = vista;
    }
    
        public void login(String cedula, String password, Usuario usuario){
            // Intenta loguear como Crupier
            try{
                Crupier crupier = Fachada.getInstancia().loginCrupier(cedula, password);
                if (crupier != null) {
                    Mesa nuevaMesa = new Mesa(); // Crear una nueva mesa
                    crupier.setMesa(nuevaMesa); // Asigno la mesa al crupier
                 } 
            } catch (AccesoException ex) {
                  Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    public Crupier loginAdmin(String cedula, String pass) throws AccesoException {
        return Fachada.getInstancia().loginCrupier(cedula, pass);
    }

    public Jugador loginPropietario(String cedula, String pass) throws AccesoException {
        return Fachada.getInstancia().loginJugador(cedula, pass);
    }

}
