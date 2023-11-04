/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author sabrina
 */
public class Apuesta {
    
    private TipoApuesta tipoApuesta;
    private UniversalCellCode ucc;
    private Jugador jugador;
    private double montoApostado;
   

    public Apuesta(TipoApuesta tipoApuesta, double montoApostado, Jugador jugador) {
        this.tipoApuesta = tipoApuesta;
        this.jugador = jugador;
        this.montoApostado = montoApostado;
    }


    public TipoApuesta getTipoApuesta() {
        return tipoApuesta;
    }

    public void setTipoApuesta(TipoApuesta tipoApuesta) {
        this.tipoApuesta = tipoApuesta;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public double getMontoApostado() {
        return montoApostado;
    }

    public void setMontoApostado(double montoApostado) {
        this.montoApostado = montoApostado;
    }

   public boolean esGanadora(int numeroSorteado) {
        return tipoApuesta.esGanadora(numeroSorteado);
    }
    
}
