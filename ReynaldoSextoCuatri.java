/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reynaldosextocuatri;

import java.util.Scanner;

/**
 *
 * @author Kevin Ortega
 */
public class ReynaldoSextoCuatri {

    public static void main(String[] args) {


    }
    
    public String Mult(){
        String Result="";
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("introduce los valores de x1");
        int x1 = teclado.nextInt();
        
        System.out.println("introduce los valores de x2");
        int x2 = teclado.nextInt();
        
        System.out.println("introduce los valores de y1");
        int y1 = teclado.nextInt();
        
        System.out.println("introduce los valores de x2");
        int y2 = teclado.nextInt();
        
        System.out.println("introduce el valir de i");
        int i = teclado.nextInt();
        Result=String.format(+"+"+"i");

        return Result;
    }
    
}
