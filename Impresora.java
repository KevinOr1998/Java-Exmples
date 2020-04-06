/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listasligadas;

import java.util.Scanner;
import java.util.LinkedList;

/**
 *
 * @author Kevin Ortega
 */
public class Impresora {
    public static void main(String[]args) throws InterruptedException{
        Scanner teclado=new Scanner(System.in);
        int hojas=0;
        int opcion;
        LinkedList impresora=new LinkedList();
        while(true){
            System.out.println("1.-Añadir impresion");
            System.out.println("2.-Imprimir");
            System.out.println("3.-Ver lista de impresion");
            System.out.println("4.-Salir");
            System.out.println("\nElige una opcion");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                   System.out.println("cuantas hojas quieres imprimir");
                   hojas=teclado.nextInt();
                   impresora.offer(hojas);
                    break;
                case 2:      
                    if(impresora.isEmpty()){
                        System.out.println("No hay hojas");
                    }else{
                    hojas=(int) impresora.poll();
                    System.out.println("imprimiendo "+hojas+" hojas...");
                     Thread.sleep(hojas);
                    }
                    break;
                case 3:
                    for(int i=0;i<impresora.size();i++){
                        System.out.println(impresora.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Saliste");
                    return;    
            }
        } 
    }
}
