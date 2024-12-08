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
public class Ejercicio_12 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        System.out.println("=== Menu de Pizzas ===");
        System.out.println("1. Italiana");
        System.out.println("2. Carnes Frias");
        System.out.println("3. Vegetariana");
        System.out.println("4. Pepperoni");
        System.out.println("5. Hawaiana");
        System.out.println("6. Mexicana");
        System.out.println("7. Camaron");
        System.out.print("Que pizza deseas ordenar?: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1: 
                System.out.println("Pizza numero 1. Italiana");
                System.out.println("Ingredientes: Queso, tomate, albahaca.");
                break;
            case 2:
                System.out.println("Pizza numero 2. Carnes Frias");
                System.out.println("Ingredientes: Salami, jamon, pepperoni.");
                break;
            case 3:
                System.out.println("Pizza numero 3. Vegetariana");
                System.out.println("Ingredientes: Champiñones, pimientos, aceitunas.");
                break;
            case 4:
                System.out.println("Pizza numero 4. Pepperoni");
                System.out.println("Ingredientes: Pepperoni y queso.");
                break;
            case 5:
                System.out.println("Pizza numero 5. Hawaiana");
                System.out.println("Ingredientes: Piña, jamon, queso.");
                break;
            case 6:
                System.out.println("Pizza numero 6. Mexicana");
                System.out.println("Ingredientes: Jalapeños, chorizo, queso.");
                break;
            case 7:
                System.out.println("Pizza numero 7. Camaron");
                System.out.println("Ingredientes: Camarones, queso.");
                break;
            default:
                System.out.println("Opcion no valida.");
                break;
        }
    }
}

