package Ejercicios;

import java.util.Scanner;

public class Ejercicio_15 {

    public class Ejercicio15 {
        public static void main(String[] args) {
            char car1;
            Scanner lector=new Scanner(System.in);
            System.out.println("ingrese un caracter");
            car1 = lector.next().charAt(0);
            if(car1>='0' && car1<'9')
                System.out.println("es un numero");
            else
                System.out.println("no es un numero");
        }
    }

}
