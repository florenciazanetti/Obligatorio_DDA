/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author sabrina
 */
public class Crupier extends Usuario {
    private Mesa mesa;
    private boolean conectado;

    public Crupier(String cedula, String password, String nombreCompleto) {
        super(cedula, password, nombreCompleto);
        this.mesa = mesa;
    }

       public Crupier(  String cedula, String password) {//para logueo
        super( cedula, password);
     
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
       public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }
       
       
       
     public void configurarMesa(ArrayList<TipoApuesta> tiposApuestaSeleccionados) {
        mesa.setTiposApuesta(tiposApuestaSeleccionados);
    }

  
}
