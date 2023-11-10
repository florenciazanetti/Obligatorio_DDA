/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Modelo;

/**
 *
 * @author sabrina
 */
public class  ApuestaDocena  extends TipoApuesta{
    
    public ApuestaDocena(String nombre, int ratioPago) {
        super(nombre, ratioPago);
    }

    @Override
    public int calcularFactorPago(int monto) {
        return monto * 3;
    }
    
}
