package Practica_2do_parcial;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TodoArrays {
    public static void main (String [] args) {
        //Declarar ArrayList
        ArrayList<String> Lista = new ArrayList<>();
        //Agregar elemento
        Lista.add("Elemento 1");
        //Acceder a un elemto por indice
        String ElementoUno = Lista.get(1);
        //Modificar un elemento
        Lista.set(0, "Elemento 2"); // Reemplaza al elemento 0 con "Elemento 2"
        //Eliminar elemento
        Lista.remove("Elemento 1"); //Elimina "Elemento 1" de la lista
        //Crear una pila
        Stack <String> Pila = new Stack<>();
        //Apilar elementos
        Pila.push("Boca");
        //Desapilar elementos
        String equipo = Pila.pop(); //Obtiene y remueve el de abajo de todos de la pila
        String cima = Pila.peek(); //Obtiene el elemento de arriba sin removerlo
        Boolean estaVacia = Pila.isEmpty(); //Obtiene si la pila esta vacia
        //Crear una cola
        Queue<String> cola = new LinkedList<>();
        //Agregar elementos a la cola
        cola.offer("Hola");
        //Obtener y remover el elemento al frente de la cola
        String sacarUltimo = cola.poll();
        //Obtener el elemento al frente de la cola sin moverlo
        String SinMover = cola.peek();
        //Verificar si la cola esta vacia
        Boolean ColaVacia = cola.isEmpty();

    }
}
