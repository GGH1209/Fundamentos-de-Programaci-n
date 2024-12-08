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
public class Ejercicio_15 {
    
        public static double salario15 (double a){
        return a*15;
    }
        public static double salariodescontado (double a){
        return (a-((a*0.135)+(a*0.025)));
    }
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        double SD, SQ;
        // Entrada
        System.out.println("Digite su salario diario: ");
        SD= sc.nextDouble();
        // Proceso
        SQ=salario15(SD);
        // Salida
        System.out.print("El salario quincenal despues");
        System.out.println(" de impuestos es un total de: "+salariodescontado(SQ));
    }
}