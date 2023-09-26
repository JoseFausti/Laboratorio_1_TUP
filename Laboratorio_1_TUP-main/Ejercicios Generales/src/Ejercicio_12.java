import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n;
        String texto;

        String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

        System.out.println("Introduce el texto a cifrar: ");
        texto = lector.nextLine().toUpperCase(); // Convertir a mayúsculas

        System.out.print("Introduce el valor del desplazamiento: ");
         n = lector.nextInt();

        String textoCifrado = cifrarTexto(texto, abecedario, n);
        String textoDescifrado = descifrarTexto(textoCifrado, abecedario, n);

        System.out.println("Texto cifrado: " + textoCifrado);
        System.out.println("Texto descifrado: " + textoDescifrado);
    }

    public static String cifrarTexto(String texto, String abecedario, int n) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (Character.isLetter(caracter)) {
                int indice = abecedario.indexOf(caracter);
                int nuevoIndice = (indice + n) % abecedario.length();
                char nuevoCaracter = abecedario.charAt(nuevoIndice);
                resultado.append(nuevoCaracter);
            } else {
                resultado.append(caracter); // Mantener caracteres no alfabéticos sin cambios
            }
        }

        return resultado.toString();
    }

    public static String descifrarTexto(String texto, String abecedario, int n) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (Character.isLetter(caracter)) {
                int indice = abecedario.indexOf(caracter);
                int nuevoIndice = (indice - n + abecedario.length()) % abecedario.length();
                char nuevoCaracter = abecedario.charAt(nuevoIndice);
                resultado.append(nuevoCaracter);
            } else {
                resultado.append(caracter); // Mantener caracteres no alfabéticos sin cambios
            }
        }

        return resultado.toString();
    }
}

