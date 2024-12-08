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
public class Ejercicio_1 {
    
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        int num1, num2, suma;
        // Entrada
        System.out.println("Ingrese el primer numero: ");
        num1= sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2= sc.nextInt();
        // Proceso
        suma=num1+num2;
        // Salida
        System.out.println("La suma de los dos numeros es: "+suma);
    }
}
