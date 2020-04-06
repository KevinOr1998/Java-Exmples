/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas;
import java.util.Stack;
/**
 *
 * @author Kevin Ortega
 */
public class LLenadoDePila {
    public static void main(String[]args){
        Stack pila=new Stack();
        for(int a=1;a<=10;a++){
            pila.push(a);
        }
                while(!pila.empty()){
            
            System.out.println(pila.pop());
        }
    }
}
