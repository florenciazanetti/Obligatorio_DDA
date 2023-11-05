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
    private boolean iniciada;
    private Crupier crupier;
    private double balance;
    private Ronda rondaActual;
    private EstadoMesa estado;
    private final ArrayList<Integer> ultimosNumerosGanadores;
    private ArrayList<Ronda> rondas;
    private ArrayList<Apuesta> apuestas;
    private ArrayList<TipoApuesta> tiposApuesta;
    private ArrayList<Jugador> jugadores;
    private Map<Integer, UniversalCellCode> casilleroAUccMap;
    private int MAX_JUGADORES;

    public Mesa() {
        this.tiposApuesta = new ArrayList<>();
        this.jugadores = new ArrayList<>();
        this.iniciada = false;
        this.balance = 0;
        this.ultimosNumerosGanadores = new ArrayList<>();
        this.casilleroAUccMap = new HashMap<>();
    }
    
     public UniversalCellCode obtenerUccDeCasillero(int casillero) {
        return casilleroAUccMap.get(casillero);
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

    public boolean isIniciada() {
        return iniciada;
    }

    public void setIniciada(boolean iniciada) {
        this.iniciada = iniciada;
    }

    public Crupier getCrupier() {
        return crupier;
    }

    public void setCrupier(Crupier crupier) {
        this.crupier = crupier;
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

    public void setRondaActual(Ronda rondaActual) {
        this.rondaActual = rondaActual;
    }

   
    public ArrayList<Ronda> getRondas() {
        return rondas;
    }

    public void setRondas(ArrayList<Ronda> rondas) {
        this.rondas = rondas;
    }

    public ArrayList<Apuesta> getApuestas() {
        return apuestas;
    }


    public ArrayList<TipoApuesta> getTiposApuesta() {
        return tiposApuesta;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    
    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
   

    public Map<Integer, UniversalCellCode> getCasilleroAUccMap() {
        return casilleroAUccMap;
    }

    public void setCasilleroAUccMap(Map<Integer, UniversalCellCode> casilleroAUccMap) {
        this.casilleroAUccMap = casilleroAUccMap;
    }
  //----------------------------------------//
    
   public void agregarJugador(Jugador jugador){
        if(jugadores.size() < MAX_JUGADORES){
            jugadores.add(jugador);
        }else{
            System.out.println("La mesa esta llena");
        }
    }

    public void eliminarJugador(Jugador jugador) {
        this.jugadores.remove(jugador);
    }

   public void iniciarRonda() {
        Ronda nuevaRonda = new Ronda();
        this.rondas.add(nuevaRonda);
    }

    public Ronda obtenerRondaActual() {
        return rondas.get(rondas.size() - 1);
    }
    
     public void cerrarMesa(){
        avisar(Eventos.MESA_CERRADA);
    }
     
     public int calcularBalanceTotalMesa(){
        return 0;
     }
     
     public void iniciarNuevaRonda() {
        // Inicializar una nueva ronda y establecerla como la ronda actual
        rondaActual = new Ronda(obtenerSiguienteNumeroRonda());
        // Otras operaciones para iniciar la ronda
    }
     
      private int obtenerSiguienteNumeroRonda() {
        // Lógica para obtener el número de la siguiente ronda
        return rondas.size() + 1;
    }
      
    public void agregarApuesta(Apuesta apuesta) {
        apuestas.add(apuesta);
    }
    
    public void iniciarMesa(ArrayList<TipoApuesta> tiposApuestaSeleccionados) {
        this.tiposApuesta = tiposApuestaSeleccionados;
        this.iniciada = true;
        setEstado(EstadoMesa.ACTIVA); // Esto notificará a los observadores
    }
    
    public boolean esIniciada(){
        return iniciada;
    }
}
