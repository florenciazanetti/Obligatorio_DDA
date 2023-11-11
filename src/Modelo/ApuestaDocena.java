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
    
    @Override
    public boolean esGanadora(int numeroGanador, int codigoUCC) {
        // Lógica para determinar si el número ganador está en la docena correcta
        return esNumeroEnDocenaCorrecta(numeroGanador, codigoUCC);
    }

    private boolean esNumeroEnDocenaCorrecta(int numero, int docenaUCC) {
        // Implementar la lógica para determinar si el número está en la docena correcta
        // basado en el código UCC
    }
}
