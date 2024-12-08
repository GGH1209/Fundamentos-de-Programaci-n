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
public class Ejercicio_7 {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cal;
        
        System.out.println("Ingresa la calificacion del alumno: ");
        cal = sc.nextInt();

        if (cal >= 70) {
            System.out.println("Aprobado.");
        } else {
            System.out.println("Reprobado.");
        }
    }
}

