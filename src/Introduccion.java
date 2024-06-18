import java.security.PublicKey;

public class Introduccion {

    // ENCAPSULAMIENTO
    public static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
    // HERENCIA
    public class mascota {
        private String nombre;
        private int edad;

        public mascota(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

            public void hacerSonido() {
                System.out.println("La mascota hace un sonido");
            }
            public String getNombre() {
            return nombre;
            }
            public int getEdad() {
            return edad;
            }
    }
    public class perro extends mascota {

        public perro(String nombre, int edad) {
            super(nombre, edad);
        }

        @Override                        //POLIMORFISMO
        public void hacerSonido() {
            System.out.println(getNombre() +  " dice: ¡guau guau!");
        }
    }
    public class gato extends mascota {
        public gato(String nombre, int edad) {
            super(nombre, edad);
        }

        @Override                      //POLIMORFISMO
        public void hacerSonido () {
            System.out.println(getNombre() + " dice ¡miau miau!");

        }

    }
    public class tortuga extends mascota {
        public tortuga(String nombre, int edad) {
            super(nombre, edad);
        }

        @Override                       //POLIMORFISMO
        public void hacerSonido() {
            System.out.println(getNombre() + " no hace sonido");
        }
    }
    public static void main(String[] args) {
    //CREAR OBJETOS
    Persona persona1 = new Persona("Jime", 28);

    //USAR LOS METODOS DEL OBJETO
    System.out.println("Nombre: " + persona1.getNombre());
    }
}

