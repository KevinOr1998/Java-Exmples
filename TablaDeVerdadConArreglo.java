/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas;

import java.util.Scanner;

/**
 *
 * @author Kevin Ortega
 */
public class TablaDeVerdadConArreglo {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        String p="",q="";
        int l=0;
        int a=0;
        System.out.println("cuantas preposiciones son?");
                a=teclado.nextInt();
                a=(int) (Math.pow(2,a));
        String arreglo[][];
        arreglo=new String[5][3];
        arreglo[0][0]="p";
        arreglo[0][1]="q";
        arreglo[0][2]="(p => q)";
         //aqui se llena la tabla de las primeras dos columnas   
        for (int i=1; i<=4;i++) {
                for (int j=0;j<=1;j++) {
                System.out.print("Inserta V o F\n");
                arreglo[i][j] = teclado.nextLine();
            }
           //aqui se determina si la parte de la columna 3 es verdadera o falsa
            for(int k=1;k<=4;k++){
                if("V".equals(arreglo[k][0]) && "F".equals(arreglo[k][1])){
 
                   arreglo[k][2]="  F";
                }else{
                    arreglo[k][2]="  V";
                }

            }
         } 
        //imprimimos la tabla
            for (int i = 0; i < arreglo.length; i++) {
            System.out.println();
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print(arreglo[i][j] + " ");
                
            }
         }
    } 
}