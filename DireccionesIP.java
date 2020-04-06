/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package direccionesip;

import java.util.Scanner;

/**
 *
 * @author Kevin Ortega
 */
public class DireccionesIP 
{

 
    public static void main(String args[])
    {
        
        Scanner teclado=new Scanner(System.in);
        int prefijo;
        String direccionIP;
        DireccionesIPconversiones conversiones=new DireccionesIPconversiones();
        String primerOcteto = "";
        String segundoOcteto= "";
        String tercerOcteto= "";
        String cuartoOcteto= "";
        int punto=0;
        
        
        System.out.println("introduce la direccion IP sin el numero de -prefijo");
        direccionIP=teclado.nextLine();
        char[] arreglo=direccionIP.toCharArray();
        
        System.out.println("introduce el numero de -prefijo");
        prefijo=teclado.nextInt();
        
        for(int a=0;a<arreglo.length;a++)
        {
            
            if(arreglo[a]!='.' && punto==0)
            {
                primerOcteto=primerOcteto+arreglo[a];  
          
            }
            else if(punto==1 && arreglo[a]!='.') 
            {
                segundoOcteto=segundoOcteto+arreglo[a];
            }
            else if(punto==2 && arreglo[a]!='.')
            {
                tercerOcteto=tercerOcteto+arreglo[a];
            }
            else if(punto==3 && arreglo[a]!='.')
            {
                cuartoOcteto=cuartoOcteto+arreglo[a];
            }
            else if (arreglo[a]=='.')
            {
            punto++;    
            }
        }
        if(punto>3){
            System.out.println("Esta no es una direccion IP");
        }else{
          System.out.println(primerOcteto+"."+segundoOcteto+"."+tercerOcteto+"."+cuartoOcteto +"/"+prefijo); 
        }
    }
    
}
