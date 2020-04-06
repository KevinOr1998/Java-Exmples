/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package direccionesip;

/**
 *
 * @author Kevin Ortega
 */
public class DireccionesIPconversiones {
  private  String codigo="";
  private  int decimal=0;
  private String direccioIPTrasnformada="";
       
  
  public void setBinariToDecimal(String arreglo){

        
         char[] arreglo1=arreglo.toCharArray();

        //Con las siguientes calculamos el numero decimal
        for(int b=7;b<=arreglo1.length;b++){
            if(arreglo1[b]=='1'){
                decimal= (int) (decimal+(Math.pow(2,b)));
                        }
                  }
            
     }
  
  public int getBinariToDecimal()
  {
      return decimal;
  }
        
     
  public void setDecimalToBinari(int decimal){
        int binario=0;
        
        //Se calcula el codigo binario
                System.out.println("El codigo binario es:");
            for(int a=7;a>=0;a--){  
                binario= (int) (Math.pow(2,a));
                if(binario<=decimal){ 
                        codigo=codigo+"1";
                        decimal=decimal-binario;      
                 }else{   
                             codigo=codigo+"0";
                 }
          }
         
    }
  
  public String getDecimalToBinari()
  {
      return codigo;
  }
  
  public void setDireccionIPToBinario(String primerOcteto, String segundoOcteto, String tercerOcteto, String cuartoOcteto)
  {
      
    
   
  }
  
    
}
