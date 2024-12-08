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
public class Ejercicio_16 {
    
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        double radio, area;
        // Entrada
        System.out.println("Ingrese el valor del radio: ");
        radio= sc.nextDouble();
        // Proceso
        area=3.1416*Math.pow(radio, 2);
        // Salida
        System.out.println("El area del circulo es: "+area);
    }
}
