/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listasligadas;
import java.util.Scanner;


/**
 *
 * @author Kevin Ortega
 */
public class ContadorDePalabras {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        int contador=0;
        String texto;
        String acumulador="";
        System.out.println("Escribe un texto");
        texto=teclado.nextLine(); 
        char[] letras=texto.toCharArray();
        for(int i=0;i<letras.length;i++){
            if(letras[i]!=' '){           
                contador++;
                acumulador=acumulador+letras[i];
            }   
        }
        System.out.println("Aqui hay "+contador+" palabras");
        System.out.println(acumulador);
    }  
}
