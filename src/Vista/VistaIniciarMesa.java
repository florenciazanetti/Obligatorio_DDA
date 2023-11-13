/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Vista;

import Modelo.Crupier;
import Modelo.Mesa;
import Modelo.TipoApuesta;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

/**
 *
 * @author sabrina
 */
public interface VistaIniciarMesa {
      ArrayList<TipoApuesta> obtenerTiposApuestaSeleccionados();
      void mostrarTiposDeApuestas(ArrayList<TipoApuesta> tipoApuestas, String apuestaDirecta);
      void ejecutarSiguienteCasoUso(Crupier crupier, ArrayList<TipoApuesta> tiposApuesta);
      void cerrarVentana(); //cuando se va sin iniciar
      void cerrarPantallaConfiguracion();//cuando ya inició mesa
      void volverALaPantallaDeLogin(); //La pantalla de configuración se cierra. (Si el cierra la mesa y quisiera iniciarla de nuevo deberá loguearse 
      void mostrarMensaje(String mensaje);
}
