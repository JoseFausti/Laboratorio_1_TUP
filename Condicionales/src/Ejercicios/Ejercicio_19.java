package Ejercicios;
import java.util.Scanner;
public class Ejercicio_19 {
    public static void main(String[] args) {
    int mes;
    Scanner cs = new Scanner(System.in);
    System.out.println( "insert a number of month " );
    mes = cs.nextInt();
    if( mes < 1 || mes > 12){
        System.out.println("the number entered does not correspond to a month");
    }else {
        switch (mes) {
            case 1 -> System.out.print("january");
            case 2 -> System.out.print("February");
            case 3 -> System.out.print("March");
            case 4 -> System.out.print("April");
            case 5 -> System.out.print("may");
            case 6 -> System.out.print("june");
            case 7 -> System.out.print("july");
            case 8 -> System.out.print("August");
            case 9 -> System.out.print("September");
            case 10 -> System.out.print("october");
            case 11 -> System.out.print("november");
            case 12 -> System.out.print("december");
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.print(" month of 30 days");
        } else if (mes == 2) {
            System.out.print("  month of 28 days ");

        } else {
            System.out.print(" month of 31 days ");
        }
    }
    }
}