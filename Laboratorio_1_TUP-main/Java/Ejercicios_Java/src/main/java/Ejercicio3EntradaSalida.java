
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hola
 */
public class Ejercicio3EntradaSalida {
    public static void main(String[]args){
        int numero;
        String sNumero;
        sNumero= JOptionPane.showInputDialog("Ingrese un numero entero: ");
        numero= Integer.parseInt(sNumero);
        JOptionPane.showMessageDialog(null,"El resultado es: " + numero);
                
    }
}
