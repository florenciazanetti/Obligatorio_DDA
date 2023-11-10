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
    private ArrayList<Apuesta> apuestas;
    private ArrayList<Ronda> rondasPariticipadas;
     
    
    public Jugador(String cedula, String password, String nombreCompleto, int saldo){
        super(cedula, password, nombreCompleto);
        this.saldo = saldo;
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

    public ArrayList<Apuesta> getApuestas() {
        return apuestas;
    }

    public void setApuestas(ArrayList<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }
    
      public ArrayList<Ronda> getRondasParticipadas() {
        return rondasPariticipadas;
    }

    public Apuesta realizarApuesta(int monto, TipoApuesta tipo) {
        Apuesta apuesta = null; 

        if (this.saldo > monto) {
            apuesta = new Apuesta(tipo, monto, this); 
            this.apuestas.add(apuesta);
            this.saldo -= monto;
            mesaActual.agregarApuesta(apuesta);
        }
        return apuesta; 
    }
   
      
    public void recibirGanancias(double monto) {
         this.saldo += monto;
    }

    public void actualizarSaldo(double monto) {
        this.saldo += monto;
    }

 
    
    }
