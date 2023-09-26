import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

/* Pasar de grados centígrados a kelvin en Java
Programa Java que lee una temperatura expresada en grados centígrados
 y la convierte a grados kelvin.
El proceso de leer grados centígrados se debe repetir mientras que se responda
 ‘S’ a la pregunta: Repetir proceso? (S/N)
Para hacer la conversión de grados Centígrados a grados Kelvin hay que utilizar
la fórmula:
ºK = ºC + 273  */

        String operador = "S";
        while (!(operador.equals("N"))) {
            System.out.print("Ingrese la Temperatura en °C: ");
            Scanner uno = new Scanner(System.in);
            int GradosCelsius = uno.nextInt();
            int GradosKelvin = GradosCelsius + 273;
            System.out.println("La Temperatura en Kelvin es: " + GradosKelvin);
            System.out.println("Desea repetir el proceso? (S/N)");
            Scanner dos = new Scanner(System.in);
            operador = dos.next();

            if(operador == "N" || operador == "n"){
                break;
            }
        }




    }
}
