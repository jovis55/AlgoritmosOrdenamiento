package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String filename = "numeros.txt";
        int arraySize = 10;  // Tamaño del arreglo a generar
        int numDigits = 3;   // Cantidad de dígitos en los números aleatorios

        // Cargar arreglo desde archivo de texto, generarlo si está vacío
        int[] arr = CargarArreglo.loadArrayFromFile(filename, arraySize, numDigits);
        System.out.println( Arrays.toString(arr));

    }
}