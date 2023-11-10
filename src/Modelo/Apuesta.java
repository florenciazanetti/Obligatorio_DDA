/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.HashMap;

/**
 *
 * @author sabrina
 */
public class Apuesta {
    
    private TipoApuesta tipoApuesta;
    private HashMap <String, UniversalCellCode> casilleros;
    private Jugador jugador;
    private double montoApostado;
   

     public Apuesta(TipoApuesta tipoApuesta, int monto) {
        this.tipoApuesta = tipoApuesta;
        this.montoApostado = monto;
        this.casilleros = new HashMap<> ();
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

     public HashMap<String, UniversalCellCode> getCasilleros() {
        return casilleros;
    }
    
    public void setCasilleros(HashMap<String, UniversalCellCode> casilleros) {
        this.casilleros = casilleros;
    }
  
    public void apostar(int monto, int code, TipoApuesta tp){//, TipoApuesta tp???
        this.casilleros.put(String.valueOf(code), new UniversallCellCode(tipoApuesta.getTipo(), code))
    }
    
}
