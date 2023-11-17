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
      void mostrarTiposDeApuestas(ArrayList<TipoApuesta> tiposApuestas);
      void ejecutarSiguienteCasoUso(Crupier crupier, TipoApuesta[] tiposApuesta, Mesa mesa);
      void cerrarVentana(); //cuando se va sin iniciar 
      void mostrarMensaje(String mensaje);
}
