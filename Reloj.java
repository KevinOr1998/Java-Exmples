/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PrimerParcial;

import static java.lang.Thread.sleep;

/**
 *
 * @author Kevin Ortega
 */
public class Reloj {
 
    public static void main (String[]args) throws InterruptedException{
      int h=0;
      int m=0;
      int s=0;
   
      while(h<=23)
      {
         m =00;
          while(m<=59)
          {
              s=00;
              while(s<=59)
              {
                  System.out.println(h+":"+m+":"+s);
                  
                  Thread.sleep(1000);
                  
                  s++;
              }
              m++;
            

          }
          h++;

      }
      
    }
}
