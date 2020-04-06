/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numerosrepetidosfuera;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kevin Ortega
 */
public class NumerosRepetidosFuera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,contador=0, tope=10;
        List<Integer> arreglo= new ArrayList<Integer>();
        Scanner teclado=new Scanner(System.in);
        
        while(true)
        {
          System.out.println("*****************************************************************************\n");
          System.out.println("1. Insertar numero...");
          System.out.println("2. Buscar");
          System.out.println("3. Eliminar");
          System.out.println("4. Mostrar");
          System.out.println("5. salir");
          System.out.println("SELECCIONA UNA OPCION:--");
          
          switch(teclado.nextInt())
          {
            case 1:
                
               while(contador<tope){
                        System.out.println("Escribe el numero");
                        numero=teclado.nextInt();
                        
                            if(arreglo.isEmpty())
                            {
                                arreglo.add(numero);
                                System.out.println("¡¡¡¡NUMERO AGREGADO EXITOSAMENTE!!!!");
                                contador++;
                                break;
                            }
                            
                            if(arreglo.contains(numero)==true)
                            {
                                System.out.println("¡¡¡ESTE NUMERO YA EXISTE EN LA LISTA!!!!");
                            
                            }else{
                                arreglo.add(numero);
                                System.out.println("¡¡¡¡NUMERO AGREGADO EXITOSAMENTE!!!");
                                contador++;
                                break;                           
                            }         
                        }
                  break;
              
            case 2:
             if(arreglo.isEmpty()){
                   System.out.println("\n LISTA VACIA");
                  }else{     
                
                         System.out.println("QUE NUMERO DESEAS BUSCAR?");
                         numero=teclado.nextInt();
                            for(int i=0;i<arreglo.size();i++){
                                 if(arreglo.get(i)==numero){
                                   System.out.println("NUMERO ENCONTRADO, ESTÁ EN LA POSICION "+i);
                                  break;
                                } 
                            }  
                        }
                  break;
                  
            case 3:
                if(arreglo.isEmpty()){
                   System.out.println("\n LISTA VACIA");
                  }else{ 
                  System.out.println("QUE NUMERO DESEAS ELIMINAR?");
                  numero=teclado.nextInt();
                  for(int i=0;i<arreglo.size();i++){
                      if(arreglo.get(i)==numero && arreglo.contains(numero)==true){
                          arreglo.remove(i);
                          break;
                      }else{
                          System.out.println("ESE NUMERO NO SE ENCUENTRA EN LA LISTA");
                          break;
                      }
                  }
                }
                  break;  
                  
            case 4:
                  System.out.println("***********DATOS EN LA LISTA***********");
                  if(arreglo.isEmpty()){
                   System.out.println("\n LISTA VACIA");
                  }else{
                  for(int i=0;i<arreglo.size();i++){
                      System.out.println(i+".- "+arreglo.get(i));
                  }
                  }
                  break;
            case 5:
                  return;
                  
              
          }
            
            
            
        }
       
    }
    
}
