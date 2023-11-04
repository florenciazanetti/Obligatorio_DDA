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

/**
 *
 * @author flore
 */
public interface VistaOperarCerrarMesa {

    public void mostrarNumeroSorteado(int numSorteado);
    
    public void mostrarBalanceDeMesa(double balanceMesa);
    
    public void mostrarNumeroDeRonda(int numeroDeRonda);
    
    public void mostrarRondas(Mesa mesa);//por controlador de Gian
    
    public void mostrarNumeroDeRuleta(int numeroRuleta);
    
    public void mostrarListaDeEfectos(ArrayList<EfectoSorteo> efectos);
    
    public void mostrarCantidadApuestas(int cantidadApuestas);
    
    public void mostrarMontoTotalApostado(int montoTotal);
    
    public void motrarMesaConDistribucionApuestasAcadaTipoDeApuestas(Mesa mesaConDistribucionApuestas);  

   public void mostrarListaUltimosLanzamientos(ArrayList <Ronda> ultimosLanzamientos);
    
    public void mostrarRondasEfectuadas(ArrayList <Ronda> rondasEfectuadas);
    
    public void mostrarJugadoresEnLaMesa(ArrayList <Jugador> jugadoresMesa);

    public void saldoDeJugadores(int  saldo);
    
    public void mostrarMensajeDeError(String message);
    
}
