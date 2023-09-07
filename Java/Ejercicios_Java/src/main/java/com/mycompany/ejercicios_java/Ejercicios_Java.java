/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios_java;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Ejercicios_Java {

    public static void main(String[] args) {
        int numero1, numero2,resultado;
        System.out.println("Ingrese el 1º numero: ");
        Scanner pepe= new Scanner(System.in);
        numero1=pepe.nextInt();
        
        System.out.println("Ingrese el 2º numero: ");
        Scanner popo= new Scanner(System.in);
        numero2=pepe.nextInt();
        System.out.println("Usted ingreso el numero: ");
        resultado= numero1 + numero2;
        System.out.println("Resultado: "+ resultado);
    }
}
