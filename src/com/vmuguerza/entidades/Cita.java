package com.vmuguerza.entidades;

import java.util.Date;

public class Cita {
    private int idCita;
    private Date fecha;
    private String motivo;
    private String estado;
    private Mascota mascota; // relacion con clase mascota
    private Veterinario veterinario; // relacion con veterinario
    private Tratamiento tratamiento; // relacion con tratamiento
    
    public Cita(){
        
    }
    public Cita(int idCita, Date fecha, String motivo, String estado) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.motivo = motivo;
        this.estado = estado;
    }

    public int getIdCita() {
        return idCita;
    }
    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Mascota getMascota() {
        return mascota;
    }
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }
    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public void confirmar(){
        this.estado = "CONFIRMAR";
    }

    public void cancelar(){
        this.estado = "CANCELAR";
    }

}
