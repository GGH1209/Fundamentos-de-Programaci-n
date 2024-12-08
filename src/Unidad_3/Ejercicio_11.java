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
public class Ejercicio_11 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int semestre;
        double promedio;
        
        System.out.println("Ingresa el semestre del alumno: ");
        semestre = sc.nextInt();
        System.out.println("Ingresa el promedio del alumno: ");
        promedio = sc.nextDouble();

        if (semestre >= 4 && semestre <= 9 && promedio >= 80) {
            System.out.println("Eres elegible para la Beca de manutencion.");
        } else if (semestre >= 1 && semestre <= 3 && promedio >= 75) {
            System.out.println("Eres elegible para la Beca de transporte.");
        } else {
            System.out.println("No cumples con los requisitos para la beca.");
        }
    }
}

