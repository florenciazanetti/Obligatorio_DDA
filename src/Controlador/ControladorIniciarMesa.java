/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Common.Observable;
import Common.Observador;
import Vista.VistaIniciarMesa;
import Modelo.Crupier;
import Modelo.EstadoMesa;
import Modelo.TipoApuesta;
import Modelo.Fachada;
import java.util.ArrayList;
import Modelo.Mesa;
import Modelo.MesaRuletaException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladorIniciarMesa {
    private Fachada fachada;
    private VistaIniciarMesa vista;
    private Mesa mesa;
    private Crupier crupier;
    private Map<String, TipoApuesta> nombreATipoMap = new HashMap<>();

    // Constructor del controlador
    public ControladorIniciarMesa(Crupier crupier, VistaIniciarMesa vista) {
        this.vista = vista;
        this.fachada = Fachada.getInstancia(); 
        this.mesa = new Mesa();
        crupier.setMesa(mesa);
        fachada.agregarMesa(mesa); 
    }  

    // Cuando cargues los tipos de apuesta en la tabla, también llena el mapa
    public void cargarTiposDeApuestas() {
        ArrayList<TipoApuesta> tiposApuesta = mesa.getTiposApuesta();
        for (TipoApuesta tipo : tiposApuesta) {
            nombreATipoMap.put(tipo.getNombre(), tipo);
        }
        vista.mostrarTiposDeApuestas(tiposApuesta, "Apuesta Directa");
}
      public TipoApuesta getTipoApuestaPorNombre(String nombre) {
        return nombreATipoMap.get(nombre);
    }
      
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
        fachada.iniciarMesa(crupier, seleccionados); // Asumiendo que fachada.iniciarMesa espera un objeto Mesa
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
