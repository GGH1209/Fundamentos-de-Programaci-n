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
public class Ejercicio_20 {
    
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        double E, S, I, PE, PS, PI, CT;
        // Entrada
        System.out.println("Digite en una escala del 0 al 100 sus calificaciones en orden segun:");
        System.out.println("Examen, Solucion de ejercicios e Investigacion");
        E= sc.nextDouble();
        S= sc.nextDouble();
        I= sc.nextDouble();
        // Proceso
        PE=E*0.40;
        PS=S*0.35;
        PI=I*0.25;
        CT=PE+PS+PI;
        // Salida
        System.out.print("La calificacion obtenida fue un total de: "+CT);
        System.out.println("%");
    }
}