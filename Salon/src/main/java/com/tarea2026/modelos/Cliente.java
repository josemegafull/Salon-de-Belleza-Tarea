/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea2026.modelos;

/**
 *
 * @author jose cambisaca
 */
public class Cliente extends Persona{
    
    private String idcliente;

    public Cliente(String idcliente, String cedula, String nombre, String telefono, String correo ) {
        super(cedula, nombre, telefono, correo);
        this.idcliente = idcliente;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }
     
}
