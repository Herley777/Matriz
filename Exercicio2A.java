/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author DaniB
 */
public class Exercicio2A {
         public static void main(String[] args) {

            int somaImpares = 0;
           
             
             
            int[][] matriz = new int[5][5];
            Scanner scanner = new Scanner(System.in);
            
            for (int i = 0;i < 5; i++) {
                for (int j = 0; j < 5; j++){
                    System.out.println("Digite valor para a posição ["+i +"]["+j + "]: ");
                    matriz[i][j] = scanner.nextInt();
                    
               if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                    
                }
            }
              
                }
        System.out.println("\nMatriz 5x5 prenchida:");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]  + " " );
        }
            System.out.println(); 
    }
        // Exibindo a soma dos números ímpares
        System.out.println("\nSoma dos números ímpares fornecidos: " + somaImpares);
        
        scanner.close();
         }

    
}
        
      
        
        
        
        
        
      
