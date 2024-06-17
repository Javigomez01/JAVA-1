/*Crea una clase Cliente con los atributos nombre y edad. Luego, crea una clase Pedido
con el atributo numero y un atributo cliente de tipo Cliente. Implementa un método en Pedido para mostrar los datos del cliente y del pedido*/
public class Relaciones {
    static class Cliente {
        String nombre;
        int edad;

        public Cliente(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String verAtributos() {
            return "Nombre: " + nombre + ", Edad: " + edad;
        }
    }

    static class Pedido {
        int numero;
        Cliente cliente;

        public Pedido(int numero, Cliente cliente) {
            this.numero = numero;
            this.cliente = cliente;
        }

        public void verDetalles() {
            System.out.println("Pedido N°: " + numero);
            System.out.println("Cliente: " + cliente.verAtributos());
        }

        public static void main(String[] args) {
            Cliente cliente = new Cliente("Ana", 25);
            Pedido pedido = new Pedido(123, cliente);
            pedido.verDetalles();
        }
    }
}
