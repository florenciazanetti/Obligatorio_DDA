/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Crupier;

import Common.Observable;
import Common.Observador;
import Modelo.Crupier;
import Modelo.Mesa;
import Modelo.TipoApuesta;
import java.util.ArrayList;
import Modelo.Apuesta;
import Modelo.EfectoSorteo;
import Modelo.Eventos;
import Modelo.Fachada;
import Modelo.Jugador;
import Modelo.MesaRuletaException;
import Modelo.Ronda;
import Vista.VistaOperarCerrarMesa;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author flore
 */

public class ControladorOperarCerrarMesa implements Observador {
    
    private Crupier crupier;
    private Mesa mesa;
    private VistaOperarCerrarMesa vista;


    public ControladorOperarCerrarMesa(Crupier crupier, Mesa mesa, VistaOperarCerrarMesa vista) {
        this.crupier = crupier;
         this.mesa = mesa;
        this.vista = vista;  
    }
    
    public void iniciarRonda(){
        mesa.iniciarRonda();
        vista.mostrarBalanceDeMesa(mesa.getBalance());
        inicializar();
    }
    
     public void inicializar() {
        vista.mostrarNumeroDeRuleta(mesa.getMesaId()); //va Fachada???
        vista.mostrarMontoTotalApostado(mesa.getTotalApostado());
        vista.mostrarNumeroDeRonda(mesa.getRondaActual().getRondaId());
        vista.mostrarCantidadApuestas(mesa.getApuestas().size());//?
        vista.mostrarMontoTotalApostado(mesa.getBalance());
        vista.mostrarListaDeEfectos(Fachada.getInstancia().getEfectosSorteo());
        vista.mostrarListaUltimosLanzamientos(mesa.getRondaActual().ultimosResultados(5));
        vista.mostrarJugadoresEnLaMesa(mesa.getJugadores());
     }


    public void cerrarMesa(int mesaId) {
        Fachada fachada = Fachada.getInstancia();
      
    }
    
    public void lanzar(){}
    
    public void pagar(){}
    
    @Override
    public void actualizar(Object evento, Observable origen) {
        if(Eventos.LOGIN_JUGADOR.equals(evento) || (Eventos.NUEVA_RONDA.equals(evento)) ){
         //   vista.mostrarJugadoresEnLaMesa(jugadoresMesa);
            vista.saldoDeJugadores();
        }
        if(Eventos.NUEVA_RONDA.equals(evento)){
            vista.mostrarListaUltimosLanzamientos(mesa.getRondaActual().ultimosResultados(5));
            vista.mostrarJugadoresEnLaMesa(mesa.getJugadores());
            vista.mostrarCantidadApuestas(mesa.getApuestas().size());
            vista.mostrarBalanceDeMesa(mesa.getBalance());
            vista.mostrarMontoTotalApostado(mesa.getBalance());
        }else if(Eventos.MESA_CERRADA.equals(evento)){
            //vista.notificarCierreMesa();
            //mesa.expulsarJugadores();
            //mesa.realizarLiquidacion();
            //vista.ocultarUltimoNumeroGanador();
            //mesa.prepararParaNuevaRonda();
        }
    }
}
