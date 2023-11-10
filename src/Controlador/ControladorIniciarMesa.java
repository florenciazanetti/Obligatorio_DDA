/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Common.Observable;
import Common.Observador;
import IuEscritorio.OperarCerrarJDialog;
import Vista.VistaIniciarMesa;
import Modelo.Crupier;
import Modelo.EstadoMesa;
import Modelo.TipoApuesta;
import Modelo.Fachada;
import java.util.ArrayList;
import Modelo.Mesa;
import Modelo.MesaRuletaException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author flore
 */
public class ControladorIniciarMesa {
    private Fachada fachada;
    private VistaIniciarMesa vista;
    TipoApuesta tipo;

    public ControladorIniciarMesa(Crupier crupier, VistaIniciarMesa vista) {
        this.vista = vista;
        mesa.agregar(this);
    }  

    public void cargarComboTiposDeApuestas(){
        ArrayList<TipoApuesta> tiposDeApuestas = Fachada.getInstancia().getTiposApuesta();
        String[] strings = new String[tiposDeApuestas.length];
        for (int i = 0; i < tiposDeApuestas.length; i++){
            if(tiposDeApuestas[i].name() != "ApuestaDirecta"){
                strings[i] = tiposDeApuestas[i].name();
            }
        }
        vista.mostrarTiposDeApuestas(strings);
    }
    
    public void tipoApuestaSeleccionado(String tipoSeleccionado){
        tipo = TipoApuesta.valueOf(tipoSeleccionado);
    }
    
     public void iniciarMesa(String[] tipos, Crupier crupier) {
        ArrayList<TipoApuesta> tiposSeleccionados = new ArrayList<>();  
        tiposSeleccionados.add(TipoApuesta.ApuestaDirecta);
        if(tipos != null){
            for (String tiposA : tipos)
                tiposSeleccionados.add(TipoApuesta.valueOf(tiposA));
            }
        Mesa mesa;
        try{
            mesa = fachada.iniciarMesa(tiposSeleccionados, crupier);
            vista.ejecutarSiguienteCasoUso(mesa);
        } catch (MesaRuletaException ex) {
            vista.mostrarMensaje(ex.getMessage());
        }
     }

    public void logout() {
          Fachada.getInstancia().logout(crupier);   
    }

    public void cerrarPantallaSinIniciar() {// El crupier cierra la pantalla (sin presionar “Iniciar”): el usuario se desloguea.
        vista.volverALaPantallaDeLogin();
        Fachada.getInstancia().logout(crupier);   
    }



    
}
