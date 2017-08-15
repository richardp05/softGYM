/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.DB;
import logica.PlaceHolder;
import logica.Utilidades;
import logica.msj;
import net.sf.jcarrierpigeon.WindowPosition;
import net.sf.jtelegraph.Telegraph;
import net.sf.jtelegraph.TelegraphQueue;
import net.sf.jtelegraph.TelegraphType;

/**
 *
 * @author gaso
 */
public class RegistrarPagoMembresia extends javax.swing.JFrame {

    private DB db = new DB();
    Map<Integer, Double> saldoProductos = new HashMap<>();
    Map<String, Integer> MembresiasUsuario = new HashMap<>();
    private final int socioId;
    private VerSocio socio;
    private final int usuario_sistema = Integer.valueOf(System.getProperty("usuario_sistema"));
    Utilidades utilidades = new Utilidades();
    private boolean usuarioPaga;

    /**
     * Creates new form RegistrarPagoMembresia
     *
     * @param socioId
     * @param socio
     */
    public RegistrarPagoMembresia(int socioId, VerSocio socio) {
        initComponents();
        this.setTitle(".:: Hércules - Ventana de Pagos ::.");
        this.socioId = socioId;
        this.socio = socio;
        obtenerMembresiasActivas();

        //darle el foco al campo de dinero
       // cDineroRecibido.requestFocus();

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
        bPago = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lBalance = new javax.swing.JLabel();
        cBalance = new javax.swing.JTextField();
        cValorAdquirido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        cDineroRecibido = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/agregar.png"))); // NOI18N
        bPago.setText("Agregar Pago");
        bPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPagoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gestor de Pagos");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/registradora.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Este asistente le ayudará a registrar el pago del usuario");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/caneco.png"))); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bPago, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPago, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lBalance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lBalance.setText("Cambio $");

        cBalance.setEditable(false);
        cBalance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cBalance.setText("0");
        cBalance.setFocusable(false);

        cValorAdquirido.setEditable(false);
        cValorAdquirido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cValorAdquirido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cValorAdquirido.setText("0");
        cValorAdquirido.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Valor A Pagar $");

        TablaProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaProductos.setFocusable(false);
        jScrollPane1.setViewportView(TablaProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lBalance)
                            .addComponent(jLabel8))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cValorAdquirido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cValorAdquirido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBalance))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cDineroRecibido.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        cDineroRecibido.setForeground(new java.awt.Color(51, 102, 0));
        cDineroRecibido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cDineroRecibido.setText("0");
        cDineroRecibido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cDineroRecibidoFocusGained(evt);
            }
        });
        cDineroRecibido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDineroRecibidoActionPerformed(evt);
            }
        });
        cDineroRecibido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cDineroRecibidoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cDineroRecibidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cDineroRecibidoKeyTyped(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jCheckBox1.setText("¿Registrar este pago en otra Fecha?");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setText("Dinero Recibido");
        jLabel9.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cDineroRecibido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox1))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cDineroRecibido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cDineroRecibidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDineroRecibidoActionPerformed

    }//GEN-LAST:event_cDineroRecibidoActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void cDineroRecibidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cDineroRecibidoKeyReleased
        recalcularDinero();
    }//GEN-LAST:event_cDineroRecibidoKeyReleased

    private void bPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPagoActionPerformed

        boolean validacion = false;
        try {
            validacion = utilidades.validarFechaRegistro(utilidades.fecha_apertura(), utilidades.obtnerFechaActual());
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarEgreso.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (validacion == false) {
            JOptionPane.showMessageDialog(this, "NO SE HA REGISTRADO EL PAGO", "REGISTRANDO PAGO", JOptionPane.WARNING_MESSAGE);
            Telegraph tele = new Telegraph("Cierre Caja", "No se puede registrar el pago. \n La fecha actual es menor que la fecha de apertura", TelegraphType.NOTIFICATION_WARNING, WindowPosition.TOPRIGHT, 9000);
            TelegraphQueue q = new TelegraphQueue();
            q.add(tele);
        } else {
            guardar();
        }


    }//GEN-LAST:event_bPagoActionPerformed

    private void cDineroRecibidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cDineroRecibidoFocusGained
        //Seleccionar Texto de la Caja
        cDineroRecibido.selectAll();

    }//GEN-LAST:event_cDineroRecibidoFocusGained

    private void cDineroRecibidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cDineroRecibidoKeyPressed

    }//GEN-LAST:event_cDineroRecibidoKeyPressed

    private void cDineroRecibidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cDineroRecibidoKeyTyped
        // TODO add your handling code here:
        int tamano = cDineroRecibido.getText().length();
        if (tamano > 5) {
            Telegraph tele = new Telegraph("PAGO MEMBRESIA", "NO SE HA PODIDO AGREGAR ESTE PAGO \n HA SOBREPASASO EL VALOR DE LOS PAGOS", TelegraphType.NOTIFICATION_ERROR, WindowPosition.TOPRIGHT, 5000);
            TelegraphQueue q = new TelegraphQueue();
            q.add(tele);
            cDineroRecibido.setText("");
        }
    }//GEN-LAST:event_cDineroRecibidoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton bPago;
    private javax.swing.JTextField cBalance;
    private javax.swing.JTextField cDineroRecibido;
    private javax.swing.JTextField cValorAdquirido;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lBalance;
    // End of variables declaration//GEN-END:variables

    private void guardar() {

        String dineroRecibido = cDineroRecibido.getText();

        if ("0".equals(dineroRecibido)) {
            msj.show("Registro de Cero Pesos no permitido", "Debe indicar el dinero recibido.", TelegraphType.NOTIFICATION_INFO, 3000);
            return;
        }

        int idFactura = registrarPagos();
        if(idFactura==-1){
            return;
        }
         
        socio.updateDatos();
        this.dispose();
        ImprimirRecibo imprimirRecibo = new ImprimirRecibo(idFactura);
        Frame.escritorio.add(imprimirRecibo);
        imprimirRecibo.toFront();
        imprimirRecibo.setVisible(true);
        Utilidades.centrarInternalFrame(imprimirRecibo);
    }
   

    private void obtenerMembresiasActivas() {
        CachedRowSet data;
        try {

            DefaultTableModel dtmEjemplo = new DefaultTableModel(null, new String[]{"Fecha Asignacion", "Producto Adquirido", "Costo Membresia", "Saldo"});
//            data = db.sqlDatos("SELECT  mendatos.fecha_asignacion, men.nombre || ': Comienza  ' || mendatos.fecha_inicio_membresia ||' | Termina '|| mendatos.fecha_fin_membresia , mendatos.costo_membresia , mendatos.costo_membresia + mendatos.costo_inscripcion - mendatos.descuento as saldo , mendatos.id \n"
//                    + "FROM socio soc , membresia_usuario menusu , membresia men , membresia_datos mendatos\n"
//                    + "WHERE menusu.socio_id = soc.id AND menusu.membresia_id = men.id AND mendatos.membresia_socio_id = menusu.id\n"
//                    + "AND men.estado = true and menusu.activa = true AND mendatos.estado = 'Sin Cancelar' AND soc.id = " + socioId);

            data = db.sqlDatos("SELECT  mendatos.fecha_asignacion, men.nombre || ': Comienza  ' || mendatos.fecha_inicio_membresia ||' | Termina '|| mendatos.fecha_fin_membresia , mendatos.costo_membresia , (SELECT saldo FROM pago_membresia WHERE membresiadatos_id = mendatos.id order by fecha_pago desc limit 1) as saldo , mendatos.id \n"
                    + "                    FROM socio soc , membresia_usuario menusu , membresia men , membresia_datos mendatos\n"
                    + "                    WHERE menusu.socio_id = soc.id AND menusu.membresia_id = men.id AND mendatos.membresia_socio_id = menusu.id\n"
                    + "                    AND men.estado = true  AND mendatos.estado = 'Sin Cancelar' AND soc.id = " + socioId);

            TablaProductos = logica.Utilidades.llenarTabla(data.createCopy(), dtmEjemplo, TablaProductos);
            double valorAdquirido = 0;

            while (data.next()) {
                String ComboInfo = String.format("%s|%s| Costo = $ %s| Saldo = $ %s", data.getString(1), data.getString(2), data.getString(3), data.getString(4));
                //cbMembresias.addItem(ComboInfo);

                valorAdquirido += data.getDouble("saldo");

                saldoProductos.put(data.getInt("id"), data.getDouble("saldo"));
                MembresiasUsuario.put(ComboInfo, data.getInt("id"));
            }

            cValorAdquirido.setText(String.valueOf(valorAdquirido));

        } catch (Exception ex) {
            Logger.getLogger(RegistrarPagoMembresia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void actualizarEstadoPagoMembresia(int membresiaId) {
        String querySQL = String.format("UPDATE membresia_datos SET estado = 'Pagada' WHERE id = %s", membresiaId);
        boolean success = db.sqlEjec(querySQL);
//        if (success) {
//            msj.show("Membresia Pagada", "La Membresia a sido Cancelada en su Totalidad", TelegraphType.MESSAGE);
//        } else {
//            msj.show("Error Registrando Pago", "No se completó la operación de registrar el Pago, consulte con el administrador del Sistema", TelegraphType.NOTIFICATION_ERROR);
//        }
    }
    
    private int registrarPagos() {
        boolean success = false;
        Double dineroRecibido =Double.parseDouble(cDineroRecibido.getText());
       
        //Aqui Generar Factura
        int facturaId = generarFactura(dineroRecibido);
        if (facturaId == -1) {
            Logger.getLogger(RegistrarPagoMembresia.class.getName()).log(Level.SEVERE, "Error generado factura .. no es posible registrar Pago");
            return -1; 
        }

        for (Map.Entry<Integer, Double> entry : saldoProductos.entrySet()) {
            int membresiaDatosId = entry.getKey();
            Double saldo = entry.getValue();

            //Obtener valor adquirido de pago_membresia en base a id
            Double valorAdquirido = obtenerValorAdquirido(membresiaDatosId);
            if (dineroRecibido >= saldo) {
                success = procesarPago(valorAdquirido, saldo, 0.0, membresiaDatosId, facturaId);
                //System.out.println("Membresia de id " + membresiaDatosId + " se pagara completa");
                if (success) {
                    actualizarEstadoPagoMembresia(membresiaDatosId);
                }
                dineroRecibido = dineroRecibido - saldo;
                msj.show("Pago exitoso", "El cambio es: "+dineroRecibido+"", TelegraphType.NOTIFICATION_DONE, 4000);
            } 

        }


        if (success) {
            bPago.setEnabled(false);
            cDineroRecibido.setEditable(false);
            //Actualizar Valores Factura Aqui.
            actualizarValoresFactura(facturaId);

            msj.show("Transacción Exitosa", "Pago registrado con exito", TelegraphType.NOTIFICATION_DONE, 3000);
        } else {

        }

        return facturaId;

    }

    
    /**
     * Consultar el Valor adquirido de una membresia en la tabla de pagos,
     * obteniendo el ultimo registro de manera descendente.
     *
     * @param membresiadatos_id
     */
    private Double obtenerValorAdquirido(int membresiadatos_id) {
        CachedRowSet data;
        String query = "SELECT valor_adquirido FROM pago_membresia WHERE membresiadatos_id = " + membresiadatos_id + " ORDER BY fecha_pago DESC LIMIT 1";
        Double valorAdquirido = -1.0;
        try {
            data = db.sqlDatos(query);
            while (data.next()) {
                valorAdquirido = data.getDouble("valor_adquirido");
            }
        } catch (SQLException e) {
            Logger.getLogger(RegistrarPagoMembresia.class.getName()).log(Level.WARNING, "Error ejecutando consulta para obtener valor adquirido ...");
        }

        return valorAdquirido;

    }

    /**
     * Registrar el Pago de la Membresia
     *
     * @param valorAdquirido
     * @param pago
     * @param saldo
     * @param membresiaDatos
     * @return
     */
    private boolean procesarPago(Double valorAdquirido, Double pago, Double saldo, int membresiaDatos, int facturaId) {
        int socio_id = socioId;
        String querySQL = String.format("INSERT INTO pago_membresia(fecha_pago,socio_id,valor_adquirido,pago,saldo,fecha_registro,usuario_sistema_id,membresiadatos_id,factura_id) VALUES (now(),%s,%s,%s,%s,now(),%s,%s,%s)", socio_id, valorAdquirido, pago, saldo, usuario_sistema, membresiaDatos, facturaId);
        boolean success = db.sqlEjec(querySQL);
        return success;
    }

    


   
    public void recalcularDinero() {
        if (!cDineroRecibido.getText().isEmpty()) {
            if (cDineroRecibido.getText().startsWith("0")) {
                cDineroRecibido.setText(cDineroRecibido.getText().substring(1));
            }
            try {
                Double valorAdquirido = Double.valueOf(cValorAdquirido.getText());
                Double dineroRecibido = Double.valueOf(cDineroRecibido.getText());
                Double saldo = 0.0;
                saldo = valorAdquirido - dineroRecibido;

                if (saldo > 0) {
                    lBalance.setText("Resta $");
                    cBalance.setText(String.valueOf(saldo));
                    usuarioPaga = false;
                } else if (saldo == 0) {
                    lBalance.setText("Balance $");
                    cBalance.setText("0");
                    usuarioPaga = true;
                } else if (saldo < 0) {
                    lBalance.setText("Cambio $");
                    cBalance.setText(String.valueOf((saldo)*(-1)));
                    usuarioPaga = true;
                }

            } catch (NumberFormatException e) {
                new PlaceHolder("0", cDineroRecibido);
                cDineroRecibido.setText("0");
                msj.show("Numero Incorrecto", "Debe de digitar una Suma Correcta para poder registrar el Pago", TelegraphType.APPLICATION_WARNING, 4000);
            }

        } else {
            cDineroRecibido.setText("0");
        }
    }

    /**
     * Generar Registro de Factura
     *
     * @param paga - Valor que el usuario cancela
     * @return
     */
    private int generarFactura(Double paga) {
        int id = -1;
        Double debe = 0.0;

        if (!usuarioPaga) {
            msj.show("Numero Incorrecto", "Debe de digitar una Suma Correcta para poder registrar el Pago", TelegraphType.APPLICATION_WARNING, 4000);
            return -1;  
        }
        

        String queryFactura = String.format("INSERT INTO factura(socio_id,paga,debe,usuario_sistema_id) VALUES (%s,%s,%s,%s);", socioId, paga, debe, usuario_sistema);
        if (db.sqlEjec(queryFactura)) {
            id = db.getKeys();
        }
        return id;
    }

    private void actualizarValoresFactura(int facturaId) {
        Double paga = 0.0;
        if (!cDineroRecibido.getText().isEmpty()) {
            paga = Double.valueOf(cDineroRecibido.getText());
        }

        Double valorAdquirido = Double.valueOf(cValorAdquirido.getText());



        Double debe = 0.0;

        if (lBalance.getText().equals("Resta $")) {
            debe = Double.valueOf(cBalance.getText());
        }

        String query = String.format("UPDATE factura SET paga = %s , debe = %s   WHERE id = %s", paga, debe, facturaId);

        db.sqlEjec(query);
    }

}
