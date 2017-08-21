/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sql.rowset.CachedRowSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import logica.Conexion;
import logica.ConexionFoto;
import logica.DB;
import logica.Utilidades;
import logica.msj;
import net.sf.jtelegraph.TelegraphType;

/**
 *
 * @author Santiago Escudero
 */
public class EmpresaData extends javax.swing.JFrame {

    private DB db = new DB();
    msj msj = new msj();
    int longitudBytes;
    FileInputStream fis;
    Utilidades utilidades = new Utilidades();
    ConexionFoto foto = new ConexionFoto();

    /**
     * Creates new form EmpresaData
     */
    public EmpresaData() {
        this.setUndecorated(true);
        initComponents();
        if (utilidades.mostrarPantallaBienvenida()) {
            jButton1.setText("Actualizar");
            datosEmpresa();
        } else {
            jLabel8.setVisible(false);
            txtDias.setVisible(false);
            jButton1.setText("Guardar");
        }
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDire = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBackup = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        rsesion = new javax.swing.JRadioButton();
        rabrir = new javax.swing.JRadioButton();
        rcerrar = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblfoto = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido a Hercules");

        jLabel3.setText("En esta ventana usted va a configurar los datos iniciales de su empresa.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(175, 175, 175))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel4.setText("Nombre de la Empresa:");

        txtNit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNitFocusLost(evt);
            }
        });
        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNitKeyReleased(evt);
            }
        });

        jLabel5.setText("Nit de la Empresa:");

        jLabel7.setText("Direccion:");

        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelKeyReleased(evt);
            }
        });

        jLabel9.setText("Telefono:");

        jLabel10.setText("Tipo de puerta:");

        txtBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBackupActionPerformed(evt);
            }
        });

        jLabel12.setText("Ruta del backup");

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cantonera", "Torniquete" }));

        jLabel6.setText("Cada cuanto quiere hacer backup");

        rsesion.setText("Al iniciar sesion");
        rsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsesionActionPerformed(evt);
            }
        });

        rabrir.setText("Al abrir la caja");

        rcerrar.setText("Al cerrar la caja");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rabrir)
                    .addComponent(jLabel6)
                    .addComponent(rcerrar)
                    .addComponent(rsesion))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rsesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rabrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rcerrar))
        );

        jRadioButton4.setText("Desea darle un plazo a su cliente despues de que se le venza la membresia");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel8.setText("Dias");

        txtDias.setText("0");
        txtDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasActionPerformed(evt);
            }
        });

        jButton1.setText(" ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("DV: ");

        jLabel11.setText("Imagen del Empresa");

        jButton2.setText("Abrir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(52, 52, 52)
                                    .addComponent(txtBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDire, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRadioButton4)
                        .addGap(18, 18, 18)
                        .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblfoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton4)
                            .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jButton1))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBackupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBackupActionPerformed

    private void rsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rsesionActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        if (jRadioButton4.isSelected()) {
            jLabel8.setVisible(true);
            txtDias.setVisible(true);
        } else {
            jLabel8.setVisible(false);
            txtDias.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        guardarDatosEmpresa();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        foto();
        actualizarImagen();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasActionPerformed

    private void txtNitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNitFocusLost
         jLabel2.setText("DV: "+txtNit.getText()+utilidades.dv(txtNit.getText()));
    }//GEN-LAST:event_txtNitFocusLost

    private void txtTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyReleased
        utilidades.validarCampoNumericos(txtTel.getText(), txtTel, 10);
    }//GEN-LAST:event_txtTelKeyReleased

    private void txtNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyReleased
