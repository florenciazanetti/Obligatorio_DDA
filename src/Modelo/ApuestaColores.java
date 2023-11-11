/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Modelo;
import Modelo.TipoApuesta;

        
public class ApuestaColores extends TipoApuesta{
    String color;
    
    public ApuestaColores(String nombre, int ratioPago) {
        super(nombre, ratioPago);
    }

    @Override
    public int calcularFactorPago(int monto) {
        return monto * 2;
    }
    
    @Override
    public boolean esGanadora(int numeroGanador, int codigoUCC) {
        // Supongamos que tienes un método que determina el color del número
        String colorGanador = obtenerColor(numeroGanador);
        return ((colorGanador.equals("Rojo") && codigoUCC == 43) ||
                (colorGanador.equals("Negro") && codigoUCC == 44));
    }
}
}
