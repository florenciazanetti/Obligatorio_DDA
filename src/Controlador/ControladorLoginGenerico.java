/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.VistaLogin;

/**
 *
 * @author sabrina
 */
public abstract class ControladorLoginGenerico {
    public VistaLogin vista;
    
    public ControladorLoginGenerico (VistaLogin vista){
        this.vista =  vista;
    }
    
    public abstract void loginUsuario(String cedula, String password);
}
