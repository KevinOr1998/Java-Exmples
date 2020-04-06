/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos2;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Window;

/**
 *
 * @author Kevin Ortega
 */
public class CRUD 
{


    private String A_paterno="";
    private boolean EstadoAlta;
    private String A_materno="";
    private String Nombre="";
    private String Matricula="";
    private static Connection conectar;
    boolean conexion=false;
    boolean EstadoMod;
        
    public void Conectar(String Direccion, String Usuario, String pass) {
         
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection(Direccion,Usuario,pass); 
              JOptionPane.showMessageDialog(null,"Bienvenido");
              
             
            conexion=true;
        } catch (SQLException  | ClassNotFoundException ex ) {
            
           JOptionPane.showMessageDialog(null,"Error en conexion O usuario y/o contraseña incorrectos", "Error al conectarse", JOptionPane.ERROR_MESSAGE);
           conexion=false;
           
        }
        
        
    }
        
        public void Altas(String nombre, String a_paterno, String a_materno, String matricula){
            PreparedStatement ps= null;
             try {
                 
                /* String Query= String.format("INSERT INTO alumno (matricula, nombre, apellidoPaterno, apellidoMaterno) VALUES("
                         +matricula+","+nombre+","+ a_paterno+","+a_materno+")") ;
                 */
                 
                String Query= String.format("INSERT INTO alumno (matricula, nombre, apellidoPaterno, apellidoMaterno) VALUES(?,?,?,?)");
                ps=getConexion().prepareStatement(Query);
                ps.setString(1, nombre);
                 ps.setString(2, a_paterno);
                 ps.setString(3, a_materno);
                 ps.setString(4, matricula);
                 ps.execute();
                 EstadoAlta=true;
                
                 JOptionPane.showMessageDialog(null,"Datos almacenados exitosamente","Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException  ex ) {
            EstadoAlta=false;;
           JOptionPane.showMessageDialog(null,"Error al incertar los datos", "Error ", JOptionPane.ERROR_MESSAGE);
           
           
        }
            
        }
        
        public void Bajas(String matricula){
            
        try {
             String Query=String.format("Delete from alumno where matricula='"+matricula+"'");
            Statement st=(Statement) getConexion().createStatement();
           st.execute(Query);
             JOptionPane.showMessageDialog(null,"Registro borrado exitosamente","Registro", JOptionPane.INFORMATION_MESSAGE);
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al borrar registro","Error", JOptionPane.ERROR_MESSAGE);
        }
            
        }
        
        public void Modificar(String matricula, String Nombre, String Apaterno,String Amaterno){

                        
             try {

                //String Query= String.format("UPDATE  alumno SET nombre='"+matricula+"', apellidoPaterno='"+Apaterno+"' , apellidoMaterno'"+Amaterno+"' where matricula='"+matricula+"'");
                String Query= String.format("UPDATE  alumno SET nombre=?, apellidoPaterno=? , apellidoMaterno=? where matricula=?");
                PreparedStatement ps= conectar.prepareStatement(Query);
                ps.setString(1, Nombre);
                 ps.setString(2, Apaterno);
                 ps.setString(3, Amaterno);
                 ps.setString(4, matricula);
                 ps.executeUpdate();
                 EstadoMod=true;
                 JOptionPane.showMessageDialog(null,"Actualizacion exitosa","Mensaje", JOptionPane.INFORMATION_MESSAGE);
               } catch (SQLException  ex ) {
            EstadoMod=false;
             JOptionPane.showMessageDialog(null,"Error al incertar los datos", "Error ", JOptionPane.ERROR_MESSAGE);  
        }
        }
        
        public void ConsultaNormal(String matricula){
                        
             try {
                 String Query= String.format("SELECT * FROM alumno where matricula='"+matricula+"'");
                Statement st=(Statement) getConexion().createStatement();
                ResultSet result;
                result=st.executeQuery(Query);
                
                while(result.next()){
                    Nombre=String.format(result.getString("nombre"));
                    A_paterno=String.format(result.getString("apellidoPaterno"));
                    A_materno=String.format(result.getString("apellidoMaterno"));
                    Matricula=String.format(result.getString("matricula"));
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Error en la adquisicion de datos","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        public void ConsultaAvanzada(String nombre, String Apaterno, String Amaterno){
                           
             /*try {
                String Query= String.format("SELECT * FROM alumno where matricula='"++"'");
                Statement st=(Statement) getConexion().createStatement();
                ResultSet result;
                result=st.executeQuery(Query);
                
                while(result.next()){
                    Nombre=String.format(result.getString("nombre"));
                    A_paterno=String.format(result.getString("apellidoPaterno"));
                    A_materno=String.format(result.getString("apellidoMaterno"));
                    Matricula=String.format(result.getString("matricula"));
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Error en la adquisicion de datos","Error", JOptionPane.ERROR_MESSAGE);
            }*/
        }
        
        public boolean getValorDeConexionCRUDE(){
            return conexion;
        }     
        
        public boolean getEstadoAltas(){
            return EstadoAlta;
        }
        
        public boolean getEstadoMod(){
            return EstadoMod;
        }
        
        public Connection getConexion(){
            return conectar;        }
        
        public String getA_paterno() {
        return A_paterno;
    }

        public String getA_materno() {
        return A_materno;
    }

        public String getNombre() {
        return Nombre;
    }

        public String getMatricula() {
        return Matricula;
    }

}
