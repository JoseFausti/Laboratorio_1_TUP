import javax.swing.JOptionPane;
public class Ejercicio7 {
    public static void main(String[] args) {
        /*7- Dado un texto terminado en punto, contar la cantidad de palabras.*/
        String texto = JOptionPane.showInputDialog("ingrese una oración");
        if (texto != null && !texto.isEmpty()) {
            String[] palabras = texto.split(" ");
            int cantidadPalabras = palabras.length;
            JOptionPane.showMessageDialog(null, "cantidad de palabras: " + cantidadPalabras);
        } else {
            JOptionPane.showMessageDialog(null, "el mensaje ingresado no es válido");
        }
    }
}
