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
public class primos {
   public static void main(String[]args){
       Scanner teclado=new Scanner(System.in);
       int b=1,a,c,k=0;
       System.out.println("Que numero quieres saber si es primo");
       a=teclado.nextInt();
       while(b<=a)
       {
           c=a%b;
           if(c==0){
               k++;
           }
           b++;
       }
       if(k==2)
       {
           System.out.println("si es un numero primo");
           
       }
       else
       {
           System.out.print("no es un numero primo");
       }
   } 
}
