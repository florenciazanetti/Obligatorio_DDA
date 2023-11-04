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
public class ModoAleatorioParcial extends EfectoSorteo{
    
    public ModoAleatorioParcial(String nombre) {
        super(nombre);
    }

    @Override
    public int realizarSorteo(ArrayList<Integer> numerosAnteriores, ArrayList<Integer> numerosApostadosDirectamente) {
        int numero;
        do {
            numero = new Random().nextInt(37);
        } while (numerosAnteriores.contains(numero));
        return numero;
    }
    
}
