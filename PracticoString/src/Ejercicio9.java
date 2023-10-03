import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese un texto terminado en punto:");

        String palabraLarga = encontrarPalabraMasLarga(texto);

        JOptionPane.showMessageDialog(null, "La palabra más larga es: " + palabraLarga);
    }

    public static String encontrarPalabraMasLarga(String texto) {

        String[] palabras = texto.split(" ");

        String palabraLarga = palabras[0];

        for (String palabra : palabras) {

            if (palabra.length() > palabraLarga.length()) {
                palabraLarga = palabra;
            }
        }

        return palabraLarga;
    }
}



