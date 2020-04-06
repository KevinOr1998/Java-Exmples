/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas;

import java.util.Stack;
import java.util.Scanner;
/**
 *
 * @author Kevin Ortega
 */
public class LLenadoDePila2 {
        public static void main(String[]args){
        Stack pila=new Stack();
        Scanner teclado=new Scanner(System.in);
        int b;
        for(int a=1;a<=10;a++){
            System.out.println("Introduce tu "+a+" elemento o dato");
            b=teclado.nextInt();
            pila.push(a);
        }
                System.out.println("Imprimiendo pila...");
        while(!pila.empty()){
            
            System.out.println(pila.pop());
        }
    }
    
}
