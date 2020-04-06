/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundoParcial;

/**
 *
 * @author Kevin Ortega
 */
public class BinarioToDecimal {
     char comparar;
    
    public int BinariToDecimal(String arreglo){

        int decimal=0;
         char[] arreglo1=arreglo.toCharArray();

        //Con las siguientes calculamos el numero decimal
        for(int b=7;b<=arreglo1.length;b--){
       
            if(arreglo1[b]=='1'){
                decimal+=(int)(Math.pow(2,b));
                        }
                  }
            return decimal;
     } 
    }
     
    
