/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Valeria;
import java.util.Scanner;

/**
 *
 * @author Kevin Ortega
 */
public class LLenadoDeDatos {
   private double MATRIX[][]=new double[5][3];
   private Scanner entrada=new Scanner(System.in);
   
    public double[][] Matriz(){          
//LLENADO DE MATRIZ       
       
        for (int i = 0; i < MATRIX.length; i++) 
        {
            for (int j = 0; j < MATRIX[0].length; j++)
            {
                System.out.print("Introduce los valores para el Campo "+(i+1)+", Zona "+(j+1)+"\n");
                MATRIX[i][j] = entrada.nextFloat();
            }
        }
        
        
        
  //IMPRIMIEN DOMATRIZ      
          System.out.println("ZONA 1  ZONA 2  ZONA 3");
                    for (int i=0;i<MATRIX.length;i++)
                    {
                        System.out.println();
                             for (int j=0;j<MATRIX[0].length;j++)
                             {
                                System.out.print(MATRIX[i][j]+"     "); 
                             }
                    }
        return MATRIX;
    }
    
}
