import java.util.ArrayList;
import java.util.Scanner;

public class CargarNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();

        boolean salirAlumno;
        do {
            // Crear un nuevo alumno
            System.out.println("INGRESE DATOS DEL ALUMNO");
            System.out.print("INGRESE NOMBRE COMPLETO: ");
            String nombreCompleto = scanner.nextLine();
            System.out.print("INGRESE LEGAJO: ");
            int legajo = scanner.nextInt();
            scanner.nextLine();

            ArrayList<Nota> notas = new ArrayList<>();
            boolean salirNotas;

            do {
                // Crear una nueva nota
                System.out.println("INGRESE DATOS DE LA NOTA");
                System.out.print("INGRESE NOMBRE CATEDRA: ");
                String nombreCatedra = scanner.nextLine();
                System.out.print("NOTA DEL EXAMEN: ");
                double notaExamen = scanner.nextDouble();
                scanner.nextLine();

                // Agregar la nota a la lista de notas del alumno
                notas.add(new Nota(nombreCatedra, notaExamen));

                // Preguntar si desea salir de la carga de notas
                System.out.print("¿DESEA SALIR DE LA CARGA DE NOTAS? (true/false): ");
                salirNotas = scanner.nextBoolean();
                scanner.nextLine();

            } while (!salirNotas);

            // Crear el objeto Alumno con las notas y agregarlo a la lista de alumnos
            alumnos.add(new Alumno(nombreCompleto, legajo, notas));

            // Preguntar si desea salir de la carga de alumnos
            System.out.print("¿DESEA SALIR DE LA CARGA DE ALUMNOS? (true/false): ");
            salirAlumno = scanner.nextBoolean();
            scanner.nextLine();

        } while (!salirAlumno);

        // Mostramos los resultados
        for (Alumno alumno:alumnos) {
            System.out.println("DATOS ALUMNOS");
            System.out.println("Alumno: "+alumno.getNombreCompleto());
            System.out.println("Legajo: "+alumno.getLegajo());
            System.out.println("NOTAS");
            for (Nota nota: alumno.getArrayNotas()) {
                System.out.println(nota.getCatedra()+": "+nota.getNotaExamen());
            }
            System.out.println(" ");
        }

    }
}