/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PrimerParcial;
import java.util.Scanner;
/**
 *
 * @author Kevin Ortega
 */
public class LLenarMatriz {
        public static void main(String args[]) {
        int MATRIX[][] = new int[4][6];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < MATRIX.length; i++) {
            for (int j = 0; j < MATRIX[0].length; j++) {
                System.out.print("Inserta numero:\n");
                MATRIX[i][j] = entrada.nextInt();
            }
            
            }
for (int i = 0; i < MATRIX.length; i++) {
            System.out.println();
            for (int j = 0; j < MATRIX[i].length; j++) {
                System.out.print(MATRIX[i][j] + " ");
            }
        }
        }   

    
}
