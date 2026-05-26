package com.example;

/**
 *Objeto para control la temperatura de un espacio
 * @author Sergio Portas Arcos
 */
public class XestorTemperaturas {

    private double temperaturaActual;

    /**
     * Constructor para la creacion del Objeto apartir de la temperatura actual del lugar
     * @param temperaturaInicial Temperatura actual del recinto
     */
    public XestorTemperaturas(double temperaturaInicial) {
        temperaturaActual = temperaturaInicial;
    }

    /**
     * Metodo para aumentar la temperatura del recinto
     * @param incremento Cantidad de temperatura que se quiere aumentar a la actual
     */

    public void aumentarTemperatura(double incremento) {

        if (incremento > 0) {
            temperaturaActual = temperaturaActual + incremento;
        }

    }

    /**
     * Metodo para reducir la temperatura del recinto
     * @param reducion Cantidad de temperatura que se quiere reducir respecto a la actual
     */
    public void reducirTemperatura(double reducion) {

        if (reducion > 0) {
            temperaturaActual = temperaturaActual - reducion;
        }

    }

    /**
     * Metodo get para obtener la temperatura actual
     * @return Double
     */
    public double getTemperaturaActual() {
        return temperaturaActual;
    }

    /**
     * Metodo que comprueba si la temperatura es 0 o menor de 0
     * @return Boolean
     */
    public boolean estaConxelada() {return temperaturaActual <= 0;}

    /**
     * Metodo para obtener el estado del recinto apartir de diferentes valores de temperatura preestablecidos
     * devolviendo un mensaje del estado de la temperatura
     * @return String
     */
    public String obterEstado() {

        if (temperaturaActual < 0) {
            return "Conxelada";
        }

        if (temperaturaActual >= 0 && temperaturaActual < 25) {
            return "Fría";
        }

        if (temperaturaActual >= 25 && temperaturaActual < 60) {
            return "Normal";
        }

        return "Quente";
    }
}