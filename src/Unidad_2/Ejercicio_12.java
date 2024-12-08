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
public class Ejercicio_12 {
    
        public static double area (double a, double b){
        return a*b/2;
    }
        public static double perimetro (double a, double b){
        return (2*a)+(2*b);
    }
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        double baseT, alturaT, baseR, alturaR;
        // Entrada
        System.out.println("Ingrese la base del triangulo: ");
        baseT= sc.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        alturaT= sc.nextDouble();
        System.out.println("Ingrese la base del rectangulo: ");
        baseR= sc.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        alturaR= sc.nextDouble();
        // Salida
        System.out.println("El area del triangulo es: "+area(baseT, alturaT));
        System.out.println("El perimetro del rectangulo es: "+perimetro(baseR,alturaR));
        
    }
}