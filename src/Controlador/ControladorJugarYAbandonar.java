/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Common.Observable;
import Common.Observador;
import Modelo.Apuesta;
import Modelo.Jugador;
import Modelo.Mesa;
import Modelo.Ronda;
import Vista.VistaJugarAbandonar;
import java.util.ArrayList;

/**
 *
 * @author flore
 */
public class ControladorJugarYAbandonar implements Observador {
    
    private Jugador jugador;
    private Mesa mesa;
    private VistaJugarAbandonar vista;

    public ControladorJugarYAbandonar(Jugador jugador, Mesa mesa, VistaJugarAbandonar vista) {
         this.mesa = mesa;
        this.vista = vista;
       
    }
    public void iniciarNuevaRonda(){
        Ronda ronda = new Ronda();
        //logica para gestionar la ronda, calcular montos, etc.
        jugador.registrarRonda(ronda);
        vista.mostrarRondasParticipadas(jugador.getRondasParticipadas());
    }
    public double calcularTotalDeApuestas(ArrayList <Apuesta> apuestas){
      double total = 0.0;
      
      for(Apuesta apuesta: apuestas){
          total += apuesta.getMontoApostado();
      }
      return total;
    }
    
    public void unirseAmesa() {
    }

    public void jugarBtn() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizar(Object evento, Observable origen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void mostrarMesasAbiertas(ArrayList<Mesa> mesasAbiertas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getSaldoJugador() {
        return 0;
    }
}