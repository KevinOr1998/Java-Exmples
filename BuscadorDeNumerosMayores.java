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
public class BuscadorDeNumerosMayores {
    public static void main(String[]args){
       Scanner teclado=new Scanner(System.in);
        int i;
        System.out.println("¿De que tamaño es tu arreglo?");
        i=teclado.nextInt();
        double valores[];
        valores=new double[i];
        double minimo;
        
        for(int k=0;k<valores.length;k++){
        System.out.println("introduce valores");
        valores[k]=teclado.nextDouble();
    }
        minimo=valores[0];
        for(int k=0;k<i;k++){
            
             if(valores[k]>minimo){
                minimo=valores[k];
                
            }
        }
        System.out.println("La palabra con menor letras es => "+minimo);
    }
    
}
