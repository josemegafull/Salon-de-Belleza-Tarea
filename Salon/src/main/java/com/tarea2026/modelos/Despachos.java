/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea2026.modelos;
/**
 *
 * @author Jose Cambisaca Baquerizo
 */
public class Despachos {
private int numero;
private String fecha;
private int id;
private String Scodigo;
private String codigo; 
private String detalle;
private int cantidad;
private String medida;
private int vutil;
private String ubicacion;
private String disponibilidad;
private double precio;
private double total;
private String marca;
private String modelo;
private String serie;
private String color;
private String estado;
private String factura;
private String observacion;
private String observacionact;
private String cfinal;

    public String getScodigo() {
        return Scodigo;
    }

    public void setScodigo(String Scodigo) {
        this.Scodigo = Scodigo;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getVutil() {
        return vutil;
    }

    public void setVutil(int vutil) {
        this.vutil = vutil;
    }
    public Despachos() {
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    } 

    public String getCfinal() {
        return cfinal;
    }

    public void setCfinal(String cfinal) {
        this.cfinal = cfinal;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getObservacionact() {
        return observacionact;
    }

    public void setObservacionact(String observacionact) {
        this.observacionact = observacionact;
    }
    
     //Estructura para comprobantes de egreso
    public Despachos(int numero, String fecha, String codigo, String detalle, int cantidad, String medida, double precio, double total) {
        this.numero = numero;
        this.fecha = fecha;
        this.codigo = codigo;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.medida = medida;
        this.precio = precio;
        this.total = total;
    }
    //Estructura para comprobantes de Ingreso Suministros
    public Despachos(int numero, String fecha, String codigo, String detalle, int cantidad, String medida, double precio, double total, String factura) {
        this.numero = numero;
        this.fecha = fecha;
        this.codigo = codigo;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.medida = medida;
        this.precio = precio;
        this.total = total;
        this.factura = factura;
    }
//Estructura para comprobantes de Ingreso de Activos
    public Despachos(int numero, int id ,String fecha, String codigo, String detalle, int cantidad, int vutil, String ubicacion, String disponibilidad, double precio, String marca, String modelo, String serie, String color, String estado, String factura, String observacion) {
        this.numero = numero;
        this.id= id;
        this.fecha = fecha;
        this.codigo = codigo;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.vutil = vutil;
        this.ubicacion = ubicacion;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.color = color;
        this.estado = estado;
        this.factura = factura;
        this.observacion = observacion;
    }
    
    //Estructura para actas de Entrega y Recepcion
    public Despachos(int id, String codigo, String detalle, String marca, String modelo, String serie, String color, String estado, String observacion,double precio,int cantidad,String ubicacion,String disponibilidad, String observacionact) {
        this.id = id;
        this.codigo = codigo;
        this.detalle = detalle;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.color = color;
        this.estado = estado;
        this.observacion = observacion;
         this.precio = precio;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
        this.disponibilidad = disponibilidad;
        this.observacionact = observacionact;
    }
    // Estructura para busqueda de Bienes
    public Despachos(String fecha,int id, String codigo, String detalle, String cfinal  ) {
        this.fecha = fecha;
        this.id = id;
        this.codigo = codigo;
        this.detalle = detalle;
        this.cfinal = cfinal;
    }

    public Despachos(String fecha, String Scodigo, String codigo, String detalle, String medida, double precio) {
        this.fecha = fecha;
        this.Scodigo = Scodigo;
        this.codigo = codigo;
        this.detalle = detalle;
        this.medida = medida;
        this.precio = precio;
    }



}
