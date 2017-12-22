/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.swing.table.DefaultTableModel;
import logica.DB;
import logica.msj;
import net.sf.jtelegraph.TelegraphType;

/**
 *
 * @author jucazuse
 */
public class ventanaRoles extends javax.swing.JInternalFrame {

    private DB db = new DB();
    private msj mensaje = new msj();
    String idVentana;
    DefaultTableModel dtmEjemplo = new DefaultTableModel();
    ArrayList<String> dato = new ArrayList<>();
    ArrayList<String> datosAgregar = new ArrayList<>();

    /**
     * Creates new form ventanaRoles
     */
    public ventanaRoles() {
        initComponents();
        cargarCombo();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbVentana = new javax.swing.JComboBox();
        btnAgregar = new javax.swing.JButton();
        txtNombreRol = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVentanaRol = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/gym.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Control de Acceso");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel7.setText("Elija un usuario e ingrese la contraseña para entrar.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(0, 131, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre Rol");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ventana");

        cbVentana.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbVentanaFocusLost(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtNombreRol.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jtVentanaRol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ventana", "Crear", "Modficar", "Eliminar", "Consultar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtVentanaRol);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtNombreRol)))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreRol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String id = consultar(String.valueOf(cbVentana.getSelectedItem()));
        if (!cbVentana.getSelectedItem().toString().isEmpty()) {
            datosAgregar.add(id);
            cargarTabla(id);
        } else {
            mensaje.show("Advertencia", "Debe Seleccinar una ventana para asignarle los permisos", TelegraphType.NOTIFICATION_WARNING, 4000);
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombreRol;
        boolean insercionUno = false;
        boolean insercionDos = false;
        boolean crear = false;
        boolean modificar = false;
        boolean eliminar = false;
        boolean consultar = false;
        String querySQL;
        
        if (!txtNombreRol.getText().isEmpty()) {
            nombreRol = txtNombreRol.getText();
            querySQL = String.format("INSERT INTO rol(nombre) VALUES('%s');", nombreRol);
            insercionUno = db.sqlEjec(querySQL);
            for (int fila = 0; fila < jtVentanaRol.getRowCount(); fila++) {
                datosAgregar.clear();
                datosAgregar.add(String.valueOf(dtmEjemplo.getValueAt(fila, 0)));
                datosAgregar.add(String.valueOf(dtmEjemplo.getValueAt(fila, 2)));
                datosAgregar.add(String.valueOf(dtmEjemplo.getValueAt(fila, 3)));
                datosAgregar.add(String.valueOf(dtmEjemplo.getValueAt(fila, 4)));
                datosAgregar.add(String.valueOf(dtmEjemplo.getValueAt(fila, 5)));
                querySQL = String.format("INSERT INTO permisos(ventana_id,crear,modificar,eliminar,consultar) VALUES(%s,%s,%s,%s,%s)", datosAgregar.get(0), datosAgregar.get(1), datosAgregar.get(2), datosAgregar.get(3), datosAgregar.get(4));
                System.out.println(querySQL);
                insercionDos = db.sqlEjec(querySQL);
            }
        } else {
            mensaje.show("Advertencia", "El nombre del rol es requerido", TelegraphType.NOTIFICATION_WARNING, 4000);
        }
        if (insercionUno == true && insercionDos == true) {
            mensaje.show("Creacion Rol", "Rol Creado con exito", TelegraphType.NOTIFICATION_ADD, 4000);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbVentanaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbVentanaFocusLost
        idVentana = consultar(String.valueOf(cbVentana.getSelectedItem()));
        
    }//GEN-LAST:event_cbVentanaFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cbVentana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtVentanaRol;
    private javax.swing.JTextField txtNombreRol;
    // End of variables declaration//GEN-END:variables

    public String consultar(String nombre) {
        CachedRowSet data;
        String id = "";
        String querySQL = String.format("SELECT id FROM ventana WHERE nombre='%s';", nombre);
        data = db.sqlDatos(querySQL);
        try {
            while (data.next()) {
                id = data.getString("id");
                return id;
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public void cargarCombo() {
        CachedRowSet data;
        String querySql;
        try {
            querySql = String.format("SELECT nombre FROM ventana;");
            data = db.sqlDatos(querySql);
            cbVentana.addItem("");
            while (data.next()) {
                cbVentana.addItem(data.getString("nombre"));
            }

        } catch (Exception ex) {
            Logger.getLogger(RegistrarPagoMembresia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarTabla(String id) {
        CachedRowSet data;
        String querySql;
        try {
            dtmEjemplo = (DefaultTableModel) jtVentanaRol.getModel();
            querySql = String.format("SELECT id,nombre,aplica_crear,aplica_modificar,aplica_aliminar,aplica_consultar FROM ventana WHERE id=%s;", id);
            data = db.sqlDatos(querySql);
            Object[] datos = new Object[2];
            while (data.next()) {
                datos[0] = data.getString("id");
                datos[1] = data.getString("nombre");
                dato.add("aplica_crear");
                dato.add("aplica_modificar");
                dato.add("aplica_aliminar");
                dato.add("aplica_consultar");
            }
            dtmEjemplo.addRow(datos);
        } catch (Exception ex) {
            Logger.getLogger(RegistrarPagoMembresia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
