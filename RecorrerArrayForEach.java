package Practica_2do_parcial;

public class RecorrerArrayForEach {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.println(elemento + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Mostrar de forma vertical");
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.println(matriz[x][y] + " ("+x+","+y+")");
            }
        }
        System.out.println("Mostrar de forma matricial");
        for (int x=0; x<4; x++) {
            for (int y=0; y<3; y++) {
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println("");
        }
    }
}

