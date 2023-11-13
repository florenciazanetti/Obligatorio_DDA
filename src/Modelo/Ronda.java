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
    private int balanceAnterior;
    private int balancePosterior;
   // private float recoleccion;
   // private float liquidacion;
    private int numeroSorteado;
    private int montoTotalPagado;
    private int montoTotalPerdido;
    private int montoTotalGanado;
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
        this.balanceAnterior = 0;
        this.balancePosterior = 0;
        this.montoTotalPagado = 0;
        this.montoApostado = 0;
        this.montoTotalGanado = 0;
        this.montoTotalPerdido = 0;
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

    public void setNumeroGanador(int numero) {
        this.numeroGanador = numero;
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

    public int getCantidadApuestas() {
         return apuestas.size();
    }
    
    public int getMontoTotalPagado() {
        return montoTotalPagado;
    }
    
    public void setBalanceAnterior(int balance) {
       this.balanceAnterior = balance;
    }

    public int getBalancePosterior() {
        return balancePosterior;
    }

    
     public void agregarApuesta(Apuesta apuesta) {
        apuestas.add(apuesta);
        montoApostado += apuesta.getMontoApostado();
    }

    public void procesarSorteo(int numeroGanador) {
        int montoTotalGanado = 0;
        int montoTotalPerdido = 0;

        for (Apuesta apuesta : apuestas) {
            if (apuesta.esGanadora(numeroGanador)) {
                int montoGanado = apuesta.calcularMontoGanado();
                montoTotalGanado += montoGanado;
            } else {
                montoTotalPerdido += apuesta.getMontoApostado();
            }
        }
         balancePosterior = balanceAnterior + (montoTotalPerdido - montoTotalGanado);
    }
    
    public int getMontoTotalPerdido() {
        return montoTotalPerdido;
    }
    
    public int getMontoTotalGanado() {
        return montoTotalGanado;
    }


    public int getMontoTotalApostado() {//en ronda
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

    public void recolectarPerdedoras() {
        for (Apuesta apuesta : apuestas) {
            if (!apuesta.esGanadora(numeroGanador)) {
                // Opcionalmente registrar o realizar acciones con las apuestas perdedoras
                System.out.println("Apuesta perdida: " + apuesta);
            }
        }
}


    public void liquidarRonda() {
        int montoTotalGanado = 0;
        int montoTotalPerdido = 0;

        for (Apuesta apuesta : apuestas) {
            if (apuesta.esGanadora(numeroGanador)) {
                montoTotalGanado += apuesta.calcularMontoGanado();
            } else {
                montoTotalPerdido += apuesta.getMontoApostado();
            }
        }

        // Aquí actualizas los montos relevantes
        montoTotalPagado = montoTotalGanado;
    // Puedes agregar más lógica si es necesario
}

    public void pagarGanadoras() {
        for (Apuesta apuesta : apuestas) {
            if (apuesta.esGanadora(numeroGanador)) {
                int montoGanado = apuesta.calcularMontoGanado();
                Jugador jugador = apuesta.getJugador();
                jugador.actualizarSaldo(montoGanado); // Suponiendo que Jugador tiene un método para actualizar su saldo
            }
        }
}

    
}
