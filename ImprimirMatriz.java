/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PrimerParcial;

/**
 *
 * @author Kevin Ortega
 */
public  class ImprimirMatriz {
    public static void main(String[]args){
        int arreglo1[][] = {{0, 0, 0, 0}, {1, 1, 1, 1}, {4, 4, 4, 4}, {2, 2, 2, 2}};
            System.out.println("imprimiendotabla");
            for (int i=0;i<arreglo1.length;i++){
                System.out.println();
                    for (int j=0;j<arreglo1.length;j++){
                        System.out.print("|"+arreglo1[i][j]+"|"); 
                        
                    }
                       
                    
                
            }
  
    
      
                
    }

    
}
