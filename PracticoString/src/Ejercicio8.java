import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        /*8 -Dado un texto terminado en punto, contar la cantidad de palabras terminadas en vocal.*/
        String texto = JOptionPane.showInputDialog("Ingrese un mensaje terminado en punto");
        texto = texto.toLowerCase();
        if (texto != null && texto.isEmpty()){
            String palabras [] = texto.split(" ");
            int contadorPalabrasTerminadasEnVocal = 0;
            for (String palabra : palabras){
                char ultimaletra = palabra.charAt(palabra.length() - 1);
                if( ultimaletra == 'a' || ultimaletra == 'á' || ultimaletra == 'e' || ultimaletra == 'é' || ultimaletra == 'i' || ultimaletra == 'í' || ultimaletra == 'o' || ultimaletra == 'ó' || ultimaletra == 'u' || ultimaletra == 'ú' );{


                    contadorPalabrasTerminadasEnVocal++;
                    JOptionPane.showMessageDialog(null,"cantidad de palabras terminadas en vocal" + contadorPalabrasTerminadasEnVocal);
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"el texto no es válido");
        }
    }
}
