import java.util.Scanner;

public class Ejercicio_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu número de DNI: ");
        int numeroDNI = scanner.nextInt();

        char letraDNI = calcularLetraDNI(numeroDNI);
        System.out.println("La letra del DNI es: " + letraDNI);

        scanner.close();
    }

    public static char calcularLetraDNI(int numeroDNI) {
        // Array con las letras del DNI
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        // Calculo de la letra del DNI
        int resto = numeroDNI % 23;
        return letrasDNI[resto];
    }
}