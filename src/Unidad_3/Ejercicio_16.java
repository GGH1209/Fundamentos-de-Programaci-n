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
public class Ejercicio_16 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorInicial, valorFinal;

        do {
            System.out.println("Introduce el valor inicial: ");
            valorInicial = sc.nextInt();
            System.out.println("Introduce el valor final: ");
            valorFinal = sc.nextInt();

            if (valorInicial < valorFinal + 5) {
                System.out.println("El valor inicial debe ser al menos 5 unidades mayor que el valor final. Repita el proceso.");
            }
        } while (valorInicial < valorFinal + 5);
        
        while (valorInicial > valorFinal) {
            System.out.println("Valor inicial: " + valorInicial);
            valorInicial -= 5;
        }
    }
}

