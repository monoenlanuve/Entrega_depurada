package com.coderhouse.Clase8.model;

public class DetalleFacturaDto {
    private String titulo;
    private String descripcion;
    private String codigo;
    private double precio;
    private int cantidad;

    public DetalleFacturaDto(String titulo,String descripcion,String codigo,double precio,int cantidad){
       this.titulo=titulo;
       this.descripcion=descripcion;
       this.codigo=codigo;
       this.precio=precio;
       this.cantidad=cantidad;
    }

    //Agrego Getters & Setters


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
