/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_5;

import java.util.Scanner;

/**
 *
 * @author Mark
 */
public class Ejercicio_9 {

    public static void main(String[] args) {
        getMenorYMayorPorFilas();
    }

    public static int[][] setTamanioMatriz() {
        Scanner sc = new Scanner(System.in);
        int[][] matriz;
        int f, c;

        System.out.println("Tamano de la matriz");
        System.out.println("Filas:");
        f = sc.nextInt();
        System.out.println("Columnas:");
        c = sc.nextInt();
        matriz = new int[f][c];
        return matriz;
    }

    public static int[][] llenarMatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese elemento (" + (i + 1) + "," + (j + 1) + "): ");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    public static void getMenorYMayorPorFilas() {
        int[][] matriz;
        int numMayor, numMenor;

        matriz = setTamanioMatriz();

        matriz = llenarMatriz(matriz);

        for (int i = 0; i < matriz.length; i++) {

            numMayor = matriz[i][0];
            numMenor = matriz[i][0];
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > numMayor) {
                    numMayor = matriz[i][j];
                }
                if (matriz[i][j] < numMenor) {
                    numMenor = matriz[i][j];
                }
            }
            System.out.println("Fila " + (i + 1) + " - Mayor: " + numMayor + ", Menor: " + numMenor);

            numMenor = matriz[i][0];
            numMayor = matriz[i][0];

            for (int j = 1; j < matriz[0].length; j++) {
                if (matriz[i][j] > numMayor)
                {
                    numMayor = matriz[i][j];
                }

                if (matriz[i][j] < numMenor)
                {
                    numMenor = matriz[i][j];
                }
            }
            System.out.println("Fila " + (i + 1) + ". Numero mayor: " + numMayor + ", Numero menor: " + numMenor);
        }

    }

}