/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_4;

import java.util.Scanner;

/**
 *
 * @author Mark
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz;
        int f, c,numMayor,numMenor;
        
        System.out.println("Tamano de la matriz ");
        System.out.println("Filas: ");
        f = sc.nextInt();
        System.out.println("Columnas: ");
        c = sc.nextInt();
        matriz = new int[f][c];
        
        for (int i =0;i<f;i++){
            for (int j=0;j<c;j++){
                System.out.println("Ingrese elemento ("+(i+1)+","+(j+1)+"): ");
                matriz[i][j]=sc.nextInt();
            }
        }
        
        for (int i =0;i<f;i++){
            
            numMenor = matriz[i][0];
            numMayor = matriz[i][0];
            
            for (int j =1;j<c;j++){
            if(matriz[i][j]>numMayor)
                numMayor = matriz[i][j];
            if(matriz[i][j]<numMenor)
                numMenor = matriz[i][j];
                
            }
            System.out.println("Fila "+(i+1)+". Numero mayor:"+numMayor+". Numero menor:"+numMenor);
        }
        
        
    }
    
}