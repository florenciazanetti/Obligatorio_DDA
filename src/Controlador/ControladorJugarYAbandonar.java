/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Common.Observable;
import Common.Observador;
import Modelo.Apuesta;
import Modelo.Eventos;
import Modelo.Fachada;
import Modelo.Jugador;
import Modelo.Mesa;
import Modelo.MesaRuletaException;
import Modelo.Ronda;
import Modelo.TipoApuesta;
import Vista.VistaJugarAbandonar;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author flore
 */
public class ControladorJugarYAbandonar implements Observador {
    
    private Jugador jugador;
    private Mesa mesa;
    private VistaJugarAbandonar vista;

    public ControladorJugarYAbandonar(Jugador jugador, Mesa mesa, VistaJugarAbandonar vista) {
         this.mesa = mesa;
        this.vista = vista;
        mesa.agregar(this);
    }

    public void realizarApuesta(int monto, TipoApuesta tipo, int casilleroUCC) {
        try {
            Apuesta apuesta = jugador.realizarApuesta(monto, tipo, casilleroUCC);
            if (apuesta != null) {
                mesa.agregarApuesta(apuesta);
                vista.actualizarVistaPostApuesta(jugador.getSaldo(), mesa.getApuestas());
            } else {
                vista.mostrarMensajeError("No se pudo realizar la apuesta.");
            }
        } catch (MesaRuletaException e) {
            vista.mostrarMensajeError(e.getMessage());
        }
    }
     
    public void mostrarInformacionJugador() {
        String nombreJugador = jugador.getNombreCompleto();
        int saldo = jugador.getSaldo();
        int mesaId = mesa.getMesaId();
        int numeroSorteado= mesa.getNumeroSorteado();
        int rondaId = mesa.getRondaActual().getRondaId();
        vista.mostrarNombreCompletoJugador(nombreJugador);
        vista.mostrarSaldoJugador(saldo);
        vista.mostrarNumeroMesayRonda(mesaId, rondaId);
        vista.mostrarNumeroSorteado(numeroSorteado);
    }

    public void mostrarRondasParticipadas() {
        Ronda rondaActual = mesa.getRondaActual();
        List<Ronda> rondas = Fachada.getInstancia().getRondasJugador(jugador);
        vista.mostrarRondasParticipadas(rondas);
    }

      public void abandonarMesa() {
        mesa.eliminarJugador(jugador);
        vista.actualizarVistaPostAbandono();
        // Puedes disparar un evento para notificar que el jugador ha abandonado la mesa
    }
      
     public void mostrarTiposDeApuesta(int idMesa) {
        Mesa mesa = Fachada.getInstancia().getMesaPorId(idMesa);
        vista.mostrarTiposDeApuesta (mesa.getTiposApuesta());
    }
      
    @Override
    public void actualizar(Object evento, Observable origen) {
        if (evento instanceof Eventos) {
        Eventos eventoTipo = (Eventos) evento;
        switch (eventoTipo) {
            case NUEVA_RONDA:
                // Lógica para manejar el inicio de una nueva ronda
                mostrarRondasParticipadas();
                break;
            case SORTEO_REALIZADO:
                int numeroSorteado = mesa.getNumeroSorteado();
                vista.mostrarNumeroSorteado(numeroSorteado);
                break;
            case LIQUIDACION_RONDA:
                // Lógica para manejar la liquidación de la ronda
                mostrarInformacionJugador();
                break;
            case MESA_CERRADA:
                // Lógica para manejar el evento de cierre de mesa
                abandonarMesa();
                break;
        }
    }
 }
