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
    private int ucc; // Universal Cell Code
    private HashMap<Integer, Integer> montosPorCasillero; // Clave: Código UCC, Valor: Monto apostado
   

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

    public Set<Integer> getCodigosUCC() {
        return montosPorCasillero.keySet();
    }
    
    public int getMontoApostado() {
        return montoApostado;
    }
    
      // Método para agregar o actualizar una apuesta en un casillero
    public void agregarApuesta(UniversalCellCode casilleroUCC, int montoApostado) {
        int codigoUCC = casilleroUCC.getCodigo();
        montosPorCasillero.put(codigoUCC, montosPorCasillero.getOrDefault(codigoUCC, 0) + montoApostado);
    }

    // Método para obtener la cantidad apostada en un casillero específico
    public int getMontoTotalEnUnCasillero(UniversalCellCode casilleroUCC) {
         return montosPorCasillero.getOrDefault(casilleroUCC.getCodigo(), 0);
    }
  
     public int calcularPago() {
        return tipoApuesta.calcularFactorPago(montoApostado);
    }

    public boolean esGanadora(int numeroGanador) {
    // Itera a través de los códigos UCC y verifica si alguno coincide con el número ganador
        for (Integer codigoUCC : montosPorCasillero.keySet()) {
            if (tipoApuesta.esGanadora(numeroGanador, codigoUCC)) {
             return true;
            }
        }
        return false;
    }
    
     public int calcularMontoGanado() {
        int montoGanado = 0;
        for (Integer codigoUCC : montosPorCasillero.keySet()) {
            int montoApostadoEnCasillero = montosPorCasillero.get(codigoUCC);
            montoGanado += montoApostadoEnCasillero * tipoApuesta.getRatioPago();
        }
        return montoGanado;
    }

}
