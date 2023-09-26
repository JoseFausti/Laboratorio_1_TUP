package Ejercicios;
import java.util.Scanner;
public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner nombre= new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Introduzca primer número: ");
        num1 = nombre.nextInt();
        System.out.print("Introduzca segundo número: ");
        num2 = nombre.nextInt();
        System.out.print("Introduzca tercer número: ");
        num3 = nombre.nextInt();
        if(num1>num2) {
            if (num1 > num3){
                System.out.println("El numero mayor es: " + num1);
            }else{
                System.out.println("El numeros mayor es: "+num3);
            }
        }else if (num2 > num3){
            System.out.println("El numero mayor es: "+num2);
        }else{
            System.out.println("El numero mayor es: "+num3);
        }
    }
}
