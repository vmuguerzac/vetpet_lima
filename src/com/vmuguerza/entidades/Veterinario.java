package com.vmuguerza.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Veterinario {
    private int idVeterinario;
    private String nombre;
    private Date fechaNacimiento;
    private String cmp;
    private String especialidad;
    private List<Cita> citas; // relacion con clase Cita

    public Veterinario(){
        citas = new ArrayList<>();
    }
    public Veterinario(int idVeterinario, String nombre, Date fechaNacimiento, String cmp, String especialidad) {
        this.idVeterinario = idVeterinario;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.cmp = cmp;
        this.especialidad = especialidad;
        citas = new ArrayList<>();
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }
    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getCmp() {
        return cmp;
    }
    public void setCmp(String cmp) {
        this.cmp = cmp;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void atenderCita(int idCita){
        System.out.println("Se atendio la cita con id: " + idCita);
    }

    public void emitirDiagnostico(int idCita){
        System.out.println("Se emitio el diagnotico para la cita: " + idCita);
    }

    // metodos asociados a la relacion con Cita
    public List<Cita> getCitas(){
        return citas;
    }

    public void agregarCita(Cita cita){
        // Validaciones
        if(cita != null && !citas.contains(cita)){
            citas.add(cita);
            cita.setVeterinario(this);
        }
    }

    
}
