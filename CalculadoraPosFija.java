/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Kevin Ortega
 */
public class CalculadoraPosFija {
   public static void main(String[]args){
    Scanner teclado=new Scanner(System.in); 
    Stack pila=new Stack();
    int opciones;
    int eleccion;
    
    while(true){
        System.out.println("MENÚ");
        System.out.println("1.-Sumar");
        System.out.println("2.-Restar");
        System.out.println("3.-Multiplicar");    
        System.out.println("4,-Dividir");            
        System.out.println("5.-Añadir numero");
        System.out.println("6.-Imprimir pila");  
        System.out.println("7.-Salir");  
        System.out.println("\nElige la opcion");
        opciones=teclado.nextInt();
        System.out.println("\n");
int a,b;
        switch(opciones){
            
            case 1:
                    if(pila.size()<=1){
                   System.out.println("no se puede sumar");
                }
                a=(int)pila.pop();
                 b=(int)pila.pop();
                int suma=b+a;
                pila.push(suma);
                
                break;
            case 2:
                    if(pila.size()<=1){
                     System.out.println("no se puede restar");
//                }else{
                 a=(int)pila.pop();
                 b=(int)pila.pop();
                int resta=b-a;
                pila.push(resta);}
                break; 
            case 3:
                    if(pila.size()<=1){
                     System.out.println("no se puede mulltiplicar");
                }else{
                a=(int)pila.pop();
                b=(int)pila.pop();
                int multiplicacion=b*a;
                pila.push(multiplicacion);
                break;}
            case 4:
                if(pila.size()<=1){
                   System.out.println("no se puede dividir");
                }else{
                int i=(int)pila.pop();
                int j=(int)pila.pop();
                int divicion=j/i;
                pila.push(divicion);}
                break;
            case 5:
                System.out.println("\nIntoduce el numero");
                eleccion=teclado.nextInt();
                pila.push(eleccion);
                break;
            case 6:
                for(int k=pila.size()-1;k >= 0;k--){
                    int imprimiendoPila=(int)pila.get(k);
                System.out.println(imprimiendoPila);}
                break;
            case 7:
                return;    
        }
    }
   }   
}
