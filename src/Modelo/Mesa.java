/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import Common.Observable;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author sabrina
 */
public class Mesa extends Observable{
    
    private int mesaId;
    private static int nextId = 1;
    private int contadorRondas;
    private boolean bloqueada;
    private boolean disponible;
    private int balance;
    private Ronda rondaActual;
    private Crupier crupier;
    private EstadoMesa estadoMesa;
    private ArrayList<Apuesta> apuestas;
    private ArrayList<Jugador> jugadores;
    private List<Ronda> rondas;
    private ArrayList<TipoApuesta> tiposApuesta;
    private List<Integer> ultimosLanzamientos = new ArrayList<>();

    public Mesa(ArrayList<TipoApuesta> tiposApuesta, Crupier crupier) {
        this.mesaId = nextId++;
        this.contadorRondas = 0;
        this.balance = 0;
        this.bloqueada = false;
        this.disponible = false;
        this.rondaActual = null;
        this.tiposApuesta = new ArrayList<>(tiposApuesta);
        this.jugadores = new ArrayList<>();
        this.estadoMesa = EstadoMesa.INACTIVA; // Estado inicial de la mesa
    }
    
      public Mesa() {
    }
    
 
//-------------GETTERS Y SETTERS-----------------//
     
     public void setEstado(EstadoMesa estado) {
        this.estadoMesa = estado;
        avisar(Eventos.ESTADO_MESA_CAMBIADO); // Notifica a los observadores
    }
     
      // Método para obtener los últimos lanzamientos
    public List<Integer> getUltimosLanzamientos() {
        return new ArrayList<>(ultimosLanzamientos); // Devuelve una copia para evitar modificaciones externas
    }

    // Método para agregar un nuevo lanzamiento a la lista
    public void agregarNuevoLanzamiento(int numeroGanador) {
        // Agregar al inicio de la lista
        ultimosLanzamientos.add(0, numeroGanador);
        int maximoLanzamientos = 10;
        if (ultimosLanzamientos.size() > maximoLanzamientos) {
            ultimosLanzamientos.remove(ultimosLanzamientos.size() - 1);
        }
    }
     
     public EstadoMesa getEstado() {
        return estadoMesa;
    }

    public ArrayList<Apuesta> getApuestas() {
        return apuestas;
    }
     
    public int getMesaId() {
        return mesaId;
    }

    public void setMesaId(int mesaId) {
        this.mesaId = mesaId;
    }

