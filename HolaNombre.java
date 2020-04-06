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
public class HolaNombre {
    public static void main(String[]args){
       Scanner teclado=new Scanner(System.in);
       String i;
        System.out.println("¿Como te llamas?");
       i = teclado.next();
        HI(i);
        
    }
    public static void HI(String nombre){
        System.out.println("-Hola "+nombre);
    }
}
