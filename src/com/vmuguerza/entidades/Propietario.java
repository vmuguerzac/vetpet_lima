package com.vmuguerza.entidades;

import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private int idPropietario;
    private String dni;
    private String nombre;
    private String telefono;
    private List<Mascota> mascotas; // relacion con clase Mascota
    
    public Propietario() {
        this.mascotas = new ArrayList<>();    
    }
    public Propietario(int idPropietario, String dni, String nombre, String telefono) {
        this.idPropietario = idPropietario;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.mascotas = new ArrayList<>();
    }

    public int getIdPropietario() {
        return idPropietario;
    }
    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Mascota> getMascotas(){
        return mascotas;
    }

    
}
