package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CargarArreglo {
    public static int[] loadArrayFromFile(String filename, int arraySize, int numDigits) {
        List<Integer> list = new ArrayList<>();

        File file = new File(filename);
        if (!file.exists() || file.length() == 0) {
            // Generar el archivo con números aleatorios si no existe o está vacío
            generateRandomNumbersFile(filename, arraySize, numDigits);
        }

        // Leer los números del archivo
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] numbers = line.split(" ");
                for (String number : numbers) {
                    list.add(Integer.parseInt(number));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Convertir List a array
        return list.stream().mapToInt(i -> i).toArray();
    }

    // Método para generar un archivo de texto con números aleatorios
    public static void generateRandomNumbersFile(String filename, int size, int numDigits) {
        int[] arr = generateRandomArray(size, numDigits); // Generar arreglo aleatorio

        // Escribir el arreglo aleatorio en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int num : arr) {
                writer.write(num + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para generar un arreglo de números aleatorios con una cantidad específica de dígitos
    public static int[] generateRandomArray(int size, int numDigits) {
        Random rand = new Random();
        int[] arr = new int[size];
        int min = (int) Math.pow(10, numDigits - 1);  // Mínimo valor con 'numDigits' dígitos
        int max = (int) Math.pow(10, numDigits) - 1;  // Máximo valor con 'numDigits' dígitos

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(max - min + 1) + min;
        }
        return arr;
    }
}
