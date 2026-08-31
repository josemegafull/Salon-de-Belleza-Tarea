package com.tarea2026.logica;

import com.tarea2026.modelos.Cliente;

/**
 *
 * @author PC TECHNOLOGY
 */


public class ClienteNuevo extends Cliente {

    public ClienteNuevo(String idcliente, String cedula, String nombre,
                        String telefono, String correo) {
        super(idcliente, cedula, nombre, telefono, correo);
    }

    @Override
    public double calcularDescuento(double precio) {
        return precio * 0.05;
    }
     @Override
    public String getTipo() {
        return "Nuevo";
    }
}