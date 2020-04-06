/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listasligadas;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;
/**
 *
 * @author Kevin Ortega
 */
public class ListasLigadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        LinkedList lista=new LinkedList();
       int opcion=0;
       String a;
       int cancion=0;
       int b;
       Scanner entrada=new Scanner(System.in);
        while(true){
            System.out.println("\n");
            System.out.println("1.-Añadir video");
            System.out.println("2.-Reproducir video");
            System.out.println("3.-Ver lista de reproduccion");
            System.out.println("4.-Salir");    
             System.out.println("\n¿QUE OPCION ELIGES?");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("\nEscribe el nombre del video de la cancion");
                    a=entrada.nextLine();
                    lista.addLast(a);
                    break;
                case 2:
             if(cancion==lista.size()){
                System.out.println("Reporduciendo cancion..."+lista.get(0));
                cancion=1;
             }else{
                 System.out.println("Reporduciendo cancion..."+lista.get(cancion));
                 cancion++;
             }
                    break;
                case 3:
                  for(b=0;b<lista.size();b++){
                   
                      System.out.println((b+1)+".-"+lista.get(b));
                  }
                    break;
                case 4:
                    System.out.println("\n Saliste");
                    return;
            }
         }
     }   
 }

