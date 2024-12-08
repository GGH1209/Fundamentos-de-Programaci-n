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
public class Ejercicio_19 {
    
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        int segundos, minutos, horas, dias;
        // Entrada
        System.out.println("Ingrese el tiempo transcurrido en segundos: ");
        segundos= sc.nextInt();
        // Proceso
        dias=segundos/86400;
        horas=segundos/3600;
        minutos=segundos/60;
        // Salida
        System.out.println("Tiempos equivalentes");
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundos);
    }
}
