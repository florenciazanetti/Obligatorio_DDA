/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Common.Observable;
import Common.Observador;
import Vista.VistaIniciarMesa;
import Modelo.Crupier;
import Modelo.TipoApuesta;
import Modelo.Fachada;
import java.util.ArrayList;
import Modelo.Mesa;


public class ControladorIniciarMesa implements Observador{
    private Fachada fachada;
    private VistaIniciarMesa vista;
    private Mesa mesa;
    private Crupier crupier;

    // Constructor del controlador
    public ControladorIniciarMesa(Crupier crupier, VistaIniciarMesa vista) {
        this.vista = vista;
        this.fachada = Fachada.getInstancia(); 
        this.mesa = new Mesa();
        crupier.setMesa(mesa);
        fachada.agregarMesa(mesa); 
    }  
   
      
       public void mostrarListadoTipoApuestas(){
        ArrayList<TipoApuesta> tipos = Fachada.getInstancia().getTiposApuesta();
        this.vista.mostrarTiposDeApuestas(tipos);
    }
    

    public void cerrarVentana() {
        if (crupier != null) {
            crupier.setConectado(false);
        }
        vista.cerrarVentana();
    } 

    @Override
    public void actualizar(Observable origen, Object evento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
