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
public class CalculaFactorial {
    public static void main(String[]args){

  System.out.println("El factorial de que numero quieres saber? ");
int a = 0;
        fatoria(a);
    }
    public static int fatoria(int numero){
                Scanner teclado=new Scanner(System.in);
                
                int a=teclado.nextInt();
        int f=1;
        for(int c=2;c<=a;c++){
            f=f*c;
        }
        System.out.println("El factorial de "+a+" es "+f);
                return f;
    }

}
