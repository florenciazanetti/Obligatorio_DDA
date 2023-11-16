/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Modelo;
import Modelo.TipoApuesta;

        
public class ApuestaColores extends TipoApuesta{
    String color;

    public ApuestaColores(String nombre, String nombreCodigo, int casillero) {
        super(nombre, nombreCodigo, casillero);
    }
    

    @Override
    public int calcularFactorPago(int monto) {
        return monto * 2;
    }
    
    @Override
    public boolean esGanadora(int numeroGanador, int casillero) {
        // Supongamos que tienes un método que determina el color del número
        String colorGanador = obtenerColor(numeroGanador);
        return ((colorGanador.equals("Rojo") && casillero == 43) ||
                (colorGanador.equals("Negro") && casillero == 44));
    }
    
    public static String obtenerColor(int numero) {
        // Definir números rojos y negros típicos en la ruleta
        int[] rojos = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
        for (int numRojos : rojos) {
            if (numero == numRojos) {
                return "Rojo";
            }
        }
        // Si no es rojo y es entre 1 y 36, entonces es negro
        if (numero >= 1 && numero <= 36) {
            return "Negro";
        }
        // 0  no tienen color
        return "Sin color";
    }
}

