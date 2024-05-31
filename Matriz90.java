package Practica_2do_parcial;

public class Matriz90 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matriz90 = rotarMatriz(matriz);
        for (int x=0; x<3; x++) {
            for (int y=0; y<3; y++) {
                System.out.print(matriz90[x][y]+" ");
            }
            System.out.println("");
        }
    }
        public static int[][] rotarMatriz ( int[][] matriz){
            int n = matriz.length;
            int[][] matrizRotada = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrizRotada[j][n - 1 - i] = matriz[i][j];
                }
            }
            return matrizRotada;
        }
    }



