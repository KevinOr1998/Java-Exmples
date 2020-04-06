/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SegundoParcial;

/**
 *
 * @author Kevin Ortega
 */
public class FuncionImprimirMatriz {
    public static void main(String[]args){
     int matrix[][] = {{0, 0, 0, 0}, {1, 1, 1, 1}, {4, 4, 4, 4}, {2, 2, 2, 2}};
     ImprimirMatriz(matrix);
    }
    public static void ImprimirMatriz(int[][] matriz){
                  System.out.println("imprimiendotabla");
            for (int i=0;i<matriz.length;i++){
                System.out.println();
                    for (int j=0;j<matriz.length;j++){
                        System.out.print("|"+matriz[i][j]+"|"); 
            }
        }
    }
}
