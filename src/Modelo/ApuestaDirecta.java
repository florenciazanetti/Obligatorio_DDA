/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Modelo;

/**
 *
 * @author sabrina
 */
public class  ApuestaDirecta extends TipoApuesta {

    public ApuestaDirecta(String nombre, String nombreCodigo, int casillero) {
        super(nombre, nombreCodigo, casillero);
    }
    

    @Override
    public int calcularFactorPago(int monto) {
        return monto * 36;
    }
    
     @Override
    public boolean esGanadora(int numeroGanador, int casillero) {
        // En una apuesta directa, el código UCC es igual al número apostado
        return casillero == numeroGanador;
    }
}
