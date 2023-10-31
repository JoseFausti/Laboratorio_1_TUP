import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ejercicio_2 {
    public static void main(String[] args) {


    /*2-Escriba una aplicación que:
a) lea 20 números decimales ingresados por teclado por el usuario y los
coloque en un ArrayList<Integer>.
b) determine y muestre el mayor de los números en el arreglo
c) determine y muestre el menor de los números del arreglo calcule y
muestre el rango (diferencia entre el mayor y el menor) de los
elementos en el arreglo*/
        Scanner lector = new Scanner(System.in);
        ArrayList<Double> numerosDecimales = new ArrayList<Double>();


        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el número decimal " + i + ": ");
            double numero = lector.nextDouble();
            numerosDecimales.add(numero);
        }

        // Muestra el mayor número en el arreglo
        double mayor = Collections.max(numerosDecimales);
        System.out.println("El número más grande es: " + mayor);

        //Muestra el menor número en el arreglo
        double menor = Collections.min(numerosDecimales);
        System.out.println("El número más pequeño es: " + menor);

        // Calcula y muestra el rango de los elementos en el arreglo
        double rango = mayor - menor;
        System.out.println("El rango de los elementos es: " + rango);

        lector.close();
    }
}
