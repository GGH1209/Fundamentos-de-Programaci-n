/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_5;

/**
 *
 * @author Mark
 */
public class Ejercicio_15 {

    public static void main(String[] args) {
        
        int[][] visitantes = {
            {6000, 12000, 15000, 18000, 19000, 12000},
            {4000, 7000, 10000, 11000, 12000, 15000},
            {7000, 11000, 15000, 16000, 17000, 8000},
            {9000, 10000, 10000, 15000, 16000, 7000},
            {10000, 15000, 13000, 14000, 15000, 9000},
            {12000, 17000, 11000, 12000, 13000, 10000},
            {13000, 16000, 12000, 13000, 14000, 5000},
            {18000, 18000, 16000, 17000, 18000, 6000},
            {8000, 4000, 8000, 9000, 10000, 9000},
            {5000, 3000, 7000, 8000, 9000, 11000}
        };

        int[] totalVisitantes = calcularTotalVisitantes(visitantes);

        System.out.println("Total de visitantes por centro turistico:");
        for (int i = 0; i < totalVisitantes.length; i++) {
            System.out.println("Centro turistico " + (i + 1) + ": " + totalVisitantes[i]);
        }

        int[] masMenosVisitado = calcularMasMenosVisitado(totalVisitantes);

        System.out.println("\nCentro turistico mas visitado: Centro " + (masMenosVisitado[0] + 1) + " con " + totalVisitantes[masMenosVisitado[0]] + " visitantes.");
        System.out.println("Centro turistico menos visitado: Centro " + (masMenosVisitado[1] + 1) + " con " + totalVisitantes[masMenosVisitado[1]] + " visitantes.");
        System.out.println("Mes con mas visitantes del centro turistico mas visitado: Mes " + (calcularMesMasVisitantes(visitantes, masMenosVisitado[0]) + 1));
        System.out.println("Mes con mas visitantes del centro turistico menos visitado: Mes " + (calcularMesMasVisitantes(visitantes, masMenosVisitado[1]) + 1));

        int[] afluenciaMeses = calcularAfluenciaMeses(visitantes);

        System.out.println("\nMes con mayor afluencia turistica: Mes " + (afluenciaMeses[0] + 1) + " con " + afluenciaMeses[2] + " visitantes.");
        System.out.println("Mes con menor afluencia turistica: Mes " + (afluenciaMeses[1] + 1) + " con " + afluenciaMeses[3] + " visitantes.");
    }

    public static int[] calcularTotalVisitantes(int[][] visitantes) {
        int[] total = new int[visitantes.length];
        for (int i = 0; i < visitantes.length; i++) {
            for (int j = 0; j < visitantes[i].length; j++) {
                total[i] += visitantes[i][j];
            }
        }
        return total;
    }

    public static int[] calcularMasMenosVisitado(int[] totalVisitantes) {
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
        return new int[] {masVisitado, menosVisitado};
    }

    public static int calcularMesMasVisitantes(int[][] visitantes, int centro) {
        int mesMasVisitado = 0;
        for (int i = 1; i < visitantes[centro].length; i++) {
            if (visitantes[centro][i] > visitantes[centro][mesMasVisitado]) {
                mesMasVisitado = i;
            }
        }
        return mesMasVisitado;
    }

    public static int[] calcularAfluenciaMeses(int[][] visitantes) {
        int[] afluencia = new int[4]; //
        afluencia[2] = 0;
        afluencia[3] = Integer.MAX_VALUE;

        for (int j = 0; j < visitantes[0].length; j++) {
            int sumaMes = 0;
            for (int i = 0; i < visitantes.length; i++) {
                sumaMes += visitantes[i][j];
            }
            if (sumaMes > afluencia[2]) {
                afluencia[0] = j;
                afluencia[2] = sumaMes;
            }
            if (sumaMes < afluencia[3]) {
                afluencia[1] = j;
                afluencia[3] = sumaMes;
            }
        }
        return afluencia;
    }
}
