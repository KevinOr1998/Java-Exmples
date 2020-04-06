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

public class Arreglo {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        int i=0;
        int suma=0;
        int []arreglo;
        arreglo=new int[5];
        float promedio;
        
        while(i<arreglo.length){
            System.out.println("ingresa las calificaciones "+i);
            arreglo[i]=teclado.nextInt();
            suma=suma+arreglo[i];
            i++;
            
            
        }
          System.out.println("el promedio  de tus calificaciones es:");
        promedio=suma/i;
          System.out.println(promedio);
        }
        
        
    }
    

