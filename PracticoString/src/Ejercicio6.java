import javax.swing.*;

public class Ejercicio6{
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese la frase: ");

        int cantidadVocales= contarVocales(texto);

        JOptionPane.showMessageDialog(null, "Cantidad de vocales: " + cantidadVocales);
    }
    public static int contarVocales(String texto){
        texto=texto.toLowerCase();
        int contador=0;

        for (int i=0; i < texto.length(); i++){
            char caracter= texto.charAt(i);
            if (caracter=='a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u'){
                contador++;
            }
        }
        return contador;

    }
}
