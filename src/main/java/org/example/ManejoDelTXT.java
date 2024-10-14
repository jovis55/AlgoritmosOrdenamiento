package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ManejoDelTXT {

    /**
     * Método para leer los valores de un archivo de texto y cargarlos en un arreglo.
     * @param rutaArchivo Ruta del archivo de texto que contiene los valores
     * @return Arreglo de enteros con los valores leídos del archivo
     */
    public static int[] cargarValoresDesdeArchivo(String rutaArchivo) {

        List<Integer> listaNumeros = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Convertir la línea a un número entero y añadirlo a la lista
                listaNumeros.add(Integer.parseInt(linea));
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        // Convertir la lista de Integer a un arreglo de int
        return listaNumeros.stream().mapToInt(i -> i).toArray();
    }

    /**
     * Método para generar números aleatorios de 8 dígitos y guardarlos en un archivo de texto.
     * @param tamanoArreglo Tamaño del arreglo (número de valores a generar)
     * @param rutaArchivo Ruta del archivo donde se guardarán los números
     */
    public static void rellenartxt(int tamanoArreglo, String rutaArchivo) {

        Random random = new Random();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (int i = 0; i < tamanoArreglo; i++) {
                // Generar un número aleatorio de 8 dígitos
                int numeroAleatorio = 10000000 + random.nextInt(90000000);
                writer.write(Integer.toString(numeroAleatorio));
                writer.newLine(); // Escribir el número en una nueva línea
            }
            System.out.println("Archivo generado con éxito en la ruta: " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
