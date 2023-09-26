package Ejercicios;

import java.util.Scanner;
public class Ejercicio_15_2 {

    public class ejercicio15_2 {
        public static void main(String[] args) {
            int num1,num2;
            Scanner lector= new Scanner(System.in);
            System.out.println("ingrese dos numeros que quiera operar");
            num1=lector.nextInt();
            num2=lector.nextInt();
            if(num2 ==0)
                System.out.println("no es posible dividir un numero por 0");
            else
                System.out.println(num1/num2);
        }
    }

}
