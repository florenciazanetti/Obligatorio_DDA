/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Vista;

import Modelo.Apuesta;
import Modelo.Jugador;
import Modelo.Mesa;
import Modelo.Ronda;
import Modelo.TipoApuesta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author flore
 */
public interface VistaJugarAbandonar {
    
     void mostrarTiposDeApuesta(ArrayList<TipoApuesta> listarTiposApuestaSeleccionados);
    
     void mostrarSaldoJugador();
    
     void mostrarNombreJugador(String jugador);
    
     void mostrarRondasParticipadas(List <Ronda> rondasParticipadas);

     void mostrarMensajeError(String mensaje);

     void mostrarNumeroSorteado(int numeroGanador);
}
