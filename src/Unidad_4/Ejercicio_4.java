/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_4;

/**
 *
 * @author Mark
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] fibonacci = new int[100];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        for (int i = 2; i < 100; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}