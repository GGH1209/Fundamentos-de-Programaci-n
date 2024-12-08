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
public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamano del primer arreglo:");
        int n = sc.nextInt();
        System.out.println("Ingrese el tamano del segundo arreglo:");
        int m = sc.nextInt();

        int[] arreglo1 = new int[n];
        int[] arreglo2 = new int[m];

        System.out.println("Ingrese los elementos del primer arreglo:");
        llenarArreglo(arreglo1, sc);
        System.out.println("Ingrese los elementos del segundo arreglo:");
        llenarArreglo(arreglo2, sc);

        int[] arregloMezclado = mezclarYOrdenar(arreglo1, arreglo2);

        System.out.println("Arreglo mezclado y ordenado:");
        imprimirArreglo(arregloMezclado);
    }

    public static void llenarArreglo(int[] arreglo, Scanner scanner) {
        for (int i = 0; i < arreglo.length; i++) {
             System.out.println("Ingrese el elemento ("+(i+1)+") del arreglo");
            arreglo[i] = scanner.nextInt();
        }
    }

    public static int[] mezclarYOrdenar(int[] arreglo1, int[] arreglo2) {
        int n = arreglo1.length;
        int m = arreglo2.length;
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

        return arregloMezclado;
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
    }
}