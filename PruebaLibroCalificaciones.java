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
public class PruebaLibroCalificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
   LibroDeCalificaciones miLibroCalificaciones= new LibroDeCalificaciones();
   Scanner teclado=new Scanner(System.in);
   SalonClases miSalon= new SalonClases();
   System.out.println("El nombre del curso inicial es:"+miLibroCalificaciones.obtenerNombreDelCurso()+"\n");
    System.out.println("El nombre del profesor inicial es:"+miLibroCalificaciones.obtenerNombreDelProfesor()+"\n");
   
   
   System.out.println("Escriba el nombre del curso:\n");
   miLibroCalificaciones.establecerNombreDelCurso(teclado.nextLine());
  
   System.out.println("Escriba el nombre del del Profesor:\n");
   miLibroCalificaciones.EstablecerNombreDelProfesor(teclado.nextLine());
   
   System.out.println("Escriobe el nombre del salon");
   miSalon.EstablecerNombreDelSalon(teclado.nextLine());
   
   
   miLibroCalificaciones.mostrarMensaje(miSalon); 
   
   
    }
    
}
