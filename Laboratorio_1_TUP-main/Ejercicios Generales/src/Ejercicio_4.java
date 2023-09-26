public class Ejercicio_4 {
    public static void main(String[] args) {
        /* Mostrar la tabla de multiplicar de un número en Java
Programa Java que lea un número entero N y muestre la tabla de multiplicar
de ese número. */

        int num=7;
        System.out.println("Tabla del "+num);
        System.out.println("---------------------------");
        for( int i = 1 ; i <= 10 ; i ++){
            System.out.println( num + " x " + i + "= " + ( num * i ));
        }
    }
}
