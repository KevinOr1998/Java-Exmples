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
public class PalabraEnPila {
    public static void main(String[]args){
        Stack pila=new Stack();
        int a=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("ingresa tu palabra");
        String palabra=teclado.nextLine();
                char[]arreglo=palabra.toCharArray();
        for(a=0;a<arreglo.length;a++){
            pila.push(arreglo[a]);
        }
                while(!pila.empty()){
            System.out.println(pila.pop());
        }  
    }
    
}
