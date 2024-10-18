package org.example;

import java.util.Arrays;

public class Algoritmos {

    /**
     * Método de ordenamiento de burbuja
     * @param arr Arreglo que se va a ordenar
     * Recorre repetidamente el arreglo comparando elementos adyacentes y los intercambia
     * si están en el orden incorrecto. Este proceso se repite hasta que el arreglo esté ordenado.
     */
    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar arr[j] y arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    /**
     * Método de ordenamiento QuickSort
     * @param arr Arreglo que se va a ordenar
     * @param low indice inicial del arreglo
     * @param high indice final del arreglo
     * QuickSort es un algoritmo de ordenamiento de tipo divide y vencerás que selecciona un pivote
     * y organiza los elementos menores al pivote a la izquierda, y los mayores a la derecha.
     * Luego se aplica recursivamente a las sublistas.
     */
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pi = partition(arr, low, high); // Partición del arreglo
            quickSort(arr, low, pi - 1); // Ordenar la parte izquierda del pivote
            quickSort(arr, pi + 1, high); // Ordenar la parte derecha del pivote
        }

    }

    /**
     * Método de partición para QuickSort
     * @param arr Arreglo que se está ordenando
     * @param low indice inicial del subarreglo
     * @param high indice final del subarreglo
     * @return indice del pivote después de la partición
     * Este método coloca el pivote en su posición correcta y reorganiza el arreglo
     * para que los menores al pivote queden a su izquierda y los mayores a su derecha.
     */
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Elegir el último elemento como pivote
        int i = (low - 1); // indice del menor elemento
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    /**
     * Método de ordenamiento Stooge Sort
     * @param arreglo Arreglo que se va a ordenar
     * @param inicio indice inicial del subarreglo
     * @param fin indice final del subarreglo
     * Stooge Sort es un algoritmo de ordenamiento recursivo que intercambia el primer y último
     * elemento si el primero es mayor, y luego ordena recursivamente los primeros dos tercios,
     * los últimos dos tercios, y otra vez los primeros dos tercios.
     */
    public static void stoogeSort(int[] arreglo, int inicio, int fin) {

        if (inicio >= fin) {
            return; // Si el subarreglo tiene un solo elemento, ya está ordenado
        }

        // Si el primer elemento es mayor que el último, intercambiarlos
        if (arreglo[inicio] > arreglo[fin]) {
            int temp = arreglo[inicio];
            arreglo[inicio] = arreglo[fin];
            arreglo[fin] = temp;
        }

        // Si el subarreglo tiene más de dos elementos
        if (fin - inicio + 1 > 2) {
            int tercio = (fin - inicio + 1) / 3;

            // Ordenar los primeros dos tercios
            stoogeSort(arreglo, inicio, fin - tercio);

            // Ordenar los últimos dos tercios
            stoogeSort(arreglo, inicio + tercio, fin);

            // Repetir la ordenación de los primeros dos tercios
            stoogeSort(arreglo, inicio, fin - tercio);
        }

    }


    /**
     * Método de ordenamiento Pigeonhole Sort
     * @param arr Arreglo que se va a ordenar
     * Este algoritmo es eficiente para arreglos con un rango limitado de valores.
     * Clasifica los elementos en "agujeros" basados en su valor y luego los devuelve al arreglo.
     */
    public static void pigeonholeSort(int[] arr) {

        int min = Arrays.stream(arr).min().getAsInt(); // Encontrar el valor mínimo
        int max = Arrays.stream(arr).max().getAsInt(); // Encontrar el valor máximo
        int range = max - min + 1; // Rango de valores
        int[] holes = new int[range]; // Crear agujeros para cada valor en el rango

        for (int i : arr) {
            holes[i - min]++; // Contar las ocurrencias de cada valor
        }

        int index = 0;
        for (int i = 0; i < range; i++) {
            while (holes[i]-- > 0) {
                arr[index++] = i + min; // Reinsertar los valores en el arreglo
            }
        }
    }

    /**
     * Método de ordenamiento Merge Sort
     * @param arreglo Arreglo que se va a ordenar
     * @param indiceInicio indice inicial del subarreglo
     * @param indiceFinal indice final del subarreglo
     * Merge Sort es un algoritmo de ordenamiento de tipo divide y vencerás que divide el arreglo en dos,
     * los ordena recursivamente y luego los fusiona en el orden correcto.
     */
    public static void mergeSort(int[] arreglo, int indiceInicio, int indiceFinal) {

        if (indiceInicio < indiceFinal) {
            // Encontrar el punto medio para dividir el arreglo
            int puntoMedio = (indiceInicio + indiceFinal) / 2;

            // Ordenar la primera mitad
            mergeSort(arreglo, indiceInicio, puntoMedio);

            // Ordenar la segunda mitad
            mergeSort(arreglo, puntoMedio + 1, indiceFinal);

            // Fusionar las mitades ordenadas
            merge(arreglo, indiceInicio, puntoMedio, indiceFinal);
        }

    }

    /**
     * Método auxiliar para la fusión en Merge Sort
     * @param arreglo Arreglo que se está fusionando
     * @param indiceInicio indice inicial del subarreglo
     * @param puntoMedio indice medio del subarreglo
     * @param indiceFinal indice final del subarreglo
     * Fusiona dos subarreglos ordenados en uno solo ordenado.
     */
    private static void merge(int[] arreglo, int indiceInicio, int puntoMedio, int indiceFinal) {
        // Tamaño de los subarreglos izquierdo y derecho
        int tamanoIzquierdo = puntoMedio - indiceInicio + 1;
        int tamanoDerecho = indiceFinal - puntoMedio;

        // Crear los subarreglos izquierdo y derecho
        int[] subarregloIzquierdo = new int[tamanoIzquierdo];
        int[] subarregloDerecho = new int[tamanoDerecho];

        // Copiar los datos a los subarreglos
        System.arraycopy(arreglo, indiceInicio, subarregloIzquierdo, 0, tamanoIzquierdo);
        System.arraycopy(arreglo, puntoMedio + 1, subarregloDerecho, 0, tamanoDerecho);

        // indices para recorrer los subarreglos y el arreglo original
        int i = 0, j = 0, k = indiceInicio;

        // Fusionar los subarreglos en el arreglo original
        while (i < tamanoIzquierdo && j < tamanoDerecho) {
            if (subarregloIzquierdo[i] <= subarregloDerecho[j]) {
                arreglo[k] = subarregloIzquierdo[i];
                i++;
            } else {
                arreglo[k] = subarregloDerecho[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes del subarreglo izquierdo (si hay)
        while (i < tamanoIzquierdo) {
            arreglo[k] = subarregloIzquierdo[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes del subarreglo derecho (si hay)
        while (j < tamanoDerecho) {
            arreglo[k] = subarregloDerecho[j];
            j++;
            k++;
        }
    }



    /**
     * Método de ordenamiento Bitonic Sort
     * @param arreglo Arreglo que se va a ordenar
     * @param indiceInicio indice inicial del subarreglo
     * @param numElementos Número de elementos a ordenar
     * @param direccion Dirección de ordenamiento (true para ascendente, false para descendente)
     * Bitonic Sort es un algoritmo paralelo que primero genera una secuencia bitónica
     * (una secuencia que primero sube y luego baja), y luego la clasifica mediante la fusión bitónica.
     */
    public static void bitonicSort(int[] arreglo, int indiceInicio, int numElementos, boolean direccion) {

        if (numElementos > 1) {
            int mitad = numElementos / 2;
            // Ordenar en orden ascendente la primera mitad
            bitonicSort(arreglo, indiceInicio, mitad, true);
            // Ordenar en orden descendente la segunda mitad
            bitonicSort(arreglo, indiceInicio + mitad, mitad, false);
            // Fusionar las dos mitades en la dirección dada
            bitonicMerge(arreglo, indiceInicio, numElementos, direccion);
        }
    }

    /**
     * Método auxiliar para la fusión en Bitonic Sort
     * @param arreglo Arreglo que se está fusionando
     * @param indiceInicio indice inicial del subarreglo
     * @param numElementos Número de elementos a fusionar
     * @param direccion Dirección de la fusión (true para ascendente, false para descendente)
     * Fusiona una secuencia bitónica en una secuencia completamente ordenada.
     */
    private static void bitonicMerge(int[] arreglo, int indiceInicio, int numElementos, boolean direccion) {
        if (numElementos > 1) {
            int mitad = numElementos / 2;
            for (int i = indiceInicio; i < indiceInicio + mitad; i++) {
                // Si la dirección es ascendente, intercambiamos si el valor actual es mayor que el correspondiente
                if (direccion == (arreglo[i] > arreglo[i + mitad])) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + mitad];
                    arreglo[i + mitad] = temp;
                }
            }
            // Fusionar la primera mitad
            bitonicMerge(arreglo, indiceInicio, mitad, direccion);
            // Fusionar la segunda mitad
            bitonicMerge(arreglo, indiceInicio + mitad, mitad, direccion);
        }
    }


}
