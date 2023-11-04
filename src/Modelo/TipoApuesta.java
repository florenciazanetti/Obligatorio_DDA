/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author sabrina
 */
public class TipoApuesta {

    public static TipoApuesta[] get;

    private String nombre;
    private String tipo;
    private UniversalCellCode codigoUCC;

    public TipoApuesta(String nombre, UniversalCellCode codigoUCC, String tipo) {
        this.nombre = nombre;
        this.codigoUCC = codigoUCC;
        this.tipo = tipo;
    }
    
    public TipoApuesta() {
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }    
    

    public UniversalCellCode getCodigoUCC() {
        return codigoUCC;
    }

    public void setCodigoUCC(UniversalCellCode codigoUCC) {
        this.codigoUCC = codigoUCC;
    }
    
    public void manejarApuesta(Apuesta apuesta) {
        if ("Directa".equals(tipo)) {
            // Lógica para apuesta directa
        } else if ("Docena".equals(tipo)) {
            // Lógica para apuesta docena
        } else if ("Colores".equals(tipo)) {
            // Lógica para apuesta colores
        }
    }

    public  boolean validarApuesta(Apuesta apuesta){
        return false;
    };

    public  double calcularGanancia(Apuesta apuesta, int numeroRuleta){
        return 0;
    };

    public  Set<Integer> getNumerosGanadores(int numeroRuleta){
        return null;
    };
    
    public  boolean esGanadora(int numeroSorteado){
        return false;
    };
    
    public  double getFactorPago(){
        return 0;
    };

}
