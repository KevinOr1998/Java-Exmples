
package basededatos;

import com.mysql.jdbc.Connection;

public class ConfirmarEliminar2 extends javax.swing.JFrame {

    public ConfirmarEliminar2() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAceptar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnAceptar.setText("Aceptar");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("¿CONFIRMAR ELIMINAR REGISTRO?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCancelar)
                .addGap(88, 88, 88)
                .addComponent(BtnAceptar)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnAceptar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.toBack();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        crudeConfirmarEliminar=getConexionConfirmarEliminar();
        crudeConfirmarEliminar.Bajas(getEliminarRegistro());
        this.setVisible(false);
    }//GEN-LAST:event_BtnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    String EliminarRegistro;
   public void setConexionConfirmarEliminar(CRUD conexion){
        crudeConfirmarEliminar=conexion;
    }
    public CRUD getConexionConfirmarEliminar(){
        return crudeConfirmarEliminar;
    }
    Connection conexionConfirmarEliminar=null;
    CRUD crudeConfirmarEliminar=new CRUD();
    public String getEliminarRegistro() {
        return EliminarRegistro;
    }
    public void setEliminarRegistro(String EliminarRegistro) {
        this.EliminarRegistro = EliminarRegistro;
    }
 }
