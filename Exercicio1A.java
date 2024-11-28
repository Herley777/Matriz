/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DaniB
 */
public class Exercicio1A {
        public static void main(String[] args) { 

        String [][] texto = new String[4][5]; 

         

        texto[0][0] = "a"; 
         texto[0][1] = "b";
          texto[0][2] = "c";
           texto[0][3] = "d";
            texto[0][4] = "e";
             texto[1][0] = "f";
              texto[1][1] = "g";
               texto[1][2] = "h";
                texto[1][3] = "i";
                 texto[1][4] = "j";
                  texto[2][0] = "l";
                   texto[2][1] = "m";
                    texto[2][2] = "n";
                     texto[2][3] = "o";
                      texto[2][4] = "p";
                       texto[3][0] = "q";
                        texto[3][1] = "r";
                         texto[3][2] = "s";
                          texto[3][3] = "t";
                           texto[3][4] = "u";

           for (int i = 0; i < texto.length; i++){ 

            for (int j = 0; j < texto[i].length; j++){ 

                System.out.print(texto[i][j] + " "); 

            } 

            System.out.println(); //pula para a proxima linha 

        } 

         

       

    } 

} 

