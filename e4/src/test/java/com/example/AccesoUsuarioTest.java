package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccesoUsuarioTest {

    @Test
    void TestV1() {
    AccesoUsuario obj=new AccesoUsuario();
   assertEquals("Acceso denegado",obj.comprobarAcceso(17,true));
    }

    @Test
    void TestV2() {
        AccesoUsuario obj=new AccesoUsuario();
        assertEquals("Acceso permitido",obj.comprobarAcceso(18,true));
    }

    @Test
    void TestV3() {
        AccesoUsuario obj=new AccesoUsuario();
        assertEquals("Necesita entrada",obj.comprobarAcceso(18,false));
    }

}
