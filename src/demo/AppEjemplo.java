/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import componente.DatosPrueba;

/**
 *
 * @author digregor
 */
public class AppEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       DatosPrueba.cargar();
        new VentanaMesa().setVisible(true);
    }
    
}
