/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class FrmRegistrarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmGenerarMembresia
     */
    public FrmRegistrarCliente(){
        initComponents();
        TxtCodMem.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        btnADir = new javax.swing.JButton();
        panGenMem = new javax.swing.JPanel();
        lblCM = new javax.swing.JLabel();
        lblTM = new javax.swing.JLabel();
        TxtCodMem = new javax.swing.JTextField();
        cmbTipoMem = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        lblTM1 = new javax.swing.JLabel();
        TxtFecha = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtDPI = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtApellidos = new javax.swing.JTextField();
        TxtFeNac = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtMem = new javax.swing.JTextField();
        TxtDir = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Registrar Cliente");

        lblTitulo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblTitulo.setText("Registrar Nuevo Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dirección Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Dirección:");

        TxtDireccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        btnADir.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnADir.setText("Aceptar");
        btnADir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnADir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnADir)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnADir)
                .addContainerGap())
        );

        panGenMem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Generar Membresía", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14))); // NOI18N
        panGenMem.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lblCM.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblCM.setText("Código Membresía:");

        lblTM.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTM.setText("Tipo Membresía:");

        TxtCodMem.setEditable(false);
        TxtCodMem.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        cmbTipoMem.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cmbTipoMem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estándar", "Premium", "Gold" }));

        btnAceptar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnGenerar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        lblTM1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTM1.setText("Fecha Emisión:");

        TxtFecha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout panGenMemLayout = new javax.swing.GroupLayout(panGenMem);
        panGenMem.setLayout(panGenMemLayout);
        panGenMemLayout.setHorizontalGroup(
            panGenMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGenMemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panGenMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCM)
                    .addComponent(lblTM)
                    .addComponent(lblTM1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panGenMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtCodMem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoMem, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panGenMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panGenMemLayout.setVerticalGroup(
            panGenMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGenMemLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(panGenMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCM)
                    .addComponent(TxtCodMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panGenMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTM)
                    .addComponent(cmbTipoMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panGenMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTM1)
                    .addComponent(btnAceptar)
                    .addComponent(TxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("DPI:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Apellidos:");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Fecha Nacimiento:");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Correo:");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Telefono:");

        TxtDPI.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtApellidos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtFeNac.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtCorreo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtTelefono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("Membresía:");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("Dirección:");

        TxtMem.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtDir.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        btnRegistrar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(99, 99, 99))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtApellidos)
                            .addComponent(TxtFeNac)
                            .addComponent(TxtNombre)
                            .addComponent(TxtDPI)
                            .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtMem)
                            .addComponent(TxtDir)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TxtDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtFeNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo)
                    .addComponent(panGenMem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panGenMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        Random r = new Random();
        int valor = r.nextInt(100000)+1;
        String cod_memb="M";
        cod_memb+=valor;
        if(cmbTipoMem.getSelectedIndex()==0){
            cod_memb+="E";
        }
        if(cmbTipoMem.getSelectedIndex()==1){
            cod_memb+="P";
        }
         if(cmbTipoMem.getSelectedIndex()==2){
            cod_memb+="G";
        }
        TxtCodMem.setText(cod_memb);
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       try
       {
           int estatus=1;
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_film_magic", "root", "informaticdv2016");
           PreparedStatement pst = cn.prepareStatement("insert into membresia values(?,?,?,?)");
           pst.setString(1, TxtCodMem.getText().trim());
           pst.setString(2, cmbTipoMem.getSelectedItem().toString().trim());
           pst.setString(3, TxtFecha.getText().trim());
           pst.setInt(4, estatus);
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "Registro Hecho");
           TxtMem.setText(TxtCodMem.getText());
           TxtCodMem.setText("");
           cmbTipoMem.setSelectedIndex(0);
           TxtFecha.setText("");
           TxtDireccion.requestFocus();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e.toString());
       }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnADirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADirActionPerformed
       try
       {
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_film_magic", "root", "informaticdv2016");
           PreparedStatement pst = cn.prepareStatement("insert into direccion values(?,?)");
           pst.setString(1, "0");
           pst.setString(2, TxtDireccion.getText().trim());
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "Registro Hecho");
           TxtDir.setText(TxtDireccion.getText());
           TxtDireccion.setText("");
           TxtDPI.requestFocus();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e.toString());
       }
    }//GEN-LAST:event_btnADirActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
          consultarDireccion(TxtDir.getText());
          try
          {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_film_magic", "root", "informaticdv2016");
            PreparedStatement pst = cn.prepareStatement("insert into cliente values(?,?,?,?,?,?,?,?)");
            pst.setString(1, TxtDPI.getText().trim());
            pst.setString(2, TxtNombre.getText().trim());
            pst.setString(3, TxtApellidos.getText().trim());
            pst.setString(4, TxtFeNac.getText().trim());
            pst.setString(5, TxtCorreo.getText().trim());
            pst.setString(6, TxtTelefono.getText().trim());
            pst.setInt(7, cod_direccion);
            pst.setString(8, TxtMem.getText().trim());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Registrado");
            TxtDPI.setText("");
            TxtNombre.setText("");
            TxtApellidos.setText("");
            TxtFeNac.setText("");
            TxtCorreo.setText("");
            TxtTelefono.setText("");
            TxtMem.setText("");
            cod_direccion=0;
            TxtCodMem.requestFocus();
          }
          catch(Exception e){
              JOptionPane.showMessageDialog(null, e.toString());
          }
    }//GEN-LAST:event_btnRegistrarActionPerformed
    public int cod_direccion;
    
    public void consultarDireccion(String direccion)
    {
        try
        {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_film_magic", "root", "informaticdv2016");
            PreparedStatement pst = cn.prepareStatement("select id_direccion from direccion where desc_direccion = ?");
            pst.setString(1, TxtDir.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                cod_direccion = (rs.getInt("id_direccion"));
            } else {
                JOptionPane.showMessageDialog(null, "Direccion no registrada.");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtApellidos;
    private javax.swing.JTextField TxtCodMem;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDPI;
    private javax.swing.JTextField TxtDir;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtFeNac;
    private javax.swing.JTextField TxtFecha;
    private javax.swing.JTextField TxtMem;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JButton btnADir;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbTipoMem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCM;
    private javax.swing.JLabel lblTM;
    private javax.swing.JLabel lblTM1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panGenMem;
    // End of variables declaration//GEN-END:variables
}
