/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author sabrina
 */
    public class UniversalCellCode {
        
    private int codigo;
    private TipoApuesta tipoApuesta;
    

    public UniversalCellCode(int codigo) {
        this.codigo = codigo;
        this.tipoApuesta = tipo;
    }

    public int getCodigo() {
        return codigo;
    }


    public TipoApuesta getTipoApuesta() {
        return tipoApuesta;
    }

  
    public boolean esDirecto(){
        return this.tipoApuesta.getNombre().equals("Directa");
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniversalCellCode that = (UniversalCellCode) o;
        return codigo == that.codigo;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(codigo);
    }
}

