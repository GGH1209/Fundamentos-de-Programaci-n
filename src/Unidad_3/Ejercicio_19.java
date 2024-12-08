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
public class Ejercicio_19 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        int x = sc.nextInt();
        int nMayores = 0, nMujeres = 0, nHombres = 0;
        double sumaPeso = 0, sumaAltura = 0;

        for (int i = 0; i < x; i++) {
            System.out.print("Introduce el peso: ");
            double peso = sc.nextDouble();
            System.out.print("Introduce la altura: ");
            double altura = sc.nextDouble();
            System.out.print("Introduce la edad: ");
            int edad = sc.nextInt();
            System.out.print("Introduce el sexo (M para mujer, H para hombre): ");
            char sexo = sc.next().charAt(0);

            sumaPeso += peso;
            sumaAltura += altura;

            if (edad >= 18) nMayores++;
            if (sexo == 'M' || sexo == 'm') nMujeres++;
            if (sexo == 'H' || sexo == 'h') nHombres++;
        }

        System.out.println("Promedio de peso: " + (sumaPeso / x));
        System.out.println("Promedio de altura: " + (sumaAltura / x));
        System.out.println("Porcentaje de mayores de edad: " + ((nMayores * 100.0) / x) + "%");
        System.out.println("Relacion de mujeres a hombres: " + nMujeres + ":" + nHombres);
    }
}