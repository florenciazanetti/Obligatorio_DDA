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

    public void mostrarNumeroSorteado(int numSorteado);
    
    public void mostrarBalanceDeMesa(double balanceMesa);
    
    public void mostrarNumeroDeRonda(int numeroDeRonda);
    
    public void mostrarRondas(Mesa mesa);
    
    public void mostrarNumeroDeRuleta(int numeroRuleta);
    
    public void mostrarListaDeEfectos(ArrayList<EfectoSorteo> efectos);
    
    public void mostrarCantidadApuestas(int cantidadApuestas);
    
    public void mostrarMontoTotalApostado(int montoTotal);
    
    public void motrarMesaConDistribucionApuestasAcadaTipoDeApuestas(Mesa mesaConDistribucionApuestas);  

    public void mostrarListaUltimosLanzamientos(List<Integer> ultimosLanzamientos);
        
    public void mostrarJugadoresEnLaMesa(ArrayList <Jugador> jugadoresMesa);

    public int saldoDeJugadores();
    
    public void mostrarMensajeDeError(String message);
    
}
