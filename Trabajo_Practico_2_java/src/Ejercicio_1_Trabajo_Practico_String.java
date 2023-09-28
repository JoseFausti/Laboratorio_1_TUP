import javax.swing.*;

public class Ejercicio_1_Trabajo_Practico_String {
    public static void main(String[] args){
/*  1)_	A partir de una frase ingresada por pantalla analizar:
    _Su longitud.
    _El carácter asociado a un índice ingresado por pantalla.
    _Buscar una subcadena ingresada por pantalla.
    _El índice que ocupa el carácter 'x'.
    _La String transformada en mayúsculas.
*/
        String Phrase;
        int StringLength;
        int Subphrase;
        String letter;

        Phrase = JOptionPane.showInputDialog("Ingrese una frase: ");
        StringLength = Phrase.length();
        JOptionPane.showMessageDialog(null,"La longitud de la cadena es: " + StringLength);

        do {
            Subphrase = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número de pocisión dentro" +
                    "de la cadena:  (El rango de valores es de 0 hasta " + (StringLength - 1) + " )." ));
        }while (Subphrase != StringLength - 1 && Subphrase > -1);


        letter = String.valueOf(Phrase.charAt(Subphrase));

        JOptionPane.showMessageDialog(null,
                "La letra " + (Phrase.charAt(Subphrase)) + "se encuentra en las pocición "
                        + Phrase.indexOf(letter));

        JOptionPane.showMessageDialog(null,
                "La frase convertida a mayúsculas es: " + Phrase.toUpperCase());

        }
}