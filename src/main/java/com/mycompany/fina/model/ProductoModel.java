/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fina.model;

/**
 *
 * @author LENOVO
 */
public class ProductoModel { 
    private String nombre;
    private Integer cantidad;
    private Double precio;
    private String descripcion;

    public ProductoModel() {
    }

    public ProductoModel(String nombre, Integer cantidad, Double precio, String descripcion) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "ProductoModel{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", descripcion=" + descripcion + '}';
    }

   

   
    
}
