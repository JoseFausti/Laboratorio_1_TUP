public class OrdenPorInsercion {
    public static void main(String[] args) {
        int[] arreglo = {5, 2, 9, 3, 4, 6};
        System.out.println("Arreglo original: ");
        imprimirArreglo(arreglo);

        ordenarPorInsercion(arreglo);

        System.out.println("Arreglo ordenado por inserción: ");
        imprimirArreglo(arreglo);
    }

    public static void ordenarPorInsercion(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            int valorActual = arreglo[i];
            int j = i - 1;

            // Mover elementos del arreglo[0..i-1] que son mayores que el valor actual
            while (j >= 0 && arreglo[j] > valorActual) {
                arreglo[j + 1] = arreglo[j];
                j--;

                // Mostrar el estado del arreglo en cada paso
                System.out.println("Paso " + i + ", Iteración " + (j + 2) + ":");
                imprimirArreglo(arreglo);
            }

            // Colocar el valor actual en su posición correcta
            arreglo[j + 1] = valorActual;
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
