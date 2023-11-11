/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import Common.Observable;
import java.util.List;

/**
 *
 * @author sabrina
 */
public class Mesa extends Observable{
    
    private int mesaId;
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
        this.balance = 0;
        this.bloqueada = false;
        this.rondaActual = new Ronda(rondaActual.getRondaId());
        this.tiposApuesta = new ArrayList<>();
        this.jugadores = new ArrayList<>();
        this.nextId++;
    }
    
 
//-------------GETTERS Y SETTERS-----------------//
     
     public void setEstado(EstadoMesa estado) {
        this.estado = estado;
        avisar(Eventos.ESTADO_MESA_CAMBIADO); 
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

    public Ronda getRondaActual() {
       for(Ronda r: rondas){
           if(r.getRondaId() == (rondaActual.getRondaId())){
               return r;
           }
       }
       return null;
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

    public void setTiposApuesta(ArrayList<TipoApuesta> tiposApuesta) {
        this.tiposApuesta = tiposApuesta;
    }

    public List<Ronda> getRondas() {
        return rondas;
    }
    
  //----------------------------------------//
    
    public void agregarJugador(Jugador jugador) throws MesaRuletaException {
        if (jugadores.contains(jugador)){
            throw new MesaRuletaException("El jugador ya participa de esta mesa");
        }
        jugadores.add(jugador);
    }

    public void eliminarJugador(String cedula) {
        for(Jugador jugador: jugadores){
            if(jugador.getCedula().equals(cedula)){
                jugadores.remove(jugador);
            }
        }
    }

    ArrayList<Jugador> getJugadoresEnMesa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    List<Integer> ultimosNumerosSorteados(int utlimosNNumeros) {
        List<Ronda> ultimasRondas = null;
        List<Integer> ultimosNum = new ArrayList<Integer>();
        if(this.rondas.size() > utlimosNNumeros){
             ultimasRondas = this.rondas.subList(this.rondas.size() - utlimosNNumeros, rondas.size());
        } 
        for (Ronda r: ultimasRondas){
            ultimosNum.add(r.getNumeroGanador());
        }
        return ultimosNum;
    }
    
    public void finalizarRonda(int numeroGanador) {
        int totalApostado = 0;
        int totalPagado = 0;

        for (Apuesta apuesta : apuestas) {
            totalApostado += apuesta.getMonto();

            if (apuesta.esGanadora(numeroGanador)) {
                totalPagado += apuesta.calcularPago();
            }
        }

        // Actualizar el balance
        balance += (totalApostado - totalPagado);
        // Limpiar las apuestas para la próxima ronda y realizar otras tareas necesarias
    }
    
    private void liquidarRonda(){
    }

    public void iniciarRonda(){
    
    }
  
    public boolean agregarRonda(Ronda ronda){     
        if(ronda != null){
            rondas.add(ronda);
            avisar(Eventos.NUEVA_RONDA);
            return true;
        }
        return false;
    }

    public int obtenerMontoTotalApostado() {
        int montoTotal = 0;
        for (Apuesta apuesta : apuestas) {
            montoTotal += apuesta.getMonto();
        }
        return montoTotal;
    }

    public void agregarApuesta(Apuesta apuesta) {
        apuestas.add(apuesta);
    }
    
     
}
