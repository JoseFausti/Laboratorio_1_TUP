import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        int num;


        Scanner sn = new Scanner(System.in);


        while (true) {
            System.out.println("ingrese un numero , ingrese 0 para terminar");
            num = sn.nextInt();
            if (0 == num) {
                break;
            }

            array.add(num);

        }
        System.out.println("Los numeros ingresados son");
        for (int number : array) {
            System.out.println(number + " ");
        }
    }
}