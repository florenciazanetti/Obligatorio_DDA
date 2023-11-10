/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Vista;

import Modelo.EnumTipoApuesta;
import Modelo.Jugador;
import Modelo.Mesa;
import Modelo.Ronda;
import java.util.ArrayList;

/**
 *
 * @author flore
 */
public interface VistaJugarAbandonar {
    
    public void mostrarTiposDeApuesta(ArrayList<EnumTipoApuesta> listarTiposApuestaSeleccionados);
    
    public void mostrarSaldoJugador();
    
    public void mostrarNumeroMesayRonda(); //FALTA MANDARLE POR PARAMETRO
    
    public void mostrarNombreCompletoJugador(Jugador jugador);
    
    public void mostrarMesaConApuestas(Mesa mesaConApuestas);
    
    public void mostrarRondasParticipo(ArrayList <Ronda> rondasParticipadas);
    
    public void mostrarEstadisticasMesa (float estadistica);
}
