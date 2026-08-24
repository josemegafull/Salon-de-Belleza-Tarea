/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea2026.modelos;

/**
 *
 * @author jose cambisaca
 */
public class Persona {

    private String cedula;
    private String nombre;
    private String telefono;
    private String correo;

    /**
     * Crea una persona con todos sus datos.
     */
    public Persona(String cedula, String nombre, String telefono, String correo) {
        setCedula(cedula);
        setNombre(nombre);
        setTelefono(telefono);
        setCorreo(correo);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = textoObligatorio(
                cedula,
                "La cedula no puede estar vacia"
        );
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = textoObligatorio(
                nombre,
                "El nombre no puede estar vacio"
        );
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = textoObligatorio(
                telefono,
                "El telefono no puede estar vacio"
        );
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        String correoNormalizado = textoObligatorio(
                correo,
                "El correo no puede estar vacio"
        );

        int arroba = correoNormalizado.lastIndexOf('@');

        boolean correoValido = arroba >= 1
                && arroba < correoNormalizado.length() - 1
                && correoNormalizado.substring(arroba + 1).contains(".");

        if (!correoValido) {
            throw new IllegalArgumentException(
                    "El correo no tiene un formato valido"
            );
        }

        this.correo = correoNormalizado;
    }

    /**
     * Retorna una representacion legible de la persona.
     */
    public String resumen() {
        return cedula + " - "
                + nombre + " - "
                + telefono + " - "
                + correo;
    }

    /**
     * Valida textos que son obligatorios.
     */
    private static String textoObligatorio(String valor, String mensaje) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }

        return valor.trim();
    }
}