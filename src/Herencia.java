/*Enunciado: Crea una clase Persona con los atributos nombre y edad.
Luego, crea una clase Empleado que herede de Persona y añada el atributo sueldo. Implementa el método verAtributos en ambas clases. */
public class Herencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Javi", 23, 500000);
        empleado1.verAtributos();

    }
    static class Persona {
         String nombre;
         int edad;
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        public void verAtributos() {
            System.out.println("Nombre: " + nombre + ", edad: " + edad);
        }
    }
    static class Empleado extends Persona {
        double Sueldo;
        public Empleado(String nombre, int edad, double Sueldo) {
        super(nombre, edad);
        this.Sueldo = Sueldo;
        }
        public void verAtributos() {
            System.out.println("Nombre: " + nombre + ", edad: " + edad + ", Sueldo: " + Sueldo);
        }
    }
}
