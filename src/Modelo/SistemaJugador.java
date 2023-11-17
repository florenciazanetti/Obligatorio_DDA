/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author sabrina
 */
public class SistemaJugador {
    private ArrayList<Jugador> jugadores;
    
    public SistemaJugador() {
        this.jugadores = new ArrayList<>();
    }
    
    // Método para agregar un nuevo jugador
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
    
    // Método para obtener todos los jugadores
    public ArrayList<Jugador> getJugadoresEnMesa() {
        return jugadores;
    }
    
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
}
