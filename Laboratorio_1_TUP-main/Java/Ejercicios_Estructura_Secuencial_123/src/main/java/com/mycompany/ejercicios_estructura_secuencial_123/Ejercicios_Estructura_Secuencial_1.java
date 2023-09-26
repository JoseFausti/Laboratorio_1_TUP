/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios_estructura_secuencial_123;
import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Ejercicios_Estructura_Secuencial_1 {

    public static void main(String[] args) {
        // 1)_Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
        
        // Creamos el scaner:
        Scanner uno = new Scanner(System.in);
        
        // Definimos las variables:
        int n1;
        int n2;
        int resultado;
        
        // Mostramos el mensaje por pantalla y le pedimos al usuario
        // que ingrese los números:
      System.out.println("Ingrese el primer número entero: " );
      n1= uno.nextInt();
      System.out.println("Ingrese el segundo número entero: ");
      n2= uno.nextInt();
      
      // Introducimos la fórmula matemática:
      resultado = n1 + n2;
      
      // Mostramos el resultado por pantalla...
      System.out.println("Resultado: " + resultado);
      
      
      
    }
}