    public Crupier getCrupier() {
        return crupier;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setRondas(List<Ronda> rondas) {
        this.rondas = rondas;
    }
    

    public Ronda getRondaActual() {
        if(!rondas.isEmpty()){
          return rondas.get(rondas.size() - 1);
        } else {
            return null;
        }
    }
    
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Mesa.nextId = nextId;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

    public ArrayList<TipoApuesta> getTiposApuesta() {
        return tiposApuesta;
    }

    public void setTiposApuesta(List<TipoApuesta> tiposApuesta) {
        this.tiposApuesta.clear();
        this.tiposApuesta.addAll(tiposApuesta);
    }

    public List<Ronda> getRondas() {
        return rondas;
    }
    
  //----------------------------------------//
    public void iniciarMesa() {
        if (!this.tiposApuesta.isEmpty()) {
            // Lógica para iniciar la mesa
            this.estadoMesa = EstadoMesa.ACTIVA;
            // Otros procesos de inicialización...
        }
    }
    
    public void eliminarJugador(Jugador jugador) {
        jugadores.remove(jugador); // Elimina al jugador de la lista
        if (jugadores.isEmpty()) {
            setEstado(EstadoMesa.INACTIVA);
        }
    }
    
    
    public void agregarJugador(Jugador jugador) throws MesaRuletaException {
        if (jugadores.contains(jugador)){
            throw new MesaRuletaException("El jugador ya participa de esta mesa");
        }
        jugadores.add(jugador);

        if (jugadores.size() == 1) { // Verificar después de agregar el jugador
            setEstado(EstadoMesa.ACTIVA);
        }
}

    public List<Integer> ultimosNumerosSorteados(int ultimosNNumeros) {
        List<Integer> ultimosNumeros = new ArrayList<>();
        int inicio = Math.max(0, rondas.size() - ultimosNNumeros);
        for (int i = inicio; i < rondas.size(); i++) {
            ultimosNumeros.add(rondas.get(i).getNumeroGanador());
        }
        return ultimosNumeros;
    }

    //Calcula y distribuye los pagos a los jugadores según el resultado del sorteo
    public void liquidarRonda(int numeroGanador) {
        if (rondaActual != null) {
            rondaActual.procesarSorteo(numeroGanador);
            actualizarBalancePostRonda();
        }
    }
    
    //marca el fin de una ronda de apuestas y prepara la mesa para la siguiente ronda  
    public void finalizarRonda(int numeroSorteado) {
        rondaActual = getRondaActual();
        if (rondaActual != null) {
            rondaActual.setNumeroGanador(numeroSorteado);
            rondas.add(rondaActual); // Añade la ronda actual al historial
            iniciarNuevaRonda(); // Método que inicia una nueva ronda
        }

        // Cambiar estadoMesa según la presencia de jugadores
        if (!jugadores.isEmpty()) {
            setEstado(EstadoMesa.ACTIVA);
        } else {
            setEstado(EstadoMesa.INACTIVA);
        }
}

    
    public void iniciarNuevaRonda() {
        contadorRondas++;
       rondaActual = new Ronda(contadorRondas);
        this.rondas.add(rondaActual);
        setEstado(EstadoMesa.OPERANDO);
       rondaActual.setBalanceAnterior(this.balance);
        
    }

    public void actualizarBalancePostRonda() {
        rondaActual = getRondaActual();
        if (rondaActual != null) {
            // Obtener los montos ganados y perdidos de la ronda actual.
            int montoTotalGanado = rondaActual.getMontoTotalPagado();
            int montoTotalPerdido = rondaActual.getMontoTotalApostado() - montoTotalGanado;
            // Actualizar el balance de la mesa.
            this.balance += (montoTotalPerdido - montoTotalGanado);
        }
}

  
    public boolean agregarRonda(Ronda ronda){     
        if(ronda != null){
            rondas.add(ronda);
            avisar(Eventos.NUEVA_RONDA);
            return true;
        }
        return false;
    }

    public int getMontoTotalApostadoPorRonda() {
        rondaActual = getRondaActual();
        if(rondaActual != null){
            return rondaActual.getMontoTotalApostado();
        } else {
            return 0;
        }
    }

    public void agregarApuesta(Apuesta apuesta) {
        for (Jugador jugador: jugadores){
            if (jugador.getSaldo() >= apuesta.getMontoApostado()) {
                apuestas.add(apuesta);
                avisar(Eventos.NUEVA_APUESTA);
            }
        }
    }
    
    public int getNumeroSorteado(){
        int numeroSorteado = 0;
        for(Ronda ronda: rondas){
             numeroSorteado = ronda.getNumeroGanador();
        }
        return numeroSorteado;
    }
    
    public int getCantidadApuestas(){
        return rondaActual.getCantidadApuestas();
    }

    public int lanzarBola() {
        Random random = new Random();
        int numeroGanador = random.nextInt(37); // Genera un número entre 0 y 36
        if (rondaActual != null) {
            rondaActual.setNumeroGanador(numeroGanador);
            // Aquí podrías avisar a los observadores sobre el nuevo número ganador
            avisar(Eventos.SORTEO_REALIZADO);
        }
        return numeroGanador;
    }
    
    public void bloquearMesa() {
        this.estadoMesa = EstadoMesa.BLOQUEADA;
    }
    
    public void desbloquearMesa() {
        this.estadoMesa = EstadoMesa.ACTIVA;
    }

    public boolean estaBloqueada() {
        return estadoMesa == EstadoMesa.BLOQUEADA;
    }
    
    public void cerrarMesa() {
        this.estadoMesa = EstadoMesa.CERRADA;
        avisar(Eventos.MESA_CERRADA);
    }

    public void bloquearApuestas() {
        this.bloqueada = true;
        this.estadoMesa = EstadoMesa.BLOQUEADA;
}

    public void desbloquearApuestas() {
        this.bloqueada = false;
}


    public void recolectarApuestasPerdedoras() {
    if (rondaActual != null) {
        rondaActual.recolectarPerdedoras();
    }
    avisar(Eventos.RECOLECCION);
}
   public void pagarApuestasGanadoras() {
        if (rondaActual != null) {
            rondaActual.pagarGanadoras();
        }
}


    public void realizarLiquidacion() {
         if (rondaActual != null) {
            rondaActual.liquidarRonda();
        }
         avisar(Eventos.LIQUIDACION);
    }

    public void expulsarJugadores() {
         jugadores.clear(); // Elimina todos los jugadores de la lista
         setEstado(EstadoMesa.INACTIVA); // Cambia el estadoMesa de la mesa a inactiva
    }

    public void prepararParaNuevaRonda() {
         iniciarNuevaRonda(); 
    }

    public void retirarApuesta(Apuesta apuesta) {
         this.balance += apuesta.getMontoApostado(); // Asumiendo que getMonto devuelve el monto apostado
         // Eliminar la apuesta de la lista de apuestas actuales
        this.apuestas.remove(apuesta);
    }
    
    public boolean estaDisponibleParaNuevoJugador() {
        if (!disponible) {
            return false;
        }
        // Verifica el estado de la mesa
        if (estadoMesa == EstadoMesa.BLOQUEADA || estadoMesa == EstadoMesa.CERRADA) {
            return false;
        }
        return true; 
    }

     public boolean estaJugadorUnidoAMesa(Jugador jugador) {
        return jugadores.contains(jugador);
    }
   
}
