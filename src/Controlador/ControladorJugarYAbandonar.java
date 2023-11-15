/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Common.Observable;
import Common.Observador;
import Modelo.Apuesta;
import Modelo.Eventos;
import static Modelo.Eventos.LIQUIDACION;
import static Modelo.Eventos.MESA_CERRADA;
import static Modelo.Eventos.NUEVA_RONDA;
import static Modelo.Eventos.SORTEO_REALIZADO;
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
        this.jugador = jugador;
        mesa.agregar(this);
    }

    public void realizarApuesta(int casilleroUCC, int monto, Jugador jugador, TipoApuesta tipo ) {
        try {
            if (jugador.getSaldo() < monto) {
                vista.mostrarMensajeError("Saldo insuficiente.");
                return;
            }
            Apuesta apuesta = jugador.realizarApuesta(casilleroUCC, monto, jugador, tipo );
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
    
    
    public void getDatosIniciales() {
        String nombreJugador = jugador.getNombreCompleto();
        vista.mostrarNombreJugador(nombreJugador);
        int saldo = jugador.getSaldo();
        vista.mostrarSaldoJugador();
        Ronda rondaQueSeUne = mesa.getRondaActual();
        List<Ronda> rondasParticipadas = Fachada.getInstancia().getRondasJugador(jugador);
        vista.mostrarRondasParticipadas(rondasParticipadas);
    }
    
    public void numeroGanador(Ronda ronda){
        vista.mostrarNumeroSorteado(ronda.getNumeroGanador());
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
      

    public TipoApuesta buscarTipoApuesta(int codigoCasillero) {
        List<TipoApuesta> tiposDeApuesta = Fachada.getInstancia().getTiposApuesta();
        for (TipoApuesta tipoApuesta : tiposDeApuesta) {
            if (tipoApuesta.getCodigosCasilleros().contains(codigoCasillero)) {
                return tipoApuesta;
            }
    }
    return null;
}

    @Override
    public void actualizar(Observable origen, Object evento) {
        if (evento instanceof Eventos) {
                Eventos eventoTipo = (Eventos) evento;
                switch (eventoTipo) {
                    case NUEVA_RONDA:
                        // Lógica para manejar el inicio de una nueva ronda
                        getDatosIniciales();
                        break;
                    case SORTEO_REALIZADO:
                        numeroGanador(jugador.getRondaActual().getNumeroGanador());
                        vista.mostrarNumeroSorteado(numeroSorteado);
                        break;
                    case LIQUIDACION:
                        mostrarInformacionJugador();
                        break;
                    case MESA_CERRADA:
                        // Lógica para manejar el evento de cierre de mesa
                        abandonarMesa();
                        break;
                }
            }    
   }


}
