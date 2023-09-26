/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios_estructura_secuencial_123;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Ejercicios_Estructura_Secuencial_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 3)_Escribe un programa Java que lee un número entero por teclado y obtiene 
        // y muestra por pantalla el doble y el triple de ese número.
        
        // Creamos el scaner:
        Scanner tres = new Scanner(System.in);
        
        // Definimos las variables:
        int numero;
        int doble;
        int triple;
        
        // Mostramos el mensaje por pantalla y le pedimos al usuario
        // que ingrese el numero:
        System.out.println("Ingrese un número: ");
        numero = tres.nextInt();
        doble = numero * 2;
        triple = numero * 3;
        
        // Mostramos el mensaje por pantalla...
        System.out.println("El número introducido fue: " + numero);
        System.out.println("El doble de dicho número es: " + doble);
        System.out.println("El triple de dicho número es: " + triple);
    }
    
}
