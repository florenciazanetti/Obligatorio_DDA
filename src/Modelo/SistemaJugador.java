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
    
    // Método para obtener un jugador específico por ID o algún otro identificador
    public Jugador getJugadorById(int id) {
        // Aquí puedes agregar la lógica para buscar un jugador por su ID
        return null;
    }
    
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
}
