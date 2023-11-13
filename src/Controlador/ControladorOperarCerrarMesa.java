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
import Modelo.EstadoMesa;
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
        inicializar();
    }
    
    public void inicializar() {
        vista.mostrarNumeroDeRuleta(mesa.getMesaId()); // Asumiendo que hay un método getNumeroRuleta()
        vista.mostrarMontoTotalApostado(mesa.getMontoTotalApostadoPorRonda());
        vista.mostrarNumeroDeRonda(mesa.getRondaActual().getRondaId());
        vista.mostrarCantidadApuestas(mesa.getApuestas().size());
        vista.mostrarBalanceDeMesa(mesa.getBalance());
        vista.mostrarListaDeEfectos(Fachada.getInstancia().getEfectosSorteo());
        vista.mostrarListaUltimosLanzamientos(mesa.getRondaActual().ultimosResultados(5));
        vista.mostrarJugadoresEnLaMesa(mesa.getJugadores());
    }

    public void cerrarMesa(int mesaId) {
        Fachada fachada = Fachada.getInstancia();
        Mesa mesaACerrar = fachada.getMesaPorId(mesaId);
        if (mesaACerrar != null && mesaACerrar.getEstado() == EstadoMesa.ACTIVA) {
            mesaACerrar.realizarLiquidacion();
            mesaACerrar.expulsarJugadores();
            mesaACerrar.setEstado(EstadoMesa.CERRADA);
            vista.notificarCierreMesa();
        }
}

    
    public void lanzar() {
    // Suponiendo que hay un método para lanzar la bola y determinar el número ganador
        int numeroGanador = mesa.lanzarBola();
        vista.mostrarNumeroSorteado(numeroGanador);
        mesa.bloquearApuestas(); // Bloquea nuevas apuestas
}

    
    public void pagar() {
        // Suponiendo que hay métodos en Mesa para recoger apuestas perdedoras y pagar a las ganadoras
        mesa.recolectarApuestasPerdedoras();
        mesa.pagarApuestasGanadoras();
        vista.actualizarSaldosJugadores(mesa.getJugadores());
        mesa.desbloquearApuestas(); // Desbloquea la mesa para nuevas apuestas
        vista.ocultarUltimoNumeroGanador();
        vista.actualizarListaUltimosLanzamientos();
        vista.actualizarListaRondas();
}

    
    @Override
    public void actualizar(Object evento, Observable origen) {
        if(Eventos.LOGIN_JUGADOR.equals(evento) || Eventos.NUEVA_RONDA.equals(evento)){
            // Actualizar información relevante
            vista.saldoDeJugadores();
            vista.mostrarJugadoresEnLaMesa(mesa.getJugadores());
        }
        if(Eventos.NUEVA_RONDA.equals(evento)){
            vista.mostrarListaUltimosLanzamientos(mesa.getRondaActual().ultimosResultados(5));
            vista.mostrarCantidadApuestas(mesa.getApuestas().size());
            vista.mostrarBalanceDeMesa(mesa.getBalance());
        } else if(Eventos.MESA_CERRADA.equals(evento)){
            vista.notificarCierreMesa();
            mesa.expulsarJugadores();
            mesa.realizarLiquidacion();
            vista.ocultarUltimoNumeroGanador();
            mesa.prepararParaNuevaRonda();
        }
    }
}
