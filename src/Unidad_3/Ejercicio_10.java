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
public class Ejercicio_10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edadChico, edadChica;
        double estatura;
        
        System.out.println("Ingresa la edad del chico: ");
        edadChico = sc.nextInt();
        System.out.println("Ingresa la edad de la chica: ");
        edadChica = sc.nextInt();
        System.out.println("Ingresa la estatura del chico (en metros): ");
        estatura = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingresa el artista favorito del chico: ");
        String artista = sc.nextLine();

        if (edadChico > edadChica && estatura >= 1.80 && artista.equalsIgnoreCase("BTS")) {
            System.out.println("Es compatible.");
        } else {
            System.out.println("No es compatible.");
        }
    }
}