utilidades.validarCampoNumericos(txtNit.getText(), txtNit, 10);        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    public void guardarDatosEmpresa() {

        String nom = txtnombre.getText();
        String dire = txtDire.getText();
        String nit = txtNit.getText();
        String tel = txtTel.getText();
        String backup = txtBackup.getText();
        String dias = txtDias.getText();
        boolean sesion = rsesion.isSelected();
        boolean abrir = rabrir.isSelected();
        boolean cerrar = rcerrar.isSelected();
        String tipo = String.valueOf(jcbTipo.getSelectedItem());
        String querySQL = "";

        boolean suceses;
        if (nom.isEmpty() && dire.isEmpty() && nit.isEmpty() && tel.isEmpty() && backup.isEmpty() && dias.isEmpty()) {
            msj.show("Campo Requerido", "Todos los campos son requeridos", TelegraphType.NOTIFICATION_WARNING, 5000);
        } else if (nom.isEmpty()) {
            msj.show("Campo Requerido", "El Campo nombre es requerido", TelegraphType.NOTIFICATION_WARNING, 5000);
        } else if (nit.isEmpty()) {
            msj.show("Campo Requerido", "El Campo nit es requerido", TelegraphType.NOTIFICATION_WARNING, 5000);
        } else if (dire.isEmpty()) {
            msj.show("Campo Requerido", "El Campo direcccion es requerido", TelegraphType.NOTIFICATION_WARNING, 5000);
        } else if (backup.isEmpty()) {
            msj.show("Campo Requerido", "El Campo backup es requerido", TelegraphType.NOTIFICATION_WARNING, 5000);
        } else if (jRadioButton4.isSelected()) {
            if (dias.isEmpty()) {
                msj.show("Campo Requerido", "El Campo dias es requerido", TelegraphType.NOTIFICATION_WARNING, 5000);
            } else {
                if (utilidades.mostrarPantallaBienvenida()) {
                    querySQL = String.format("UPDATE empresa SET nombre='%s',nit='%s',dir='%s',tel='%s',backup_ruta='%s',backup_sesion=%s,backup_abrircaja=%s,backup_cierrecaja=%s,tipo_puerta='%s',plazo_entrada=%s", nom, nit, dire, tel, backup, sesion, abrir, cerrar, tipo, Integer.valueOf(dias));
                    suceses = db.sqlEjec(querySQL);
                  
                    if (suceses) {

                        this.dispose();

                    }
                } else {

                    querySQL = String.format("INSERT INTO empresa(nombre,nit,dir,tel,backup_ruta,backup_sesion,backup_abrircaja,backup_cierrecaja,tipo_puerta,plazo_entrada) VALUES ('%s','%s','%s','%s','%s',%s,%s,%s,'%s','%s')", nom, nit, dire, tel, backup, sesion, abrir, cerrar, tipo, Integer.valueOf(dias));
                    suceses = db.sqlEjec(querySQL);
                    
                    if (suceses) {
                        this.dispose();
                        login lo = new login();
                        lo.setVisible(true);
                    }
                }
            }
        } else {

            if (utilidades.mostrarPantallaBienvenida()) {
                querySQL = String.format("UPDATE empresa SET nombre='%s',nit='%s',dir='%s',tel='%s',backup_ruta='%s',backup_sesion=%s,backup_abrircaja=%s,backup_cierrecaja=%s,tipo_puerta='%s',plazo_entrada=%s", nom, nit, dire, tel, backup, sesion, abrir, cerrar, tipo, Integer.valueOf(dias));
                suceses = db.sqlEjec(querySQL);
                
                if (suceses) {

                    this.dispose();

                }
            } else {

                if (dias.isEmpty()) {
                    dias = "0";
                }

                querySQL = String.format("INSERT INTO empresa(nombre,nit,dir,tel,backup_ruta,backup_sesion,backup_abrircaja,backup_cierrecaja,tipo_puerta,plazo_entrada) VALUES ('%s','%s','%s','%s','%s',%s,%s,%s,'%s','%s')", nom, nit, dire, tel, backup, sesion, abrir, cerrar, tipo, Integer.valueOf(dias));
                suceses = db.sqlEjec(querySQL);
                
                if (suceses) {
                    this.dispose();
                    login lo = new login();
                    lo.setVisible(true);
                }
            }
        }

    }

    public void foto() {

        lblfoto.setIcon(null);
        JFileChooser j = new JFileChooser();
        FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        j.setFileFilter(imageFilter);

        j.setFileSelectionMode(JFileChooser.FILES_ONLY);//solo archivos y no carpetas
        int estado = j.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {

                fis = new FileInputStream(j.getSelectedFile());
                //necesitamos saber la cantidad de bytes
                this.longitudBytes = (int) j.getSelectedFile().length();
                try {
                    Image icono = ImageIO.read(j.getSelectedFile()).getScaledInstance(lblfoto.getWidth(), lblfoto.getHeight(), Image.SCALE_DEFAULT);
                    lblfoto.setIcon(new ImageIcon(icono));
                    lblfoto.updateUI();

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "imagen: " + ex);
                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void actualizarImagen() {
        ConexionFoto foto = new ConexionFoto();
        foto.guardarfoto(fis, longitudBytes);

    }

    public void datosEmpresa() {
        CachedRowSet data;
        String sql = "SELECT nombre,nit,dir,tel,backup_ruta,backup_sesion,backup_abrircaja,backup_cierrecaja,tipo_puerta,plazo_entrada,imagen FROM empresa";
        data = db.sqlDatos(sql);

        try {
            while (data.next()) {
                txtnombre.setText(data.getString("nombre"));
                txtNit.setText(data.getString("nit"));
                txtTel.setText(data.getString("tel"));
                txtBackup.setText(data.getString("backup_ruta"));
                txtDire.setText(data.getString("dir"));
                jLabel2.setText("DV: "+data.getString("nit")+utilidades.dv(data.getString("nit")));

                if (data.getBoolean("backup_sesion") == true) {
                    rsesion.setSelected(true);

                }
                if (data.getBoolean("backup_abrircaja") == true) {
                    rabrir.setSelected(true);

                }
                if (data.getBoolean("backup_cierrecaja") == true) {
                    rcerrar.setSelected(true);

                }
                if (data.getInt("plazo_entrada") > 0) {
                    jRadioButton4.setSelected(true);
                    txtDias.setVisible(true);
                    jLabel8.setVisible(true);
                    txtDias.setText(data.getString("plazo_entrada"));

                } else {
                    txtDias.setVisible(false);
                    jLabel8.setVisible(false);
                }
                foto.consultarFoto(lblfoto);

            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpresaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JRadioButton rabrir;
    private javax.swing.JRadioButton rcerrar;
    private javax.swing.JRadioButton rsesion;
    private javax.swing.JTextField txtBackup;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtDire;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
