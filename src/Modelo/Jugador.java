/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Common.Observable;
import java.util.ArrayList;
import java.util.Date;
import Common.Observable;

/**
 *
 * @author sabrina
 */



public class Jugador extends Usuario {
    
    private int saldo;
    private Mesa mesaActual;
    private Ronda rondaActual;
    private ArrayList<Apuesta> apuestas;
    private ArrayList<Ronda> rondasPariticipadas;
    private boolean conectado;
     
    
    public Jugador(String cedula, String password, String nombreCompleto, int saldo){
        super(cedula, password, nombreCompleto);
        this.saldo = saldo;
    }

    public Mesa getMesaActual() {
        return mesaActual;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Mesa getMesa() {
        return mesaActual;
    }

    public void setMesa(Mesa mesaActual) {
        this.mesaActual = mesaActual;
    }
    
    public void removerMesa() {
        this.mesaActual = null;
    }

     // Método para obtener la ronda actual
    public Ronda getRondaActual() {
        return rondaActual;
    }

    // Método para establecer la ronda actual
    public void setRondaActual(Ronda rondaActual) {
        this.rondaActual = rondaActual;
    }
    
    public ArrayList<Apuesta> getApuestas() {
        return apuestas;
    }

    public void setApuestas(ArrayList<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }
    
      public ArrayList<Ronda> getRondasParticipadas() {
        return rondasPariticipadas;
    }

 

    public void recibirGanancias(double monto) {
         this.saldo += monto;
    }

    public void actualizarSaldo(double monto) {
        this.saldo += monto;
    }

    void restarSaldo(int monto) {
        if (this.saldo >= monto) {
            this.saldo -= monto;
        }    
    }
    
    }
