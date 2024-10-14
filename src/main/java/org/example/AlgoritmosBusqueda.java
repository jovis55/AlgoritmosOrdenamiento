package org.example;

import java.util.Arrays;

public class AlgoritmosBusqueda {


    /**
     * Metodo de busqueda lineal
     * @param arreglo Arreglo en el que se va a buscar
     * @param clave Elemento que se busca en el arreglo
     * @return Devuelve la posicion del elemento buscado, si no existe sera -1
     * La busqueda lineal es un tipo de algoritmo que recorre de manera continua una lista
     * de elementos buscando un elemento especificado, esto lo hace comparando cada
     * elemento de la lista con el elemento que se esta buscando, hasta recorrer toda la lista
     * o hasta encontrar la posicion del elemento solicitado
     */
    public static int linearSearch(int[] arreglo, int clave) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == clave) {
                return i; // Retorna el índice si el elemento se encuentra
            }
        }
        return -1; // Retorna -1 si el elemento no está en el array
    }

    /**
     * Metodo de busqueda binaria
     * @param arreglo Arreglo en el que se va a buscar
     * @param clave Elemento que se busca en el arreglo
     * @return Devuelve la posicion del elemento buscado, si no existe sera -1
     * La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en un array
     * ordenado. Este algoritmo divide repetidamente el array a la mitad, comparando el valor
     * medio con el elemento que se está buscando. Si el valor medio no es el elemento deseado,
     * el algoritmo decide si continuar la búsqueda en la mitad izquierda o en la mitad derecha,
     * descartando la otra.
     */
    public static int binarySearch(int[] arreglo, int clave) {
        // Aseguramos que el array esté ordenado antes de realizar la búsqueda
        Arrays.sort(arreglo); // Ordena el array en orden ascendente

        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int mitad = izquierda + (derecha - izquierda) / 2; // Evita el desbordamiento
            if (arreglo[mitad] == clave) {
                return mitad; // Elemento encontrado
            }
            if (arreglo[mitad] < clave) {
                izquierda = mitad + 1; // Buscar en la mitad derecha
            } else {
                derecha = mitad - 1; // Buscar en la mitad izquierda
            }
        }
        return -1; // Elemento no encontrado
    }

    public static int jumpSearch(int[] arreglo, int clave) {
        // Aseguramos que el array esté ordenado antes de realizar la búsqueda
        Arrays.sort(arreglo); // Ordenar el array en orden ascendente

        int n = arreglo.length;
        int salto = (int) Math.sqrt(n); // Tamaño del salto
        int indice = 0;

        // Saltar bloques de tamaño 'step'
        while (arreglo[Math.min(salto, n) - 1] < clave) {
            indice = salto;
            salto += (int) Math.sqrt(n);
            if (indice >= n) {
                return -1; // Si hemos superado el tamaño del array
            }
        }

        // Búsqueda lineal dentro del bloque
        while (arreglo[indice] < clave) {
            indice++;
            if (indice == Math.min(salto, n)) {
                return -1; // Si llegamos al final del bloque o del array
            }
        }

        // Si encontramos el elemento
        if (arreglo[indice] == clave) {
            return indice;
        }

        return -1; // Si el elemento no está presente
    }
}
