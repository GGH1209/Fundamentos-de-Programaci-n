/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_3;

import java.util.Scanner;
/**
 *
 * @author Mark
 */
public class Ejercicio_8 {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double dividendo, divisor, resultado;
        
        System.out.println("Ingrese el dividendo");
        dividendo = sc.nextDouble();
        System.out.println("Ingrese el divisor");
        divisor = sc.nextDouble();

        if (divisor != 0) {
            resultado = dividendo / divisor;
            System.out.println("Resultado de la division: " + resultado);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }
}

