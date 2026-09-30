package com.tarea2026.repository;


import com.tarea2026.modelos.Citas;
import org.junit.Test;
import static org.junit.Assert.*;

public class ColaCitasTest {

    @Test
    public void probarAgregar() {

        ColaCitas cola = new ColaCitas();

        Citas cita = new Citas(
                "C001",
                "2026/09/29",
                "08:00",
                "Pendiente",
                null,
                null
        );

        cola.agregar(cita);

        assertEquals(1, cola.cantidad());
        assertFalse(cola.estaVacia());
    }

    @Test
    public void probarSiguiente() {

        ColaCitas cola = new ColaCitas();

        Citas cita1 = new Citas(
                "C001",
                "2026/09/29",
                "08:00",
                "Pendiente",
                null,
                null
        );

        Citas cita2 = new Citas(
                "C002",
                "2026/09/29",
                "09:00",
                "Pendiente",
                null,
                null
        );

        cola.agregar(cita1);
        cola.agregar(cita2);

        Citas siguiente = cola.siguiente();

        assertEquals("C001", siguiente.getCodigo());
    }

    @Test
    public void probarEliminar() {

        ColaCitas cola = new ColaCitas();

        Citas cita1 = new Citas(
                "C001",
                "2026/09/29",
                "08:00",
                "Pendiente",
                null,
                null
        );

        Citas cita2 = new Citas(
                "C002",
                "2026/09/29",
                "09:00",
                "Pendiente",
                null,
                null
        );

        cola.agregar(cita1);
        cola.agregar(cita2);

        Citas eliminada = cola.eliminar();

        assertEquals("C001", eliminada.getCodigo());
        assertEquals(1, cola.cantidad());
        assertEquals("C002", cola.siguiente().getCodigo());
    }

    @Test
    public void probarColaVacia() {

        ColaCitas cola = new ColaCitas();

        assertTrue(cola.estaVacia());
        assertEquals(0, cola.cantidad());
        assertNull(cola.siguiente());
        assertNull(cola.eliminar());
    }
}