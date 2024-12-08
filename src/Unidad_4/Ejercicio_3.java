/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_4;

/**
 *
 * @author Mark
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numPs = new int[100];
        int numero = 2;
        int contador = 0;

        while (contador < 100) {
            boolean esPrimo = true;

            if (numero < 2) {
                esPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                numPs[contador] = numero;
                contador++;
            }
            numero++;
        }

        for (int nump : numPs) {
            System.out.print(nump + " ");
        }
    }
}