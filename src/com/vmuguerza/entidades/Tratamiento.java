package com.vmuguerza.entidades;

import java.util.ArrayList;
import java.util.List;

public class Tratamiento {
    private int idTratamiento;
    private String descripcion;
    private int duracion;
    private double costo;
    // Composicion el tratamiento el "todo" agrupa a 1 o mas citas
    private List<Cita> citas;

    public Tratamiento(){
        citas = new ArrayList<>();
    }
    public Tratamiento(int idTratamiento, String descripcion, int duracion, double costo) {
        this.idTratamiento = idTratamiento;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.costo = costo;
        this.citas = new ArrayList<>();
    } 

    public int getIdTratamiento() {
        return idTratamiento;
    }
    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }

    public List<Cita> getCitas(){
        return this.citas;
    }
    public void agregarCita(Cita cita){
        if(cita != null && !citas.contains(cita)){
            citas.add(cita);
            cita.setTratamiento(this);
        }
    }
}
