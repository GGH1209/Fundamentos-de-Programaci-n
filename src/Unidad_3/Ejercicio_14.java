/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_3;

/**
 *
 * @author Mark
 */
public class Ejercicio_14 {
    
    public static void main(String[] args) {
        // Ciclo FOR
        System.out.println("Ciclo FOR:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        // Ciclo WHILE
        System.out.println("\nCiclo WHILE:");
        int i = 4;
        while (i <= 24) {
            System.out.print(i + " ");
            i += 4;
        }
        // Ciclo DO-WHILE
        System.out.println("\nCiclo DO-WHILE:");
        i = 5;
        do {
            System.out.print(i + " ");
            i--;
        } while (i >= 1);
    }
}

