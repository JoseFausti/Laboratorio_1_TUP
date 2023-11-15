// Examen Mercadolibre

// Magneto quiere reclutar la mayor cantidad de mutantes para poder luchar contra los X-Mens.
// Te ha contratado a ti para que desarrolles un proyecto que detecte si un humano es mutante 
// basándose en su secuencia de ADN.

// Para eso te ha pedido crear un programa con un método o función con la siguiente forma:
// boolean isMutant(String[] dna);

// En donde recibirás como parámetro un array de Strings que representan cada fila de una tabla
// de (6x6) con la secuencia del ADN. Las letras de los Strings solo pueden ser: (A,T,C,G),
// las cuales representa cada base nitrogenada del ADN.

// Sabrás si un humano es mutante, si encuentras MAS DE UNA SECUNCIA de cuatro letras iguales, 
// de forma oblicua, horizontal o vertical.
// Ejemplo (Caso mutante):
// String[] dna = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
// Para la primera Matriz de la derecha!!!

// En este caso el llamado a la función isMutant(dna) devuelve “true”. Desarrolla el algoritmo 
// de la manera más eficiente posible.

// Ingrese por teclado las filas de la matrz, cargando las mismas.
// (Teniendo en cuenta  casos para que sea mutante y casos para que no lo sea-,

// Una vez cargada correctamente la misma, aplique una función que verifique si hay presencia 
// en la matriz de mutantes o no y que la misma le devuelva el resultado al usuario.

// Subir el proyecto con los casos de pruebas a git hub.


import java.util.Scanner;
// FUNCIONES

// Funcion Para verificar si es mutante
public class VerificadorMutante {
    // Función para verificar si es mutante
    public static boolean esMutante(String[] adn) {
        // Contador para verificar si es mutante
        int contadorMutante = 0;

        // Horizontales
        for (String fila : adn) {
            // Contador de filas
            int contadorFila = 1;
            for (int i = 0; i < 5; i++) {
                if (fila.charAt(i) == fila.charAt(i + 1)) {
                    contadorFila++;
                    // Posible mutante
                    if (contadorFila == 4) {
                        contadorMutante++;
                    }
                }
            }
        }

        // Verticales
        for (int columnas = 0; columnas < 6; columnas++) {
            // Contador de columnas
            int contadorColumna = 1;
            for (int filas = 0; filas < 5; filas++) {
                if (adn[filas].charAt(columnas) == adn[filas + 1].charAt(columnas)) {
                    contadorColumna++;
                    // Posible mutante
                    if (contadorColumna == 4) {
                        contadorMutante++;
                    }
                }
            }
        }

        // Diagonales
        // --------------------------------- //
        // Diagonal Principal
        for (int i = 0; i < 3; i++) {
            // Contador de diagonales
            int contadorDiagonal = 1;
            for (int j = 0; j < 3; j++) {
                if (adn[i].charAt(j) == adn[i + 1].charAt(j + 1) && adn[i + 1].charAt(j + 1) == adn[i + 2].charAt(j + 2)
                        && adn[i + 2].charAt(j + 2) == adn[i + 3].charAt(j + 3)) {
                    contadorDiagonal += 3;
                    // Posible mutante
                    if (contadorDiagonal == 4) {
                        contadorMutante++;
                    }
                }
            }
        }
        // --------------------------------- //
        // Diagonal Opuesta
        for (int i = 0; i < 3; i++) {
            // Contador de diagonales
            int contadorDiagonal = 1;
            for (int j = 3; j < 6; j++) {
                if (adn[i].charAt(j) == adn[i + 1].charAt(j - 1) && adn[i + 1].charAt(j - 1) == adn[i + 2].charAt(j - 2)
                        && adn[i + 2].charAt(j - 2) == adn[i + 3].charAt(j - 3)) {
                    contadorDiagonal += 3;
                    // Posible mutante
                    if (contadorDiagonal == 4) {
                        contadorMutante++;
                    }
                }
            }
        }
        // --------------------------------- //
        // Retorno
        if (contadorMutante >= 2){
            return true;
        }else{
            return false;
        }
    }

    // Función para imprimir matrices
    public static void mostrarResultado(String[] matriz) {

        System.out.println("----------------------------------");
        for (String fila : matriz) {
            System.out.println(fila);
        }
        System.out.println();

        if (esMutante(matriz)) {
            System.out.println("Es mutante");
        } else {
            System.out.println("No es mutante");
        }
        System.out.println("----------------------------------");
    }

    // ALGORITMO PRINCIPAL
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1º Prueba: Mutante
        // Inicializamos la matriz
        String[] matrizMutante = new String[6];
        System.out.println("----------------------------------");
        System.out.println("1º PRUEBA");
        System.out.println("----------------------------------");
        // Ingreso de Datos:
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese una secuencia de Aminoácidos (A,T,G,C), Ejemplo: 'ACTGCG': ");
            String adn = scanner.next().toUpperCase();
            // Validador
            if (adn.length() != 6 || !adn.matches("[ATCG]+")) {
                System.out.println("Ingreso incorrecto");
                i--;
                continue;
            }
            // Inserción de datos en la matriz
            matrizMutante[i] = adn;
        }
        // 2º Prueba
        // Inicializamos la matriz
        String[] matrizNoMutante = new String[6];
        System.out.println("----------------------------------");
        System.out.println("2º PRUEBA");
        System.out.println("----------------------------------");
        // Ingreso de Datos:
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese una secuencia de Aminoácidos (A,T,G,C), Ejemplo: 'ACTGCG': ");
            String adn = scanner.next().toUpperCase();
            // Validador
            if (adn.length() != 6 || !adn.matches("[ATCG]+")) {
                System.out.println("Ingreso incorrecto");
                i--;
                continue;
            }
            // Inserción de datos en la matriz
            matrizNoMutante[i] = adn;
        }
        // Llamada de la Función y Resultado Final
        // 1º Prueba
        mostrarResultado(matrizMutante);
        // 2º Prueba
        mostrarResultado(matrizNoMutante);
        scanner.close();
    }
}
