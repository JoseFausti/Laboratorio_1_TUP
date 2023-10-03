import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese varias frases separadas por ';': ");
        String entrada = scanner.nextLine();


        String[] frases = entrada.split(";");


        int longitudMaxima = 0;
        String oracionMasLarga = "";


        for (String frase : frases) {

            frase = frase.trim();


            int longitud = frase.length();


            if (longitud > longitudMaxima) {
                longitudMaxima = longitud;
                oracionMasLarga = frase;
            }
        }

        if (!oracionMasLarga.isEmpty()) {
            System.out.println("La oración más larga es: ");
            System.out.println(oracionMasLarga);
        } else {
            System.out.println("No se ingresaron frases válidas.");
        }

        scanner.close();
    }
}
