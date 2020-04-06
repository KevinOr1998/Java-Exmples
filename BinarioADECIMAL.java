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
public class BinarioADECIMAL {
    public static void main(String[]args){
        
        int a,b ;
        int decimal=0;
        int arreglo[]=new int[8];
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el contigo binario");
       //Con las lineas 22 y 23 llenamos el arreglo
        b=1;
        for(a=0;a<arreglo.length;a++){
            System.out.println("Escribe el "+b+"  digito del codigo binario de derecha a isquierda digito del condigo binario");
            arreglo[a]=teclado.nextInt();
        b++;}
        //Con las siguientes calculamos el numero decimal
        for(b=0;b<arreglo.length;b++){
            if(arreglo[b]==1){
                decimal= (int) (decimal+(Math.pow(2,b)));
                        }
                  }
                            
            System.out.println("El numero decimal es "+decimal);
     }
}
