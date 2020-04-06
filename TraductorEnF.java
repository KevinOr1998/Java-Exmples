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
public class TraductorEnF {
    public static void main(String[]args){
        String acumulador="";
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce tu texto");
        String f=teclado.nextLine();
        char [] letra=f.toCharArray();
        
        for(int a=0;a<letra.length;a++){

            if(letra[a]=='e' || letra[a]== 'a' || letra[a]=='i' || letra[a]=='o' || letra[a]=='u' ){
                acumulador=acumulador+letra[a]+"f"+letra[a];
            }else{
                acumulador=acumulador+letra[a];
            }
 
        }
                    System.out.println(acumulador);
    }
    
}
