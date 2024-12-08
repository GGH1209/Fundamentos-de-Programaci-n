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
public class Ejercicio_9 {
    
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        double SD, SQ, SQT;
        // Entrada
        System.out.println("Digite su salario diario: ");
        SD= sc.nextDouble();
        // Proceso
        SQ= SD*15;
        SQT=(SQ-((SQ*0.135)+(SQ*0.025)));
        // Salida
        System.out.print("El salario quincenal despues de impuestos");
        System.out.println(" es un total de: "+SQT);
    }
}