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

    public ApuestaDocena(String nombre, String nombreCodigo, int casillero) {
        super(nombre, nombreCodigo, casillero);
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
        // Asumiendo que 40, 41, 42 son los códigos UCC para las tres docenas
        int docenaInicio = (docenaUCC - 40) * 12 + 1;
        int docenaFin = docenaInicio + 11;

        return numero >= docenaInicio && numero <= docenaFin;
    }
}
