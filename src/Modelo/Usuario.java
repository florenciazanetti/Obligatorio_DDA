/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author sabrina
 */
public abstract class Usuario extends Observable {
    private String cedula;
    private String password;
    private String nombreCompleto;
    
    public Usuario(String cedula, String password, String nombreCompleto){
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.password = password;   
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    public abstract boolean validar();
}
