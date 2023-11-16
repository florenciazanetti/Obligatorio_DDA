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
        return sAcceso.loginCroupier(cedula, password);
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

    public void agregarMesa(Mesa mesa) throws MesaRuletaException {
        sistemaMesa.agregarMesa(mesa);
        avisar(Eventos.MESA_AGREGADA);   
    }
    
    public void iniciarMesa(Crupier crupier, ArrayList<TipoApuesta> tiposApuestaSeleccionados) {
        Mesa mesa = crupier.getMesa();
        if (mesa == null) {
            mesa = new Mesa(); // Crear una nueva mesa si el crupier no tiene una asignada
            crupier.setMesa(mesa); // Asegúrate de que el crupier tenga la mesa asignada
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

    public Mesa getMesaPorId(int mesaId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
