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
public class Ejercicio_17 {
    
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        int a, b, aux;
        // Entrada
        System.out.println("Ingrese el valor de A: ");
        a= sc.nextInt();
        System.out.println("Ingrese el valor de B: ");
        b= sc.nextInt();
        System.out.println("Valores antes del intercambio: ");
        System.out.println("A= "+a);
        System.out.println("B: "+b);
        // Proceso
        aux=a;
        a=b;
        b=aux;
        // Salida
        System.out.println("Valores despues del intercambio: ");
        System.out.println("A= "+a);
        System.out.println("B: "+b);
    }
}
