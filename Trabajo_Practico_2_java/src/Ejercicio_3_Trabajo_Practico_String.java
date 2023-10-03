import javax.swing.*;

public class Ejercicio_3_Trabajo_Practico_String {
    public static void main(String[] args) {
        /* Dado una secuencia de no nulos, mostrar el
        menor de los pares y la cantidad de impares. */

        int Even = Integer.MAX_VALUE ;
        int Odd = 0;
        int Value;
        int Number = 1;
        Value = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la vantidad de valores a ingresar: "));
        while ( Value > 0 || Number != 0){
            Number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número no nulo: "));
            if (Number == 0){
                break;
            }else {
                if (Number % 2 == 0){
                    if (Number < Even){
                        Even = Number;
                    }
                } else if ( Number % 2 != 0) {
                    Odd += 1;
                }
            Value -= 1;
            }
        }
        if (Even == Integer.MAX_VALUE){
            JOptionPane.showMessageDialog(null, "No se ingresaron " +
                    "valores pares.");
        }else {
            JOptionPane.showMessageDialog(null, "El menor " +
                    "de los números pares es: "+ Even);
        }
        JOptionPane.showMessageDialog(null, "La cantidad " +
                "de números impares es: "+ Odd);

    }
}
