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
public class TipoApuesta {
    private String nombre;
    private double ratioPago;
    ¿private String tipo; // Puede ser "Directa", "Rojo/Negro", "Docena", etc.

    private ArrayList<UniversalCellCode> codigosValidos;

    public TipoApuesta(String nombre, double ratioPago) {
        this.nombre = nombre;
        this.ratioPago = ratioPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRatioPago() {
        return ratioPago;
    }

    public void setRatioPago(double ratioPago) {
        this.ratioPago = ratioPago;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<UniversalCellCode> getCodigosValidos() {
        return codigosValidos;
    }

    public void setCodigosValidos(ArrayList<UniversalCellCode> codigosValidos) {
        this.codigosValidos = codigosValidos;
    }

    
     public void addCodigoValido(UniversalCellCode codigo) {
        if (!codigosValidos.contains(codigo)) {
            codigosValidos.add(codigo);
        }
     }

      public boolean esApuestaValida(UniversalCellCode codigo) {
        return codigosValidos.contains(codigo);
    }


       public boolean esDirecta() {
        return "Directa".equalsIgnoreCase(this.tipo);
    }

    public boolean esRojoNegro() {
        return "Rojo/Negro".equalsIgnoreCase(this.tipo);
    }

    public boolean esDocena() {
        return "Docena".equalsIgnoreCase(this.tipo);
    }
}
