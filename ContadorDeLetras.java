/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listasligadas;

import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Kevin Ortega
 */
public class ContadorDeLetras {
     public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        TreeMap<String,Integer> diccionario=new TreeMap<>();
        String texto;
        System.out.println("escribe un texto");
        texto=teclado.nextLine();
        texto=texto.toLowerCase();
        String [] tokens=texto.split("");
        for(int i=0;i<tokens.length;i++){
           if(!tokens[i].equals(" ")){
            if( diccionario.containsKey(tokens[i])){
                int cuenta=diccionario.get(tokens[i]);
                cuenta++;
                diccionario.put(tokens[i], cuenta);
           }else{
               diccionario.put(tokens[i],1);
           }
        }
        }
        //array.list para in parra introducir datos des ordenados y despuues con order para ordenarlos
        System.out.println(diccionario);
    }
    
    
}

