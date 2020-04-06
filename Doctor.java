/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CitaMedica;

/**
 *
 * @author Kevin Ortega
 */
public class Doctor {
    private String doctorNombre;
    private String cedula;
    private String Especialidad;
    
        public void EstablecerNombreDelDoctor(String NombreDoctor)
    {
        doctorNombre=NombreDoctor;
    }
    public String ObtenerNombreDelDoctor ()
    {
        return doctorNombre;
    }
    
    
    
      public void EstablecerCedulaDelDoctor(String CedulaDoctor)
    {
        cedula=CedulaDoctor;
    }
    public String ObtenerCedulaDelDoctor ()
    {
        return cedula;
    }
    
    
    public void PreguntarNombre(Niño unNiño)
    {
        System.out.printf("\n"+unNiño.DiceNombre()+"\n");
    }
    
    public void PreguntarSintomas(Niño unNiño)
    {
        
    }
    
          public void EstablecerEspecialidadDelDoctor(String EspecialidadD)
    {
        Especialidad=EspecialidadD;
    }
    public String ObtenerEspecialidadDelDoctor ()
    {
        return Especialidad;
    }
    
    
    
          
    
}
