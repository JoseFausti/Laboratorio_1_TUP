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
public class Ejercicios_Estructura_Secuencial_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2)_Programa Java que lea un nombre y muestre por pantalla: "Buenos dias" + nombre_introducido.
        
        // Creamos el scaner:
        Scanner dos = new Scanner(System.in);
        
        // Definimos las variables:
        String nombreIntroducido;
        
        // Mostramos el mensaje por pantalla y le pedimos al usuario
        // que ingrese su nombre:
        System.out.println("Ingrese su nombre: ");
        nombreIntroducido = dos.nextLine();
        
        // Mostramos el mensaje por pantalla...
        System.out.println("Buenos Días " + nombreIntroducido);
        
        
        
    }
    
}
