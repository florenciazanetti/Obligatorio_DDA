/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author sabrina
 */
public class ModoSimulador extends EfectoSorteo {

    public ModoSimulador(String nombre) {
        super(nombre);
    }


    @Override
     public int realizarSorteo(Ronda ronda) {
        List<Integer> numerosConApuestaDirecta = getNumerosConApuestaDirecta(ronda);
        numerosConApuestaDirecta.add(0); // Añadir el número cero

        if (numerosConApuestaDirecta.isEmpty()) {
            return new Random().nextInt(37); // Número aleatorio entre 0 y 36
        }

        Random random = new Random();
        return numerosConApuestaDirecta.get(random.nextInt(numerosConApuestaDirecta.size()));
    }

    private List<Integer> getNumerosConApuestaDirecta(Ronda ronda) {
        List<Integer> numeros = new ArrayList<>();
        for (Apuesta apuesta : ronda.getApuestas()) {
            if (apuesta.getTipoApuesta() instanceof ApuestaDirecta) {
                numeros.add(apuesta.getUcc());
            }
        }
        return numeros;
    }
}
