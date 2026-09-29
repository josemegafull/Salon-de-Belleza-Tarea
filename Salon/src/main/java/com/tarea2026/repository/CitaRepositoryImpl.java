/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author jose cambisaca
 */

package com.tarea2026.repository;

import com.tarea2026.modelos.Citas;


public class CitaRepositoryImpl implements CitaRepository {

    private ColaCitas cola;

    public CitaRepositoryImpl() {
        cola = new ColaCitas();
    }

    @Override
    public void guardar(Citas cita) {
        cola.agregar(cita);
    }

    @Override
    public Citas obtenerSiguiente() {
        return cola.siguiente();
    }

    @Override
    public Citas eliminarSiguiente() {
        return cola.eliminar();
    }

    @Override
    public int cantidad() {
        return cola.cantidad();
    }

    @Override
    public boolean estaVacia() {
        return cola.estaVacia();
    }
}
