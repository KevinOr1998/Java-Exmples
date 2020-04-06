/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CuartoCuatrimestre;

/**
 *
 * @author Kevin Ortega
 */
public class LibroDeCalificaciones {
    // muestra un mensaje de bienvenida al usuario de LibroCalificaciones
 private String nombreDelCurso;
 private String nombreDelProfesor;
 private String nombreDelSalon;

    
 
 public void mostrarMensaje(SalonClases salon)
    {
    System.out.printf( "Bienvenido al Libro de calificaciones para "+obtenerNombreDelCurso() +" Impartido por el profesor "+obtenerNombreDelProfesor()+" En en salon de clases "+salon.obtenerNombreDelSalon());
    } // fin del método mostrarMensaje
    
    
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }


    public void establecerNombreDelCurso(String Nombre){        
        nombreDelCurso=Nombre;
    }
    public void EstablecerNombreDelProfesor(String NombreProfesor){
        nombreDelProfesor=NombreProfesor;
    }
    
    public String obtenerNombreDelProfesor(){
        return nombreDelProfesor;
    }
   

}
