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
    private ArrayList<UniversalCellCode> codigosValidos;

    public TipoApuesta(String nombre, double ratioPago) {
        this.nombre = nombre;
        this.ratioPago = ratioPago;
    }

     public void addCodigoValido(UniversalCellCode codigo) {
        if (!codigosValidos.contains(codigo)) {
            codigosValidos.add(codigo);
        }
     }

      public boolean esApuestaValida(UniversalCellCode codigo) {
        return codigosValidos.contains(codigo);
    }


    Integer getUniversalCellCode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

}
