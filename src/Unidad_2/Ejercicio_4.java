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
public class Ejercicio_4 {
    
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        int h, b, p;
        // Entrada
        System.out.println("Ingrese la altura: ");
        h= sc.nextInt();
        System.out.println("Ingrese la base: ");
        b= sc.nextInt();
        // Proceso
        p=(2*h)+(2*b);
        // Salida
        System.out.println("El perimetro de un rectangulo es: "+p);
    }
}