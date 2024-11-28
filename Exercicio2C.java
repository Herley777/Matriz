/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author DaniB
 */
public class Exercicio2C {
    public static void main(String[] args) {
             
            int[][] matriz = new int[5][5];
            Scanner scanner = new Scanner(System.in);
            
            for (int i = 0;i < 5; i++) {
                for (int j = 0; j < 5; j++){
                    System.out.println("Digite valor para a posição ["+i +"]["+j + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }
        System.out.println("\nMatriz 5x5 prenchida:");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]  + " " );
        }
            System.out.println(); 
    }
         // Calculando a soma de cada linha
        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
   
}
    System.out.println("Soma da linha " + (i + 1) + ": " + somaLinha);
        }
        scanner.close(); 
    }
}
    
