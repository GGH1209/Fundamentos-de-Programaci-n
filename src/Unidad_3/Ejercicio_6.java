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
public class Ejercicio_6 {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        
        System.out.println("Ingresa un numero: ");
        num = sc.nextInt();
        
        if (num >= 0) {
            System.out.println("El numero es positivo.");
        } else {
            System.out.println("El numero es negativo.");
        }
    }
}

