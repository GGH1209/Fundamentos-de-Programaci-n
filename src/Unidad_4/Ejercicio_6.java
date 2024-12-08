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
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamano del arreglo:");
        int n = sc.nextInt();

        int[] arreglo = new int[n];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = sc.nextInt();
        }

        System.out.println("Ingrese el valor a buscar:");
        int valor = sc.nextInt();

        int izquierda = 0;
        int derecha = n - 1;
        int resultado = -1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (arreglo[medio] == valor) {
                resultado = medio;
                break;
            }
            
            if (arreglo[medio] < valor) {
                izquierda = medio + 1;
            } else {

                derecha = medio - 1;
            }
        }

        if (resultado == -1) {
            System.out.println("El valor no se encuentra en el arreglo.");
        } else {
            System.out.println("El valor se encuentra en la posicion: " + resultado);
        }
    }
}