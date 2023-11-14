/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Vista;

import Modelo.EfectoSorteo;
import java.util.ArrayList;
import Modelo.Jugador;
import Modelo.Mesa;
import Modelo.Ronda;
import java.util.List;

/**
 *
 * @author flore
 */
public interface VistaOperarCerrarMesa {

    void mostrarDatosDeRonda(ArrayList<Ronda> rondas);

    void mostrarListaUltimosLanzamientos(ArrayList<Integer> ultimosLanzamientos);

    void mostrarMensajeDeError(String message);

    void ultimoNumeroSorteado(int ultimo);
    
    void mostrarJugadoresYSaldo(ArrayList<Jugador> jugadores);

    
}
