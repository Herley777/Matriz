/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author DaniB
 */
public class EXERCICIO3B {
        public static void main(String[] args) {
            
            int quantidadePares = 0; // Variável para contar números pares
            
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
                   // Verificar se o número é par
                if (matriz[i][j] % 2 == 0) {
                    quantidadePares++;
        }
            System.out.println(""); 
    }
             // Exibição da quantidade de números pares
        System.out.println("\nQuantidade de números pares na matriz: " + quantidadePares);

    scanner.close();
}
    
        }
}

