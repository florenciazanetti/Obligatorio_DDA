/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.HashMap;
import Modelo.Jugador;

/**
 *
 * @author sabrina
 */
public class Apuesta {
    
    private TipoApuesta tipoApuesta;
    private int monto;
    private Jugador jugador;
    private int montoApostado;
   

     public Apuesta(TipoApuesta tipoApuesta, int monto, Jugador jugador) {
        this.tipoApuesta = tipoApuesta;
        this.montoApostado = monto;
        this.jugador = jugador;
    }
     
      public int getMonto() {
        return monto;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    boolean esGanadora(int numeroGanador) {
         return tipoApuesta.esNumeroGanador(, numeroGanador);
    }
  
     public int calcularPago() {
        return tipoApuesta.calcularFactorPago(monto);
    }
    
}
