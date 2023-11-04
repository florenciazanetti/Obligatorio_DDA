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
    private Random random;
    
    public EfectoSorteo(String nombre) {
        this.nombre = nombre;
        this.random = random;
    }
    
    public String getNombre() {
        return nombre;
    }
    
   public abstract int realizarSorteo(ArrayList<Integer> numerosAnteriores, ArrayList<Integer> numerosApostadosDirectamente);

}
