import javax.swing.*;
public class Ejercicio_4 {
    public static void main(String[] args) {
        int numero;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero" +
                    " mayor a 0 para " + "conocer la cantidad de dígitos que posee: "));
        }while (numero <= 0);
        JOptionPane.showMessageDialog(null,"La cantidad de cifras que posee"+
                " el numero " +  numero + " es: " + Cantidad_digitos(numero) );
    }
    public static int Cantidad_digitos(int numero){
        if (numero < 10){
            return 1;

        }else {
            return  1 + Cantidad_digitos(numero / 10);
        }
    }
}
