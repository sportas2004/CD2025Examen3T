package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class NumeroPrimoTest {


    @Test
    void testmetodoesPrimoV1() throws Exception {
        NumeroPrimo obj=new NumeroPrimo();
        assertTrue(obj.esPrimo(2));
        assertTrue(obj.esPrimo(11));
        assertTrue(obj.esPrimo(Integer.MAX_VALUE));
    }

    @ParameterizedTest
    @CsvSource({"0", "1","10"})
    void testmetodoesPrimoV2(int numero) throws Exception {
        NumeroPrimo obj=new NumeroPrimo();
        assertFalse(obj.esPrimo(numero));
    }

    @Test
    void testmetodoesPrimoV3() throws Exception {
        NumeroPrimo obj=new NumeroPrimo();

        Exception exception = assertThrows(Exception.class, () -> {
           obj.esPrimo(Integer.MIN_VALUE);
           obj.esPrimo(-1);
           obj.esPrimo(-1);
            obj.esPrimo(-10);
        });

        assertEquals("Error. El número tiene que ser >=0", exception.getMessage());



    }


}
