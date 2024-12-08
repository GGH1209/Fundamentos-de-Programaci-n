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
public class Ejercicio_7 {
    
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        double pu, pl, pm, pp;
        // Entrada
        System.out.println("Digite su peso: ");
        pu= sc.nextDouble();
        // Proceso
        pl=0.165*pu;
        pm=0.377*pu;
        pp=0.0632*pu;
        // Salida
        System.out.println("Su peso en la luna seria de: "+pl);
        System.out.println("Su peso en marte seria de: "+pm);
        System.out.println("Su peos en pluton seria de: "+pp);
    }
}