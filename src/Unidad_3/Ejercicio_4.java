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
public class Ejercicio_4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int edad;
        
        System.out.println("Programa que determina si usted es mayor de edad");
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        
        // (edad == 18) (edad<=18) (edad<17)
        // Usted es mayor de edad"
        // Usted es menor de dedad"
        // If
        
        System.out.println("Solucion de Israel");
        if (edad>=18)
            //SI ES VERDADERO
            System.out.println ("Eres mayor de edad. Te voy a llevar a un VIP");
        else
            //SI ES FALSO
            System.out.println ("Eres menor de edad");
        
        System.out.println ("Solucion de Yamir y Cristopher");
        if (edad<18)
            //SI ES VERDADERO
            System.out.println("Eres menor de edad");
        else
            //SI ES FALSO
            System.out.println("Eres mayor de edad");
        
        System.out.println("Solucion de Diego");
        if (edad>17)
            //SI ES VERDADERO
            System.out.println("Eres mayor de edad");
        else
            //SI ES FALSO
            System.out.println("Ve anda, mira, te habla tu mami. No quiero ir a la carcel");
    }
}
