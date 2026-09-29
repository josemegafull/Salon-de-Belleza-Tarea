/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea2026.repository;

/**
 *
 * @author PC josecambisaca
 */

import com.tarea2026.modelos.Citas;

public class Nodo {

    Citas cita;
    Nodo siguiente;

    public Nodo(Citas cita) {
        this.cita = cita;
        this.siguiente = null;
    }
}
