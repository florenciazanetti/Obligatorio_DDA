/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import Common.Observable;

/**
 *
 * @author sabrina
 */
public class Mesa extends Observable{
    
    private int mesaId;
    private static int nextId = 0;
    private boolean bloqueada;
    private double balance;
    private Ronda rondaActual;
    private Crupier crupier;
    private EstadoMesa estado;
    private ArrayList<Jugador> jugadores;
    private final ArrayList<Integer> ultimosNumerosGanadores;
    private ArrayList<Ronda> historialRondas;//rondas
    private ArrayList<EnumTipoApuesta> tiposApuesta;


    public Mesa(ArrayList<EnumTipoApuesta> tiposApuesta, Crupier crupier) {
        this.mesaId = nextId;
        this.balance = 0;
        this.bloqueada = false;
        this.rondaActual=new Ronda(this);
        this.tiposApuesta = tiposApuesta;
        this.jugadores = new ArrayList<>();
        this.ultimosNumerosGanadores = new ArrayList<>();
        this.tiposApuesta.add(EnumTipoApuesta.Apuesta_Directa);
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
     
    public int getMesaId() {
        return mesaId;
    }

    public void setMesaId(int mesaId) {
        this.mesaId = mesaId;
    }

    public Crupier getCrupier() {
        return crupier;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Ronda getRondaActual() {
        return rondaActual;
    }
    
    public Ronda getRondaAnteriorAActual(){
        return this.historialRondas.get(this.historialRondas.size() - 1);
    }
   
    public ArrayList<Ronda> getRondas() {
        return historialRondas;
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

    public ArrayList<Ronda> getHistorialRondas() {
        return historialRondas;
    }

    public ArrayList<EnumTipoApuesta> getTiposApuesta() {
        return tiposApuesta;
    }

    public void setTiposApuesta(ArrayList<EnumTipoApuesta> tiposApuesta) {
        this.tiposApuesta = tiposApuesta;
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

     
}
