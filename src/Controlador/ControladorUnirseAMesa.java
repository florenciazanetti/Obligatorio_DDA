package Controlador;

import Common.Observable;
import Common.Observador;
import Modelo.Eventos;
import Modelo.Fachada;
import Modelo.Jugador;
import Modelo.Mesa;
import Modelo.MesaRuletaException;
import Vista.VistaUnirseAMesa;
import java.util.ArrayList;

/**
 *
 * @author flore
 */
public class ControladorUnirseAMesa implements Observador {
    
    private VistaUnirseAMesa vista;
    private Fachada fachada;
    private Jugador jugador;
    
    public ControladorUnirseAMesa(Jugador jugador, VistaUnirseAMesa vista) {
        this.vista = vista;
        this.fachada = fachada;
        this.jugador = jugador;
    }
 
    
    public void logOut(){
        Fachada.getInstancia().logout(jugador);
        jugador.setConectado(false);
        vista.logOut();
    }
    
    
    public void cargarMesasAbiertas() {
        ArrayList<Mesa> mesasAbiertas = Fachada.getInstancia().getMesasAbiertas();
        vista.mostrarMesasAbiertas(mesasAbiertas);
    }


    @Override
    public void actualizar(Observable origen, Object evento) {
        if (Eventos.MESA_AGREGADA.equals(evento) || Eventos.MESA_INICIADA.equals(evento)) {
            vista.mostrarMesasAbiertas(Fachada.getInstancia().getMesasAbiertas());
        }
    }

    public boolean unirJugadorAMesa(Mesa mesaSeleccionada, Jugador jugador) {
        boolean puedeUnirse;
        try {
            puedeUnirse = Fachada.getInstancia().agregarJugadorAUnaMesa(jugador,mesaSeleccionada);
            return true;
        } catch(MesaRuletaException e) {
            this.vista.mostrarMensajeError(e.getMessage());
        }
        return false;
    }
}

    