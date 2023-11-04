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

    public void agregarCrupier(String cedula, String password, String nombreCompleto, Mesa mesaAsignada) throws AccesoException{
        Crupier c = new Crupier(cedula, password, nombreCompleto, mesaAsignada);
        if (c.validar()){
            croupiers.add(c);
        } else {
            throw new AccesoException("No se ha podido agregar el Croupier");
        }
    }
    
    public void agregarUsuarioJugador(String cedula, String password, String nombreCompleto, double saldoInicial, double monto) throws AccesoException{
        Jugador j = new Jugador(cedula, password, nombreCompleto, saldoInicial, monto);
        if(j.validar()){
            jugadores.add(j);
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
    
    
    public Crupier loginCroupier(String cedula, String password) throws AccesoException{
        Usuario u = login(cedula, password, croupiers);
        if(croupierYaConectado(u) == true){
            throw new AccesoException("Acceso denegado. El usuario ya tiene una sesión activa");
        }
        usuariosConectados.add(u);
        return (Crupier)u;
    }
    
    public Jugador loginJugador(String cedula, String password) throws AccesoException{
        Usuario u = login(cedula, password, jugadores);
        if(jugadorYaConectado(u) == true){
            throw new AccesoException("Acceso denegado. El usuario ya tiene una sesión activa");
        }
        usuariosConectados.add(u);
        return (Jugador)u;
    }
    
    private Usuario login(String cedula,String password,ArrayList usuarios){
        Usuario u;
        for(Object o:usuarios){
            u = (Usuario)o;
            if(u.getCedula().equals(cedula) && u.getPassword().equals(password)){
                return u;
            }
        }
        return null;
    } 
    
    public void logout(Usuario u){
        usuariosConectados.remove(u);
        
        
    }
    
}
