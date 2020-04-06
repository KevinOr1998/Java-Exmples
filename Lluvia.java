/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Valeria;

import java.util.Scanner;

/**
 *
 * @author Kevin Ortega
 */
public class Lluvia {
        public static void main(String[]args){
            int eleccion;
            Scanner teclado=new Scanner(System.in);
            LLenadoDeDatos Datos=new LLenadoDeDatos();
     //CREACION DE MATRIX    Y LLENADO DE DATOS     
        
 System.out.println("INICIANDO LLENADO DE DATOS");
        
 Datos.Matriz();
        
 System.out.println("\n************************************************");  
 
  while(true){
  System.out.println("Escribe el numero de la opcion que quieras.");
  
     System.out.println("1.-Obtener promedio por campo.");
     System.out.println("2.-Obtener promedio por zona.");
     System.out.println("2.-Exit.");
     
     eleccion=teclado.nextInt();
    switch(eleccion){
        case 1:
            
            break;
        
        case 2:
            
            break;
        
        case 3:
            
            break;
      
      
                     }
            }
 
 
        
        
       
        
        



    }
}
    

