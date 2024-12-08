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
public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamano de la matriz (N):");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        llenarMatriz(matriz);

        imprimirMatriz(matriz);
    }

    public static void llenarMatriz(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            matriz[i][i] = 1; 
            matriz[i][n - 1 - i] = 1; 
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}