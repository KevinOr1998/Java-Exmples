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
public class MayoriaDeEdad {
       	public static void main(String args[]){
		int MyEdad;
		Scanner teclado=new Scanner(System.in);
                System.out.println("¿Cual es tu edad?");
                MyEdad=teclado.nextInt();

		if(MyEdad>=18)
		{
			System.out.println("Eres mayor de edad :D");
         
		}
		else
		{

			System.out.print("No eres mayor de edad :c  ");
		}

			}
    
    
}
