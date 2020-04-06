/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CitaMedica;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author Kevin Ortega
 */
public class Niño {
    private String NombreDelNiño;
    private String FechaNacimiento;
    private String Edad;
  
    public void EstablecerNombreDelNiño(String NombreNiño)
    {
        NombreDelNiño=NombreNiño;
    }
    public String ObtenerNombreDelNiño ()
    {
        return NombreDelNiño;    
    }
    
    
    
    public void EstablecerFechDeNacimiento(String Fecha)
    {
        FechaNacimiento=Fecha;
    }
    public String ObtenerFechaDeNacimiento ()
    {
        return FechaNacimiento;    
    }
    
    public LocalDate FechaDeNacimiento(){
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return LocalDate.parse(FechaNacimiento,fmt);
    
    }
    public Period ObtenerEdad()
    {

        return Period.between(FechaDeNacimiento(), FechaActual());
        
    }
    
    public LocalDate FechaActual(){
    return LocalDate.now();
}
    
    
    public String DiceNombre()
    {
   
        if(ObtenerEdad().getMonths()>=6 && ObtenerEdad().getYears()>=1)
        {
          return NombreDelNiño;
        }else{
            return "...";
        }
        
    } 
}
    
    
    
    
    
    

