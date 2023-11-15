/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sabrina
 */



public class Jugador extends Usuario{
    
    private int saldo;
    private Mesa mesaActual;
    private Ronda rondaActual;
    private ArrayList<Apuesta> apuestas;
    private ArrayList<Ronda> rondasPariticipadas;
    private boolean estaConectado;
     
    
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

    public void isEstaConectado(boolean estaConectado) {
         this.estaConectado = estaConectado;
    }

    public void setEstaConectado(boolean estaConectado) {
        this.estaConectado = estaConectado;
    }
    
    
      public ArrayList<Ronda> getRondasParticipadas() {
        return rondasPariticipadas;
    }

     public Apuesta realizarApuesta(int monto, int casilleroUCC, Jugador jugador, TipoApuesta tipo) throws MesaRuletaException {
        if (this.saldo >= monto) {
            this.saldo -= monto;
            Apuesta apuesta = new Apuesta(tipo, monto, this, casilleroUCC); 
            this.apuestas.add(apuesta);
            return apuesta;
        } else {
            throw new MesaRuletaException("Saldo insuficiente");
        }
    }

    public void recibirGanancias(double monto) {
         this.saldo += monto;
    }

    public void actualizarSaldo(double monto) {
        this.saldo += monto;
    }
    
    }
