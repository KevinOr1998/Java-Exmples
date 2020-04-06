/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas;

import java.util.Scanner;

/**
 *
 * @author Kevin Ortega
 */
public class TablaDeVerdadConBOOLEAN {
    public static void main(String[]args){
     
        Scanner teclado=new Scanner(System.in);    
          boolean a;
           boolean b;
           System.out.println("si chema viene, es true o false?");
           a=teclado.nextBoolean();
           System.out.println("yo me voy, es true o false?");
           b=teclado.nextBoolean();
           if(a==true && b==false){  
               System.out.println("\n ENTONCES  P => Q es false");
           }else{
               System.out.println("\n ENTONCES P => Q es true");
           }     
    }  
}
