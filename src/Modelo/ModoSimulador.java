/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author sabrina
 */
public class ModoSimulador extends EfectoSorteo {
     private Random random;
    private ArrayList<Integer> numerosConApuestaDirecta;

    public ModoSimulador(String nombre) {
        super(nombre);
    }


    @Override
    public int realizarSorteo(Ronda rondaActual) {
        Set<Integer> codigosCasillerosConApuestaDirecta = new HashSet<>();

        // Obtiene los números con Apuesta Directa en la ronda actual
        for (Apuesta apuesta : rondaActual.getApuestas()) {
            TipoApuesta tipoApuesta = apuesta.getTipoApuesta();
            if (tipoApuesta instanceof ApuestaDirecta) {
                codigosCasillerosConApuestaDirecta.addAll(tipoApuesta.getCodigosCasilleros());
            }
        }

        if (codigosCasillerosConApuestaDirecta.isEmpty()) {
            return 0; // Si no hay apuestas directas, devuelve cero
        } else {
            int indiceAleatorio = random.nextInt(codigosCasillerosConApuestaDirecta.size());
            return new ArrayList<>(codigosCasillerosConApuestaDirecta).get(indiceAleatorio);
        }
    }
}
