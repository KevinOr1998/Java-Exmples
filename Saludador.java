/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaludadorPersonalizable;

  import java.awt.FlowLayout;
  import java.awt.event.ActionListener;
  import java.awt.event.ActionEvent;
  import javax.swing.JFrame;
import javax.swing.JLabel;
  import javax.swing.JTextField;
  import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;

/**
 *
 * @author Kevin Ortega
 */
public class Saludador extends JFrame {
    
    private JLabel etiqueta1;
    private JButton Boton1;
    private JTextField campo1;
    
    public Saludador()
    {
     super("Saludador");
     setLayout(new FlowLayout());
        
     etiqueta1=new JLabel("Escirbe un nombre para saludar",SwingConstants.CENTER);
     add(etiqueta1);
     
     campo1=new JTextField(20);
     campo1.setHorizontalAlignment(SwingConstants.CENTER);
     add(campo1);
     
     Boton1=new JButton("¡Saludar!");
     Boton1.setVerticalAlignment(SwingConstants.BOTTOM);
     add(Boton1);
     
     ManejadorSaludador manejador=new ManejadorSaludador();
     
     Boton1.addActionListener(manejador);
       
    }
    private class ManejadorSaludador implements ActionListener
    {
        
        public void actionPerformed(ActionEvent evento)
        {
             String Saludo=campo1.getText();
             JOptionPane.showMessageDialog(null,"!Hola "+Saludo+ "¡");
             
             
        }
        
    }
    
    
    
}
