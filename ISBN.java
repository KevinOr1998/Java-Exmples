/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SegundoParcial;
import java.util.Scanner;
/**
 *
 * @author Kevin Ortega
 */
public class ISBN {
    public static void main(String args[]) {
    Scanner teclado=new Scanner(System.in);
    int a,b,UD,suma = 0;
    int arreglo[];
    arreglo=new int[10];
    for(b=0;b<9;b++){
           System.out.println("Introduce el ISBN");
             arreglo[b]=teclado.nextInt();}
       b=0;
    for(a=1;a<=arreglo.length;a++){
 
       suma=suma+(a*arreglo[b]);     
         b++;}
    UD=suma%11;
    System.out.println("El digito de seguridad es "+UD);
       arreglo[9]=suma%11;
       if(arreglo[9]==UD){
          System.out.println("el ISBN es correcto");
          
       }else{
           System.out.println("el ISBN  es incorrecto");
       }
    }
}
