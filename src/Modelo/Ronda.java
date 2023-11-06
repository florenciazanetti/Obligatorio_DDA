/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author sabrina
 */
public class Ronda {
    private int numeroRonda;
    private int numeroGanador;
    private ArrayList<Apuesta> apuestas;
    private Map<Apuesta, Boolean> resultados;
    private EfectoSorteo efectoSorteo;
    private ArrayList<Integer> numerosAnteriores;
    private ArrayList<Integer> numerosApostadosDirectamente;
    
    private double montoTotalApostado;
    private double montoTotalGanado;
    private double montoTotalPerdido;

    public Ronda(int numeroRonda) {
        this.numeroRonda = 1;
        this.apuestas = new ArrayList<>();
        this.resultados = new HashMap<>();
        this.numerosAnteriores = new ArrayList<>();
        this.numerosApostadosDirectamente = new ArrayList<>();
        this.efectoSorteo = efectoSorteo;
        numeroRonda++;
    }

    public Ronda() {
    }

     
    
    public void agregarApuesta(Apuesta apuesta) {
        this.apuestas.add(apuesta);
    }

    public void establecerNumeroGanador(int numeroGanador) {
        this.numeroGanador = numeroGanador;
        calcularResultados();
    }

    private void calcularResultados() {
        for (Apuesta apuesta : apuestas) {
            boolean resultado = apuesta.esGanadora(numeroGanador);
            resultados.put(apuesta, resultado);
        }
    }
    
    private void finalizarRonda(){
    }
    
    private void liquidarRonda(){
    }
    public void calcularMontoTotalGanado(double montoGanado){
        montoTotalGanado += montoGanado;
    }
    public void calcularMontoTotalPerdido(double montoPerdido){
        montoTotalGanado += montoPerdido;
    }
    public double calcularBalanceRonda(){
        return montoTotalGanado - montoTotalPerdido;
    }
    

    
}
