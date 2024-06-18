/* Enunciado: Crea una clase base Animal con un método hacerSonido. Luego, crea clases derivadas Perro y Gato que sobrescriban el método hacerSonido.
En el método principal, crea una lista de Animal que contenga objetos de tipo Perro y Gato, y llama al método hacerSonido para cada uno.*/
import java.util.ArrayList;
public class Polimorfismo {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());
        for (Animal animal: animales) {
            animal.hacerSonido();
        }
    }
    static class Animal {

        public void hacerSonido () {
            System.out.println("El animal hace ");
        }
    }
    static class Perro extends Animal {

        @Override
        public void hacerSonido() {
            System.out.println("El perro hace guau");
        }
    }
    static class Gato extends Animal {

        @Override
        public void hacerSonido() {
            System.out.println("El gato hace miau");
        }
    }
}
