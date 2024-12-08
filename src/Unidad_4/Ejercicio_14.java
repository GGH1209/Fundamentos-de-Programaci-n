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
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de alumnos:");
        int n = scanner.nextInt();

        double[][] calificaciones = new double[n][4];

        System.out.println("Ingrese las calificaciones de los alumnos:");
        for (int i = 0; i < n; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.println("Calificacion del Examen " + (j + 1) + ":");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Promedio de cada alumno:");
        for (int i = 0; i < n; i++) {
            double suma = 0;
            for (int j = 0; j < 4; j++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / 4;
            System.out.println("Alumno " + (i + 1) + ": " + promedio);
        }

        System.out.println("Promedio del grupo en cada examen:");
        for (int j = 0; j < 4; j++) {
            double suma = 0;
            for (int i = 0; i < n; i++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / n;
            System.out.println("Examen " + (j + 1) + ": " + promedio);
        }

        double maxPromedio = 0;
        int examenMayorPromedio = 0;
        for (int j = 0; j < 4; j++) {
            double suma = 0;
            for (int i = 0; i < n; i++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / n;
            if (promedio > maxPromedio) {
                maxPromedio = promedio;
                examenMayorPromedio = j;
            }
        }
        System.out.println("El examen con mayor promedio es el Examen " + (examenMayorPromedio + 1));

        System.out.println("Numero de alumnos aprobados en cada examen:");
        for (int j = 0; j < 4; j++) {
            int aprobados = 0;
            for (int i = 0; i < n; i++) {
                if (calificaciones[i][j] >= 70 && calificaciones[i][j] <= 100) {
                    aprobados++;
                }
            }
            System.out.println("Examen " + (j + 1) + ": " + aprobados + " alumnos aprobados.");
        }
    }
}