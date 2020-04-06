/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package misproyectos;

import java.util.Scanner;

/**
 *
 * @author Kevin Ortega
 */
public class DecimalToBinari {
    
    public String DecimalToBinari(int decimal){
        int binario=0;
        String codigo="";
        //Se calcula el codigo binario
                System.out.println("El codigo binario es:");
            for(int a=7;a>=0;a--){  
                binario= (int) (Math.pow(2,a));
                if(binario<=decimal){ 
                        codigo=codigo+"1";
                        decimal=decimal-binario;      
                     }else{   
                             codigo=codigo+"0";
                    }
          }
         return codigo;
    }
}
