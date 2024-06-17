/*Crea una clase Vehiculo con un método mover.
Luego, crea una clase Coche que herede de Vehiculo y sobrescriba el método mover. Implementa ambos métodos para que impriman un mensaje diferente*/
public class Sobreescritura {
    static class Vehiculo {
        public void mover() {
            System.out.println("El vehículo se está moviendo");
        }
    }

    static class Coche extends Vehiculo {
        @Override
        public void mover() {
            System.out.println("El coche se está moviendo");
        }

        public static void main(String[] args) {
            Vehiculo vehiculo = new Vehiculo();
            Vehiculo coche = new Coche();

            vehiculo.mover();
            coche.mover();
        }
    }
}
