/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;

/**
 *
 * @author sabrina
 */
public class SistemaAcceso {
    private ArrayList<Crupier> croupiers = new ArrayList();
    private ArrayList<Jugador> jugadores = new ArrayList();
    private ArrayList<Usuario> usuariosConectados = new ArrayList(); 
     
    public ArrayList<Crupier> getCroupiers(){
        return croupiers;
    }

    public ArrayList<Jugador> getJugadores(){
        return jugadores;
    }

    public ArrayList<Usuario> getUsuariosConectados(){
        return usuariosConectados;
    }

    public void agregarCrupier(Crupier crupier) throws AccesoException{
        if (!croupiers.contains(crupier)){
            croupiers.add(crupier);
        } else {
            throw new AccesoException("No se ha podido agregar el Croupier");
        }
    }
    
    public void agregarUsuarioJugador(Jugador jugador) throws AccesoException{
       if (!jugadores.contains(jugador)){
            jugadores.add(jugador);
        } else {
             throw new AccesoException("No se ha podido agregar el jugador");
        }
    }
    
    public boolean croupierYaConectado(Usuario u){
        return usuariosConectados.contains(u);
    }
    
    public boolean jugadorYaConectado(Usuario u){
        return usuariosConectados.contains(u);
    }
    
    public Jugador loginJugador(String cedula, String password) throws AccesoException{
        for (Jugador jugador : jugadores) {
            if(jugadorYaConectado(jugador) == true){
                throw new AccesoException("Acceso denegado. El usuario ya tiene una sesión activa");
            }
            jugador.setConectado(true);
            usuariosConectados.add(jugador);
            return jugador;
        }
        return null;
    }
    
    public Crupier loginCrupier(String cedula,String password){
         for(Crupier crupier : croupiers){
            if(crupier.getCedula().equals(cedula) && crupier.getPassword().equals(password)){
                return crupier;
            }
            crupier.setConectado(true);
            usuariosConectados.add(crupier);
            return crupier;
        }
        return null;
    } 
    
    public void logout(Usuario u){
        usuariosConectados.remove(u);
        
        
    }
    
}
