import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = lector.nextInt();

        if (cantidadAlumnos <= 0) {
            System.out.println("La cantidad de alumnos debe ser mayor que cero.");
            return;
        }

        double sumaNotas = 0;
        double notaMayor = Double.MIN_VALUE;
        double notaMenor = Double.MAX_VALUE;

        for (int i = 1; i <= cantidadAlumnos; i++) {
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            double nota = lector.nextDouble();

            sumaNotas += nota;

            if (nota > notaMayor) {
                notaMayor = nota;
            }

            if (nota < notaMenor) {
                notaMenor = nota;
            }
        }

        double notaMedia = sumaNotas / cantidadAlumnos;

        System.out.println("Nota media de la clase: " + notaMedia);
        System.out.println("Nota mayor: " + notaMayor);
        System.out.println("Nota menor: " + notaMenor);
    }
}

