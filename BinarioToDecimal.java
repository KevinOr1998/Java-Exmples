/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package direccionesip;

/**
 *
 * @author Kevin Ortega
 */
public class BinarioToDecimal {
     int numero,contador=0, tope=10;

    
    public int BinariToDecimal(String arreglo){

        int decimal=0;
         char[] arreglo1=arreglo.toCharArray();

        //Con las siguientes calculamos el numero decimal
        for(int b=7;b<arreglo1.length;b++){
            if(arreglo1[b]=='1'){
                decimal= (int) (decimal+(Math.pow(2,b)));
                        }
                  }
            return decimal;
     } 
    }
     
    
