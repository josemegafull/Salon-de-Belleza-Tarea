/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author jose Cambisaca
 */
package com.tarea2026.repository;

import com.tarea2026.modelos.Citas;
import java.util.List;

public interface CitaRepository {

    void guardar(Citas cita);
    
    List<Citas> listar();

    Citas obtenerSiguiente();

    Citas eliminarSiguiente();

    int cantidad();

    boolean estaVacia();
}