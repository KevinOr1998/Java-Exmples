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
public class DecimalABINARIO {
    
    public static void main(String[]args){
        int a;
        String respuesta="";
        double binario=0;
        double decimal = 0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el nuermo decimal");
             decimal=teclado.nextInt();
        //Se calcula el codigo binario
                System.out.println("El codigo binario es:");
            for(a=7;a>=0;a--){  
                binario= -1*(-Math.pow(2,a));
                if(binario<=decimal){
                        respuesta = respuesta +"1";
                        System.out.print("1");
                        decimal=decimal-binario;      
                     }else{   
                             System.out.print("0"); 
                    }
          }
             System.out.println("\n Favor de anotar el codigo binario de derecha a isquierda  (*w*)");
    }
}
