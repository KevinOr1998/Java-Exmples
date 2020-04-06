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
public class IdentificadorPalabrasMenores {
        public static void main(String[]args){
       Scanner teclado=new Scanner(System.in);
        int i;
        System.out.println("¿De que tamaño es tu arreglo?");
        i=teclado.nextInt();
        String valores[];
        valores=new String[i];
        String minimo;
        
        for(int k=0;k<valores.length;k++){
        System.out.println("introduce las palabras");
        valores[k]=teclado.next();
    }
        minimo=valores[0];
        for(int k=1;k<i;k++){
            
             if(valores[k].length()<minimo.length()){
                minimo=valores[k];
                
            }
        }
        System.out.println("El numeromenor es =>"+minimo);
    }
    
}
