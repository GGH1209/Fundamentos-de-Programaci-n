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
public class Ejercicio_13 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu signo zodiacal: ");
        String signo = sc.nextLine().toLowerCase();

        switch (signo) {
            case "aries", "leo", "sagitario": 
                System.out.println("Eres compatible con signos de Fuego y Aire: ");
                System.out.println("Aries, Leo, Sagitario, Geminis, Libra, Acuario");
                break;
            case "geminis", "libra", "acuario":
                System.out.println("Eres compatible con signos de Aire y Fuego: ");
                System.out.println("Geminis, Libra, Acuario, Aries, Leo, Sagitario");
                break;
            case "cancer", "escorpion", "piscis":
                System.out.println("Eres compatible con signos de Agua y Tierra: ");
                System.out.println("Cancer, Escorpion, Piscis, Tauro, Virgo, Capricornio");
                break;
            case "tauro", "virgo", "capricornio":
                System.out.println("Eres compatible con signos de Tierra y Agua: ");
                System.out.println("Tauro, Virgo, Capricornio, Cancer, Escorpion, Piscis");
                break;
            default:
                System.out.println("Signo no válido.");
                break;
        }
    }
}

