/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_4;

/**
 *
 * @author Mark
 */
public class Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] visitantes = {
            {12000, 13000, 18000, 15000, 16000, 17000},
            {7000, 8000, 9000, 15000, 11000, 12000},
            {15000, 14000, 17000, 18000, 21000, 20000},
            {6000, 9000, 8000, 90000, 12000, 11000},
            {11000, 15000, 16000, 17000, 18000, 22000},
            {5000, 6000, 7000, 8000, 9000, 10000},
            {9000, 11000, 12000, 13000, 14000, 16000},
            {13000, 14000, 23000, 22000, 17000, 18000},
            {16000, 20000, 21000, 22000, 23000, 18000},
            {7000, 11000, 12000, 13000, 14000, 8000}
        };

        int[] totalVisitantes = new int[visitantes.length];
        for (int i = 0; i < visitantes.length; i++) {
            for (int j = 0; j < visitantes[i].length; j++) {
                totalVisitantes[i] += visitantes[i][j];
            }
        }

        System.out.println("Total de visitantes por centro turistico:");
        for (int i = 0; i < totalVisitantes.length; i++) {
            System.out.println("Centro turistico " + (i + 1) + ": " + totalVisitantes[i]);
        }

        int masVisitado = 0;
        int menosVisitado = 0;
        for (int i = 1; i < totalVisitantes.length; i++) {
            if (totalVisitantes[i] > totalVisitantes[masVisitado]) {
                masVisitado = i;
            }
            if (totalVisitantes[i] < totalVisitantes[menosVisitado]) {
                menosVisitado = i;
            }
        }

        System.out.println("\nCentro turistico mas visitado: Centro " + (masVisitado + 1) + " con " + totalVisitantes[masVisitado] + " visitantes.");
        System.out.println("Centro turistico menos visitado: Centro " + (menosVisitado + 1) + " con " + totalVisitantes[menosVisitado] + " visitantes.");

        int mesMasVisitado = 0;
        for (int j = 1; j < visitantes[masVisitado].length; j++) {
            if (visitantes[masVisitado][j] > visitantes[masVisitado][mesMasVisitado]) {
                mesMasVisitado = j;
            }
        }
        System.out.println("Mes con mas visitantes del centro turistico mas visitado: Mes " + (mesMasVisitado + 1));

        mesMasVisitado = 0;
        for (int j = 1; j < visitantes[menosVisitado].length; j++) {
            if (visitantes[menosVisitado][j] > visitantes[menosVisitado][mesMasVisitado]) {
                mesMasVisitado = j;
            }
        }
        System.out.println("Mes con mas visitantes del centro turistico menos visitado: Mes " + (mesMasVisitado + 1));

        int mesMayorAfluencia = 0;
        int mesMenorAfluencia = 0;
        int maxAfluencia = 0;
        int minAfluencia = Integer.MAX_VALUE;

        for (int j = 0; j < visitantes[0].length; j++) {
            int sumaMes = 0;
            for (int i = 0; i < visitantes.length; i++) {
                sumaMes += visitantes[i][j];
            }
            if (sumaMes > maxAfluencia) {
                maxAfluencia = sumaMes;
                mesMayorAfluencia = j;
            }
            if (sumaMes < minAfluencia) {
                minAfluencia = sumaMes;
                mesMenorAfluencia = j;
            }
        }

        System.out.println("\nMes con mayor afluencia turistica: Mes " + (mesMayorAfluencia + 1) + " con " + maxAfluencia + " visitantes.");
        System.out.println("Mes con menor afluencia turistica: Mes " + (mesMenorAfluencia + 1) + " con " + minAfluencia + " visitantes.");
    }
}