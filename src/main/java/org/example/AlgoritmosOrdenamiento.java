package org.example;

public class AlgoritmosOrdenamiento {


    /**
     * Metodo de busqueda lineal
     * @param arr Arreglo en el que se va a buscar
     * @param key Elemento que se busca en el arreglo
     * @return
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

}
