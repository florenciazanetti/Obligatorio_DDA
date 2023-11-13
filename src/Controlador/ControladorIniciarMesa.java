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


public class ControladorIniciarMesa {
    private Fachada fachada;
    private VistaIniciarMesa vista;
    private Mesa mesa;

    // Constructor del controlador
    public ControladorIniciarMesa(Crupier crupier, VistaIniciarMesa vista) {
        this.vista = vista;
        this.fachada = Fachada.getInstancia(); 
        crupier.setMesa(new Mesa());
        fachada.agregarMesa(mesa);
    }  

    // Método para cargar el combo con los tipos de apuestas
    public void cargarTiposDeApuestas() {
        ArrayList<TipoApuesta> tiposApuesta = mesa.getTiposApuesta();
        vista.mostrarTiposDeApuestas(tiposApuesta, "Apuesta Directa");
    }
    
    // Método para manejar la selección de tipos de apuesta y empezar la mesa
  /*  public void iniciarMesaConSeleccion(Crupier crupier, ArrayList<TipoApuesta> seleccionados) {
        mesa.setTiposApuesta(seleccionados); // Configura los tipos de apuesta en la mesa
        fachada.iniciarMesa(crupier, seleccionados); // Inicia la mesa con el crupier y los tipos de apuesta seleccionados
        // Continuar con "Operar mesa"
    }*/
    
     public void manejarInicioDeMesa() {
        // Obtener las selecciones de la vista
        ArrayList<TipoApuesta> tiposSeleccionados = vista.obtenerTiposApuestaSeleccionados();
        // Verificar si al menos un tipo de apuesta ha sido seleccionado
        if (tiposSeleccionados.isEmpty()) {
            vista.mostrarMensaje("Debe seleccionar al menos un tipo de apuesta.");
            return;
        }
        // Iniciar la mesa con las selecciones
        iniciarMesaConSeleccion(tiposSeleccionados);
    }

    // Método para iniciar la mesa con los tipos de apuesta seleccionados
    public void iniciarMesaConSeleccion(ArrayList<TipoApuesta> seleccionados) {
        mesa.setTiposApuesta(seleccionados);
        fachada.iniciarMesa(mesa); // Asumiendo que fachada.iniciarMesa espera un objeto Mesa
        // Continuar con "Operar mesa"
    }
    
    // Método para iniciar la configuración de la mesa
    public void iniciarConfiguracionMesa(Crupier crupier) {
        cargarTiposDeApuestas(); 
    }

    public void volverALaPantallaDeLogin() {
        vista.cerrarVentana();
    }
}

    
    /* public void iniciarMesa(String[] tipos, Crupier crupier) {
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
     }/*

    public void logout() {
          Fachada.getInstancia().logout(crupier);   
    }

    public void cerrarPantallaSinIniciar() {// El crupier cierra la pantalla (sin presionar “Iniciar”): el usuario se desloguea.
        vista.volverALaPantallaDeLogin();
        Fachada.getInstancia().logout(crupier);   
    }



    
}
