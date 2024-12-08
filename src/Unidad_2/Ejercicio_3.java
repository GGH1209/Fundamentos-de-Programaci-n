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
public class Ejercicio_3 {
    
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        double bmy, bmn, h, a;
        // Entrada
        System.out.println("Ingrese la base mayor: ");
        bmy= sc.nextDouble();
        System.out.println("Ingrese la base menor: ");
        bmn= sc.nextDouble();
        System.out.println("Ingrese la altura: ");
        h= sc.nextDouble();
        // Proceso
        a=(bmy+bmn)*h/2;
        // Salida
        System.out.println("El area del trapecio es: "+a);
    }
}