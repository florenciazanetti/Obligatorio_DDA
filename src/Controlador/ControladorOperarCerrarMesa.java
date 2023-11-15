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
import Modelo.ModoAleatorioCompleto;
import Modelo.ModoAleatorioParcial;
import Modelo.ModoSimulador;
import Modelo.Ronda;
import Vista.VistaOperarCerrarMesa;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author flore
 */

public class ControladorOperarCerrarMesa implements Observador {
    
    private Crupier crupier;
    private Mesa mesa;
    private Ronda ronda;
    private VistaOperarCerrarMesa vista;

    public ControladorOperarCerrarMesa(Crupier crupier, Mesa mesa, VistaOperarCerrarMesa vista) {
        this.crupier = crupier;
        this.mesa = crupier.getMesa();
        this.vista = vista;  
    }
    
    
    public void inicializar() {
        int balance = mesa.getBalance();
        int numeroMesa = mesa.getMesaId();
        int rondaId = mesa.getRondaActual().getRondaId() +1;
        mesa.iniciarMesa(); //ver si va
        ArrayList<EfectoSorteo> efectos = Fachada.getInstancia().getEfectosSorteo();
        this.vista.mostrarDatosMesa(balance, rondaId, numeroMesa, efectos);
                }

    public void cerrarMesa(int mesaId) {
        Fachada fachada = Fachada.getInstancia();
        Mesa mesaACerrar = fachada.getMesaPorId(mesaId);
        if (mesaACerrar != null && mesaACerrar.getEstado() == EstadoMesa.ACTIVA && mesaACerrar.estaBloqueada()) {
            mesaACerrar.realizarLiquidacion();
            mesaACerrar.expulsarJugadores();
            mesa.cerrarMesa();
            mesaACerrar.setEstado(EstadoMesa.CERRADA);
            fachada.logout(mesa.getCrupier());
            //vista.notificarCierreMesa();
        } 
}

    public void lanzarPagar(Mesa mesa, String efectoSorteoNombre) {
    /// Lanzar
        mesa.bloquearApuestas(); // Bloquea nuevas apuestas
        int numeroGanador = determinarNumeroGanador(efectoSorteoNombre, mesa); // Método para determinar el número ganador
        vista.ultimoNumeroSorteado(numeroGanador); // Mostrar el número ganador en la vista
        actualizarUltimosLanzamientos(numeroGanador); // Actualizar la lista de últimos lanzamientos

        // Pagar
        recogerApuestasPerdedoras(numeroGanador); // Recoger apuestas perdedoras
        distribuirPremiosApuestasGanadoras(numeroGanador); // Distribuir premios a las apuestas ganadoras
        mesa.desbloquearApuestas(); // Desbloquear la mesa para nuevas apuestas
//        vista.ocultarNumeroSorteado(); // Ocultar el último número ganador en la vista
        actualizarListaRondas(numeroGanador); // Actualizar la lista de rondas

        // Preparación para la siguiente ronda
        mesa.prepararParaNuevaRonda();
}
    
    public int determinarNumeroGanador(String efectoSorteoNombre, Mesa mesa) {
        EfectoSorteo efectoSorteo;
        switch (efectoSorteoNombre) {
            case "Aleatorio Completo":
                efectoSorteo = new ModoAleatorioCompleto(efectoSorteoNombre);
                break;
            case "Aleatorio Parcial":
                efectoSorteo = new ModoAleatorioParcial(efectoSorteoNombre);
                break;
            case "Simulador":
                efectoSorteo = new ModoSimulador(efectoSorteoNombre);
                break;
            default:
                throw new IllegalArgumentException("Efecto de sorteo desconocido: " + efectoSorteoNombre);
        }
        return efectoSorteo.realizarSorteo(ronda);
    }
    
    private void recogerApuestasPerdedoras(int numeroGanador) {
    // Obtener las apuestas de la ronda actual
        ArrayList<Apuesta> apuestas = mesa.getApuestas();

        // Itera sobre las apuestas y determinar cuáles son perdedoras
        for (Apuesta apuesta : apuestas) {
            if (!apuesta.esGanadora(numeroGanador)) { // asumiendo que la apuesta sabe si es ganadora
                mesa.retirarApuesta(apuesta); // Actualiza el balance de la mesa
            }
        }
}
    
    private void distribuirPremiosApuestasGanadoras(int numeroGanador) {
        ArrayList<Apuesta> apuestas = mesa.getApuestas();

        for (Apuesta apuesta : apuestas) {
            if (apuesta.esGanadora(numeroGanador)) {
                Jugador jugador = apuesta.getJugador();
                int premio = apuesta.calcularMontoGanado(); // asumiendo que la apuesta sabe calcular su premio
                jugador.actualizarSaldo(premio);
            }
        }
}
    
    private void actualizarListaRondas(int numeroGanador) {
       mesa.finalizarRonda(numeroGanador);
    }

    
    private void actualizarUltimosLanzamientos(int numeroGanador) {
        List<Integer> ultimosLanzamientos = mesa.getUltimosLanzamientos();

        // Agregar el nuevo número ganador al inicio de la lista
        ultimosLanzamientos.add(0, numeroGanador);
        vista.mostrarListaUltimosLanzamientos(ultimosLanzamientos);
}

    int rondaId = 0;
    private void getDatosDeMesa(){
        int saldo = mesa.getBalance();
        int mesaId = 1;
        ArrayList<EfectoSorteo> efectos = Fachada.getInstancia().getEfectosSorteo();
       rondaId++;
       vista.mostrarDatosMesa(saldo, rondaId, mesaId, efectos);
    }
    
    @Override
    public void actualizar(Object evento, Observable origen) {
        if( Eventos.NUEVA_RONDA.equals(evento)){
            getDatosDeMesa();
        }
    }
}
