package Practica_2do_parcial;

import java.util.ArrayList;

public class RetornarPares {
    public static ArrayList<Integer> getNumerosPares(int [] array) {
        ArrayList<Integer> numerosPares = new ArrayList<>();
        for (int numero: array) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }
        }
        return numerosPares;
    }
}
