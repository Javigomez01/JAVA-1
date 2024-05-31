package Practica_2do_parcial;

import java.util.Arrays;

public class Ordenamientos {
    public static void main(String[] args) {
        int[] Orden = {6, 56, 8, 3, 67, 12, 4, 7, 5};
        System.out.println("Ordenar de mayor a menor");
        Arrays.sort(Orden);
        for (int i = 0; i <= (Orden.length - 1) ; i++) {
            System.out.println("Elemento N° " + i + ": " + Orden[i]);
        }
        System.out.println("Ordenar de mayor a menor paralelamente");
        Arrays.parallelSort(Orden);
        for (int elemento:Orden) {
            System.out.println(elemento + " ");
        }
    }
}
