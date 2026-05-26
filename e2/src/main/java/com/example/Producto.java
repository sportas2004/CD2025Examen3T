package com.example;

public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void vender(int cantidad) throws Exception {

        if (cantidad <= 0) {
            throw new Exception("Cantidad inválida");
        }

        if (cantidad > stock) {
            throw new Exception("Stock insuficiente");
        }

        stock = stock - cantidad;
    }

    public void reponer(int cantidad) throws Exception {

        if (cantidad <= 0) {
            throw new Exception("Cantidad inválida");
        }

        stock = stock + cantidad;
    }

    public double calcularValorStock() {
        return precio * stock;
    }
}