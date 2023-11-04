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
    public ArrayList<Crupier> getCrupieres() {
        return crupieres;
    }
    
    // Método para obtener un crupier específico por ID o algún otro identificador
    public Crupier getCrupierById(int id) {
        // Aquí puedes agregar la lógica para buscar un crupier por su ID
        return null;
    }
 
}
