import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        String phrase;
        int letterA = 0;
        phrase = JOptionPane.showInputDialog("Ingrese una frase (con punto al final): ").toLowerCase();
        if (('.') == phrase.charAt(phrase.length()-1)){
            for(int i = 0; i < phrase.length(); i++){
                if ('a' == phrase.charAt(i)){
                    letterA += 1;
                }
            }
            JOptionPane.showMessageDialog(null, "La frase tiene un total de " + letterA + " letras A");
        }
    }
}
