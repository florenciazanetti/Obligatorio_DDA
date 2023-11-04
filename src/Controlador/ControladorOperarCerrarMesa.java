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

       public void operarMesa(int idMesa, EfectoSorteo efecto) {
           var fachada = Fachada.getInstancia();
           fachada.prepararParaSorteo(idMesa);
           int numeroGanador = fachada.lanzarBola(idMesa, efecto);
           fachada.pagarApuestas(idMesa, numeroGanador);
           fachada.actualizarEstadoMesa(idMesa);
           fachada.prepararParaNuevaRonda(idMesa);
    }

    public void cerrarMesa(int mesaId) {
        Fachada fachada = Fachada.getInstancia();
        if(fachada.estaMesaBloqueada(mesaId)){
            // Notificar a los jugadores que la mesa se cerrará
            
            // Expulsar a los jugadores de la mesa
            fachada.expulsarJugadoresDeMesa(mesaId);
            // Ejecutar la liquidación de apuestas como en el caso de uso de "Operar mesa"
            fachada.liquidarApuestas(mesaId);
            // Cerrar la mesa
            fachada.cerrarMesa(mesaId);
            mesa.remover(this);
        }
    }
    
    public void lanzarBola(){}
    
    public void pagarApuestas(){}
    
    @Override
    public void actualizar(Object evento, Observable origen) {
        if(Eventos.NUEVA_RONDA.equals(evento)){
            vista.mostrarRondas(mesa);
            vista.mostrarJugadoresEnLaMesa(mesa.getJugadores());
            vista.mostrarCantidadApuestas(mesa.getApuestas().size);
            vista.mostrarBalanceDeMesa(mesa.getBalance());
            //vista.mostrarMontoTotalApostado(mesa.getApuestas());
        }else if(Eventos.MESA_CERRADA.equals(evento)){
            //vista.notificarCierreMesa();
            //mesa.expulsarJugadores();
            //mesa.realizarLiquidacion();
            //vista.ocultarUltimoNumeroGanador();
            //mesa.prepararParaNuevaRonda();
        }
    }
}
