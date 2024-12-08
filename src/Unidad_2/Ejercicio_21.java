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
public class Ejercicio_21 {
    
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        double radio, altura, volumen;
        // Entrada
        System.out.println("Ingrese el valor del radio: ");
        radio= sc.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        altura= sc.nextDouble();
        // Proceso
        volumen=(3.1416*Math.pow(radio, 2)*altura)/3;
        // Salida
        System.out.println("El volumen del cono es: "+volumen);
    }
}
