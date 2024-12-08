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
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamano de la matriz (N):");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            System.out.println("FILA "+(i+1));
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el elemento "+(j+1));
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean esSimetrica = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    esSimetrica = false;
                    break;
                }
            }
        }

        if (esSimetrica) {
            System.out.println("La matriz es simetrica.");
        } else {
            System.out.println("La matriz no es simetrica.");
        }
    }
}