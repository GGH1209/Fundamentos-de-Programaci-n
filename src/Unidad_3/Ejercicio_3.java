/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_3;

/**
 *
 * @author Mark
 */
public class Ejercicio_3 {
    
    public static void main(String[]args) {
        int x=2709;
        int y=1820;
        
        boolean comparacion = (x<y); // VERDADERO O FALSO (true or false)
        System.out.println(" x es menor que y: "+ comparacion); // false
        
        comparacion = (x>y); //true
        System.out.println(" x es mayor que y: "+ comparacion);
        
        comparacion = (x==y); //false
        System.out.println(" x es igual que y: "+ comparacion);
        
        // !=significa "DIFERENTE DE"
        comparacion = (x!=y); //true
        System.out.println (" x es diferente que y: "+ comparacion);
        
        comparacion = (x<y); //false
        System.out.println (" x es menor o igual que y: "+ comparacion);
        
        comparacion = (x>=y); //true
        System.out.println(" x es mayor o igual que y: "+ comparacion); 
    }
}