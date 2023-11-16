/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componente;
import Modelo.AccesoException;
import Modelo.Crupier;
import Modelo.Fachada;
import Modelo.Jugador;
import Modelo.ApuestaColores;
import Modelo.ApuestaDirecta;
import Modelo.ApuestaDocena;
import Modelo.EfectoSorteo;
import Modelo.ModoAleatorioCompleto;
import Modelo.ModoAleatorioParcial;
import Modelo.ModoSimulador;


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

        
        Fachada.getInstancia().agregarCrupier(crupier1);
        Fachada.getInstancia().agregarCrupier(crupier2);
        Fachada.getInstancia().agregarCrupier(crupier3);
        
        Fachada.getInstancia().agregarJugador(jugador1);
        Fachada.getInstancia().agregarJugador(jugador2);
        Fachada.getInstancia().agregarJugador(jugador3);
        Fachada.getInstancia().agregarJugador(jugador4);
        Fachada.getInstancia().agregarJugador(jugador5);


        EfectoSorteo aleatorioCompl = new ModoAleatorioCompleto ("Aleatorio Completo");
        EfectoSorteo aleatorioParcial = new ModoAleatorioParcial ("Aleatorio Parcial");
        EfectoSorteo simulador = new ModoSimulador ("Simulador");
        
        Fachada.getInstancia().agregarEfectoSorteo(aleatorioCompl);
        Fachada.getInstancia().agregarEfectoSorteo(aleatorioParcial);
        Fachada.getInstancia().agregarEfectoSorteo(simulador);
        
        
        ApuestaColores colores1 = new ApuestaColores ("Colores", "Negro",  44);
        ApuestaColores colores2 = new ApuestaColores ("Colores", "Rojo",  43);
        ApuestaDocena primeraDocena = new ApuestaDocena ("Docena", "Primera Docena", 40);
        ApuestaDocena segundaDocena = new ApuestaDocena ("Docena", "Segunda Docena", 41);
        ApuestaDocena terceraDocena = new ApuestaDocena ("Docena", "Tercera Docena",42);
        ApuestaDirecta directa0 = new ApuestaDirecta ("Directa", "0",0 );
       
        Fachada.getInstancia().agregarTipoApuesta(colores1);
        Fachada.getInstancia().agregarTipoApuesta(colores2);
        Fachada.getInstancia().agregarTipoApuesta(primeraDocena);
        Fachada.getInstancia().agregarTipoApuesta(segundaDocena);
        Fachada.getInstancia().agregarTipoApuesta(terceraDocena);
        Fachada.getInstancia().agregarTipoApuesta(directa0);

	
    }
        
}
