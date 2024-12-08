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
public class Ejercicio_13 {
    
        public static double fahrenheit (double a){
        return a*1.8+32;
    }
        public static double kelvin (double a){
        return a+273.15;
    }
        public static double rankines (double a){
        return (a+273.15)*1.8;
    }
    
    
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        double C;
        // Entrada
        System.out.println("Ingrese el valor de los grados Celcius: ");
        C= sc.nextDouble();
        // Salida
        System.out.println("El valor convertido a Fahrenheit es de: "+fahrenheit(C));
        System.out.println("El valor convertido a Kelvin es de: "+kelvin(C));
        System.out.println("El valor convertido a Rankines es de: "+rankines(C));
    }
}
