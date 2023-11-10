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
    private Random random;
    
    public ModoAleatorioCompleto(String nombre) {
        super(nombre);
    }

    @Override
    public int realizarSorteo(Ronda ronda) {
      random = new Random();
      return random.nextInt(37);

    }
    
}
