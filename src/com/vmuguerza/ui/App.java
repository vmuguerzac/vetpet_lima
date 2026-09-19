package com.vmuguerza.ui;

import java.util.Date;

import com.vmuguerza.entidades.Cita;
import com.vmuguerza.entidades.Mascota;
import com.vmuguerza.entidades.Propietario;
import com.vmuguerza.entidades.Tratamiento;
import com.vmuguerza.entidades.Veterinario;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear un propietario
        Propietario propietario = new Propietario();
        propietario.setIdPropietario(1);
        propietario.setDni("43126754");
        propietario.setNombre("Juan Perez");
        propietario.setTelefono("987654321");
        //Crear mascota
        Mascota mascota = new Mascota();
        mascota.setIdMascota(1);
        mascota.setEspecie("Perro");
        mascota.setRaza("Labrador");
        mascota.setEdad(3);
        mascota.setNombre("Rambo");
        // Establecer relacion entre Propietario y Mascota
        propietario.agregarMascota(mascota);
        mascota.setPropietario(propietario);
        // Crear Veterinario
        Veterinario veterinario = new Veterinario();
        veterinario.setIdVeterinario(1);
        veterinario.setEspecialidad("Cirugia");
        veterinario.setCmp("CMP-4521");
        veterinario.setFechaNacimiento(new Date());
        veterinario.setNombre("Ana Gomez");

        Cita cita = new Cita();
        cita.setIdCita(1);
        cita.setFecha(new Date());
        cita.setEstado("Pendiente");
        cita.setMascota(mascota); // Asignando a Rambo a la cita
        cita.setVeterinario(veterinario); // Asignando a Ana a la cita

        // Cita se lleva a cabo
        veterinario.atenderCita(cita.getIdCita());
        veterinario.emitirDiagnostico(cita.getIdCita());
        cita.setDiagnostico("Displacia de cadera");
        Tratamiento tratamiento = new Tratamiento();
        tratamiento.agregarCita(cita);
        tratamiento.setIdTratamiento(1);
        tratamiento.setDescripcion("Terapia fisica");
        tratamiento.setDuracion(4);
        tratamiento.setCosto(500);
        cita.setTratamiento(tratamiento);

    }
}
