/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;
import Modelo.AccesoException;
import Modelo.Crupier;
import Modelo.Fachada;
import Modelo.Jugador;
import java.util.ArrayList;
import Modelo.Apuesta;
import Modelo.ApuestaColores;
import Modelo.ApuestaDirecta;
import Modelo.ApuestaDocena;
import Modelo.EfectoSorteo;
import Modelo.Mesa;
import Modelo.ModoAleatorioCompleto;
import Modelo.ModoAleatorioParcial;
import Modelo.ModoSimulador;
import Modelo.UniversalCellCode;

/**
 *
 * @author sabrina
 */
public class DatosPrueba {
   
        
        public static void cargar() throws AccesoException {
            
        Crupier crupier1 = new Crupier("101", "aaa", "Juan Gomez");
        Crupier crupier2 = new Crupier("102", "bbb", "Pepe Alvarez");
        Crupier crupier3 = new Crupier("103", "ccc", "Nacho Gonzalez");

            // Precargar información de jugadores
        Jugador jugador1 = new Jugador("201", "aaa", "Maria Lopez 1", 1000);
        Jugador jugador2 = new Jugador("202", "bbb", "Josefina Catan", 500);
        Jugador jugador3 = new Jugador("203", "ccc", "Nombre Jugador 3", 100);
        Jugador jugador4 = new Jugador("204", "ddd", "Nombre Jugador 4", 50);
        Jugador jugador5 = new Jugador("205", "eee", "Nombre Jugador 5", 10);

        Fachada.getInstancia().agregarJugador(jugador1);
        Fachada.getInstancia().agregarJugador(jugador2);
        Fachada.getInstancia().agregarJugador(jugador3);
        Fachada.getInstancia().agregarJugador(jugador4);
        Fachada.getInstancia().agregarJugador(jugador5);


        Fachada.getInstancia().agregarCrupier(crupier1);
        Fachada.getInstancia().agregarCrupier(crupier2);
        Fachada.getInstancia().agregarCrupier(crupier3);
        
 
        /**TipoApuesta apuestaRojo = new TipoApuesta("Rojo", 2);
        apuestaRojo.agregarCasillero("Rojo", 43);

        UniversalCellCode uccRojo = apuestaRojo.getUniversalCellCode("Rojo");
        System.out.println("El código UCC de Rojo es: " + uccRojo.getCodigo());*/

        
        /**ApuestaColores tApuesta1 = new ApuestaColores ("Colores", "Rojo",43);
        ApuestaColores tApuesta2 = new ApuestaColores ("Colores", "Negro", 44);
        ApuestaDocena tApuesta3 = new ApuestaDocena ("Docena", "Primera Docena",40);
        ApuestaDocena tApuesta4 = new ApuestaDocena ("Docena", "Segunda Docena",41);
        ApuestaDocena tApuesta5 = new ApuestaDocena ("Docena", "Tercera Docena",42);
        ApuestaDirecta tApuesta6 = new ApuestaDirecta ("Directa", "0",0);
        ApuestaDirecta tApuesta7 = new ApuestaDirecta ("Directa", "1",1);
       
        fachada.agregar(tApuesta1);
        fachada.agregar(tApuesta2);
        fachada.agregar(tApuesta3);
        fachada.agregar(tApuesta4);
        fachada.agregar(tApuesta5);
        fachada.agregar(tApuesta6);
        fachada.agregar(tApuesta7);

        
	EfectoSorteo aleatorioCompl = new ModoAleatorioCompleto ("Aleatorio Completo");
        EfectoSorteo aleatorioParcial = new ModoAleatorioParcial ("Aleatorio Parcial");
        EfectoSorteo simulador = new ModoSimulador ("Simulador");
        /*
        Fachada.getInstancia().agregar(aleatorioCompl);
        Fachada.getInstancia().agregar(aleatorioParcial);
        Fachada.getInstancia().agregar(simulador);*/
        
    }
        
}
