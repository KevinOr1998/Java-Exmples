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
public class DivisionSegura {
    	public static void main(String args[]){
		int b;
		int a;
                int c = 0;
		Scanner teclado=new Scanner(System.in);
                System.out.println("introcue el valor de a o tu primer numero");
                a=teclado.nextInt();
                 System.out.println("introcue el valor de b o tu segundo numero");
                 b=teclado.nextInt();
		if(a%b==0)
		{
			c=a/b;
         
		}
		else
		{

			System.out.print("el residuo de la division de las variables no es 0");
		}
           System.out.print("el resultado de la divicion "+a+"/ "+b+" ="+c);
			}
    
}
