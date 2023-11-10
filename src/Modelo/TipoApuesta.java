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
    private int ratioPago;
    private String nombre;
    private HashMap <String, UniversalCellCode> casilleros;

    public TipoApuesta(String nombre, int ratioPago) {
        this.nombre = nombre;
        this.ratioPago = ratioPago;
        this.casilleros = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRatioPago() {
        return ratioPago;
    }

    public UniversalCellCode getUniversalCellCode(String nombreCasillero) {
        return this.casilleros.get(nombreCasillero);
    }

    public abstract int calcularFactorPago(int monto);
}
