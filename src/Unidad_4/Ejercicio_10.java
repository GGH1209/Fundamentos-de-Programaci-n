/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_4;

import java.util.Scanner;

/**
 *
 * @author Mark
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz, traspuesta;
        int f, c;

        System.out.println("Tamano de la matriz");
        System.out.println("Filas: ");
        f = sc.nextInt();
        System.out.println("Columnas: ");
        c = sc.nextInt();
        matriz = new int[f][c];
        traspuesta = new int[c][f];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese elemento (" + (i + 1) + "," + (j + 1) + "):");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("\nMATRIZ ORIGINAL");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println("");
        }

        System.out.println("\nMATRIZ TRASPUESTA");
        for (int[] fila : traspuesta) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println("");
        }

    }

}

