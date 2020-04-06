/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CitaMedica;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Kevin Ortega
 */
public class Hospital {
    
   private String NombreDoctor, Direccion;
   


    List<String> Especialidades;
   public Hospital(){
       Especialidades = new ArrayList();
       Especialidades.add("Odontologia");
   }
    


    //PARTE DE NOMBRE DEL DOCTOR
    public void EstablecerNombreDelHospital(String Doctor)
    {
        NombreDoctor=Doctor;
    }
    public String ObtenerNombreDelHospital()
    {
        return NombreDoctor;
    }
    
    //PARTE DE DIRECCIONES
    public void EstablecerDireccion(String UnaDireccion)
    {
        Direccion=UnaDireccion;
    }
    public String ObtenerDireccion()
    {
        return Direccion;
    }
    
    
    
  //PARTE DE ESPECIALIDADES
    
    public void AgregarEspecialidades(String unaEspecialidades)
    {
        
        
        Especialidades.add(unaEspecialidades);

    }
        public String ObtenerEspecialidadees(int a)
    {
        return Especialidades.get(a);

    }
    
    public void RegistrarNiño(Niño unNiño){
        
    }
    
    public void DiagnosticarNiño(Niño unNiño){
        
    }
}
   
    
    
    
    
    
        
        
    
    

