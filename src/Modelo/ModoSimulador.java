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
public class ModoSimulador extends EfectoSorteo {
    
    public ModoSimulador(String nombre) {
        super(nombre);
    }

    @Override
    public int realizarSorteo(ArrayList<Integer> numerosAnteriores, ArrayList<Integer> numerosApostadosDirectamente) {
        numerosApostadosDirectamente.add(0); // Asegurarse de que el cero está incluido
        int index = new Random().nextInt(numerosApostadosDirectamente.size());
        return numerosApostadosDirectamente.get(index);
    }
    
}
