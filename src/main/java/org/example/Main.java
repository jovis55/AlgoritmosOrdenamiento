package org.example;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;
import java.util.*;

public class Main extends ApplicationFrame {

    private static Map<String, Long> tiemposEjecucion = new HashMap<>();

    public Main(String title) {
        super(title);
        JFreeChart barChart = ChartFactory.createBarChart(
                "Comparacion de Algoritmos de Ordenamiento",
                "Algoritmo",
                "Tiempo de Ejecucion (ms)",
                crearDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        setContentPane(chartPanel);
    }

    public static void main(String[] args) {

        ManejoDelTXT.rellenartxt(10000, "numerosAleatorios10000.txt");
        ManejoDelTXT.rellenartxt(100000, "numerosAleatorios100000.txt");
        ManejoDelTXT.rellenartxt(1000000, "numerosAleatorios1000000.txt");

        // Ejecutar los algoritmos
        probarAlgoritmos();

        // Mostrar gráfico en la ventana
        SwingUtilities.invokeLater(() -> {
            Main chart = new Main("Comparacion de Algoritmos");
            chart.setSize(800, 600);
            chart.setLocationRelativeTo(null);
            chart.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            chart.setVisible(true);
        });
    }

    private static DefaultCategoryDataset crearDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (Map.Entry<String, Long> entry : tiemposEjecucion.entrySet()) {
            dataset.addValue(entry.getValue(), entry.getKey(), entry.getKey());
        }

        return dataset;
    }

    private static void probarAlgoritmos() {
        // Pruebas con 10,000 elementos
        long tiempoBubbleSort10000 = probarBubbleSortCon10000();
        tiemposEjecucion.put("BubbleSort 10,000", tiempoBubbleSort10000);

        long tiempoQuickSort10000 = probarQuickSortCon10000();
        tiemposEjecucion.put("QuickSort 10,000", tiempoQuickSort10000);

        long tiempoMergeSort10000 = probarMergeSortCon10000();
        tiemposEjecucion.put("MergeSort 10,000", tiempoMergeSort10000);

        long tiempoStoogeSort10000 = probarStoogeSortCon10000();
        tiemposEjecucion.put("StoogeSort 10,000", tiempoStoogeSort10000);

        long tiempoPigeonholeSort10000 = probarPigeonholeSortCon10000();
        tiemposEjecucion.put("PigeonholeSort 10,000", tiempoPigeonholeSort10000);

        long tiempoBitonicSort10000 = probarBitonicSortCon10000();
        tiemposEjecucion.put("BitonicSort 10,000", tiempoBitonicSort10000);

        // Pruebas con 100,000 elementos
        long tiempoBubbleSort100000 = probarBubbleSortCon100000();
        tiemposEjecucion.put("BubbleSort 100,000", tiempoBubbleSort100000);

        long tiempoQuickSort100000 = probarQuickSortCon100000();
        tiemposEjecucion.put("QuickSort 100,000", tiempoQuickSort100000);

        long tiempoMergeSort100000 = probarMergeSortCon100000();
        tiemposEjecucion.put("MergeSort 100,000", tiempoMergeSort100000);

        //long tiempoStoogeSort100000 = probarStoogeSortCon100000();
        //tiemposEjecucion.put("StoogeSort 100,000", tiempoStoogeSort100000);

        long tiempoPigeonholeSort100000 = probarPigeonholeSortCon100000();
        tiemposEjecucion.put("PigeonholeSort 100,000", tiempoPigeonholeSort100000);

        long tiempoBitonicSort100000 = probarBitonicSortCon100000();
        tiemposEjecucion.put("BitonicSort 100,000", tiempoBitonicSort100000);

        // Pruebas con 1,000,000 elementos
        long tiempoBubbleSort1000000 = probarBubbleSortCon1000000();
        tiemposEjecucion.put("BubbleSort 1,000,000", tiempoBubbleSort1000000);

        long tiempoQuickSort1000000 = probarQuickSortCon1000000();
        tiemposEjecucion.put("QuickSort 1,000,000", tiempoQuickSort1000000);

        long tiempoMergeSort1000000 = probarMergeSortCon1000000();
        tiemposEjecucion.put("MergeSort 1,000,000", tiempoMergeSort1000000);

        //long tiempoStoogeSort1000000 = probarStoogeSortCon1000000();
        //tiemposEjecucion.put("StoogeSort 1,000,000", tiempoStoogeSort1000000);

        long tiempoPigeonholeSort1000000 = probarPigeonholeSortCon1000000();
        tiemposEjecucion.put("PigeonholeSort 1,000,000", tiempoPigeonholeSort1000000);

        long tiempoBitonicSort1000000 = probarBitonicSortCon1000000();
        tiemposEjecucion.put("BitonicSort 1,000,000", tiempoBitonicSort1000000);
    }

    static long probarBubbleSortCon10000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el método bubbleSort
        Algoritmos.bubbleSort(arreglo);

        long fin = System.currentTimeMillis();  // Registrar el fin

        System.out.println("BubbleSort con 10,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarBubbleSortCon100000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el método bubbleSort
        Algoritmos.bubbleSort(arreglo);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("BubbleSort con 100,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarBubbleSortCon1000000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el método bubbleSort
        Algoritmos.bubbleSort(arreglo);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("BubbleSort con 1,000,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarQuickSortCon10000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el método quickSort
        Algoritmos.quickSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("QuickSort con 10,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarQuickSortCon100000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el método quickSort
        Algoritmos.quickSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("QuickSort con 100,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarQuickSortCon1000000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el método quickSort
        Algoritmos.quickSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("QuickSort con 1,000,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarStoogeSortCon10000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el método stoogeSort
        Algoritmos.stoogeSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("StoogeSort con 10,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarStoogeSortCon100000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el método stoogeSort
        Algoritmos.stoogeSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("StoogeSort con 100,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarStoogeSortCon1000000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el método stoogeSort
        Algoritmos.stoogeSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("StoogeSort con 1,000,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarPigeonholeSortCon10000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el método pigeonholeSort
        Algoritmos.pigeonholeSort(arreglo);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("PigeonholeSort con 10,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarPigeonholeSortCon100000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el método pigeonholeSort
        Algoritmos.pigeonholeSort(arreglo);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("PigeonholeSort con 100,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarPigeonholeSortCon1000000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el método pigeonholeSort
        Algoritmos.pigeonholeSort(arreglo);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("PigeonholeSort con 1,000,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarMergeSortCon10000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el método mergeSort
        Algoritmos.mergeSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("MergeSort con 10,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarMergeSortCon100000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el método mergeSort
        Algoritmos.mergeSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("MergeSort con 100,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarMergeSortCon1000000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el método mergeSort
        Algoritmos.mergeSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("MergeSort con 1,000,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarBitonicSortCon10000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el método bitonicSort
        Algoritmos.bitonicSort(arreglo, 0, arreglo.length, true);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("BitonicSort con 10,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarBitonicSortCon100000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el método bitonicSort
        Algoritmos.bitonicSort(arreglo, 0, arreglo.length, true);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("BitonicSort con 100,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarBitonicSortCon1000000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el método bitonicSort
        Algoritmos.bitonicSort(arreglo, 0, arreglo.length, true);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("BitonicSort con 1,000,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }
}