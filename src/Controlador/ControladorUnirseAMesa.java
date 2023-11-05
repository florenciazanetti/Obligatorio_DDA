package Controlador;

import Common.Observable;
import Common.Observador;
import Modelo.Fachada;
import Modelo.Jugador;
import Modelo.Mesa;
import Vista.VistaUnirseAMesa;
import java.util.ArrayList;

/**
 *
 * @author flore
 */
public class ControladorUnirseAMesa implements Observador {
    
    private Jugador jugador;
    private Mesa mesa;
    private VistaUnirseAMesa vista;
    
    public ControladorUnirseAMesa(Jugador jugador, Mesa mesa, VistaUnirseAMesa vista) {
        this.jugador = jugador;
        this.mesa = mesa;
        this.vista = vista;
    }
    
    public void unirseAMesa(){
        jugador.unirseAMesa(mesa);
        vista.actualizarInterfaz();
    }
    
    private void logOut(){
    
    }

    @Override
    public void mostrarMesasAbiertas(ArrayList<Mesa> mesasAbiertas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizar(Object evento, Observable origen) {
        if(evento.equals(Fachada.eventos.cambiosMesas)){
            vista.actualizarInterfaz();
        }
    }
    public void cargarMesasAbiertas() {
        ArrayList<Mesa> mesasAbiertas = Fachada.getInstancia().getMesasAbiertas();
        for(Mesa mesa: mesas){
            mesasAbiertas.add(mesa);
        }
        listaMesasAbiertas.setListData(mesasAbiertas.toArray());
     }
    
    
    
}