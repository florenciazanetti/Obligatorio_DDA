/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author sabrina
 */
public class ModoAleatorioParcial extends EfectoSorteo{
     private Queue<Integer> numerosSorteados = new LinkedList<>();
    
    public ModoAleatorioParcial(String nombre) {
        super(nombre);
    }


    @Override
    public int realizarSorteo(Ronda ronda) {
        Random random = new Random();
        int numeroAleatorio;
        do {
            numeroAleatorio = random.nextInt(37); // Genera un número entre 0 y 36
        } while (numerosSorteados.contains(numeroAleatorio));

        numerosSorteados.add(numeroAleatorio);
        if (numerosSorteados.size() > 3) {
            numerosSorteados.poll(); // Elimina el elemento más antiguo si hay más de 3 números
        }

        return numeroAleatorio;
    }
    
}
