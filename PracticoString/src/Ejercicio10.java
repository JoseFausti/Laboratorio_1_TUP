import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase u oracion: ");
        String frase = scanner.nextLine();

        String palabraConsonantesSeguidas = encontrarPalabraConsonantesSeguidas(frase);

        if (palabraConsonantesSeguidas != null) {
            System.out.println("La palabra con más consonantes seguidas es: " + palabraConsonantesSeguidas);
        } else {
            System.out.println("No se encontraron palabras con consonantes seguidas en la frase.");
        }

        scanner.close();
    }

    public static String encontrarPalabraConsonantesSeguidas(String frase) {
        String[] palabras = frase.split("\\s+");
        String palabraConMasConsonantes = null;
        int maxConsonantesSeguidas = 0;

        for (String palabra : palabras) {
            int consonantesSeguidas = contarConsonantesSeguidas(palabra);

            if (consonantesSeguidas > maxConsonantesSeguidas) {
                maxConsonantesSeguidas = consonantesSeguidas;
                palabraConMasConsonantes = palabra;
            }
        }

        return palabraConMasConsonantes;
    }

    public static int contarConsonantesSeguidas(String palabra) {
        int contador = 0;
        int maxContador = 0;

        for (char letra : palabra.toCharArray()) {
            if (esConsonante(letra)) {
                contador++;
                if (contador > maxContador) {
                    maxContador = contador;
                }
            } else {
                contador = 0;
            }
        }

        return maxContador;
    }

    public static boolean esConsonante(char letra) {
        letra = Character.toLowerCase(letra);
        return letra >= 'b' && letra <= 'z' && "aeiou".indexOf(letra) == -1;
    }
}
