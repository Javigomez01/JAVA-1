package Practica_2do_parcial;

public class ArrayInvertido {
    public static void main (String [] args) {

    }
    public static int [] invertir(int [] array) {
        int [] arrayinvertido = new int[array.length];
        for ( int i = 0; i < array.length; i ++) {
            arrayinvertido[i] = array[array.length - i - 1];
        }
        return arrayinvertido;
    }
}
