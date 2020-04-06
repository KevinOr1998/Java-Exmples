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
public class Principal {
    
    public static void main(String args[])
    {
    
    Hospital unHospital=new Hospital();
    unHospital.EstablecerNombreDelHospital("Hospital General");
    unHospital.EstablecerDireccion("Av. Del Estudiante");
    
    Doctor unDoctor=new Doctor();
    unDoctor.EstablecerNombreDelDoctor("DR.PEREZ");
    unDoctor.EstablecerCedulaDelDoctor("PEREZ-12343");
    unDoctor.EstablecerEspecialidadDelDoctor(unHospital.ObtenerEspecialidadees(0));
    
    Niño unNiño=new Niño();
    unNiño.EstablecerNombreDelNiño("Benito Camelo");
    unNiño.EstablecerFechDeNacimiento("20/02/2017");
    
    Niño otroNiño=new Niño();
    otroNiño.EstablecerNombreDelNiño("Rosa Melano");
    otroNiño.EstablecerFechDeNacimiento("17/03/1992");
    
    unDoctor.PreguntarNombre(unNiño);
    unDoctor.PreguntarNombre(otroNiño);
    
    
    }
    
}
