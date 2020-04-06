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
public class factorial {
    public static void main(String[]args){
            int a,b=2,resultado=1;
            
            Scanner teclado=new Scanner(System.in);
            System.out.println("de que numero quieres saber su factorial?");
            a=teclado.nextInt();
            while(b<=a){
                resultado=resultado*b;
                b++;
            }
            System.out.println("--------------------------------------");
            System.out.println("El factorial de "+a+" es "+resultado);
    }
    
}
