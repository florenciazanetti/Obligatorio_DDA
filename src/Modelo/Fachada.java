/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Common.Observador;
import Common.Observable;
import Controlador.ControladorIniciarMesa;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author sabrina
 */
public class Fachada extends Observable {

    private final SistemaAcceso sAcceso = new SistemaAcceso();
    private final SistemaMesa sistemaMesa = new SistemaMesa();
    private final SistemaCrupier sistemaCrupier = new SistemaCrupier();
    private final SistemaJugador sistemaJugador = new SistemaJugador();
    private static Fachada instancia = new Fachada();
    private EstadoMesa estadoMesa;
    
     public static Fachada getInstancia() {
        return instancia;
    }

    private Fachada() {}
    
    public void agregarJugador(Jugador jugador) throws AccesoException{
        sAcceso.agregarUsuarioJugador(jugador);
    }
    
    public void agregarCrupier(Crupier crupier) throws AccesoException{
        sAcceso.agregarCrupier(crupier);
    } 
    
    public Jugador loginJugador(String cedula, String password) throws AccesoException{
        return sAcceso.loginJugador(cedula, password);
    }
    
    public Crupier loginCrupier(String cedula, String password) throws AccesoException{
        return sAcceso.loginCrupier(cedula, password);
    }
    
    public ArrayList<Usuario> getUsuariosConectados(){
        return sAcceso.getUsuariosConectados();
    }
    
    public void logout(Usuario u) {
        sAcceso.logout(u);
    }       

    public ArrayList<TipoApuesta> getTiposApuesta() {
        return sistemaMesa.getTipos();
    }

    public ArrayList<Jugador> getJugadores() {
        return sistemaJugador.getJugadores();
    }
    
    public ArrayList<Crupier> getCrupiers() {
        return sistemaCrupier.getCrupiers();
    }

    public void agregarMesa(Mesa mesa) {
        sistemaMesa.agregarMesa(mesa);
        avisar(Eventos.MESA_AGREGADA);   
    }
    
    public void iniciarMesa(Crupier crupier, ArrayList<TipoApuesta> tiposApuestaSeleccionados) {
        Mesa mesa = crupier.getMesa();
        if (mesa == null) {
            mesa = new Mesa(); //sino la tiene asignada
            crupier.setMesa(mesa); 
        }
        crupier.configurarMesa(tiposApuestaSeleccionados); // Configura la mesa con los tipos de apuesta seleccionados
        mesa.iniciarMesa(); // Cambia el estado de la mesa a activa o inicia la mesa
        sistemaMesa.agregarMesa(mesa);
}

    public ArrayList<EfectoSorteo> getEfectosSorteo() {
        return sistemaMesa.getEfectosSorteo();
    } 

  public boolean agregarJugadorAUnaMesa(Jugador jugador, Mesa mesa) throws MesaRuletaException {
        return sistemaMesa.agregarJugadorAUnaMesa(jugador, mesa);
    }

    public ArrayList<Mesa> getMesasAbiertas() {
        return sistemaMesa.listarMesasAbiertas();
    }

    public Mesa getMesaPorId(int mesaId) throws MesaRuletaException {
        return sistemaMesa.findMesaById(mesaId);
    }

    public List<Ronda> getRondasJugador(Jugador jugador) {
        return sistemaMesa.getRondasJugador(jugador);
    }

    public void agregarTipoApuesta(TipoApuesta tipo) {
        sistemaMesa.agregarTipoApuesta(tipo);
    }

    public ArrayList<EfectoSorteo> agregarEfectoSorteo(EfectoSorteo efecto) {
        return sistemaMesa.agregarEfectoSorteo(efecto);
    }


   

}
