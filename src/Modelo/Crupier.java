/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author sabrina
 */
public class Crupier extends Usuario {
    private Mesa mesa;

    public Crupier(String cedula, String password, String nombreCompleto, Mesa mesaAsignada) {
        super(cedula, password, nombreCompleto);
        this.mesa = mesaAsignada;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    @Override
    public boolean validar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   


    
}
