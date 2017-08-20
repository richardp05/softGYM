/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo;

import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.swing.SpinnerNumberModel;
import logica.DB;
import logica.Reportes;
import logica.Utilidades;

/**
 *
 * @author jucazuse
 */
public class ImprimirRecibo extends javax.swing.JInternalFrame {

    Reportes reporte = new Reportes();
    private DB db = new DB();
    int idFactura;
    String descripcion;
    Date fecha = new Date();
    Utilidades utilitis = new Utilidades();

    SpinnerNumberModel model = new SpinnerNumberModel(
            new Integer(1), // Dato visualizado al inicio en el spinner 
            new Integer(1), // Límite inferior 
            new Integer(10), // Límite superior 
            new Integer(1) // incremento-decremento 
    );

    /**
     * Creates new form ImprimirRecibo
     */
    public ImprimirRecibo(int idFactura) {
        initComponents();

        this.idFactura = idFactura;
        this.setTitle(".:: Hércules - Vista Previa Recibo ::.");
        jLabel1.setText(utilitis.CargarNombreTitulo().toUpperCase());
        jLabel3.setText("DIRECCION: "+utilitis.cargarDireccionEmpresa().toUpperCase());
        lblNit.setText("NIT: "+utilitis.cargarNitEmpresa().toUpperCase());
        txtFecha.setEditable(false);
        txtCliente.setEditable(false);
        txtOperador.setEditable(false);
        txtDescripcion.setEditable(false);
        txtPaga.setEditable(false);
        txtDebe.setEditable(false);
        txtSaldoFavor.setEditable(false);
        System.out.println(idFactura);
        encabezado(idFactura);
        descripcion(idFactura);
        txtFecha.setText(String.valueOf(fecha.toLocaleString()));
        jSVeces.setModel(model);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtOperador = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        lbNumeroRecibo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPaga = new javax.swing.JTextField();
        txtDebe = new javax.swing.JTextField();
        txtSaldoFavor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtImprimir = new javax.swing.JButton();
        jSVeces = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        lUsoSaldoFavor = new javax.swing.JLabel();
        cSaldoFavorUsado = new javax.swing.JTextField();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Vista Previa Recibo"));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BioFisic GYM");

        lblNit.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        lblNit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNit.setText("Nit: 10270746-1");

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Carrera 50 No. 49 - 59");

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jLabel4.setText("Cliente:");

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Recibo de Pago No.");

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jLabel6.setText("Fecha:");

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jLabel7.setText("Operador:");

        txtOperador.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        txtOperador.setBorder(null);
        txtOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOperadorActionPerformed(evt);
            }
        });

        txtCliente.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        txtCliente.setBorder(null);

        txtFecha.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        txtFecha.setBorder(null);

        jLabel8.setText("--------------------------------------------------------------------------------------------");

        jLabel9.setText("--------------------------------------------------------------------------------------------");

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jLabel10.setText("Paga $");

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jLabel11.setText("Saldo a Favor $");

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jLabel12.setText("Debe $");

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jLabel13.setText("***NO SE HACEN DEVOLUCIONES DE DINERO***");

        jScrollPane2.setBorder(null);

        txtDescripcion.setColumns(30);
        txtDescripcion.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(2);
        txtDescripcion.setBorder(null);
        txtDescripcion.setFocusable(false);
        jScrollPane2.setViewportView(txtDescripcion);

        txtImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/imprimir.png"))); // NOI18N
        txtImprimir.setText("Imprimir");
        txtImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImprimirActionPerformed(evt);
            }
        });

        jSVeces.setModel(new javax.swing.SpinnerNumberModel(2, 2, 10, 1));

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jLabel14.setText("Numero de Copias");

        lUsoSaldoFavor.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        lUsoSaldoFavor.setLabelFor(cSaldoFavorUsado);
        lUsoSaldoFavor.setText("Usado de saldo a favor");

        cSaldoFavorUsado.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtOperador)
                                    .addComponent(txtCliente)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSVeces, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(lUsoSaldoFavor))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPaga)
                                            .addComponent(txtDebe)
                                            .addComponent(txtSaldoFavor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cSaldoFavorUsado)))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbNumeroRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNumeroRecibo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cSaldoFavorUsado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lUsoSaldoFavor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtDebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSaldoFavor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSVeces, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImprimirActionPerformed
        Thread hiloFactura = new Thread(new Runnable() {

            @Override
            public void run() {
                String veces = jSVeces.getValue().toString();
                int impresiones = Integer.parseInt(veces);
                reporte.reporte("headerfoooter.jasper", impresiones, idFactura, "Factura", "Factura");

            }
        });

        hiloFactura.start();

    }//GEN-LAST:event_txtImprimirActionPerformed

    private void txtOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOperadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOperadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cSaldoFavorUsado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSVeces;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lUsoSaldoFavor;
    private javax.swing.JLabel lbNumeroRecibo;
    private javax.swing.JLabel lblNit;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDebe;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JButton txtImprimir;
    private javax.swing.JTextField txtOperador;
    private javax.swing.JTextField txtPaga;
    private javax.swing.JTextField txtSaldoFavor;
    // End of variables declaration//GEN-END:variables

    public void encabezado(int idFactura) {
        try {
            CachedRowSet data;
            String sql;
            sql = String.format("SELECT fac.id,fac.paga,fac.debe AS debe,fac.saldo_favor,CONCAT(us.primer_nombre||' '||us.primer_apellido) AS operador,CONCAT(s.primer_nombre||' '||s.primer_apellido) AS usuario , fac.saldo_favor_uso \n"
                    + "FROM factura fac, socio s,usuario_sistema us\n"
                    + "WHERE fac.id = %s\n"
                    + "AND s.id = fac.socio_id \n"
                    + "AND fac.usuario_sistema_id = us.id;", idFactura);

            data = db.sqlDatos(sql);
            while (data.next()) {
                lbNumeroRecibo.setText(data.getString("id"));
                txtPaga.setText(data.getString("paga"));
                txtDebe.setText(data.getString("debe"));
                txtSaldoFavor.setText(data.getString("saldo_favor"));
                txtOperador.setText(data.getString("operador"));
                txtCliente.setText(data.getString("usuario"));
                cSaldoFavorUsado.setText(data.getString("saldo_favor_uso"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImprimirRecibo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void descripcion(int idFactura) {
        try {
            CachedRowSet data;
            String sql;

            sql = String.format("SELECT m.id,'Membresia',CONCAT(m.nombre||' $'||pm.pago||' ( '||md.fecha_inicio_membresia||'/'||md.fecha_fin_membresia||')') AS descripcion,\n"
                    + "CASE WHEN pm.saldo = 0 THEN 'Pago' WHEN pm.saldo > 0 THEN 'Abono'::text END AS texto\n"
                    + "FROM pago_membresia pm , factura fac, socio s, membresia m,membresia_datos md,membresia_usuario mu\n"
                    + "WHERE fac.id = %s\n"
                    + "AND s.id = pm.socio_id\n"
                    + "AND md.id = pm.membresiadatos_id\n"
                    + "AND fac.id = pm.factura_id\n"
                    + "AND s.id = fac.socio_id\n"
                    + "AND m.id = mu.membresia_id\n"
                    + "AND s.id = mu.socio_id\n"
                    + "AND md.id = pm.membresiadatos_id\n"
                    + "AND md.membresia_socio_id = mu.id;", idFactura);
            data = db.sqlDatos(sql);
            while (data.next()) {
                descripcion = data.getString("id") + " " + data.getString("texto") + " " + data.getString("descripcion") + " " + "\n";
                txtDescripcion.append(descripcion);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImprimirRecibo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
