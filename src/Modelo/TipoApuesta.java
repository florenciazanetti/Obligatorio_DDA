/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author sabrina
 */
public abstract class TipoApuesta {
    private String nombre;
    private int casillero;
    private String nombreCodigo;
   
    public TipoApuesta(String nombre, String nombreCodigo, int casillero ) {
        this.nombre = nombre;
        this.nombreCodigo = nombreCodigo;
        this.casillero = casillero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCodigo() {
        return nombreCodigo;
    }

    public void setNombreCodigo(String nombreCodigo) {
        this.nombreCodigo = nombreCodigo;
    }

    

    public int getCasillero() {
        return casillero;
    }

    public abstract int calcularFactorPago(int monto);
    

      // Método abstracto para determinar si una apuesta es ganadora
    public abstract boolean esGanadora(int numeroGanador, int casillero);
}
