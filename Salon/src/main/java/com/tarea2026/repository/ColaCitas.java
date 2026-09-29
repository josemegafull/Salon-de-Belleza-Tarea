/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea2026.repository;

/**
 * @author jose cambisaca
 */

import com.tarea2026.modelos.Citas;

public class ColaCitas {

    private Nodo frente;
    private Nodo fin;
    private int cantidad;

    public ColaCitas() {
        frente = null;
        fin = null;
        cantidad = 0;
    }

    // Agregar una cita al final de la cola
    public void agregar(Citas cita) {

        Nodo nuevo = new Nodo(cita);

        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }

        cantidad++;
    }

    // Eliminar y devolver la primera cita de la cola
    public Citas eliminar() {

        if (estaVacia()) {
            return null;
        }

        Citas cita = frente.cita;

        frente = frente.siguiente;

        cantidad--;

        if (cantidad == 0) {
            fin = null;
        }

        return cita;
    }

    // Consultar la primera cita sin eliminarla
    public Citas siguiente() {

        if (estaVacia()) {
            return null;
        }

        return frente.cita;
    }

    // Verificar si la cola está vacía
    public boolean estaVacia() {
        return cantidad == 0;
    }

    // Consultar la cantidad de citas
    public int cantidad() {
        return cantidad;
    }
}