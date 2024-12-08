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
public class Ejercicio_8 {
    
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        int RC, RI, RB, T;
        // Entrada
        System.out.println("Digite en orden el numero de respuestas: ");
        System.out.println("Correctas, incorrectas y en blanco");
        RC= sc.nextInt();
        RI= sc.nextInt();
        RB= sc.nextInt();
        // Proceso
        T=(RC*5)+(RI*(-2))+(RB*0);
        // Salida
        System.out.println("El total de puntaje obtenido seria: "+T);
    }
}