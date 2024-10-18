package org.example;

public class Main {

    public static void main(String[] args) {

        ManejoDelTXT.rellenartxt(10000, "numerosAleatorios10000.txt");
        ManejoDelTXT.rellenartxt(100000, "numerosAleatorios100000.txt");
        ManejoDelTXT.rellenartxt(1000000, "numerosAleatorios1000000.txt");
        
//        probarBubbleSortCon10000();
//        probarBubbleSortCon100000();
//        probarBubbleSortCon1000000();
//
//        probarQuickSortCon10000();
//        probarMergeSortCon100000();
//        probarQuickSortCon1000000();
//
//        probarStoogeSortCon10000();
//        probarStoogeSortCon100000();
//        probarQuickSortCon1000000();
//
//        probarPigeonholeSortCon10000();
//        probarPigeonholeSortCon100000();
//        probarPigeonholeSortCon1000000();
//
//        probarMergeSortCon10000();
//        probarMergeSortCon100000();
//        probarMergeSortCon1000000();
//
//        probarBitonicSortCon10000();
//        probarBitonicSortCon100000();
//        probarBitonicSortCon1000000();

//        probarLinearSearchCon10000();
//        probarLinearSearchCon100000();
//        probarLinearSearchCon1000000();

        probarLimitedLinearSearchCon10000();
        probarLimitedLinearSearchCon100000();
        probarLimitedLinearSearchCon1000000();

//        probarBinarySearchCon10000();
//        probarBinarySearchCon100000();
//        probarBinarySearchCon1000000();
//
//        probarJumpSearchCon10000();
//        probarJumpSearchCon100000();
//        probarJumpSearchCon1000000();
    }

