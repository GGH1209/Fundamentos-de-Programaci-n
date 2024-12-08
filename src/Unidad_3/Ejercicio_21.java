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
public class Ejercicio_21 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num, termino, sen;
        int n;
        
        System.out.print("Introduce un numero: ");
        num = sc.nextDouble();

        termino = num;
        sen = termino; 
        n = 1;


        while (Math.abs(termino) > 0.001) {
            termino = -termino * num * num / ((2 * n) * (2 * n + 1));
            sen += termino;
            n++;
                System.out.println("El seno de " +num+ " es: " + sen);
        }
    }
}