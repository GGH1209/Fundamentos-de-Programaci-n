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
public class Ejercicio_2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int tam = 0;

        System.out.println("Ingrese el numero de elementos:");
        num = sc.nextInt();
        
        int[] arreglo = new int[num];
        
        for (int i = 0; i < num; i++) {
             System.out.println("Ingrese el elemento "+"("+(i+1)+")"+" del arreglo:");
            arreglo[i] = sc.nextInt();
        }

        int[] arregloTemporal = new int[num];


        for (int i = 0; i < num; i++) {
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

        System.out.println("Arreglo sin elementos repetidos:");
        for (int i = 0; i < tam; i++) {
            System.out.print(arregloTemporal[i] + " ");
        }
    }
}
