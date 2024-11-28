/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DaniB
 */
public class Exercicio1B {
     public static void main(String[] args) {
        int[][] Matriz = new int[3][4];
        
        Matriz[0][0] = 19;
        Matriz[0][1] = 25;
        Matriz[0][2] = 100;
        Matriz[0][3] = 99;
        
        Matriz[1][0] = 10;
        Matriz[1][1] = 7;
        Matriz[1][2] = 25;
          Matriz[1][3] = 14;
        
        Matriz[2][0] = 35;
        Matriz[2][1] = 2;
        Matriz[2][2] = 47;
          Matriz[2][3] = 74;
          
       
        
      
        
        
        
        
        
        
        for (int i = 0; i < Matriz.length; i++){
            for (int j = 0; j < Matriz[i].length; j++){
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println(); //pula para a proxima linha
        }
        
}
}