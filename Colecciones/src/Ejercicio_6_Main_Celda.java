/*6. Codifique la clase celda con los atributos:
int fila;
int columna;
String valor;
 Crea una clase Matriz que contenga una variable global
ArrayList<Celda>
ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
 Codifique un programa que solicite al usuario un valor para la
celda y que solicite la posición donde se desea almacenar el valor,
cree una instancia de la clase Celda, asigne los valores cargados
por el usuario y agregue la instancia a la lista matrizCuadrada;
repita este proceso hasta que el usuario ingrese como valor la
cadena “FIN”.
 Muestre por pantalla los valores cargados en matrizCuadrada.
 Codifique un método que reciba como parámetro los valores fila y
columna y retorne el valor almacenado, en caso de que la fila y la
columna no exista retorne el mensaje “La fila y columna indicada
no ha sido asignada”*/

import Ejercicios.Celda;
import Ejercicios.Celda.*;

import java.util.Scanner;

public class Ejercicio_6_Main_Celda {
    public static void main(String[] args) {
        Matriz matriz = new Celda.Matriz();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un valor para la celda (o 'FIN' para terminar): ");
            String valor = scanner.nextLine();

            if (valor.equals("FIN")) {
                break;
            }

            System.out.print("Ingrese la fila: ");
            int fila = scanner.nextInt();
            System.out.print("Ingrese la columna: ");
            int columna = scanner.nextInt();

            // Consumir la nueva línea después de leer enteros
            scanner.nextLine();

            Celda celda = new Celda(fila, columna, valor);
            matriz.agregarCelda(celda);
        }

        System.out.println("Valores en la matriz cuadrada:");
        matriz.mostrarMatrizCuadrada();

        System.out.print("Ingrese la fila para buscar: ");
        int fila = scanner.nextInt();
        System.out.print("Ingrese la columna para buscar: ");
        int columna = scanner.nextInt();

        // Consumir la nueva línea después de leer enteros
        scanner.nextLine();

        String valorBuscado = matriz.obtenerValor(fila, columna);
        System.out.println("Valor en la fila " + fila + " y columna " + columna + ": " + valorBuscado);

        scanner.close();
    }
}
