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
public class Ejercicio_18 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num;
        int positivos = 0, negativos = 0, ceros = 0;

        System.out.print("Ingrese la cantidad de numeros: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Cantidad de numeros positivos: " + positivos);
        System.out.println("Cantidad de numeros negativos: " + negativos);
        System.out.println("Cantidad de 0's: " + ceros);
    }
}

