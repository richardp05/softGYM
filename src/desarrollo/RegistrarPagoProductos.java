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
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
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
import static desarrollo.Frame.escritorio;
import java.util.ArrayList;

/**
 *
 * @author gaso
 */
public class RegistrarPagoProductos extends javax.swing.JInternalFrame {

    private DB db = new DB();

    private final int usuario_sistema = Integer.valueOf(System.getProperty("usuario_sistema"));
    Utilidades utilidades = new Utilidades();
    private boolean usuarioPaga;
    double valorPagado;
    int idMembresia;

    /**
     * Creates new form RegistrarPagoMembresia
     *
     * @param socioId
     * @param socio
     */
    public RegistrarPagoProductos() {
        initComponents();
        this.setTitle(".:: Hércules - Ventana de Pagos ::.");
        utilidades.llenarColumnas(TablaProductos);
        cDineroRecibido.requestFocus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pagoConTarjeta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        bPago1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lBalance = new javax.swing.JLabel();
        cBalance = new javax.swing.JTextField();
        cValorAdquirido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        bPago = new javax.swing.JButton();
        cDineroRecibido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        pagoConTarjeta.setBackground(new java.awt.Color(255, 255, 255));
        pagoConTarjeta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        bPago1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/agregar.png"))); // NOI18N
        bPago1.setText("Agregar Producto");
        bPago1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPago1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pagoConTarjetaLayout = new javax.swing.GroupLayout(pagoConTarjeta);
        pagoConTarjeta.setLayout(pagoConTarjetaLayout);
        pagoConTarjetaLayout.setHorizontalGroup(
            pagoConTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagoConTarjetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pagoConTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pagoConTarjetaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pagoConTarjetaLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32)
                        .addComponent(bPago1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pagoConTarjetaLayout.setVerticalGroup(
            pagoConTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pagoConTarjetaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pagoConTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pagoConTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(pagoConTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bPago1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(129, 129, 129))
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

            },
            new String [] {

            }
        ));
        TablaProductos.setFocusable(false);
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProductos);

        bPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/agregar.png"))); // NOI18N
        bPago.setText("Agregar Pago");
        bPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPagoActionPerformed(evt);
            }
        });

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setText("Dinero Recibido");
        jLabel9.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lBalance))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bPago)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cValorAdquirido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cDineroRecibido)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cValorAdquirido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(bPago, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lBalance)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cDineroRecibido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pagoConTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pagoConTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cDineroRecibidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDineroRecibidoActionPerformed

    }//GEN-LAST:event_cDineroRecibidoActionPerformed

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
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
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

        }
    }//GEN-LAST:event_cDineroRecibidoKeyPressed

    private void cDineroRecibidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cDineroRecibidoKeyTyped
        // TODO add your handling code here:
        int tamano = cDineroRecibido.getText().length();
        if (tamano > 7) {
            Telegraph tele = new Telegraph("PAGO PRODUCTOS", "NO SE HA PODIDO AGREGAR ESTE PAGO \n HA SOBREPASASO EL VALOR DE LOS PAGOS", TelegraphType.NOTIFICATION_ERROR, WindowPosition.TOPRIGHT, 5000);
            TelegraphQueue q = new TelegraphQueue();
            q.add(tele);
            cDineroRecibido.setText("");
        }
    }//GEN-LAST:event_cDineroRecibidoKeyTyped

    private void bPago1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPago1ActionPerformed
         agregarInternalFrame(escritorio, new ProductosCompras(TablaProductos, cValorAdquirido, cBalance));
    }//GEN-LAST:event_bPago1ActionPerformed

    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked
        int row = TablaProductos.rowAtPoint(evt.getPoint());

        Double cuenta1 = Double.parseDouble(String.valueOf(TablaProductos.getValueAt(row, 3)));
        double cuenta = Double.parseDouble(cValorAdquirido.getText());
        double cuenta2 = cuenta - cuenta1;
        cValorAdquirido.setText(String.valueOf(cuenta2));
        recalcularDinero();
        DefaultTableModel modelo = (DefaultTableModel) TablaProductos.getModel();
        modelo.removeRow(TablaProductos.getSelectedRow());


    }//GEN-LAST:event_TablaProductosMouseClicked
    public void agregarInternalFrame(JDesktopPane desktop, JInternalFrame internal) { //esta funciÃ³n permite agregar un internal frame a un jframe rapidamente :)
        desktop.add(internal);
        Utilidades.centrarInternalFrame(internal);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton bPago;
    private javax.swing.JButton bPago1;
    private javax.swing.JTextField cBalance;
    private javax.swing.JTextField cDineroRecibido;
    private javax.swing.JTextField cValorAdquirido;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lBalance;
    private javax.swing.JPanel pagoConTarjeta;
    // End of variables declaration//GEN-END:variables

    private void guardar() {

        String dineroRecibido = cDineroRecibido.getText();

        if ("0".equals(dineroRecibido)) {
            msj.show("Registro de Cero Pesos no permitido", "Debe indicar el dinero recibido.", TelegraphType.NOTIFICATION_INFO, 3000);
            return;
        }

        int idFactura = registrarPagos();
        if (idFactura == -1) {
            return;
        }

        this.dispose();
//       ImprimirReciboProducto imprimirRecibo = new ImprimirReciboProducto(idFactura);
//        Frame.escritorio.add(imprimirRecibo);
//        imprimirRecibo.toFront();
//        imprimirRecibo.setVisible(true);
//        Utilidades.centrarInternalFrame(imprimirRecibo);
    }

    private int registrarPagos() {
        if (TablaProductos.getRowCount() != 0) {
            boolean success = true;
            Double dineroRecibido = Double.parseDouble(cDineroRecibido.getText());
            Double dineroAdquirido = Double.parseDouble(cValorAdquirido.getText());
            Double dineroRecibido1 = Double.parseDouble(cDineroRecibido.getText());
            //Aqui Generar Factura
            int facturaId = generarFactura(dineroRecibido);
            if (facturaId == -1) {
                Logger.getLogger(RegistrarPagoProductos.class.getName()).log(Level.SEVERE, "Error generado factura .. no es posible registrar Pago");
                success = false;
                return -1;
            }

            if (success) {
                if (dineroRecibido >= dineroAdquirido) {

                    dineroRecibido = dineroRecibido - dineroAdquirido;
                    msj.show("Pago exitoso", "El cambio es: " + dineroRecibido + "", TelegraphType.NOTIFICATION_DONE, 4000);
                }
                
                cDineroRecibido.setEditable(false);
                //Actualizar Valores Factura Aqui.
                registrarProductosFactura(idsDeLosProductos(), facturaId);
                actualizarValoresFactura(facturaId, dineroAdquirido,dineroRecibido1);

                msj.show("Transacción Exitosa", "Pago registrado con exito", TelegraphType.NOTIFICATION_DONE, 3000);
                return facturaId;
            } else {
                return -1;
            }
        }else{
            msj.show("Registrar Pago", "selecciona algun producto", TelegraphType.NOTIFICATION_ERROR, 3000);
            return -1;
        }

    }

    public void recalcularDinero() {
        if (!cDineroRecibido.getText().isEmpty()) {
            if (cDineroRecibido.getText().startsWith("0")) {
                if (cDineroRecibido.getText().length() == 1) {

                } else {
                    cDineroRecibido.setText(cDineroRecibido.getText().substring(1));
                }
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
                    cBalance.setText(String.valueOf((saldo) * (-1)));
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
        String querySQL;
        boolean success;

        if (!usuarioPaga) {
            msj.show("Numero Incorrecto", "Debe de digitar una Suma Correcta para poder registrar el Pago", TelegraphType.APPLICATION_WARNING, 4000);
            return -1;
        } else {
            querySQL = String.format("INSERT INTO factura_producto(usuario_sistema_id,fecha_registro,precio_total) VALUES (%s,now(),%s)", Integer.valueOf(usuario_sistema), paga);
            success = db.sqlEjec(querySQL);
            if (success) {
                return traerultimo();
            }
        }

        return id;
    }

    private void actualizarValoresFactura(int facturaId, double valor,double pago) {

        String query = String.format("UPDATE factura_producto SET precio_total = %s,pago=%s WHERE id = %s", valor,pago, facturaId);
        db.sqlEjec(query);
    }

    public int traerultimo() {
        CachedRowSet data;
        int aux = 0;
        String querySQL = String.format("select pro.id \n"
                + "from factura_producto pro, usuario_sistema us \n"
                + "where us.id=pro.usuario_sistema_id \n"
                + "order by pro.id desc limit 1;");
        data = db.sqlDatos(querySQL);
        try {
            while (data.next()) {

                aux = Integer.parseInt(data.getString("id"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aux;
    }

    public ArrayList<Integer> idsDeLosProductos() {
        ArrayList<Integer> ids = new ArrayList<>();
        for (int i = 0; i < TablaProductos.getRowCount(); i++) {
            ids.add(Integer.parseInt(String.valueOf(TablaProductos.getValueAt(i, 0)))); //La columna 3 es la de total
        }

        return ids;
    }
    
    
    
    
    public void registrarProductosFactura(ArrayList<Integer> ids,int facturaId){
        
        for (int i = 0; i < ids.size(); i++) {
            String querySQL;
            boolean success;
            querySQL = String.format("INSERT INTO facturaProductos(factura_producto_id,producto_id) VALUES (%s,%s)", facturaId, ids.get(i));
            success = db.sqlEjec(querySQL);
            if(success){
                actualizarProducto(ids.get(i));
            }
            
        }
        
        
        
    }
    
    public void actualizarProducto(int idproducto){
        
        String query = String.format("UPDATE producto SET cantidad=cantidad-1 WHERE id = %s", idproducto);
        db.sqlEjec(query);
        
    }

}
