package Ejercicios;

import java.util.Scanner;

public class Ejercicio_16 {
    /*
    Programa java que lee dos números distintos por teclado y
    calcula y muestra el resultado de dividir el mayor entre el menor.
     */
    public class ejercicio16 {
        public static void main(String[] args) {
            double num1,num2,mayor,menor;
            Scanner lector=new Scanner(System.in);
            System.out.println("Ingrese el primer número: ");
            num1= lector.nextDouble();
            System.out.println("Ingrese el segundo número: ");
            num2= lector.nextDouble();
            if(num1!=num2){
                if(num1>num2){
                    mayor=num1;
                    menor=num2;
                }else {
                    mayor=num2;
                    menor=num1;
                }
                if (menor==0){
                    System.out.println("No es posible dividir por 0.");
                }else{
                    System.out.println(mayor+" / "+menor+ " = "+mayor/menor);

                }
            }else{
                System.out.println("Los números ingresados son iguales.");
            }



        }
    }

}
