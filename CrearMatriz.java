/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SegundoParcial;

import java.util.Scanner;

/**
 *
 * @author Kevin Ortega
 */
public class CrearMatriz {
    public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
        System.out.println("cuales son las dimenciones de tu matriz?");
//CREACION DE MATRIX  
        Scanner entrada=new Scanner(System.in);
        double MATRIX[][]=new double[5][3];
//LLENADO DE MATRIZ       
       
        for (int i = 0; i < MATRIX.length; i++) {
            for (int j = 0; j < MATRIX[0].length; j++) {
                System.out.print("Inserta numero:\n");
                MATRIX[i][j] = entrada.nextFloat();
                     }
                        }
  //IMPRIMIEN DOMATRIZ      
                    for (int i=0;i<MATRIX.length;i++){
                System.out.println();
                    for (int j=0;j<MATRIX[0].length;j++){
                        System.out.print(MATRIX[i][j]+" "); 
           }
        }
    }
}
