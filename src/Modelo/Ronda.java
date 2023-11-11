/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author sabrina
 */
public class Ronda {
    private int rondaId = 1;
    private int nextId;
    private int numeroGanador;
 //   private float balanceAnterior;
   // private float balancePosterior;
   // private float recoleccion;
   // private float liquidacion;
    private int numeroSorteado;
    private int montoTotalPagado;
    private int montoApostado;
    private Mesa mesa;
    private ArrayList<Apuesta> apuestas;
    private Map<Apuesta, Boolean> resultados;
    private ArrayList<EfectoSorteo> efectosSorteo;
    private ArrayList<Integer> numerosAnteriores;
   // private ArrayList<Integer> numerosApostadosDirectamente;
    
    
    public Ronda(int rondaId) {
        this.apuestas = new ArrayList<>();
        this.resultados = new HashMap<>();
        this.numerosAnteriores = new ArrayList<>();
        //this.numerosApostadosDirectamente = new ArrayList<>();
        this.efectosSorteo = efectosSorteo;
       // this.balanceAnterior = 0;
        //this.balancePosterior = 0;
        this.montoTotalPagado = 0;
        this.montoApostado = 0;
      //  this.recoleccion = 0;
        //this.liquidacion = 0;
        this.mesa = mesa;
        this.rondaId = nextId++;
    }

    public int getRondaId() {
        return rondaId;
    }

     public List<Integer> ultimosResultados(int utlimosNNumeros){
        return this.mesa.ultimosNumerosSorteados(utlimosNNumeros);
    }


    public int getNumeroGanador() {
        return numeroGanador;
    }

    public ArrayList<Apuesta> getApuestas() {
        return apuestas;
    }

    public ArrayList<EfectoSorteo> getEfectosSorteo() {
        return efectosSorteo;
    }

      private void finalizarRonda(){
    }
    
    private void liquidarRonda(){
    }

    public int getCantidadApuestas() {
         return apuestas.size();
    }
    
    public int getMontoTotalPagado() {
        return montoTotalPagado;
    }
    
     public void agregarApuesta(Apuesta apuesta) {
        apuestas.add(apuesta);
        montoApostado += apuesta.getMontoApostado();
    }
     
    public void procesarSorteo(int numeroGanador) {
    // Suponiendo que 'apuestas' es una lista de todas las apuestas en la ronda
    for (Apuesta apuesta : apuestas) {
        for (Integer codigoUCC : apuesta.getCodigosUCC()) {
            if (apuesta.getTipoApuesta().esGanadora(numeroGanador, codigoUCC)) {
                // Código para manejar la apuesta ganadora
            }
        }
    }
}

    public int getMontoTotalApostado() {
        int montoTotal = 0;
        for(Apuesta apuesta: apuestas){
            montoTotal += apuesta.getMontoApostado();
        }
        return montoTotal;
    }
    
     public int getMontoTotalApostadoPorUnJugador(Jugador jugador) {
        int montoTotal = 0;
        for(Apuesta apuesta: apuestas){
            if(apuesta.getJugador().equals(jugador)){
                montoTotal += apuesta.getMontoApostado();
            }
        }
        return montoTotal;
    }
    
    
}
