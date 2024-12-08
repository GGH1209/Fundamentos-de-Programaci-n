/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_5;

/**
 *
 * @author Mark
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        int[] primos = obtenerPrimos(100);
        
        mostrarPrimos(primos);
    }

    public static int[] obtenerPrimos(int cantidad) {
        int[] primos = new int[cantidad];
        int numero = 2;
        int contador = 0;
        
        while (contador < cantidad) {
            if (esPrimo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }
        
        return primos;
    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void mostrarPrimos(int[] primos) {
        for (int primo : primos) {
            System.out.println(primo + " ");
        }
    }
}