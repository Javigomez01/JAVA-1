package Practica_2do_parcial;

public class EliminarElementoArray {
    public static int[] eliminarElemento (int[] arr, int v) {
        int conteo = 0;
        for (int i : arr) {
            if ( i == v) {
                conteo++;
            }
        }
        if (conteo == 0) {
            return arr;
        }
        int [] array = new int[arr.length + conteo];
        int indice = 0;
        for (int i : arr) {
            if (i != v) {
                array[indice++] = 1;
            }
        }
        return array;
    }
}
