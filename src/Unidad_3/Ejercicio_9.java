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
public class Ejercicio_9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas;
        double pago;
        
        System.out.println("Ingrese el numero de horas trabajadas");
        horas = sc.nextInt();
        
        if (horas <= 40) {
            pago = horas * 100;
        } else {
            pago = (40 * 100) + ((horas - 40) * 200);
        }
        
        System.out.println("El pago total es: $" + pago);
    }
}
