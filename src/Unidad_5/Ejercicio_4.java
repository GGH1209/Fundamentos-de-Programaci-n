/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_5;

/**
 *
 * @author Mark
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        int[] fibonacci = calcularFibonacci(100);
        imprimirArreglo(fibonacci);
    }

    public static int[] calcularFibonacci(int cantidad) {
        int[] fibonacci = new int[cantidad];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < cantidad; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
    }
}