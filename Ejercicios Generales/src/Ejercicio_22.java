import java.util.Scanner;

public class ejercicio22 {

    public static void main(String[] args) {
        int numero, i, auxiliar, contador, cifra;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("_ Ingrese un numero entero positvo: ");
            numero = sc.nextInt();
            if (numero <= 0) {
                System.out.println("El número ingresado no es válido");
            }
        } while (numero <= 0);

        //Se guarda el número en una variable auxiliar para poder calcular las cifras que tiene el número
        auxiliar = numero;
        contador = 0; //Contador de las cifras de numero
        while (auxiliar != 0) {
            auxiliar = auxiliar / 10;
            contador++;
        }

        //Se obtiene cada una de las cifras comenzando por la izquierda
        for (i = contador-1; i >= 0; i--) {

            //Se obtiene la cifra de la izquierda
            cifra = numero / (int) Math.pow(10, i);

            //Se muestra el nombre de cada numero
            switch (cifra) {
                case 0:
                    System.out.print("cero ");
                    break;
                case 1:
                    System.out.print("uno ");
                    break;
                case 2:
                    System.out.print("dos ");
                    break;
                case 3:
                    System.out.print("tres ");
                    break;
                case 4:
                    System.out.print("cuatro ");
                    break;
                case 5:
                    System.out.print("cinco ");
                    break;
                case 6:
                    System.out.print("seis ");
                    break;
                case 7:
                    System.out.print("siete ");
                    break;
                case 8:
                    System.out.print("ocho ");
                    break;
                case 9:
                    System.out.print("nueve ");
                    break;
            }
            if (i != 0) {
                System.out.print(" - ");
                numero = numero % (int) Math.pow(10, i);
            }
            System.out.println();
        }
        System.out.println("Fin de programa");
    }
}