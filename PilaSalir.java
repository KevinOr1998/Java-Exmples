/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Kevin Ortega
 */
public class PilaSalir {
            public static void main(String[]args){
        Stack pila=new Stack();
        Scanner teclado=new Scanner(System.in);
        String b="";
        while(!b.equals("salir")){
            System.out.println("Introduce la palabra");
           b=teclado.nextLine();
            pila.push(b);
        }
                System.out.println(" Imprimiendo pila...");
        while(!pila.empty()){
            System.out.println(pila.pop());
        }
    }
    
}
