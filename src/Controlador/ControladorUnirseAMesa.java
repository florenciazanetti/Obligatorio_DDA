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
    
    public ControladorUnirseAMesa(Fachada fachada, Jugador jugador, VistaUnirseAMesa vista) {
        this.vista = vista;
        this.fachada = fachada;
        this.jugador = jugador;
        fachada.agregar(this);
    }
 
    
    public void logOut(){
        Fachada.getInstancia().logout(jugador);
        vista.logOut();
    }
    
     public void unirseAMesa(Mesa mesa, Jugador jugador) {
        try {
            Fachada.getInstancia().agregarJugadorAUnaMesa(jugador, mesa);
            // Lanza el caso de uso "Jugar"
            //iniciarJuego(mesa);
        } catch (MesaRuletaException e) {
            vista.mostrarMensajeError(e.getMessage());
        }
    }
    

    @Override
    public void actualizar(Object evento, Observable origen) {
         if (Eventos.MESA_AGREGADA.equals(evento) || Eventos.MESA_INICIADA.equals(evento)) {
            vista.mostrarMesasAbiertas(Fachada.getInstancia().getMesasAbiertas());
        }
    }
    
    public void cargarMesasAbiertas() {
        ArrayList<Mesa> mesasAbiertas = Fachada.getInstancia().getMesasAbiertas();
        vista.mostrarMesasAbiertas(mesasAbiertas);
    }

    
    /*private void iniciarJuego(Mesa mesa) {
    // Verificar si la mesa está en un estado que permita comenzar un nuevo juego
    if (mesa.puedeIniciarRonda()) {
        // Preparar la mesa para una nueva ronda
        mesa.prepararParaNuevaRonda();

        // Habilitar apuestas
        mesa.habilitarApuestas();
*/

    public ArrayList<Mesa> getMesasDisponibles() {
        return fachada.getMesasAbiertas();
    }
}

    