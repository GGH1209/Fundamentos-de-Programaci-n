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
public class Ejercicio_2 {
    
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        double base, altura, area;
        // Entrada
        System.out.println("Ingrese la base: ");
        base= sc.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura= sc.nextDouble();
        // Proceso
        area=base*altura/2;
        // Salida
        System.out.println("El area del triangulo es: "+area);
        
    }
}
