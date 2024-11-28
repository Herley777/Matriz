/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author DaniB
 */
public class Exercicio9 {
    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        Scanner scanner = new Scanner(System.in);

        // Inicializar o tabuleiro vazio
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

        boolean jogoAtivo = true;
        char jogadorAtual = 'X';
        int jogadas = 0;

        System.out.println("Bem-vindo ao Jogo da Velha!");

        // Loop principal do jogo
        while (jogoAtivo) {
            // Exibir o tabuleiro
            exibirTabuleiro(tabuleiro);

            // Solicitar jogada do jogador atual
            System.out.println("Vez do jogador " + jogadorAtual);
            int linha, coluna;

            while (true) {
                System.out.print("Digite a linha (0, 1 ou 2): ");
                linha = scanner.nextInt();
                System.out.print("Digite a coluna (0, 1 ou 2): ");
                coluna = scanner.nextInt();

                // Verificar se a jogada é válida
                if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                    tabuleiro[linha][coluna] = jogadorAtual;
                    break;
                } else {
                    System.out.println("Jogada inválida! Tente novamente.");
                }
            }

            jogadas++;

            // Verificar se há um vencedor
            if (verificarVencedor(tabuleiro, jogadorAtual)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("Parabéns! Jogador " + jogadorAtual + " venceu!");
                jogoAtivo = false;
            } else if (jogadas == 9) {
                // Verificar empate
                exibirTabuleiro(tabuleiro);
                System.out.println("Empate! O tabuleiro está cheio.");
                jogoAtivo = false;
            } else {
                // Alternar para o próximo jogador
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }

        scanner.close();
    }

    // Função para exibir o tabuleiro
    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("\nTabuleiro:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tabuleiro[i][j] + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("---+---+---");
        }
    }

    // Função para verificar se um jogador venceu
    public static boolean verificarVencedor(char[][] tabuleiro, char jogador) {
        // Verificar linhas e colunas
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }

        // Verificar diagonais
        if ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
            (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {
            return true;
        }

        return false;
    }
}

