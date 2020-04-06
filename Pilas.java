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
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stack sillas=new Stack();
        sillas.push("silla b");
        sillas.push(10);        
        sillas.push(true);
        sillas.push(7.9);
        
        while(sillas.empty()==false){
            
            System.out.println(sillas. pop());
        }
    }
     
}
