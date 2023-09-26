import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un número entre 1 y 3999: ");
            num = lector.nextInt();
        } while (num < 1 || num > 3999);
        System.out.println(num + " en numeros romanos es: " + convertirANumerosRomanos(num));
    }
    public static String convertirANumerosRomanos(int num) {
        String [] unidades = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String [] decenas = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String [] centenas = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String [] miles = {"","M","MM","MMM"};
        int mil,cen,dec,uni;
        mil = num / 1000;
        num = num % 1000;
        cen = num /100;
        num = num % 100;
        dec = num / 10;
        num = num % 10;
        uni = num;
        return miles[mil] + centenas[cen] + decenas[dec] + unidades[uni];
    }
}
