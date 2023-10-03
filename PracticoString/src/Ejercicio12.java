import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese varias frases separadas por ';': ");
        String input = scanner.nextLine();

        String[] frases = input.split(";");

        String oracionMasLarga = "";
        String palabraMasCorta = "";

        for (String frase : frases) {
            // Eliminar los números de la frase
            String fraseSinNumeros = frase.replaceAll("[0-9]", "");

            // Dividir la frase sin números en palabras
            String[] palabras = fraseSinNumeros.trim().split("\\s+");

            if (fraseSinNumeros.length() > oracionMasLarga.length()) {
                oracionMasLarga = fraseSinNumeros;
            }

            for (String palabra : palabras) {
                if (palabraMasCorta.isEmpty() || palabra.length() < palabraMasCorta.length()) {
                    palabraMasCorta = palabra;
                }
            }
        }

        System.out.println("La oración con más palabras es: ");
        System.out.println(oracionMasLarga);
        System.out.println("La palabra más corta es: " + palabraMasCorta);

        scanner.close();
    }
}
