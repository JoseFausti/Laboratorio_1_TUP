package Clase_1;

import Clase_1.Persona.Persona;

import javax.swing.*;

// Para ejecutar el programa necesito una clase Principal
// Static: Es cuando no se usa la orientacion a objetos. No tengo que crear una
// instancia para llamar al objeto
// Void: Significa que yo no devuelvo nada como objeto
// Public: Es para que cualquiera lo pueda ver
// Private: Solo lo puede ver la clase donde esta el método
// Get: Sirve para obtener el valor de un atributo. Funciona como un retorno
// Set: Sirve para asignarle valores a un atributo

public class Persona_Main {
public static void main(String[]args){

    String nombre;
    Persona [] arraysPersonas = new Persona[6];
    for (int i= 0;i<arraysPersonas.length; i++){
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        arraysPersonas[i]=new Persona(nombre);
    }
    for (int i=0;i<arraysPersonas.length;i++) {
        System.out.println("Persona" + (i + 1) + " " + arraysPersonas[i].getNombre());
    }

    Persona persona1 = new Persona();
    persona1.setNombre("Pepe");
    Persona persona2 = new Persona("Coco");
    System.out.println("La primera persona es: " + persona1.getNombre());
    System.out.println("¿Que estas Haciendo " + persona1.getNombre() + "?");
    System.out.println("Respuesta");
    persona1.caminar();
    System.out.println(persona1);
    }
}
