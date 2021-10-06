
package Vista.Economia;

import Controlador.ControladorDeuda;
import Controlador.ControladorExoneracion;
import Controlador.DatosSistema;
import Controlador.Tablas;
import Vista.Menu.Home;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class pnlListaExoPV extends javax.swing.JPanel {

    
    ControladorExoneracion CE = new ControladorExoneracion();
    DatosSistema DS = new DatosSistema();
    ControladorDeuda CD = new ControladorDeuda();

    private String CodigoE;
    public pnlListaExoPV() {
        initComponents();
        Home.lblTitulo.setText("EVALUACION DE SOLICITUD DE EXONERACIONES");      
        jDate.setTextoFecha(DS.ObtenerFecha());        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tExoneracion = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tRecibos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        rSButton1 = new rojeru_san.RSButton();
        jDate = new rojerusan.RSDateChooser();
        btnAprobar = new rojeru_san.RSButton();
        btnRechazar = new rojeru_san.RSButton();
        jPanel2 = new javax.swing.JPanel();
        lblFoto = new rojerusan.RSLabelImage();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tExoneracion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "PADRON", "MONTO", "FECHA SOLICITUD", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tExoneracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tExoneracionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tExoneracionMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tExoneracion);

        tRecibos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUMERO DE RECIBO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tRecibos.setSelectionBackground(new java.awt.Color(255, 0, 0));
        tRecibos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tRecibosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tRecibosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tRecibos);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rSButton1.setText("BUSCAR");
        rSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton1ActionPerformed(evt);
            }
        });

        jDate.setFormatoFecha("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(rSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        btnAprobar.setText("APROBAR");
        btnAprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprobarActionPerformed(evt);
            }
        });

        btnRechazar.setText("RECHAZAR");
        btnRechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechazarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnAprobar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRechazar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAprobar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRechazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/construirxd.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprobarActionPerformed
        CE.ActualizarEstadoSolicitud(Integer.parseInt(CodigoE), 1);
        CD.ActualizarDeuda(CodigoE);
        Tablas.LimpiarTabla((DefaultTableModel) tExoneracion.getModel());
        Tablas.LLenarTablaSolicitudExo((DefaultTableModel) tExoneracion.getModel(), jDate.getFechaSeleccionada());
        Image imagen = new ImageIcon(getClass().getResource("/Imagenes/Salvador.jpg")).getImage();
        lblFoto.setIcon(new ImageIcon(imagen));
        
        
    }//GEN-LAST:event_btnAprobarActionPerformed

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed
        Tablas.LimpiarTabla((DefaultTableModel) tExoneracion.getModel());
        Tablas.LLenarTablaSolicitudExo((DefaultTableModel) tExoneracion.getModel(), jDate.getFechaSeleccionada());
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void tExoneracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tExoneracionMouseClicked
        
    }//GEN-LAST:event_tExoneracionMouseClicked

    private void tExoneracionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tExoneracionMousePressed
        int FilaSelec = tExoneracion.getSelectedRow();
        if(FilaSelec==-1){            
        }else{
            CodigoE=tExoneracion.getValueAt(FilaSelec, 0).toString();
            Tablas.LimpiarTabla((DefaultTableModel) tRecibos.getModel());
            Tablas.LLenarTablaRecibo((DefaultTableModel) tRecibos.getModel(), CodigoE);
        }
    }//GEN-LAST:event_tExoneracionMousePressed

    private void btnRechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechazarActionPerformed
        CE.ActualizarEstadoSolicitud(Integer.parseInt(CodigoE), 2);
        Tablas.LimpiarTabla((DefaultTableModel) tExoneracion.getModel());
        Tablas.LLenarTablaSolicitudExo((DefaultTableModel) tExoneracion.getModel(), jDate.getFechaSeleccionada());
        Image imagen = new ImageIcon(getClass().getResource("/Imagenes/Salvador.jpg")).getImage();
        lblFoto.setIcon(new ImageIcon(imagen));
    }//GEN-LAST:event_btnRechazarActionPerformed

    private void tRecibosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tRecibosMouseClicked
        int FilaSelec = tRecibos.getSelectedRow();
        if(FilaSelec==-1){            
        }else{
            Image factura = CE.enviarFactura(Integer.parseInt(tRecibos.getValueAt(FilaSelec, 0).toString()));
            lblFoto.setIcon(new ImageIcon(factura));
        }
    }//GEN-LAST:event_tRecibosMouseClicked

    private void tRecibosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tRecibosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tRecibosMousePressed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btnAprobar;
    private rojeru_san.RSButton btnRechazar;
    private rojerusan.RSDateChooser jDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private rojerusan.RSLabelImage lblFoto;
    private rojeru_san.RSButton rSButton1;
    public static javax.swing.JTable tExoneracion;
    public static javax.swing.JTable tRecibos;
    // End of variables declaration//GEN-END:variables
}
