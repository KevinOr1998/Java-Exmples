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
public class SalonClases {
     private String nombreDelSalon;
     private int Butacas;
        
     public void EstablecerNombreDelSalon(String NombreDelSalon)
    {
        nombreDelSalon=NombreDelSalon;
    }
    
    public String obtenerNombreDelSalon()
    {
        return nombreDelSalon;
    }
    
     public void EstablecerNumeroDeButacas(int NumeroButacas)
    {
        Butacas=NumeroButacas;
    }
    
    public int obtenerNumeroDeButacas()
    {
        return Butacas;
    }
    
}
