/*53) Determinante de una Matriz 2x2
Escribe un programa que calcule el determinante de una matriz 2x2. El determinante de una matriz 2x2 se calcula como: ad - bc
*/
package Practica_2do_parcial;

public class DeterminanteMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                { 4, 3 },
                { 2, 1 }
        };
        int determinante = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
        System.out.println("El determinante 2x2 es: " + determinante);
    }
}
