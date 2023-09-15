package Ejercicios;

import java.util.Scanner;
public class Ejercicio_18 {
    public static void main(String[] args) {
        int H,M,S;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la hora: ");
        H =  sc.nextInt();
        System.out.print("Ingrese los minutos: ");
        M =  sc.nextInt();
        System.out.print("Ingrese los segundos: ");
        S =  sc.nextInt();
        if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60)
            System.out.println("Hora valida");
        else
            System.out.println("Hora invalida");
    }
}
