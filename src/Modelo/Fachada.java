/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Common.Observador;
import Common.Observable;
import Controlador.ControladorIniciarMesa;
import java.util.ArrayList;
/**
 *
 * @author sabrina
 */
public class Fachada extends Observable {
    
    public enum eventos{cambiosMesas};
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
    
    public Mesa iniciarMesa(ArrayList<TipoApuesta> tipos, Crupier crupier) throws MesaRuletaException {
        Mesa mesa = new Mesa(tipos, crupier);
        agregarMesa(mesa);
        return mesa;
     }

    public ArrayList<EfectoSorteo> getEfectosSorteo() {
        return sistemaMesa.getEfectosSorteo();
    } 

    /**
    // Método para preparar la mesa para el sorteo
    public void prepararParaSorteo(int idMesa) throws MesaRuletaException {
        // 1. Obtener la mesa de ruleta
        Mesa mesa = sistemaMesa.obtenerMesaPorId(idMesa);
        if (mesa == null) {
            throw new MesaRuletaException("Mesa no encontrada con el ID: " + idMesa);
        }
        // 2. Verificar que la mesa está en un estado que permite el sorteo
        if (!sistemaMesa.verificarEstadoParaSorteo(mesa)) {
            throw new MesaRuletaException("La mesa no está en un estado válido para realizar un sorteo.");
        }
        // 3. Bloquear apuestas en la mesa
        sistemaMesa.bloquearApuestas(mesa);
        // 4. Validar las apuestas realizadas en la mesa
        if (!sistemaMesa.validarApuestas(mesa.getApuestas())) {
            throw new MesaRuletaException("Hay apuestas inválidas en la mesa.");
        }
        // 5. Registrar las apuestas antes del sorteo
        sistemaMesa.registrarApuestasParaSorteo(mesa.getApuestas());
        // 6. Seleccionar el efecto de sorteo si es necesario
        EfectoSorteo efecto = sistemaMesa.seleccionarEfectoDeSorteo(mesa.getEfectoSorteoActual());
        // 7. Notificar a los jugadores sobre el inicio del sorteo
        sistemaJugador.notificarInicioDeSorteo(mesa.getJugadores());
        // 8. Actualizar la interfaz de usuario para mostrar que la mesa está en fase de sorteo
        //UI.actualizarEstadoMesa(mesa.getId(), "En espera del sorteo");
        // 9. Preparar el sistema de sorteo
        sistemaMesa.prepararSorteo(mesa.getId(), efecto);
    }
  **/



   

}
