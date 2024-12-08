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
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de alumnos:");
        int n = sc.nextInt();

        int[] calificaciones = new int[n];

        System.out.println("Ingrese las calificaciones:");
        for (int i = 0; i < n; i++) {
            calificaciones[i] = sc.nextInt();
        }

        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += calificaciones[i];
        }
        double media = suma / n;
        System.out.println("Media aritmetica: " + media);

        double sumaDesviaciones = 0;
        for (int i = 0; i < n; i++) {
            sumaDesviaciones += Math.pow(calificaciones[i] - media, 2);
        }
        double varianza = sumaDesviaciones / n;
        System.out.println("Varianza: " + varianza);

        double desviacionEstandar = Math.sqrt(varianza);
        System.out.println("Desviacion estandar: " + desviacionEstandar);

        int moda = calificaciones[0];
        int maxContador = 0;
        for (int i = 0; i < n; i++) {
            int contador = 0;
            for (int j = 0; j < n; j++) {
                if (calificaciones[j] == calificaciones[i]) contador++;
            }
            if (contador > maxContador) {
                maxContador = contador;
                moda = calificaciones[i];
            }
        }
        System.out.println("Moda: " + moda);
    }
}