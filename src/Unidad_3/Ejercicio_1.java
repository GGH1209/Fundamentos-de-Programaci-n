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
public class Ejercicio_1 {
    
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        
        System.out.println("Ingresa tu edad: ");
        edad = sc.nextInt();
        
        if (edad>=18) {
            System.out.println ("Ya eres mayor de edad, ya puedes ir con las cariñosas");
        }
        else {
            System.out.println ("Mira tu mama te habla, anda ve");
        }
    }
}