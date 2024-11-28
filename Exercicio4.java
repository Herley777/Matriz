/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author DaniB
 */
public class Exercicio4 {
     public static void main(String[] args) {
        double[][] matriz = new double[4][4];
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Preencha a matriz 4x4 com valores decimais:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // Exibição da matriz preenchida
        System.out.println("\nMatriz 4x4 preenchida:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%.2f ", matriz[i][j]);
            }
            System.out.println();
        }

        // Exibição da diagonal principal
        System.out.println("\nValores da diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%.2f ", matriz[i][i]);
        }

        // Exibição da diagonal secundária
        System.out.println("\n\nValores da diagonal secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%.2f ", matriz[i][3 - i]);
        }

        scanner.close();
    }
}

