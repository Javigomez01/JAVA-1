/*Enunciado: Crea una clase Coche con los atributos marca, modelo y año.
Luego, crea un objeto de la clase Coche e inicializa sus atributos y muestra los atributos del objeto en la consola.*/
public class ClaseYObjeto {
    public static void main(String[] args) {
        Coche Auto1 = new Coche ("Toyota", "Corolla", 2015);
        Auto1.verAtributos();

    }
    public static class Coche {
        String Marca;
        String Modelo;
        int Anio;
        public Coche(String marca, String modelo, int anio) {
            this.Marca = "Marca";
            this.Modelo = "Modelo";
            this.Anio = Anio;
        }
        public void verAtributos () {
            System.out.println("Marca: " + Marca + "\nModelo: " + Modelo + "\nAnio: " + Anio);
        }
    }
}
