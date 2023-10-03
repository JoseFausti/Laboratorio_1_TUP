import javax.swing.*;

public class Ejercicio_2_Trabajo_Practico_String {
    public static void main(String[] args) {
        /* 2)_Dado una secuencia de no nulos, calcular el mayor de los negativos
        y el promedio de los positivos.*/
        int Value;
        int Number = 1;
        int Sumatory = 0;
        int Average = 0;
        int Counter = 0;
        int BiggerNumber = 0;

        Value = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de valores a ingresar: "));

        for (int i = 0; i < Value && Number != 0; i++) {

            Number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: (Ingrese 0 para salir) "));
            if (Number > 0) {
                Sumatory += Number;
                Counter++;
                Average = Sumatory / Counter;
            } else if (Number < 0) {
                if (Number < BiggerNumber) {
                    BiggerNumber = Number;
                }
            }
        }

        JOptionPane.showMessageDialog(null,
                "El mayor de los números negativos es: " + BiggerNumber);

        JOptionPane.showMessageDialog(null,
                "El promedio de los números positivos es: " + Average);
    }
}