    static void probarBubbleSortCon10000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el método bubbleSort
        Algoritmos.bubbleSort(arreglo);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("BubbleSort con 10,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarBubbleSortCon100000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el método bubbleSort
        Algoritmos.bubbleSort(arreglo);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("BubbleSort con 100,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarBubbleSortCon1000000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el método bubbleSort
        Algoritmos.bubbleSort(arreglo);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("BubbleSort con 1,000,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarQuickSortCon10000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el método quickSort
        Algoritmos.quickSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("QuickSort con 10,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarQuickSortCon100000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el método quickSort
        Algoritmos.quickSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("QuickSort con 100,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarQuickSortCon1000000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el método quickSort
        Algoritmos.quickSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("QuickSort con 1,000,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarStoogeSortCon10000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el método stoogeSort
        Algoritmos.stoogeSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("StoogeSort con 10,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarStoogeSortCon100000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el método stoogeSort
        Algoritmos.stoogeSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("StoogeSort con 100,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarStoogeSortCon1000000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el método stoogeSort
        Algoritmos.stoogeSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("StoogeSort con 1,000,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarPigeonholeSortCon10000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el método pigeonholeSort
        Algoritmos.pigeonholeSort(arreglo);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("PigeonholeSort con 10,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarPigeonholeSortCon100000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el método pigeonholeSort
        Algoritmos.pigeonholeSort(arreglo);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("PigeonholeSort con 100,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarPigeonholeSortCon1000000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el método pigeonholeSort
        Algoritmos.pigeonholeSort(arreglo);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("PigeonholeSort con 1,000,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarMergeSortCon10000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el método mergeSort
        Algoritmos.mergeSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("MergeSort con 10,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarMergeSortCon100000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el método mergeSort
        Algoritmos.mergeSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("MergeSort con 100,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarMergeSortCon1000000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el método mergeSort
        Algoritmos.mergeSort(arreglo, 0, arreglo.length - 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("MergeSort con 1,000,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarBitonicSortCon10000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el método bitonicSort
        Algoritmos.bitonicSort(arreglo, 0, arreglo.length, true);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("BitonicSort con 10,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarBitonicSortCon100000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el método bitonicSort
        Algoritmos.bitonicSort(arreglo, 0, arreglo.length, true);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("BitonicSort con 100,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarBitonicSortCon1000000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el método bitonicSort
        Algoritmos.bitonicSort(arreglo, 0, arreglo.length, true);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("BitonicSort con 1,000,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarLinearSearchCon10000() {
        long inicio =System.currentTimeMillis();    // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el metodo linearSearch
        int encontrado = AlgoritmosBusqueda.linearSearch(arreglo, 1);

        long fin = System.currentTimeMillis();      // Registrar el fin
        System.out.println("LinearSearch con 10,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarLinearSearchCon100000() {
        long inicio =System.currentTimeMillis();    // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el metodo linearSearch
        int encontrado = AlgoritmosBusqueda.linearSearch(arreglo, 1);

        long fin = System.currentTimeMillis();      // Registrar el fin
        System.out.println("LinearSearch con 100,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarLinearSearchCon1000000() {
        long inicio =System.currentTimeMillis();    // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el metodo linearSearch
        int encontrado = AlgoritmosBusqueda.linearSearch(arreglo, 1);

        long fin = System.currentTimeMillis();      // Registrar el fin
        System.out.println("LinearSearch con 1,000,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarLimitedLinearSearchCon10000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el método bubbleSort
        int encontrado = AlgoritmosBusqueda.limitedLinearSearch(arreglo, 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("Limited Linear Search con 10,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarLimitedLinearSearchCon100000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el método bubbleSort
        int encontrado = AlgoritmosBusqueda.limitedLinearSearch(arreglo, 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("Limited Linear Search con 100,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarLimitedLinearSearchCon1000000() {
        long inicio = System.currentTimeMillis();  // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el método bubbleSort
        int encontrado = AlgoritmosBusqueda.limitedLinearSearch(arreglo, 1);

        long fin = System.currentTimeMillis();  // Registrar el fin
        System.out.println("Limited Linear Search con 1,000,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarBinarySearchCon10000() {
        long inicio =System.currentTimeMillis();    // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el metodo linearSearch
        int encontrado = AlgoritmosBusqueda.binarySearch(arreglo, 1);

        long fin = System.currentTimeMillis();      // Registrar el fin
        System.out.println("BinarySearch con 10,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarBinarySearchCon100000() {
        long inicio =System.currentTimeMillis();    // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el metodo linearSearch
        int encontrado = AlgoritmosBusqueda.binarySearch(arreglo, 1);

        long fin = System.currentTimeMillis();      // Registrar el fin
        System.out.println("BinarySearch con 100,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarBinarySearchCon1000000() {
        long inicio =System.currentTimeMillis();    // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el metodo linearSearch
        int encontrado = AlgoritmosBusqueda.binarySearch(arreglo, 1);

        long fin = System.currentTimeMillis();      // Registrar el fin
        System.out.println("BinarySearch con 1,000,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarJumpSearchCon10000() {
        long inicio =System.currentTimeMillis();    // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios10000.txt");

        // Ejecutar el metodo linearSearch
        int encontrado = AlgoritmosBusqueda.jumpSearch(arreglo, 99999999);

        long fin = System.currentTimeMillis();      // Registrar el fin
        System.out.println("JumpSearch con 10,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarJumpSearchCon100000() {
        long inicio =System.currentTimeMillis();    // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios100000.txt");

        // Ejecutar el metodo linearSearch
        int encontrado = AlgoritmosBusqueda.jumpSearch(arreglo, 99999999);

        long fin = System.currentTimeMillis();      // Registrar el fin
        System.out.println("JumpSearch con 100,000 elementos tomó " + (fin - inicio) + " ms");
    }

    static void probarJumpSearchCon1000000() {
        long inicio =System.currentTimeMillis();    // Registrar el inicio

        // Cargar los valores desde el archivo al arreglo
        int[] arreglo = ManejoDelTXT.cargarValoresDesdeArchivo("numerosAleatorios1000000.txt");

        // Ejecutar el metodo linearSearch
        int encontrado = AlgoritmosBusqueda.jumpSearch(arreglo, 99999999);

        long fin = System.currentTimeMillis();      // Registrar el fin
        System.out.println("JumpSearch con 1,000,000 elementos tomó " + (fin - inicio) + " ms");
    }

}