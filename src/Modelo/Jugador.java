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
    
    public enum eventos{cambiosJugador};
    private double saldoInicial;
    private double monto;
    private Mesa mesaActual;
    private ArrayList<Apuesta> apuestas;
    private ArrayList<Notificacion> notificaciones = new ArrayList();
    private ArrayList<Ronda> rondasPariticipadas;
     
    
    public Jugador(String cedula, String password, String nombreCompleto, double saldoInicial, double monto){
        super(cedula, password, nombreCompleto);
        this.saldoInicial = saldoInicial;
        this.monto = monto;
    }
    
    public void unirseAMesa(Mesa mesa){
        if(mesa != null){
            mesa.agregarJugador(this);
            mesaActual = mesa;
        }
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public ArrayList<Apuesta> getApuestas() {
        return apuestas;
    }

    public void setApuestas(ArrayList<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }
    
     public ArrayList<Notificacion> getNotificaciones() {
        return notificaciones;
    }
      public ArrayList<Ronda> getRondasParticipadas() {
        return rondasPariticipadas;
    }

    public Apuesta realizarApuesta(double monto, TipoApuesta tipo) {
        Apuesta apuesta = null; 

        if (this.saldoInicial > monto) {
            apuesta = new Apuesta(tipo, monto, this); 
            this.apuestas.add(apuesta);
            this.saldoInicial -= monto;
            mesaActual.agregarApuesta(apuesta);
        }
        return apuesta; 
    }
    
    public void recibirGanancias(double monto) {
         this.saldoInicial += monto;
    }

    public void actualizarSaldo(double monto) {
        this.saldoInicial += monto;
    }
    public void registrarRonda(Ronda ronda){
       rondasPariticipadas.add(ronda);
    }
    
    //  void actualizar() {
    //    avisar(eventos.cambiosJugador);
    //}
      
       public void agregarNotificacion(Date fecha, String mensaje){
        notificaciones.add(new Notificacion(fecha,mensaje));
        //avisar(eventos.cambiosNotificaciones);
    }
    
      public void eliminarNotificaciones(){
        notificaciones = new ArrayList<Notificacion>();
        //avisar(eventos.cambiosNotificaciones);
    }

    @Override
     public boolean validar() {
        if(this.getCedula()!= null && this.getCedula()!= "" && this.getPassword()!= "" && this.getPassword()!= null && this.getNombreCompleto()!= null && this.getNombreCompleto()!= ""){
            if(getSaldoInicial() >= 0)
                return true;
        }
        return false;
    }
}
