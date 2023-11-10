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
    private float balanceAnterior;
    private float balancePosterior;
    private float recoleccion;
    private float liquidacion;
    private int numeroSorteado;
    private Mesa mesa;
    private ArrayList<Apuesta> apuestas;
    private Map<Apuesta, Boolean> resultados;
    private ArrayList<EfectoSorteo> efectosSorteo;
    private ArrayList<Integer> numerosAnteriores;
    private ArrayList<Integer> numerosApostadosDirectamente;

    public Ronda(int rondaId) {
        this.apuestas = new ArrayList<>();
        this.resultados = new HashMap<>();
        this.numerosAnteriores = new ArrayList<>();
        this.numerosApostadosDirectamente = new ArrayList<>();
        this.efectosSorteo = efectosSorteo;
        this.balanceAnterior = 0;
        this.balancePosterior = 0;
        this.recoleccion = 0;
        this.liquidacion = 0;
        this.mesa = mesa;
        this.rondaId = nextId++;
    }

    public int getRondaId() {
        return rondaId;
    }

     public List<Integer> ultimosResultados(int utlimosNNumeros){
        return this.mesa.ultimosNumerosSorteados(utlimosNNumeros);
    }
     
    public void agregarApuesta(Apuesta apuesta) {
        this.apuestas.add(apuesta);
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
 
    
}
