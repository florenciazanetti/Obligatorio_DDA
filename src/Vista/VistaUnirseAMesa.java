/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Vista;

import Modelo.Mesa;
import java.util.ArrayList;

/**
 *
 * @author flore
 */
public interface VistaUnirseAMesa {
    void mostrarMesasAbiertas(ArrayList<Mesa> mesasAbiertas);
    void mostrarMensajeError(String mensaje);
    void logOut();
    
}
