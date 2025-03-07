/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_5;

/**
 *
 * @author Mark
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36}
        };

        int[] sumas = sumarColumnas(matriz);

        System.out.println("Suma de cada columna:");
        for (int i = 0; i < sumas.length; i++) {
            System.out.println("Columna " + (i + 1) + ": " + sumas[i]);
        }
    }

    public static int[] sumarColumnas(int[][] matriz) {
        int columnas = matriz[0].length;
        int filas = matriz.length;
        int[] sumas = new int[columnas];

        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                sumas[j] += matriz[i][j];
            }
        }

        return sumas;
    }
}
