/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Vista;
import Modelo.Usuario;

/**
 *
 * @author sabrina
 */
public interface VistaLogin {
    void ejecutarCasoInicial(Usuario u);
   
    void mostrarMensajeError(String mensaje);

    void salir();
}
