/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import logica.DB;
import logica.Utilidades;
import puerta.Puerta;

/**
 *
 * @author gaso
 */
public class ListadoSocios extends javax.swing.JInternalFrame {

    private final String busqueda;
    private DB db = new DB();
    private final Frame Ventana;
    private Utilidades utils = new Utilidades();
    Puerta arduino;

    /**
     * Creates new form ListadoSocios
     *
     * @param busqueda
     * @param Ventana
     */
    public ListadoSocios(String busqueda, Frame Ventana) {
        initComponents();
        this.busqueda = busqueda;
        this.Ventana = Ventana;
        configurarListado(busqueda, false);
        arduino = Ventana.pp;
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
        checkInactivos = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSocios = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista Socios Sistema");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Listado Socios");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/registradora.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Para ver detalladamente la informacion de un socio , presiona doble clic sobre el registro");

        checkInactivos.setBackground(new java.awt.Color(255, 255, 255));
        checkInactivos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkInactivos.setText("Ver Socios Inactivos");
        checkInactivos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkInactivosItemStateChanged(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkInactivos))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(checkInactivos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(83, 83, 83))
        );

        tablaSocios.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSociosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaSocios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkInactivosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkInactivosItemStateChanged
        configurarListado(busqueda, checkInactivos.isSelected());
    }//GEN-LAST:event_checkInactivosItemStateChanged

    private void tablaSociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSociosMouseClicked
        //FIX -> Abrir con doble click
        if (evt.getClickCount() == 1) {
            int row = tablaSocios.rowAtPoint(evt.getPoint());
            System.out.println("Id del socio seleccionado: " + tablaSocios.getValueAt(row, 0));
            int id = Integer.valueOf(tablaSocios.getValueAt(row, 0).toString());
            this.dispose();
            try {
                Ventana.agregarInternalFrame(new VerSocio(arduino, id));
            } catch (SQLException | ParseException ex) {
                Logger.getLogger(ListadoSocios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_tablaSociosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkInactivos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaSocios;
    // End of variables declaration//GEN-END:variables

    private void configurarListado(String busqueda, Boolean inactivos) {
        try {

            CachedRowSet data;
            DefaultTableModel dtmEjemplo = new DefaultTableModel(null, new String[]{"Cod.", "Clave", "Socio", "Telefono", "Estado"});

            data = utils.buscarSocios(busqueda, inactivos);
            tablaSocios = logica.Utilidades.llenarTabla(data.createCopy(), dtmEjemplo, tablaSocios);
            tablaSocios.getColumnModel().getColumn(0).setMinWidth(0);
            tablaSocios.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
            TableColumnModel columnModel = tablaSocios.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(2);
            columnModel.getColumn(1).setPreferredWidth(2);
            columnModel.getColumn(2).setPreferredWidth(200);
            columnModel.getColumn(3).setPreferredWidth(50);
        } catch (SQLException ex) {
            Logger.getLogger(ListadoSocios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
