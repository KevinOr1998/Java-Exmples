

/**
 *
 * @author Kevin Ortega
 */
import java.util.Scanner;
public class SumaDeMatrices {
    public static void main(String []args){
       Scanner entrada=new Scanner(System.in);
      int f;
      int c;
      int a;
      int b;

      System.out.println("Cuantas columnas tine la pirmera matriz?");
      c=entrada.nextInt();
      System.out.println("Cuantas filas tiene la primera matriz");
      f=entrada.nextInt();
             int MATRIX1[][]=new int[f][c];
       System.out.println("Cuantas columnas tine la segunda matriz?");
      a=entrada.nextInt();
      System.out.println("Cuantas filas tiene la segunda matriz");
      b=entrada.nextInt();
             int MATRIX2[][]=new int[a][b];
        int suma[][]=new int[f][c];
        if( MATRIX1.length!=MATRIX2.length) {
        System.out.println("No puedes sumar las matrices, tienen que tener las mismas dimenciones");      
        }else{
                System.out.println("Empezaras a llenar la primera matriz");
            for ( f = 0; f < MATRIX1.length; f++) {
            for (int j = 0; j < MATRIX1[0].length; j++) {
                System.out.print("Inserta numero:\n");
                MATRIX1[f][j] = entrada.nextInt();
                }
            }
        System.out.println("Empezaras a llenar la segunda matriz");
          for ( f = 0; f < MATRIX2.length; f++) {
            for (int j = 0; j < MATRIX2[0].length; j++) {
                System.out.print("Inserta numero:\n");
                MATRIX2[f][j] = entrada.nextInt();
                }
            }
          System.out.println("Sumando matrices...");
          for ( f = 0; f < suma.length; f++) {
            for (int j = 0; j < suma[0].length; j++) {
                suma[f][j]=MATRIX1[f][j]+MATRIX2[f][j];
                
                
   
                }
            }
          
        }
            System.out.println("imprimiend matriz...");
            for (int i=0;i<suma.length;i++){
                System.out.println();
                    for (int j=0;j<suma.length;j++){
                        System.out.print("|"+suma[i][j]+"|");   
             }
        }
    }
}