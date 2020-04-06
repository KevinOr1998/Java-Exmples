/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quintosemestre;

import java.util.Scanner;

/**
 *
 * @author Kevin Ortega
 */
public class CalculoDeIntegrales {
        
 
        Scanner teclado=new Scanner(System.in);
        double ydx;
        double x1;
        double x2;
        double Tpaso;
        
    public static void main(String args[]){
      CalculoDeIntegrales Prueba=new CalculoDeIntegrales();
      
      //Descomentar los metodos que  desee ocupar
     Prueba.Euler();
     //Prueba.RungenKutta();
       
    }
    private void RungenKutta()
    {
        CalculoDeIntegrales Prueba=new CalculoDeIntegrales();
        double funcionEuler1=0;
        double funcionEuler2=0;
        System.out.println("Acontinuación insertará el rango de los valores de X (X1,X2)  ");
        System.out.println("CUAL ES EL VALOR DE X1?");
        x1=teclado.nextFloat();
        
        System.out.println("Cuales es el valor de X2  ?");
        x2=teclado.nextFloat();
        
        System.out.println("Cuales es el tamaño de paso?");
        Tpaso=teclado.nextFloat();
        
        System.out.println("Cual es la condicio inical de y cuando x esté en su rango inferior?");
        ydx=teclado.nextFloat();
        System.out.println("Imprimiento resultados...");
            
            while(x1<x2)
            {
                funcionEuler1=Prueba.EulerParaRugen(Tpaso, ydx,x1);
                funcionEuler2=Prueba.EulerParaRugen(Tpaso,ydx+(Tpaso*funcionEuler1),x1+Tpaso);
                ydx=ydx+(Tpaso/2)*((funcionEuler1)+funcionEuler2);
                       
                System.out.println(ydx);
            
                x1+=Tpaso;
            }
    }
    
    private void Euler()
    {   CalculoDeIntegrales Prueba=new CalculoDeIntegrales();
        System.out.println("Acontinuación insertará el rango de los valores de X (X1,X2)  ");
        System.out.println("CUAL ES EL VALOR DE X1?");
        x1=teclado.nextFloat();
        
        System.out.println("Cuales es el valor de X2  ?");
        x2=teclado.nextFloat();
        
        System.out.println("Cuales es el tamaño de paso?");
        Tpaso=teclado.nextFloat();
        
        System.out.println("Cual es la condicio inical de y cuando x esté en su rango inferior?");
        ydx=teclado.nextFloat();
        System.out.println("Imprimiento resultados...");
            while(x1<x2)
            {
            ydx=ydx+Tpaso*((4*(Math.exp(0.8*x1)))-(Tpaso*ydx));
            System.out.println("y("+(x1+Tpaso)+")= "+ydx);
            
            x1+=Tpaso;
            }
          
    }
    
    private double EulerParaRugen(double Tpaso,double ydx, double x1)
    { 
        ydx=((4*(Math.exp(0.8*x1)))-(Tpaso*ydx));            
        return ydx;  
    }
    
}
