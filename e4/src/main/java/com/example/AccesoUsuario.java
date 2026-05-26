package com.example;

public class AccesoUsuario {

    public String comprobarAcceso(int idade, boolean tenEntrada) {
                                                
        if (idade >= 18) {  
 
            if (tenEntrada) {  
                return "Acceso permitido";
            } else {  
                return "Necesita entrada";
            }

        } else {  

            return "Acceso denegado";

        }

    }
}