/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea2026.modelos;

/**
 *
 * @author JoseCambisaca
 */
public class Profesional extends Persona{
 
    private String especialidad;

    public Profesional( String cedula, String nombre, String telefono, String correo, String especialidad) {
        super(cedula, nombre, telefono, correo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
