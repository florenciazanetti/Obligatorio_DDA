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
import Modelo.Eventos;
import Modelo.Mesa;
import Modelo.TipoApuesta;
import Modelo.Fachada;
import Modelo.SistemaMesa;
import java.util.ArrayList;
import java.awt.event.WindowEvent;

/**
 *
 * @author flore
 */
public class ControladorIniciarMesa implements Observador  {
    
    private Mesa mesa;
    private Crupier crupier;
    private SistemaMesa sistemaMesa;
    private VistaIniciarMesa vista;

    public ControladorIniciarMesa(Crupier crupier, VistaIniciarMesa vista) {
        this.crupier = crupier;
        this.vista = vista;
        this.mesa = crupier.getMesa(); // Asegurándose de que Mesa está inicializada
        mesa.agregar(this);
        vista.mostrarTiposDeApuestas(Fachada.getInstancia().getTiposApuesta()); // Mostrar opciones de apuestas en la vista
    }  

     public void iniciarMesa(ArrayList<TipoApuesta> tiposApuestaSeleccionados) {
        boolean tieneApuestaDirecta = false;

        // Revisa si la apuesta directa ya está en la lista de tipos de apuesta seleccionados
        for (TipoApuesta tipoApuesta : tiposApuestaSeleccionados) {
            if (tipoApuesta.getNombre().equalsIgnoreCase("Directa")) {
                tieneApuestaDirecta = true;
                break;
            }
        }
        // Si no tiene apuesta directa, la añade a la lista
        if (!tieneApuestaDirecta) {
            TipoApuesta apuestaDirecta = new TipoApuesta();
             apuestaDirecta.setNombre("Directa");
            tiposApuestaSeleccionados.add(apuestaDirecta);
        }
        mesa.iniciarMesa(tiposApuestaSeleccionados); // Iniciar la mesa con los tipos de apuesta seleccionados
        Fachada.getInstancia().actualizarEstadoMesa(mesa, EstadoMesa.ACTIVA);
     }

       @Override
      public void actualizar(Object evento, Observable origen) {
         if (evento.equals(Eventos.MESA_INICIADA)) {
             if (mesa.getEstado() == EstadoMesa.ACTIVA) {
                vista.mostrarMensaje("La mesa ha sido iniciada. Ahora puede operar la mesa.");
                vista.ejecutarSiguienteCasoUso((Crupier) crupier);
                  vista.cerrarPantallaConfiguracion();//Ya inició mesa
                // Aquí no necesitas llamar a Fachada para actualizar el estado, ya está hecho en Mesa.iniciarMesa
            }
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
