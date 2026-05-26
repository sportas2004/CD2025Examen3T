package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    @Test
    void constructorProductoTestV1() {
        Producto objProducto1=new Producto("arroz",2.5,15);
        assertEquals("arroz",objProducto1.getNombre());
        assertEquals(2.5,objProducto1.getPrecio());
        assertEquals(15,objProducto1.getStock());
    }

    @Test
    void metodoVenderTestV1() {
        Producto objProducto1=new Producto("arroz",2.5,15);
        Exception exception = assertThrows(Exception.class, () ->
                objProducto1.vender(16)
                );
        assertEquals("Stock insuficiente", exception.getMessage());
    }

    @Test
    void metodoVenderTestV2() {
        Producto objProducto1=new Producto("arroz",2.5,15);
        Exception exception = assertThrows(Exception.class, () ->
                objProducto1.vender(-1)
        );
        assertEquals("Cantidad inválida", exception.getMessage());
    }

    @Test
    void metodoVenderTestV3() throws Exception {
        Producto objProducto1=new Producto("arroz",2.5,15);
            objProducto1.vender(5);
        assertEquals(10,objProducto1.getStock());
    }

    @Test
    void metodoReponerTestV1() {
        Producto objProducto1=new Producto("arroz",2.5,15);
        Exception exception = assertThrows(Exception.class, () ->
                objProducto1.reponer(-1)
        );
        assertEquals("Cantidad inválida", exception.getMessage());
    }

    @Test
    void metodoReponerTestV2() throws Exception {
        Producto objProducto1=new Producto("arroz",2.5,15);
        objProducto1.reponer(5);
        assertEquals(20,objProducto1.getStock());
    }

    @Test
    void metodoCalcularStockTestV1() throws Exception {
        Producto objProducto1=new Producto("arroz",2.5,15);
        assertEquals(37.5,objProducto1.calcularValorStock());
    }


}
