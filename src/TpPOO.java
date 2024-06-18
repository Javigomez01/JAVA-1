import java.util.ArrayList;

public class TpPOO {
    public static void main(String[] args) {

    }
    static class Persona {
        String Nombre;
        String Apellido;
        int DNI;
        public Persona(String nombre, String apellido, int dni) {
            this.Nombre = nombre;
            this.Apellido = apellido;
            this.DNI = dni;
        }
        public void VerAtributos() {
            System.out.println("Nombre: " + Nombre + "Apellido: " + Apellido + "DNI: " + DNI);
        }
    }
    static class Empleado extends Persona {
        int Sueldo;
        String Puesto;
        public Empleado(String nombre, String apellido, int dni, int sueldo, String puesto) {
            super(nombre, apellido, dni);
            this.Sueldo = sueldo;
            this.Puesto = puesto;
        }
        @Override
        public void VerAtributos() {
            System.out.println("Nombre: " + Nombre + "Apellido: " + Apellido + "DNI: " + DNI + "Sueldo: " + Sueldo + "puesto: " + Puesto);
        }
    }
    static class Estudiante extends Persona  {
        int Matricula;
        String Carrera;
        public Estudiante(String nombre, String apellido, int dni, int matricula, String carrera) {
            super(nombre, apellido, dni);
            this.Matricula = matricula;
            this.Carrera = carrera;
        }
        @Override
        public void VerAtributos () {
            System.out.println("Nombre: " + Nombre + "Apellido: " + Apellido + "DNI: " + DNI + "Matricula :" + Matricula + "Carrera: " + Carrera);
        }
    }
    static class Profesor extends Persona {
        String Materia;
        int Antiguedad;
        public Profesor(String nombre, String apellido, int dni, String materia, int antiguedad) {
            super(nombre, apellido, dni);
            this.Materia = materia;
            this.Antiguedad = antiguedad;
        }
        @Override
        public void VerAtributos() {
            System.out.println("Nombre: " + Nombre + "Apellido: " + Apellido + "DNI: " + DNI + "Materia: " + Materia + "Antiguedad: " + Antiguedad + "años.");
        }
    }
    static class Comision {
        private Profesor profesor;
        private ArrayList<Estudiante> estudiantes;
        public Comision (Profesor profe, ArrayList<Estudiante> estudiante) {
            this.profesor = profe;
            this.estudiantes = estudiante;
        }
        public void EliminarEstudiante (ArrayList<Estudiante> estudiantes, String EstudianteEliminado ) {
            if (estudiantes.contains(EstudianteEliminado)) {
                estudiantes.remove(EstudianteEliminado);
                System.out.println(EstudianteEliminado + "Fue eliminado correctamnte");
            } else {
                System.out.println("El estudiante no se encuentra en la lista");
            }
        }
        public void ListarComision () {
            profesor.VerAtributos();
            for (Estudiante estudiante: estudiantes) {
                estudiante.VerAtributos();
            }
        }
    }
}
