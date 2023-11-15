/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Vista;

import Modelo.Apuesta;
import Modelo.EnumTipoApuesta;
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
    
     void mostrarSaldoJugador(int saldo);
    
     void mostrarNumeroMesayRonda(int mesaId, int rondaId); 
    
     void mostrarNombreCompletoJugador(String jugador);
    
     void mostrarRondasParticipadas(List <Ronda> rondasParticipadas);
    
     void mostrarEstadisticasMesa (float estadistica);

     void mostrarMensajeError(String mensaje);

     void actualizarVistaPostApuesta(int saldo, ArrayList<Apuesta> apuestas);

     void actualizarVistaPostAbandono();

     void mostrarRondas(List<Ronda> rondas);

     void mostrarNumeroSorteado(int numeroSorteado);
}
