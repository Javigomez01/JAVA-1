package Practica_2do_parcial;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Concesionario {
    public static void main(String[] args) {
        ArrayList<String> Vehiculos = new ArrayList<>();
        int Opcion;
        Scanner SC = new Scanner(System.in);
        do {
            System.out.println("Menu de opciones");
            System.out.println("1_ Agregar vehiculo");
            System.out.println("2_ Buscar vehiculo");
            System.out.println("3_ Elminar vehiculo");
            System.out.println("4_ Listar Vehiculos");
            System.out.println("5_ Ordenar vehiculos alfabeticamente");
            System.out.println("6_ Editar vehiculo por indice");
            System.out.println("7_ Salir");
            System.out.println("ELIJA UNA OPCION");
            Opcion = SC.nextInt();
            switch (Opcion) {
                case 1:
                    System.out.println("agregar");
                    agregar(Vehiculos);
                    System.out.println("Vehiculo agregado con exito");
                    System.out.println("La lista de vehiculos es" + Vehiculos);
                    break;
                case 2:
                    System.out.println("Buscar");
                    buscar(Vehiculos);
                    break;
                case 3:
                    System.out.println("eliminar");
                    eliminar(Vehiculos);
                    System.out.println("La lista de vehiculos es" + Vehiculos);
                    break;
                case 4:
                    System.out.println("Listar");
                    listar(Vehiculos);
                    break;
                case 5:
                    System.out.println("ordenar");
                    ordenar(Vehiculos);
                    System.out.println("La lista de vehiculos es" + Vehiculos);
                    break;
                case 6:
                    System.out.println("editar");
                    int Indice1;
                    String NuevoNombre;
                    System.out.println("Ingrese el indice del auto que desea cambiar");
                    Indice1 = SC.nextInt();
                    SC.nextLine();
                    System.out.println("Ingrese el nuevo auto");
                    NuevoNombre = SC.nextLine();
                    editar(Vehiculos, Indice1, NuevoNombre);
                    System.out.println("La lista de vehiculos es" + Vehiculos);
                    break;
                case 7:
                    System.out.println("salir");
                    SC.close();
                    break;
                default:
                    System.out.println("Elija una opcion correcta");
            }

        } while (Opcion != 7);

    }

    public static void agregar(ArrayList<String> Vehiculos) {
        Scanner ve = new Scanner(System.in);
        String NuevoVehiculo;
        System.out.println("Ingrese el vehiculo para agregar");
        NuevoVehiculo = ve.nextLine();
        Vehiculos.add(NuevoVehiculo);
    }

    public static void buscar(ArrayList<String> Vehiculos) {
        Scanner SC = new Scanner(System.in);
        String BuscarVehiculo;
        System.out.println("¿Que vehiculo desea buscar");
        BuscarVehiculo = SC.nextLine();
        int IndiceNuevo = Vehiculos.indexOf(BuscarVehiculo);
        if (Vehiculos.contains(BuscarVehiculo)) {
            System.out.println("El vehiculo se encuentra en la lista, su indice es " + IndiceNuevo);
        } else {
            System.out.println("El vehiculo no se encuentra en la lista");
        }
    }
    public static void eliminar(ArrayList<String> lista) {
        Scanner el = new Scanner(System.in);
        String VehiculoEliminar;
        System.out.println("¿Que vehiculo desea eliminar?");
        VehiculoEliminar = el.nextLine();
        if (lista.contains(VehiculoEliminar)) {
            lista.remove(VehiculoEliminar);
            System.out.println("El vehiculo fue eliminado");
        } else {
            System.out.println("El vehiculo no se encuentra en la lista");
        }
    }
    public static void listar(ArrayList<String> lista) {
        System.out.println("Listado de autos:");
        String listaautos = "";
        for (String auto : lista) {
            listaautos += auto + "\n";
        }
        System.out.println(listaautos);
    }
    public static void ordenar(ArrayList<String> lista) {
        Collections.sort(lista);
        System.out.println("autos ordenados alfabéticamente.");
    }
    public static void editar (ArrayList<String> lista, int indice, String NuevoAuto) {
        if ( indice >= 0 && indice <= lista.size()) {
            lista.set(indice, NuevoAuto);
            System.out.println("Auto cambiado correctamente");
        } else {
            System.out.println("El indice es incorrecto");
        }
    }
}