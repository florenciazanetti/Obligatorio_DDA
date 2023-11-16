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
    void mostrarDatosMesa(int saldo, int rondaId, int mesaId, ArrayList<EfectoSorteo> efectos);

    void mostrarListaUltimosLanzamientos(List<Integer> ultimosLanzamientos);

    void ultimoNumeroSorteado(int ultimo);
    
    void mostrarDatosRonda(ArrayList<Ronda> rondas);
    
    void  mostrarMensajeDeError(String mensaje);
    
    void mostrarJugadoresYSaldo(ArrayList<Jugador> jugadores);

    void ocultarNumeroSorteado();

    void pausarRuleta();

    void reanudarRuleta();

    public void mostrarMontoApostado(int montoTotalApostado);

    public void obtenerCdadApuestasPorRonda(int montoTotalApostado);

    
}
