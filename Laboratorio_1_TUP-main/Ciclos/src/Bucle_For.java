import java.util.Scanner;
public class Bucle_For {
    public static void main(String[] args) {
        String nombre;
        Scanner lector=new Scanner(System.in);
        for(int i=1 ; i<10; i++){
            System.out.println("Ingrese su nombre");
            nombre= lector.next();
            System.out.println(nombre);
        }
    }
}
