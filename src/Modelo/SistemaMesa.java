/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class SistemaMesa {
    private  ArrayList<TipoApuesta> tiposDeApuestas;
    private  ArrayList<EfectoSorteo> efectosSorteo;
    private ArrayList<Apuesta> apuestas;
    private ArrayList<Mesa> mesas;

    public SistemaMesa() {
        tiposDeApuestas = new ArrayList();
        apuestas = new ArrayList();
        mesas = new ArrayList();
    }
    
    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<Mesa> mesas) {
        this.mesas = mesas;
    }
   
    public ArrayList<TipoApuesta> getTipos() {
          return new ArrayList<>(tiposDeApuestas);
    }

    public void agregarMesa(Mesa mesa) {
        mesas.add(mesa);
    }
       
     public Mesa obtenerMesaPorId(int idMesa) {
        for (Mesa mesa : mesas) {
            if (mesa.getMesaId() == idMesa) {
                return mesa;
            }
        }
        return null; 
    }
     
    public void cerrarMesa(int mesaId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public Mesa getMesaById(int id) {
        // Aquí puedes agregar la lógica para buscar una mesa por su ID
        return null;
    }

    public void listarMesasAbiertas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


   /* public void bloquearApuestas(Mesa mesa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/

     public Mesa findMesaById(int id) throws MesaRuletaException {
        return mesas.stream()
                .filter(mesa -> mesa.getMesaId() == id)
                .findFirst()
                .orElseThrow(() -> new MesaRuletaException("Mesa no encontrada con ID: " + id));
    }
     
    /*public boolean validarApuestas(ArrayList<Apuesta> apuestas) {
        for (Apuesta apuesta : apuestas) {
            if (apuesta.getMontoApostado() > apuesta.getJugador().getMonto()) {
                return false;
            }
        }
        return true;
    } */
    
     public EfectoSorteo seleccionarEfectoDeSorteo(EfectoSorteo efectoActual) {
        // Asumiendo que efectoActual viene del frontend o algún otro servicio
        return efectoActual;
    }

       public void actualizarEstadoMesa(Mesa mesa, EstadoMesa nuevoEstado) {
            if (mesa != null && nuevoEstado != null) {
                mesa.setEstado(nuevoEstado);
            }
        }

    /*ArrayList<Jugador> getJugadoresEnMesa(Mesa mesa) {

    }*/

    public ArrayList<EfectoSorteo> getEfectosSorteo() {
        return efectosSorteo;
    }
   
}
