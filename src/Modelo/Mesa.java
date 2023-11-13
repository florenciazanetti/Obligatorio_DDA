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

/**
 *
 * @author sabrina
 */
public class Mesa extends Observable{
    
    private int mesaId;
    private int contadorRondas;
    private static int nextId = 0;
    private boolean bloqueada;
    private int balance;
    private Ronda rondaActual;
    private Crupier crupier;
    private EstadoMesa estado;
    private ArrayList<Apuesta> apuestas;
    private ArrayList<Jugador> jugadores;
    private List<Ronda> rondas;
    private ArrayList<TipoApuesta> tiposApuesta;

    public Mesa(ArrayList<TipoApuesta> tiposApuesta, Crupier crupier) {
        this.mesaId = nextId;
        this.contadorRondas = 0;
        this.balance = 0;
        this.bloqueada = false;
        this.rondaActual = new Ronda(rondaActual.getRondaId());
        this.tiposApuesta = new ArrayList<>();
        this.jugadores = new ArrayList<>();
        this.nextId++;
        this.estado = EstadoMesa.INACTIVA; // Estado inicial de la mesa
    }
    
      public Mesa() {
    }
    
 
//-------------GETTERS Y SETTERS-----------------//
     
     public void setEstado(EstadoMesa estado) {
        this.estado = estado;
        avisar(Eventos.ESTADO_MESA_CAMBIADO); // Notifica a los observadores
    }
     
     public EstadoMesa getEstado() {
        return estado;
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
            this.estado = EstadoMesa.ACTIVA;
            // Otros procesos de inicialización...
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

    public void eliminarJugador(String cedula) {
        Iterator<Jugador> iterator = jugadores.iterator();
        while (iterator.hasNext()) {
            Jugador jugador = iterator.next();
            if (jugador.getCedula().equals(cedula)) {
                iterator.remove(); // Elimina el jugador usando el iterador
            }
        }
        if (jugadores.isEmpty()) { // Verificar después de eliminar el jugador
            setEstado(EstadoMesa.INACTIVA);
        }
}


    ArrayList<Jugador> getJugadoresEnMesa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
            actualizarBalance();
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

    // Cambiar estado según la presencia de jugadores
    if (!jugadores.isEmpty()) {
        setEstado(EstadoMesa.ACTIVA);
    } else {
        setEstado(EstadoMesa.INACTIVA);
    }
}

    
    private void iniciarNuevaRonda() {
        contadorRondas++;
        rondaActual = new Ronda(contadorRondas);
        setEstado(EstadoMesa.OPERANDO);
    }

    public void actualizarBalance() {
        rondaActual = getRondaActual();
        if (rondaActual != null) {
            // Obtener los montos ganados y perdidos de la ronda actual.
            int montoTotalGanado = rondaActual.getMontoTotalPagado();
            int montoTotalPerdido = rondaActual.getMontoTotalApostado() - montoTotalGanado;
            // Actualizar el balance de la mesa.
            this.balance += (montoTotalPerdido - montoTotalGanado);
        }
}
 
    public void iniciarRonda(){
        contadorRondas++;
        Ronda nuevaRonda = new Ronda(contadorRondas);
        this.rondas.add(nuevaRonda);
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
        apuestas.add(apuesta);
    }
    
    public int getCantidadApuestas(){
        return rondaActual.getCantidadApuestas();
    }
}
