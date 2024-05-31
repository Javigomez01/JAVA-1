package Practica_2do_parcial;
import java.util.ArrayList;
public class Fusion2Array {
    public static ArrayList<Object> intercalar(Object[] a1, Object[] a2) {
        ArrayList<Object> resultado = new ArrayList<>();
        int lenght = Math.min(a1.length, a2.length);
        for (int i = 0; i < lenght; i++) {
            resultado.add(a1[i]);
            resultado.add(a2[i]);
        }
        if (a1.length > a2.length) {
            for (int i = lenght; i < a1.length; i++) {
                resultado.add(a1[i]);
            }
        } else if (a2.length > a1.length) {
            for (int i = lenght; i < a2.length; i++) {
                resultado.add(a2[i]);
            }
        }
        return resultado;
    }
}

