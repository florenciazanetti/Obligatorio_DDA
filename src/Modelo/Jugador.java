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

    public void descontarDeSaldo(int monto) {
          this.saldo -= monto;
      }

      public void acreditarSaldo(int monto) {
          this.saldo += monto;
      }

    @Override
    public boolean validarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    }
}
