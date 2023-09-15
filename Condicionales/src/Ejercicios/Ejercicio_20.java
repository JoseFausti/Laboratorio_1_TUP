package Ejercicios;

import java.util.Scanner;

public class Ejercicio_20 {
    public static void main(String[] args) {
        /*Programa java para convertir una calificación numérica en alfabética.
        El programa lee por teclado una calificación numérica entre 0 y 10 y muestra por
        pantalla su correspondiente calificación alfabética.
        La equivalencia entre la calificación numérica y la alfabética se muestra en esta tabla:*/

        int nota = 0;
        System.out.println("Ingrese su nota: ");
        Scanner tres = new Scanner(System.in);
        nota = tres.nextInt();
        if (nota < 0 || nota > 10){
            System.out.println("Nota incorrecta, reinicie el programa");
        }else if (nota >= 0 && nota < 5){
            System.out.println("Insuficiente");
        }else if (nota >= 5 && nota < 6){
            System.out.println("Suficiente");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        }
    }
}
