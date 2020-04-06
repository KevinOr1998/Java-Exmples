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
public class TablasDeMultiplicar {
    
    	
		public static void main(String[]args){

			Scanner teclado= new Scanner(System.in);
			int a,b;
			
			b=1;

			System.out.println("¿De que numero quieres saber la tabla?");
			a=teclado.nextInt();

			while(b<11){

				System.out.println(a+"*"+b+"="+ (a*b));
				
				b++;
				
			}

		}
}
