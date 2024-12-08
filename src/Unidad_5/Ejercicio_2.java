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
public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de elementos:");
        int n = sc.nextInt();
        
        int[] arreglo = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el elemento "+"("+(i+1)+")"+" del arreglo:");
            arreglo[i] = sc.nextInt();
        }

        int[] arregloSinRepetidos = eliminarRepetidos(arreglo);
        
        System.out.println("Arreglo sin elementos repetidos:");
        for (int elemento : arregloSinRepetidos) {
            System.out.print(elemento + " ");
        }
    }

    public static int[] eliminarRepetidos(int[] arreglo) {
        int n = arreglo.length;
        int[] arregloTemporal = new int[n];
        int tam = 0;

        for (int i = 0; i < n; i++) {
            boolean repetido = false;
            for (int j = 0; j < tam; j++) {
                if (arreglo[i] == arregloTemporal[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                arregloTemporal[tam++] = arreglo[i];
            }
        }

        int[] arregloSinRepetidos = new int[tam];
        for (int i = 0; i < tam; i++) {
            arregloSinRepetidos[i] = arregloTemporal[i];
        }

        return arregloSinRepetidos;
    }
    
}