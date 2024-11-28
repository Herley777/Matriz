/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author DaniB
 */
public class EXERCICIO3A {
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
            System.out.println(""); 
    }
        
         // Verificar elementos repetidos
        boolean temRepetidos = false;
        outerLoop:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // Comparar com os elementos restantes na matriz
                for (int k = i; k < 5; k++) {
                    for (int l = (k == i ? j + 1 : 0); l < 5; l++) {
                        if (matriz[i][j] == matriz[k][l]) {
                            temRepetidos = true;
                            break outerLoop; // Parar a verificação ao encontrar repetidos
                        }
                    }
                }
            }
        }

        // Exibir resultado
        if (temRepetidos) {
            System.out.println("\nA matriz possui elementos repetidos.");
        } else {
            System.out.println("\nA matriz não possui elementos repetidos.");
        }
    scanner.close();
}
    
}



