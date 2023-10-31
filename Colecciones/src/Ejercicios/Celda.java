/*6. Codifique la clase celda con los atributos:
int fila;
int columna;
String valor;
 Crea una clase Matriz que contenga una variable global
ArrayList<Celda>
ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
 Codifique un programa que solicite al usuario un valor para la
celda y que solicite la posición donde se desea almacenar el valor,
cree una instancia de la clase Celda, asigne los valores cargados
por el usuario y agregue la instancia a la lista matrizCuadrada;
repita este proceso hasta que el usuario ingrese como valor la
cadena “FIN”
 Muestre por pantalla los valores cargados en matrizCuadrada.
 Codifique un método que reciba como parámetro los valores fila y
columna y retorne el valor almacenado, en caso de que la fila y la
columna no exista retorne el mensaje “La fila y columna indicada
no ha sido asignada”*/
  
  
package Ejercicios;

import java.util.ArrayList;

public  class Celda {

    private int fila, columna;
    private String valor;

    public Celda(){}

    public Celda(int fila, int columna, String valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }

    public static class Matriz {
        ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();

        public Matriz(){}

        public void agregarCelda(Celda celda) {
            matrizCuadrada.add(celda);
        }

        public void mostrarMatrizCuadrada() {
            for (Celda celda : matrizCuadrada) {
                System.out.println("Fila: " + celda.fila + ", Columna: " + celda.columna + ", Valor: " + celda.valor);
            }
        }

        public String obtenerValor(int fila, int columna) {
            for (Celda celda : matrizCuadrada) {
                if (celda.fila == fila && celda.columna == columna) {
                    return celda.valor;
                }
            }
            return "La fila y columna indicada no ha sido asignada";
        }
    }

}

