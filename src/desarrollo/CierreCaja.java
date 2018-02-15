/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.swing.JOptionPane;
import logica.DB;
import logica.Utilidades;
import net.sf.jcarrierpigeon.WindowPosition;
import net.sf.jtelegraph.Telegraph;
import net.sf.jtelegraph.TelegraphQueue;
import net.sf.jtelegraph.TelegraphType;

/**
 *
 * @author Usuario
 */
public class CierreCaja extends javax.swing.JInternalFrame {

    /**
     * Creates new form CierreCaja
     */
    private DB db = new DB();
    private CachedRowSet data;
    logica.Utilidades utilidades = new logica.Utilidades();
    Frame ventana;

    public CierreCaja(Frame ventana) {
        initComponents();
        this.ventana = ventana;
        lblFechaApertura.setText(utilidades.fecha_apertura());
        lblResponsableCaja.setText(cargarUsuario());
        obtenerDineroEgreso();
        obtenerDineroTienda();
        obtenerVisitas();
        obtenerMembresias();
        calcularTotal();
        cargarUsuario();
        cargarBase();
        obtenerAdeudos();
        obtenerMembresiasPagadasConTarjeta();
        btnAgregarDinero.setVisible(false);

    }

    public CierreCaja() {
        initComponents();

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
        btnCerrarCaja = new javax.swing.JButton();
        btnAgregarEgreso = new javax.swing.JButton();
        btnAgregarDinero = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblResponsableCaja = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblFechaApertura = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAperturaCaja = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtVentaMembresia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSumaTotalVentas = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtSumaEgreso = new javax.swing.JTextField();
        btnVisitas = new javax.swing.JButton();
        btnMembresia = new javax.swing.JButton();
        btnTotal = new javax.swing.JButton();
        btnEgresos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        lblDineroCaja = new javax.swing.JLabel();
        txtSumaVisitas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblDineroTarjeta = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSumaTienda = new javax.swing.JTextField();
        btnTienda = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cierre De Caja");
        setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Cierre De Caja");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/registradora.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Desarrollado para realizar un cierre de caja efectivo. ");

        btnCerrarCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/registradora.png"))); // NOI18N
        btnCerrarCaja.setText("Cerrar Caja");
        btnCerrarCaja.setToolTipText("Cerrar Caja");
        btnCerrarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarCajaActionPerformed(evt);
            }
        });

        btnAgregarEgreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/moneda.png"))); // NOI18N
        btnAgregarEgreso.setText("Agregar Egreso");
        btnAgregarEgreso.setToolTipText("Agregar un gasto de caja (Egreso)");
        btnAgregarEgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEgresoActionPerformed(evt);
            }
        });

        btnAgregarDinero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/moneda.png"))); // NOI18N
        btnAgregarDinero.setText("Agregar Ingreso");
        btnAgregarDinero.setToolTipText("Agregar dinero a caja (Ingreso)");
        btnAgregarDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDineroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Responsable de Caja. . . . . . . . . . . . . . . . . . . . . . . . .");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        lblResponsableCaja.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblResponsableCaja.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblResponsableCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 245, 27));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Fecha de apertura. . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        lblFechaApertura.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblFechaApertura.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lblFechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 245, 29));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Apertura de caja . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        txtAperturaCaja.setEditable(false);
        txtAperturaCaja.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(txtAperturaCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 139, 33));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Venta de membresias . . . . . . . . . . . . . . . . . . . . . . . . ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, 38));

        txtVentaMembresia.setEditable(false);
        txtVentaMembresia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(txtVentaMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 139, 32));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Venta de visitas . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Suma total de ventas . . . . . . . . . . . . . . . . . . . . . . . . .");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        txtSumaTotalVentas.setEditable(false);
        txtSumaTotalVentas.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtSumaTotalVentas.setForeground(new java.awt.Color(51, 153, 255));
        txtSumaTotalVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSumaTotalVentasActionPerformed(evt);
            }
        });
        jPanel1.add(txtSumaTotalVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 139, 35));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setText("Suma de gastos de caja (Egresos) . . . . . . . . . . . . . . . .");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 400, 30));

        txtSumaEgreso.setEditable(false);
        txtSumaEgreso.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtSumaEgreso.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(txtSumaEgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 139, 30));

        btnVisitas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVisitas.setText("Detalle");
        btnVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitasActionPerformed(evt);
            }
        });
        jPanel1.add(btnVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, -1, 30));

        btnMembresia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMembresia.setText("Detalle");
        btnMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembresiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, 30));

        btnTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTotal.setText("Detalle");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });
        jPanel1.add(btnTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 215, -1, 30));

        btnEgresos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEgresos.setText("Detalle");
        btnEgresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEgresosActionPerformed(evt);
            }
        });
        jPanel1.add(btnEgresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, -1, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 805, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jLabel4.setText("Efectivo en caja . . . . . . . . . ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        lblDineroCaja.setBackground(new java.awt.Color(255, 102, 0));
        lblDineroCaja.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        lblDineroCaja.setForeground(new java.awt.Color(0, 153, 51));
        lblDineroCaja.setToolTipText("Dinero Recibido");
        jPanel1.add(lblDineroCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 210, 50));

        txtSumaVisitas.setEditable(false);
        txtSumaVisitas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtSumaVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 139, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jLabel5.setText("Pago con tarjetas . . . . . . . .  ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        lblDineroTarjeta.setBackground(new java.awt.Color(255, 102, 0));
        lblDineroTarjeta.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        lblDineroTarjeta.setForeground(new java.awt.Color(0, 153, 51));
        lblDineroTarjeta.setToolTipText("Dinero Recibido");
        jPanel1.add(lblDineroTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 210, 50));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setText("Suma total de ventas en la tienda. . . . . . . . . . . . . . . . .");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 400, 30));

        txtSumaTienda.setEditable(false);
        txtSumaTienda.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtSumaTienda.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(txtSumaTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 139, 30));

        btnTienda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTienda.setText("Detalle");
        btnTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiendaActionPerformed(evt);
            }
        });
        jPanel1.add(btnTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarCajaActionPerformed
        // TODO add your handling code here:    
        int cerrar = JOptionPane.showConfirmDialog(this, "¿ESTA SEGUR@ QUE DESEA CERRAR LA CAJA?", "AVISO IMPORTANTE", JOptionPane.OK_CANCEL_OPTION);
        if (cerrar == 0) {
            JOptionPane.showMessageDialog(this, "SE HA CERRADO LA CAJA", "CERRANDO CAJA", JOptionPane.INFORMATION_MESSAGE);
            cerrarCaja();
        }
    }//GEN-LAST:event_btnCerrarCajaActionPerformed

    private void btnAgregarEgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEgresoActionPerformed
        // TODO add your handling code here:
        ActualizarEgresoCaja registrarEgreso = new ActualizarEgresoCaja(this);
        Frame.escritorio.add(registrarEgreso);
        registrarEgreso.toFront();
        registrarEgreso.setVisible(true);
    }//GEN-LAST:event_btnAgregarEgresoActionPerformed

    private void btnAgregarDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDineroActionPerformed
        // TODO add your handling code here:
        ActualizarIngresoCaja ingreso = new ActualizarIngresoCaja(this);
        Frame.escritorio.add(ingreso);
        ingreso.toFront();
        ingreso.setVisible(true);
    }//GEN-LAST:event_btnAgregarDineroActionPerformed

    private void btnVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitasActionPerformed
        // TODO add your handling code here:
        DetalleVisita visita = new DetalleVisita();
        Frame.escritorio.add(visita);
        visita.toFront();
        visita.setVisible(true);
    }//GEN-LAST:event_btnVisitasActionPerformed

    private void btnMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembresiaActionPerformed
        // TODO add your handling code here:
        DetalleMembresia membresia = new DetalleMembresia();
        Frame.escritorio.add(membresia);
        membresia.toFront();
        membresia.setVisible(true);
        Utilidades.centrarInternalFrame(membresia);
    }//GEN-LAST:event_btnMembresiaActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        // TODO add your handling code here:
        DetalleDineroRecibido dinero = new DetalleDineroRecibido();
        Frame.escritorio.add(dinero);
        dinero.toFront();
        dinero.setVisible(true);
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnEgresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEgresosActionPerformed
        // TODO add your handling code here:
        DetalleEgreso egreso = new DetalleEgreso();
        Frame.escritorio.add(egreso);
        egreso.toFront();
        egreso.setVisible(true);
    }//GEN-LAST:event_btnEgresosActionPerformed

    private void txtSumaTotalVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSumaTotalVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSumaTotalVentasActionPerformed

    private void btnTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiendaActionPerformed
        DetalleTienda egreso = new DetalleTienda();
        Frame.escritorio.add(egreso);
        egreso.toFront();
        egreso.setVisible(true);
    }//GEN-LAST:event_btnTiendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarDinero;
    private javax.swing.JButton btnAgregarEgreso;
    private javax.swing.JButton btnCerrarCaja;
    private javax.swing.JButton btnEgresos;
    private javax.swing.JButton btnMembresia;
    private javax.swing.JButton btnTienda;
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton btnVisitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDineroCaja;
    private javax.swing.JLabel lblDineroTarjeta;
    private javax.swing.JLabel lblFechaApertura;
    private javax.swing.JLabel lblResponsableCaja;
    private javax.swing.JTextField txtAperturaCaja;
    private javax.swing.JTextField txtSumaEgreso;
    private javax.swing.JTextField txtSumaTienda;
    private javax.swing.JTextField txtSumaTotalVentas;
    private javax.swing.JTextField txtSumaVisitas;
    private javax.swing.JTextField txtVentaMembresia;
    // End of variables declaration//GEN-END:variables

    public String fecha_apertura() {
        String fecha_apertura = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        Date fecha = null;
        try {
            String querySQL = "SELECT fecha_apertura FROM caja WHERE estado = true";
            data = db.sqlDatos(querySQL);
            if (data.next()) {
                fecha = data.getDate("fecha_apertura");

            }
            fecha_apertura = format.format(fecha);
        } catch (SQLException ex) {
            Logger.getLogger(CierreCaja.class.getName()).log(Level.SEVERE, null, ex);
        }

        return fecha_apertura;
    }

    public double obtenerDineroEgreso() {
        double suma = 0;
        long total = 0;
        try {
            String querySQL = "SELECT SUM(mov.valor) AS Dinero, ca.fecha_apertura FROM movimiento mov, caja ca WHERE tipo= 'Egreso' AND ca.fecha_apertura='".concat(fecha_apertura()).concat("'") + "AND mov.fecha_registro >= ca.fecha_apertura GROUP BY ca.fecha_apertura";
            data = db.sqlDatos(querySQL);

            if (data.size() == 0) {
                btnEgresos.setVisible(false);
            } else {
                btnEgresos.setVisible(true);
            }

            while (data.next()) {
                suma = data.getDouble("Dinero");
            }
            if (suma == 0) {
                txtSumaEgreso.setText("0.0");
            } else {
                total = (long) suma;
                txtSumaEgreso.setText(String.valueOf(total));
            }

        } catch (SQLException ex) {
            Logger.getLogger(CierreCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
public double obtenerDineroTienda() {
        double suma = 0;
        long total = 0;
        try {
            String querySQL = "SELECT SUM(mov.precio_total) AS Dinero, ca.fecha_apertura FROM factura_producto mov, caja ca WHERE ca.fecha_apertura='".concat(fecha_apertura()).concat("'") + "AND mov.fecha_registro >= ca.fecha_apertura GROUP BY ca.fecha_apertura";
            data = db.sqlDatos(querySQL);

            if (data.size() == 0) {
                btnTienda.setVisible(false);
            } else {
                btnTienda.setVisible(true);
            }

            while (data.next()) {
                suma = data.getDouble("Dinero");
            }
            if (suma == 0) {
                txtSumaTienda.setText("0.0");
            } else {
                total = (long) suma;
                txtSumaTienda.setText(String.valueOf(total));
            }

        } catch (SQLException ex) {
            Logger.getLogger(CierreCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    public void obtenerVisitas() {
        double suma = 0;
        long total = 0;
        try {
            String querySQL = "SELECT SUM(vi.costo) AS Dinero FROM pago_visita vi, caja ca WHERE ca.fecha_apertura='".concat(fecha_apertura()).concat("'") + "AND vi.fecha_registro >= ca.fecha_apertura GROUP BY ca.fecha_apertura";
            data = db.sqlDatos(querySQL);

            if (data.size() == 0) {
                btnVisitas.setVisible(false);
            } else {
                btnVisitas.setVisible(true);
            }

            while (data.next()) {
                suma = data.getDouble("Dinero");
            }
            if (suma == 0) {
                txtSumaVisitas.setText("0.0");
            } else {
                total = (long) suma;
                txtSumaVisitas.setText(String.valueOf(total));
            }

        } catch (SQLException ex) {
            Logger.getLogger(CierreCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void obtenerMembresias() {
        double suma = 0;
        long total = 0;
        try {
            String querySQL = "SELECT SUM(Dinero) as Dinero\n"
                    + "FROM (\n"
                    + "SELECT SUM(mem.valor_adquirido - f.saldo_favor_uso) AS Dinero \n"
                    + "FROM pago_membresia mem, caja ca , factura f\n"
                    + "                    WHERE ca.estado=TRUE AND mem.fecha_pago >= ca.fecha_apertura AND pago <> 0.0\n"
                    + "                    AND mem.factura_id = f.id\n"
                    + "                    GROUP BY ca.fecha_apertura\n"
                    + "UNION\n"
                    + "SELECT SUM(valor_caja) * -1 as Dinero\n"
                    + "FROM saldofavor \n"
                    + "WHERE id IN (\n"
                    + "	SELECT max(sf.id)\n"
                    + "	FROM saldofavor sf , caja c\n"
                    + "	WHERE sf.caja_id = c.id AND c.estado = TRUE\n"
                    + "	and sf.socio_id IN (\n"
                    + "		SELECT sf.socio_id\n"
                    + "		FROM saldofavor sf, caja c\n"
                    + "		WHERE sf.caja_id = c.id AND c.estado = TRUE\n"
                    + "		GROUP BY sf.valor , sf.valor_caja,sf.id\n"
                    + "		HAVING sf.valor - sf.valor_caja <= 0\n"
                    + "		)\n"
                    + "	GROUP BY sf.socio_id\n"
                    + ") AND valor_caja < 0\n"
                    + ") as ventas_membresias";

            String consultaMembresia = "SELECT SUM(mem.pago) AS Dinero\n"
                    + "FROM pago_membresia mem, caja ca\n"
                    + "WHERE mem.fecha_pago >= ca.fecha_apertura\n"
                    + "AND ca.estado = true AND mem.pago <> 0.0";

            System.out.println("Membresia sQL: " + querySQL);
            data = db.sqlDatos(consultaMembresia);

            if (data.size() == 0) {
                btnMembresia.setVisible(false);
            } else {
                btnMembresia.setVisible(true);
            }
            while (data.next()) {
                suma = data.getDouble("Dinero");
            }
            if (suma == 0) {
                txtVentaMembresia.setText("0.0");
            } else {
                total = (long) suma;
                txtVentaMembresia.setText(String.valueOf(total));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CierreCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double obtenerAdeudos() {
        double saldoPendiente = 0;
        long total = 0;

        try {
            String querySQL = "select (SELECT saldo FROM pago_membresia  WHERE fecha_pago >='" + fecha_apertura() + "' AND socio_id = pago.socio_id ORDER BY fecha_pago DESC LIMIT 1)  as Adeudos \n"
                    + "FROM pago_membresia pago WHERE pago.fecha_pago >= '" + fecha_apertura() + "'\n"
                    + "AND pago <> 0.0\n"
                    + "GROUP BY socio_id";
            System.out.println("La consulta es: " + querySQL);
            data = db.sqlDatos(querySQL);

            while (data.next()) {
                saldoPendiente += data.getDouble("Adeudos");
            }
//
//            if (saldoPendiente == 0) {
//                txtAdeudos.setText("0.0");
//            } else {
//                total = (long) saldoPendiente;
//                txtAdeudos.setText(String.valueOf(total));
//            }

        } catch (SQLException ex) {
            Logger.getLogger(CierreCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    public void cerrarCaja() {
        String totalEgresos = txtSumaEgreso.getText();
        String totalMembresia = txtVentaMembresia.getText();
        String totalVisitas = txtSumaVisitas.getText();
        String fecha_cierre = "now()";

        double egresos = Double.parseDouble(totalEgresos);
        double membresia = Double.parseDouble(totalMembresia);
        double visitas = Double.parseDouble(totalVisitas);
        double adeudos = 0.0;

        if (calcularTotal() < 0) {
            Telegraph tele = new Telegraph("Cierre Caja", "No se pueden dejar valores negativos en caja", TelegraphType.NOTIFICATION_WARNING, WindowPosition.TOPRIGHT, 9000);
            TelegraphQueue q = new TelegraphQueue();
            q.add(tele);

        } else {
            String querySQL = String.format("UPDATE caja SET ventas_membresia=%s, ventas_visitas=%s, fecha_cierre=now(), total_egresos=%s, adeudar_creditos=%s, estado=false, total_venta=%s,  total_recibido=%s, saldo_favor=%s WHERE estado=true", membresia, visitas, egresos, adeudos, calcularTotal(), lblDineroCaja.getText(), 0.0);
            boolean success = db.sqlEjec(querySQL);

            if (success) {
                Telegraph tele = new Telegraph("Cierre Caja", "Se ha cerrado la caja correctamente", TelegraphType.NOTIFICATION_DONE, WindowPosition.TOPRIGHT, 9000);
                TelegraphQueue q = new TelegraphQueue();
                q.add(tele);
                this.dispose();
                //Ventana Principal
                ventana.dispose();
                loginReinicio inicio = new loginReinicio();
                inicio.setVisible(true);

                utilidades.verificarBackups("backup_cierrecaja");
                ventana.pp.cerrarConexion();
                
            } else {
                Telegraph tele = new Telegraph("Cierre Caja", "No se ha cerrado correctamente la caja", TelegraphType.NOTIFICATION_ERROR, WindowPosition.TOPRIGHT, 9000);
                TelegraphQueue q = new TelegraphQueue();
                q.add(tele);
            }
        }
    }

    public String cargarUsuario() {
        String nombre_usuario = null;
        try {
            String nombre = String.format("SELECT us.primer_nombre AS nombre FROM usuario_sistema us, caja ca WHERE ca.fecha_apertura='" + utilidades.fecha_apertura() + "' AND ca.estado= true AND ca.usuario_sistema_id= us.id ORDER BY us.primer_nombre LIMIT 1");
            data = db.sqlDatos(nombre);

            while (data.next()) {
                nombre_usuario = data.getString("nombre");
            }

        } catch (SQLException ex) {
            Logger.getLogger(AperturaCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombre_usuario;
    }

    public void cargarBase() {
        double base = 0;
        double dineroCaja;
        long total;
        try {
            String nombre = String.format("SELECT base FROM caja WHERE estado=(%s)", true);
            data = db.sqlDatos(nombre);

            while (data.next()) {
                base = data.getDouble("base");
            }

            dineroCaja = base + calcularTotal() - obtenerDineroEgreso()-obtenerMembresiasPagadasConTarjeta();
            total = (long) dineroCaja;
            lblDineroCaja.setText(String.valueOf(total));
            txtAperturaCaja.setText(String.valueOf(base));
        } catch (SQLException ex) {
            Logger.getLogger(CierreCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double calcularTotal() {
        String totalEgresos = txtSumaEgreso.getText();
        String totalMembresia = txtVentaMembresia.getText();
        String totalVisitas = txtSumaVisitas.getText();
        long total = (long) ((long)  Double.parseDouble(totalVisitas) + Double.parseDouble(totalMembresia));
        long menosEgresos = (long) ((long)  Double.parseDouble(totalVisitas) + Double.parseDouble(totalMembresia));
        txtSumaTotalVentas.setText(String.valueOf(total));
        if (total == 0.0) {
            btnTotal.setVisible(false);
        } else {
            btnTotal.setVisible(true);
        }
        return total;
    }

    public void cargarCaja() {
        String nombre = String.format("SELECT ca.id, us.primer_nombre, ca.ventas_membresia, ca.ventas_visitas, ca.fecha_apertura, ca.fecha_cierre, ca.total_ingresos, ca.total_egresos, ca.total_venta\n"
                + "FROM caja ca, usuario_sistema us\n"
                + "WHERE ca.estado= false\n"
                + "AND ca.usuario_sistema_id= %s;", cargarUsuario());
        data = db.sqlDatos(nombre);
    }
    
      public long obtenerMembresiasPagadasConTarjeta() {
        double suma = 0;
        long total = 0;
        try {
            String querySQL = "SELECT SUM(Dinero) as Dinero\n"
                    + "FROM (\n"
                    + "SELECT SUM(mem.valor_adquirido - f.saldo_favor_uso) AS Dinero \n"
                    + "FROM pago_membresia mem, caja ca , factura f\n"
                    + "                    WHERE ca.estado=TRUE AND mem.fecha_pago >= ca.fecha_apertura AND pago <> 0.0\n"
                    + "                    AND mem.factura_id = f.id\n"
                    + "                    AND mem.pago_tarjeta = true\n"
                    + "                    GROUP BY ca.fecha_apertura\n"
                    + "UNION\n"
                    + "SELECT SUM(valor_caja) * -1 as Dinero\n"
                    + "FROM saldofavor \n"
                    + "WHERE id IN (\n"
                    + "	SELECT max(sf.id)\n"
                    + "	FROM saldofavor sf , caja c\n"
                    + "	WHERE sf.caja_id = c.id AND c.estado = TRUE\n"
                    + "	and sf.socio_id IN (\n"
                    + "		SELECT sf.socio_id\n"
                    + "		FROM saldofavor sf, caja c\n"
                    + "		WHERE sf.caja_id = c.id AND c.estado = TRUE\n"
                    + "		GROUP BY sf.valor , sf.valor_caja,sf.id\n"
                    + "		HAVING sf.valor - sf.valor_caja <= 0\n"
                    + "		)\n"
                    + "	GROUP BY sf.socio_id\n"
                    + ") AND valor_caja < 0\n"
                    + ") as ventas_membresias";

            String consultaMembresia = "SELECT SUM(mem.pago) AS Dinero\n"
                    + "FROM pago_membresia mem, caja ca\n"
                    + "WHERE mem.fecha_pago >= ca.fecha_apertura\n"
                    + "AND mem.pago_tarjeta = true\n"
                    + "AND ca.estado = true AND mem.pago <> 0.0";

            System.out.println("Membresia sQL: " + querySQL);
            data = db.sqlDatos(consultaMembresia);

            if (data.size() == 0) {
                btnMembresia.setVisible(false);
            } else {
                btnMembresia.setVisible(true);
            }
            while (data.next()) {
                suma = data.getDouble("Dinero");
            }
  
                total = (long) suma;
                lblDineroTarjeta.setText(String.valueOf(total));
                
            
        } catch (SQLException ex) {
            Logger.getLogger(CierreCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

}
