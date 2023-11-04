/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Vista;

import Modelo.TipoApuesta;
import Modelo.Usuario;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

/**
 *
 * @author sabrina
 */
public interface VistaIniciarMesa {
      void mostrarTiposDeApuestas(ArrayList<TipoApuesta> tipoApuestas);
      void mostrarMensaje(String mensaje);
      void ejecutarSiguienteCasoUso(Usuario usuario);
      void cerrarVentana(WindowEvent e); //cuando se va sin iniciar
      void cerrarPantallaConfiguracion();//cuando ya inició mesa
      void volverALaPantallaDeLogin(); //La pantalla de configuración se cierra. (Si el cierra la mesa y quisiera iniciarla de nuevo deberá loguearse 
}
