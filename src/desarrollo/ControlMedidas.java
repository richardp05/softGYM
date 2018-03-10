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

/**
 *
 * @author BrayhanJaramillo
 */
public class ControlMedidas extends javax.swing.JFrame {

    /**
     * Creates new form ControlMedidas
     */
    int idSocio;
    private DB db = new DB();
    logica.Utilidades utilidades = new logica.Utilidades();
    double estatura = 0, peso = 0, densidad_osea = 0, porcentaje_masa = 0, porcentaje_grasa = 0, cuello = 0, pecho_extendido = 0, pecho_normal = 0,
            brazo_derecho = 0, brazo_izquierdo = 0, pierna_derecha = 0, pierna_izquierda = 0, pantorrilla_derecha = 0,
            pantorrilla_izquierda = 0, cintura_normal = 0, cintura_sumida = 0, estatura_anterior = 0, peso_anterior = 0, densidad_osea_anterior = 0, porcentaje_masa_anterior = 0, porcentaje_grasa_anterior = 0, cuello_anterior = 0, pecho_extendido_anterior = 0, pecho_normal_anterior = 0,
            brazo_derecho_anterior = 0, brazo_izquierdo_anterior = 0, pierna_derecha_anterior = 0, pierna_izquierda_anterior = 0, pantorrilla_derecha_anterior = 0,
            pantorrilla_izquierda_anterior = 0, cintura_normal_anterior = 0, cintura_sumida_anterior = 0;
    ArrayList<Double> medidas_anteriores = new ArrayList<>();
    ArrayList<String> medidasFaltantes = new ArrayList<>();

    String usuario = System.getProperty("usuario_sistema");

    public ControlMedidas(int socio, String nombre) {
        initComponents();
        idSocio = socio;
        txtNombre.setText(nombre);
        txtNombre.setEditable(false);
        consultarMedidasSocio();
        cargarArraylistMedidas();
        setLocationRelativeTo(this);
        lblFechaRegistro.setText(consultarFecha());
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblFechaRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Visualizar Toma de Medidas Socio");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Person-add-black-32.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Permite visualizar todas las tomas de las medidas que ha tenido el socio ");

