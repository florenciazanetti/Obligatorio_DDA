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
public class ModoAleatorioCompleto extends EfectoSorteo {
    
    public ModoAleatorioCompleto(String nombre) {
        super(nombre);
    }

    @Override
    public int realizarSorteo(ArrayList<Integer> numerosAnteriores, ArrayList<Integer> numerosApostadosDirectamente) {
        return new Random().nextInt(37);
    }
    
}
