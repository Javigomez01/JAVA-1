import java.awt.geom.Area;

/*Crea una clase Rectangulo con los atributos ancho y alto.
Proporciona un constructor que use la palabra clave this para diferenciar entre los atributos y los parámetros del constructor.
Añade un método calcularArea que devuelva el área del rectángulo.*/
public class UsoThis {
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo(5, 3);
        System.out.println(rec.Area());
    }
    static class Rectangulo {
        float ancho;
        float alto;
        public Rectangulo(float ancho, float alto) {
            this.ancho = ancho;
            this.alto = alto;
        }
        public float Area() {
            return ancho * alto;
        }
    }
}
