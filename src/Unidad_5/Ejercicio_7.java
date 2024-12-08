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
public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de alumnos:");
        int n = sc.nextInt();

        int[] calificaciones = new int[n];

        System.out.println("Ingrese las calificaciones:");
        for (int i = 0; i < n; i++) {
            calificaciones[i] = sc.nextInt();
        }

        double media = calcularMedia(calificaciones);
        System.out.println("Media aritmetica: " + media);

        double varianza = calcularVarianza(calificaciones, media);
        System.out.println("Varianza: " + varianza);

        double desviacionEstandar = Math.sqrt(varianza);
        System.out.println("Desviacion estandar: " + desviacionEstandar);

        int moda = calcularModa(calificaciones);
        System.out.println("Moda: " + moda);
    }

    public static double calcularMedia(int[] arreglo) {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma / arreglo.length;
    }

    public static double calcularVarianza(int[] arreglo, double media) {
        double sumaDesviaciones = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumaDesviaciones += Math.pow(arreglo[i] - media, 2);
        }
        return sumaDesviaciones / arreglo.length;
    }

    public static int calcularModa(int[] arreglo) {
        int moda = arreglo[0];
        int maxContador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            int contador = 0;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[j] == arreglo[i]) contador++;
            }
            if (contador > maxContador) {
                maxContador = contador;
                moda = arreglo[i];
            }
        }
        return moda;
    }
}
