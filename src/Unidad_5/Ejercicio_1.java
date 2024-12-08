/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_5;

import java.util.Scanner;

/**
 *
 * @author Mark
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
            double[] nums = new double[10];

            nums = llenarArreglo(nums);

            System.out.println("La suma de los cuadrados de los valores contenidos en el array son: " + sumaCuadrados(nums));
        }
    
        public static double[] llenarArreglo(double[] nums) {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < nums.length; i++) {
                System.out.println("Ingrese valor " + (i + 1) + ":");
                nums[i] = sc.nextDouble();
            }
            return nums;
        }
    
        public static double sumaCuadrados(double[] nums) {
        double suma = 0;
        for (int i = 0; i < nums.length; i++) {
            suma = suma + Math.pow(nums[i], 2);
        }
        return suma;
    }
}