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
public class Ejercicio_5 {
    
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        double L, P, ap, A;
        // Entrada
        System.out.println("Ingrese el valor de un lado: ");
        L= sc.nextDouble();
        System.out.println("Ingrese el valor del apotema: ");
        ap= sc.nextDouble();
        // Proceso
        P=5*L;
        A=P*ap;
        // Salida
        System.out.println("El perimetro de un pentagono es: "+P);
        System.out.println("El area de un pentagono es: "+A);
    }
}