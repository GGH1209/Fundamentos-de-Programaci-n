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
public class Ejercicio_14 {
    
        public static double pesoluna (double a){
        return a*0.165;
    }
        public static double pesomarte (double a){
        return a*0.377;
    }
        public static double pesopluton (double a){
        return a*0.0632;
    }
    public static void main(String[]args) {
        // Definición de variables
        Scanner sc = new Scanner(System.in);
        double pu;
        // Entrada
        System.out.println("Digite su peso: ");
        pu= sc.nextDouble();
        // Salida
        System.out.println("Su peso en la luna seria de: "+pesoluna(pu));
        System.out.println("Su peso en marte seria de: "+pesomarte(pu));
        System.out.println("Su peos en pluton seria de: "+pesopluton(pu));
    }
}