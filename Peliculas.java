/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peliculas;
  import java.awt.FlowLayout;
  import java.awt.event.ActionListener;
  import java.awt.event.ActionEvent;
  import javax.swing.JFrame;
import javax.swing.JLabel;
  import javax.swing.JTextField;
  import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
/**
 *
 * @author Kevin Ortega
 */
public class Peliculas extends JFrame {
    
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JButton boton1;
    private JTextField campo1;
    private JComboBox contenedor;
    
    
    public Peliculas ()
    {
        super("Peliculas");
        setLayout(new FlowLayout());
        
        etiqueta1=new JLabel("Escribe elnombre de la pelicula",SwingConstants.LEFT);
        add(etiqueta1);
        
       
        
        campo1=new JTextField(10);
        campo1.setHorizontalAlignment(SwingConstants.LEFT);
        add(campo1);
        
         etiqueta2=new JLabel("Peliculas", SwingConstants.RIGHT);
        add(etiqueta2);
        
        boton1=new JButton("Añadir");
        boton1.setHorizontalAlignment(SwingConstants.RIGHT);
        add(boton1);
        
        contenedor=new JComboBox();
        add(contenedor);
        
        ManejadorSaludador manejador=new ManejadorSaludador();
        boton1.addActionListener(manejador);
        
       
        
    }
    private class ManejadorSaludador implements ActionListener
    {
        
        public void actionPerformed(ActionEvent evento)
        {
            String nombrePelicula=campo1.getText();
             contenedor.addItem(nombrePelicula);
             
             campo1.setText("");
             
             
             
        }
        
    }
    
    
    
    
}