        lblId.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Person-add-black-32.png"))); // NOI18N
        jButton2.setText("CALCULAR MEDIDAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblId)
                        .addContainerGap(565, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32)))
                .addComponent(jLabel3)
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Nombre Socio");

        txtNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Ultima Toma de Medida ");

        lblFechaRegistro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(348, 348, 348))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFechaRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < medidas_anteriores.size(); i++) {
            System.out.println(medidas_anteriores.get(i));
        }
        InterfazMedidas imedidas = new InterfazMedidas(idSocio, medidas_anteriores, medidasFaltantes);
        imedidas.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            int row = tabla.rowAtPoint(evt.getPoint());
            utilidades.construirFormulario(tabla, row, "Control de Medidas");
        }
    }//GEN-LAST:event_tablaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaRegistro;
    private javax.swing.JLabel lblId;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    public void consultarMedidasSocio() {
        CachedRowSet data;
        DefaultTableModel tableModel = new DefaultTableModel(null, new String[]{"COD.","FECHA REG.", "ESTATURA", "PESO", "DEN. OSEA", "% MUSCULAR", "%GRASA", "CUELLO", "PECHO EXP.", "PECHO NORM.", "BRAZO DER.", "BRAZO IZQ", "PIERNA DER", "PIERNA IZQ", "PANTORIILA DER", "PANTORRILLA IZQ", "CONTURA NOR", "CINTURA SUMIDA"});
        try {

            String usuario = System.getProperty("usuario_sistema");
            String querySQL = "SELECT me.id, me.fecha_registro, estatura, peso, densidad_osea, porcentaje_muscular, porcentaje_grasa, cuello, pecho_expandido, pecho_normal, brazo_derecho, brazo_izquierdo, pierna_derecha, pierna_izquierda, pantorrilla_derecha, pantorrilla_izquierda, cintura_normal, cintura_sumida \n"
                    + "FROM medidas_socio me, socio so, usuario_sistema us\n"
                    + "WHERE me.socio_id= so.id\n"
                    + "AND me.usuario_sistema_id = us.id\n"
                    + "AND so.id=" + idSocio + "\n"
                    + "AND us.id=" + usuario + "\n"
                    + "ORDER BY me.id DESC\n";

            data = db.sqlDatos(querySQL);
            System.out.println("La consulta es: " + querySQL);
            tabla = logica.Utilidades.llenarTabla(data.createCopy(), tableModel, tabla);

            tabla.getColumnModel().getColumn(0).setMinWidth(0);
            tabla.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarMedidas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarArraylistMedidas() {

        String tipoActividad = "", querySQL, fecha_anterior = null, actividad_fisica_anterior = "";
        boolean success = false;
        int cantidad = 0, medidas_socio_id = 0;
        CachedRowSet dataConsulta;
        String queryConsulta = "SELECT me.id, me.fecha_registro, actividad_fisica, estatura, peso, densidad_osea, porcentaje_muscular, porcentaje_grasa, cuello, pecho_expandido, pecho_normal, brazo_derecho, brazo_izquierdo, pierna_derecha, pierna_izquierda, pantorrilla_derecha, pantorrilla_izquierda, cintura_normal, cintura_sumida\n"
                + "FROM medidas_socio me, socio so, usuario_sistema us\n"
                + "WHERE so.id=" + idSocio + " \n"
                + "AND us.id=" + usuario + " \n"
                + "AND me.socio_id= so.id\n"
                + "AND me.usuario_sistema_id = us.id\n"
                + "AND me.id != (SELECT me.id\n"
                + "FROM medidas_socio me, socio so, usuario_sistema us\n"
                + "WHERE so.id=" + idSocio + " \n"
                + "AND us.id=" + usuario + " \n"
                + "AND me.socio_id= so.id\n"
                + "AND me.usuario_sistema_id = us.id\n"
                + "ORDER BY me.id DESC\n"
                + "LIMIT 1)\n"
                + "ORDER BY me.id DESC\n"
                + "LIMIT 1;";

        System.out.println("hola" + queryConsulta);
        dataConsulta = db.sqlDatos(queryConsulta);
        try {
            while (dataConsulta.next()) {
                medidas_socio_id = dataConsulta.getInt("id");
                fecha_anterior = dataConsulta.getString("fecha_registro");
                actividad_fisica_anterior = dataConsulta.getString("actividad_fisica");
                peso_anterior = dataConsulta.getDouble("peso");
                estatura_anterior = dataConsulta.getDouble("estatura");
                densidad_osea_anterior = dataConsulta.getDouble("densidad_osea");
                porcentaje_masa_anterior = dataConsulta.getDouble("porcentaje_muscular");
                porcentaje_grasa_anterior = dataConsulta.getDouble("porcentaje_grasa");
                cuello_anterior = dataConsulta.getDouble("cuello");
                pecho_extendido_anterior = dataConsulta.getDouble("pecho_expandido");
                pecho_normal_anterior = dataConsulta.getDouble("pecho_normal");
                brazo_derecho_anterior = dataConsulta.getDouble("brazo_derecho");
                brazo_izquierdo_anterior = dataConsulta.getDouble("pierna_derecha");
                pierna_derecha_anterior = dataConsulta.getDouble("pierna_derecha");
                pierna_izquierda_anterior = dataConsulta.getDouble("pierna_izquierda");
                pantorrilla_derecha_anterior = dataConsulta.getDouble("pantorrilla_derecha");
                pantorrilla_izquierda_anterior = dataConsulta.getDouble("pantorrilla_izquierda");
                cintura_normal_anterior = dataConsulta.getDouble("cintura_normal");
                cintura_sumida_anterior = dataConsulta.getDouble("cintura_sumida");

            }
            medidas_anteriores.add(0.0);
            medidas_anteriores.add(peso_anterior);
            medidas_anteriores.add(estatura_anterior);
            medidas_anteriores.add(densidad_osea_anterior);
            medidas_anteriores.add(porcentaje_masa_anterior);
            medidas_anteriores.add(porcentaje_grasa_anterior);
            medidas_anteriores.add(cuello_anterior);
            medidas_anteriores.add(pecho_extendido_anterior);
            medidas_anteriores.add(pecho_normal_anterior);
            medidas_anteriores.add(brazo_derecho_anterior);
            medidas_anteriores.add(brazo_izquierdo_anterior);
            medidas_anteriores.add(pierna_derecha_anterior);
            medidas_anteriores.add(pierna_izquierda_anterior);
            medidas_anteriores.add(pantorrilla_derecha_anterior);
            medidas_anteriores.add(pantorrilla_izquierda_anterior);
            medidas_anteriores.add(cintura_normal_anterior);
            medidas_anteriores.add(cintura_sumida_anterior);
            medidasFaltantes.add(fecha_anterior);
            medidasFaltantes.add(actividad_fisica_anterior);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrarPagoMembresia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String consultarFecha(){
        String fecha_registro = null;
                CachedRowSet dataConsulta;
        String queryConsulta = "SELECT me.id,  me.fecha_registro , actividad_fisica , peso , estatura , densidad_osea , porcentaje_muscular , porcentaje_grasa , cuello , pecho_normal , pecho_expandido , cintura_normal , cintura_sumida ,pierna_derecha , pierna_izquierda , brazo_derecho , brazo_izquierdo , pantorrilla_derecha , pantorrilla_izquierda \n"
                + "FROM medidas_socio me, socio so, usuario_sistema us\n"
                + "WHERE me.socio_id= so.id\n"
                + "AND me.usuario_sistema_id = us.id\n"
                + "AND so.id=" + idSocio + "\n"
                + "AND us.id=" + usuario + "\n"
                + "ORDER BY me.id DESC\n"
                + "LIMIT 1;";

        System.out.println(queryConsulta);
        dataConsulta = db.sqlDatos(queryConsulta);
        try {
            while (dataConsulta.next()) {
                fecha_registro = dataConsulta.getString("fecha_registro");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarPagoMembresia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return fecha_registro;
    }

}
