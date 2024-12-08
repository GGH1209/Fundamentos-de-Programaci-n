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
public class Ejercicio_6 {
    
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        double C, F, K, R;
        // Entrada
        System.out.println("Ingrese el valor de los grados Celcius: ");
        C= sc.nextDouble();
        // Proceso
        F=C*1.8+32;
        K=C+273.15;
        R=(C+273.15)*1.8;
        // Salida
        System.out.println("El valor convertido a Fahrenheit es de: "+F);
        System.out.println("El valor convertido a Kelvin es de: "+K);
        System.out.println("El valor convertido a Rankines es de: "+R);
    }
}
