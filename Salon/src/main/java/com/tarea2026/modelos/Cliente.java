
package com.tarea2026.modelos;

/**
 * @author jose cambisaca
 */
/*public class Cliente extends Persona{
    
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
     
}*/
public abstract class Cliente extends Persona {

    private String idcliente;

    public Cliente(String idcliente, String cedula, String nombre,
                   String telefono, String correo) {
        super(cedula, nombre, telefono, correo);
        this.idcliente = idcliente;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public abstract double calcularDescuento(double precio);
    public abstract String getTipo();
}
