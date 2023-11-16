/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.HashMap;
import Modelo.Jugador;
import java.util.Set;

/**
 *
 * @author sabrina
 */
public class Apuesta {
    
    private TipoApuesta tipoApuesta;
    private Jugador jugador;
    private int montoApostado;
    private int ucc; 
   

     public Apuesta(TipoApuesta tipoApuesta, int montoApostado, Jugador jugador, int ucc) {
        this.tipoApuesta = tipoApuesta;
        this.montoApostado = montoApostado;
        this.jugador = jugador;
        this.ucc = ucc;
    }
     

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public TipoApuesta getTipoApuesta() {
        return tipoApuesta;
    }
    
    public int getMontoApostado() {
        return montoApostado;
    }

    public int getUcc() {
        return ucc;
    }
    
    public boolean esGanadora(int numeroGanador) {
            if (tipoApuesta.esGanadora(numeroGanador, ucc)) {
                return true;
            }
        return false;
    }
    
     public int calcularMontoGanado() {
        int montoGanado = 0;
        montoGanado += montoApostado * tipoApuesta.calcularFactorPago(montoApostado);
        return montoGanado;
    }

}
