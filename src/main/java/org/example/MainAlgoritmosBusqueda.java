package org.example;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;
import java.util.*;

public class MainAlgoritmosBusqueda extends ApplicationFrame {

    private static Map<String, Long> tiemposEjecucion = new HashMap<>();

    public MainAlgoritmosBusqueda(String title) {
        super(title);
        JFreeChart barChart = ChartFactory.createBarChart(
                "Comparacion de Algoritmos de Busqueda",
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
            MainAlgoritmosBusqueda chart = new MainAlgoritmosBusqueda("Comparacion de Algoritmos");
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
        long tiempoLineal10000 = probarLinealCon10000();
        tiemposEjecucion.put("Lineal con 10,000", tiempoLineal10000);

        long tiempoBinario10000 = probarBinarioCon10000();
        tiemposEjecucion.put("Binario con 10,000", tiempoBinario10000);

        long tiempoSalto10000 = probarSaltoCon10000();
        tiemposEjecucion.put("Salto con 10,000", tiempoSalto10000);

        // Pruebas con 100,000 elementos
        long tiempoLineal100000 = probarLinealCon100000();
        tiemposEjecucion.put("Lineal con 100,000", tiempoLineal100000);

        long tiempoBinario100000 = probarBinarioCon100000();
        tiemposEjecucion.put("Binario con 100,000", tiempoBinario100000);

        long tiempoSalto100000 = probarSaltoCon100000();
        tiemposEjecucion.put("Salto con 100,000", tiempoSalto100000);

        // Pruebas con 1,000,000 elementos
        long tiempoLineal1000000 = probarLinealCon1000000();
        tiemposEjecucion.put("Lineal con 1,000,000", tiempoLineal1000000);

        long tiempoBinario1000000 = probarBinarioCon1000000();
        tiemposEjecucion.put("Binario con 1,000,000", tiempoBinario1000000);

        long tiempoSalto1000000 = probarSaltoCon1000000();
        tiemposEjecucion.put("Salto con 1,000,000", tiempoSalto1000000);
    }

    static long probarLinealCon10000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el método lineal
        int a = AlgoritmosBusqueda.linearSearch(arreglo, 1);

        long fin = System.currentTimeMillis();  // Registrar el fin

        System.out.println("Lineal con 10,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarBinarioCon10000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el método lineal
        int a = AlgoritmosBusqueda.binarySearch(arreglo, 1);

        long fin = System.currentTimeMillis();  // Registrar el fin

        System.out.println("Binario con 10,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarSaltoCon10000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el método lineal
        int a = AlgoritmosBusqueda.jumpSearch(arreglo, 1);

        long fin = System.currentTimeMillis();  // Registrar el fin

        System.out.println("Salto con 10,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarLinealCon100000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el método lineal
        int a = AlgoritmosBusqueda.linearSearch(arreglo, 1);

        long fin = System.currentTimeMillis();  // Registrar el fin

        System.out.println("Lineal con 100,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarBinarioCon100000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el método lineal
        int a = AlgoritmosBusqueda.binarySearch(arreglo, 1);

        long fin = System.currentTimeMillis();  // Registrar el fin

        System.out.println("Binario con 100,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarSaltoCon100000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el método lineal
        int a = AlgoritmosBusqueda.jumpSearch(arreglo, 1);

        long fin = System.currentTimeMillis();  // Registrar el fin

        System.out.println("Salto con 100,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarLinealCon1000000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el método lineal
        int a = AlgoritmosBusqueda.linearSearch(arreglo, 1);

        long fin = System.currentTimeMillis();  // Registrar el fin

        System.out.println("Lineal con 1,000,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarBinarioCon1000000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el método lineal
        int a = AlgoritmosBusqueda.binarySearch(arreglo, 1);

        long fin = System.currentTimeMillis();  // Registrar el fin

        System.out.println("Binario con 1,000,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }

    static long probarSaltoCon1000000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el método lineal
        int a = AlgoritmosBusqueda.jumpSearch(arreglo, 1);

        long fin = System.currentTimeMillis();  // Registrar el fin

        System.out.println("Salto con 1,000,000 elementos tomó " + (fin - inicio) + " ms");

        return fin - inicio;
    }
}
