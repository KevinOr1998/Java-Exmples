/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuartoCuatrimestre;
import java.util.Scanner;

/**
 *
 * @author Kevin Ortega
 */
public class Maestro {
    public static void main(String args []){
        Scanner entrada=new Scanner(System.in);
        Alumno miTarea=new Alumno();
        String tarea;
        System.out.println("Cual es la tarea de hoy?");
        tarea=entrada.nextLine();
        miTarea.RealizarTarea(tarea);
        
              
        
    }
    
}
