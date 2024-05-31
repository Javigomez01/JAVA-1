/*Crea una función en Java que reciba como parámetro una matriz (array bidimensional) de enteros, sume los elementos de la diagonal
principal y los almacene en una pila (Stack). La función debe retornar la pila con los elementos de la diagonal principal en el orden en
que aparecen en la matriz.
Requisitos:
1. La función debe llamarse sumarDiagonalPrincipal.
2. La función debe recibir un parámetro de tipo int[][].
3. La función debe retornar un Stack<Integer> que contenga los elementos de la diagonal principal de la matriz.
*/
package Practica_2do_parcial;
import java.util.ArrayList;
import java.util.Stack;

public class OtraDiagPrincipal {
    public static void main (String []args) {
        int[][] matriz3 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        Stack<Integer> DiagonalPrincipal = sumarDiagonalPrincipal(matriz3);
        System.out.println(DiagonalPrincipal);
    }
    public static Stack<Integer> sumarDiagonalPrincipal (int [][] matriz) {
        Stack<Integer> ElementosDiagonal = new Stack<>();
        for (int i = 0; i < matriz.length; i++) {
            ElementosDiagonal.push(matriz[i][i]);
        }
        return ElementosDiagonal;
    }
}
