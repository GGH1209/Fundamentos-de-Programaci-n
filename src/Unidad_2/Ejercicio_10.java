/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_2;

import java.util.Scanner;
/**
 *
 * @author Mark
 */
public class Ejercicio_10 {
    
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        double E, I, R, PE, PI, PR, CT;
        // Entrada
        System.out.println("Digite en una escala del 0 al 100 sus calificaciones en orden segun:");
        System.out.println("Examen teorico, Investigacion y Reporte de practicas");
        E= sc.nextDouble();
        I= sc.nextDouble();
        R= sc.nextDouble();
        // Proceso
        PE=E*0.40;
        PI=I*0.30;
        PR=R*0.30;
        CT=PE+PI+PR;
        // Salida
        System.out.print("La calificacion obtenida fue un total de: "+CT);
        System.out.println("%");
    }
}