/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DaniB
 */
public class Exercicio1C {
    public static void main(String[] args) {
        
    
   
      double [][] Matriz = new double[3][3];
        
        Matriz[0][0] = 1.9;
        Matriz[0][1] = 2.5;
        Matriz[0][2] = 10.0;
        
        
        Matriz[1][0] = 1.0;
        Matriz[1][1] = 7.8;
        Matriz[1][2] = 2.5;
          
        
        Matriz[2][0] = 3.5;
        Matriz[2][1] = 2.2;
        Matriz[2][2] = 4.7;
         
          
       
        
      
        
        
        
        
        
        
        for (int i = 0; i < Matriz.length; i++){
            
            for (int j = 0; j < Matriz[i].length; j++){
                
                System.out.print(Matriz[i][j] + " ");
                
            }
            System.out.println(); //pula para a proxima linha
        }
        
}
}

