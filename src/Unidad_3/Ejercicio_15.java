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
public class Ejercicio_15 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMaterias;
        double suma, cal, promedio;
        
        System.out.println("Ingresa el numero de materias: ");
        numMaterias = sc.nextInt();
        suma = 0;

        for (int i = 1; i <= numMaterias; i++) {
            System.out.print("Ingresa la calificacion de la materia " + i + ": ");
            cal = sc.nextDouble();
            suma += cal;
        }

        promedio = suma / numMaterias;
        System.out.println("El promedio es: " + promedio);
    }
}

