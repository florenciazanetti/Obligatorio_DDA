/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author sabrina
 */
public abstract class EfectoSorteo {
    
    private String nombre;

    
    public EfectoSorteo(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
   public abstract int realizarSorteo(Ronda ronda);

}
