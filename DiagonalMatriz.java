/*54) Diagonal Principal de una Matriz
Escribe un programa que imprima los elementos de la diagonal principal de una matriz cuadrada.  De una matriz de 3x3
*/
package Practica_2do_parcial;
public class DiagonalMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Elementos de la diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i]);
        }
    }
}
