package com.example;

public class NumeroPrimo {

    public boolean esPrimo(int n) throws Exception {

        if (n < 0) {
            throw new Exception("Error. El número tiene que ser >=0");
        }

        if (n == 0 || n == 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }

        }

        return true;
    }
}
