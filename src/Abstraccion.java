/*Crea una clase abstracta Figura con un método abstracto calcularArea.
Luego, crea clases Circulo y Cuadrado que extiendan de Figura y proporcionen la implementación del método calcularArea.*/
public class Abstraccion {
    public static void main(String[] args) {
        Figura circulo = new Circulo(3);
        Figura cuadrado = new Cuadrado(4);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
    }

    abstract class Figura {
        public abstract double calcularArea();
    }

     class Circulo extends Figura {
        private double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * radio * radio;
        }
    }

     class Cuadrado extends Figura {
        private double lado;

        public Cuadrado(double lado) {
            this.lado = lado;
        }

        @Override
        public double calcularArea() {
            return lado * lado;
        }
    }
}
