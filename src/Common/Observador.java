/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import Modelo.Mesa;
import java.util.ArrayList;

/**
 *
 * @author sabrina
 */
public interface Observador {
    
    public void actualizar(Object evento, Observable origen);
    
}
