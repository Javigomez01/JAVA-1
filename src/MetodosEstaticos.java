/*Crea una clase Utilidades con un método estático convertirAMayusculas que tome un String y devuelva el mismo String en mayúsculas.
 Llama a este método desde el método main sin crear una instancia de la clase.*/
public class MetodosEstaticos {
    public static void main(String[] args) {
        String texto = "hola";
        System.out.println(utilidades.ConvertirMayusculas(texto));
    }
    static class utilidades {
    public static String ConvertirMayusculas(String texto) {
        return texto.toUpperCase();
    }
    }
}
