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
public class SistemaCrupier {
   private ArrayList<Crupier> crupieres;
    
    public SistemaCrupier() {
        this.crupieres = new ArrayList<>();
    }
    
    // Método para agregar un nuevo crupier
    public void agregarCrupier(Crupier crupier) {
        crupieres.add(crupier);
    }
    
    // Método para obtener todos los crupieres
    public ArrayList<Crupier> getCrupiers() {
        return crupieres;
    }
    
    public Crupier getCrupierById(int id) {
        return null;
    }

}
