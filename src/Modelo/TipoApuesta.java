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
    private HashMap <Integer, UniversalCellCode> casilleros;

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

    public UniversalCellCode getUniversalCellCode(int casillero) {
        return this.casilleros.get(casillero);
    }
    
    // Método para obtener todos los códigos de casilleros asociados a este tipo de apuesta
    public Set<Integer> getCodigosCasilleros() {
        return this.casilleros.keySet();
    }
    
      // Método para agregar un casillero a este tipo de apuesta
    public void agregarCasillero(UniversalCellCode ucc) {
        casilleros.put(ucc.getCodigo(), ucc);
    }

    public abstract int calcularFactorPago(int monto);

      // Método abstracto para determinar si una apuesta es ganadora
    public abstract boolean esGanadora(int numeroGanador, int codigoUCC);
}
