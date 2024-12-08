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
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamano del primer arreglo:");
        int n = sc.nextInt();
        System.out.println("Ingrese el tamano del segundo arreglo:");
        int m = sc.nextInt();

        int[] arreglo1 = new int[n];
        int[] arreglo2 = new int[m];

        System.out.println("Ingrese los elementos del primer arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el elemento ("+(i+1)+") del primer arreglo");
            arreglo1[i] = sc.nextInt();
        }
        System.out.println("Ingrese los elementos del segundo arreglo:");
        for (int i = 0; i < m; i++) {
            System.out.println("Ingrese el elemento ("+(i+1)+") del segundo arreglo");
            arreglo2[i] = sc.nextInt();
        }

        int[] arregloMezclado = new int[n + m];
        int index = 0;

        for (int i = 0; i < n; i++) {
            arregloMezclado[index++] = arreglo1[i];
        }
        for (int i = 0; i < m; i++) {
            arregloMezclado[index++] = arreglo2[i];
        }

        for (int i = 0; i < arregloMezclado.length - 1; i++) {
            for (int j = 0; j < arregloMezclado.length - 1 - i; j++) {
                if (arregloMezclado[j] < arregloMezclado[j + 1]) {
                    int temp = arregloMezclado[j];
                    arregloMezclado[j] = arregloMezclado[j + 1];
                    arregloMezclado[j + 1] = temp;
                }
            }
        }

        System.out.println("Arreglo mezclado y ordenado:");
        for (int i = 0; i < arregloMezclado.length; i++) {
            System.out.print(arregloMezclado[i] + " ");
        }
    }
}