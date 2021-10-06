package Vista.Economia;

import Controlador.ControladorExoneracion;
import Controlador.ControladorVehiculo;
import Controlador.DatosSistema;
import Vista.Menu.Home;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class pnlRegistrarExoneracion extends javax.swing.JPanel {
    
    static public FileInputStream fis1;
    static public FileInputStream fis3;
    static public FileInputStream fis2;
    static public int lb,lb2,lb3;
    String CodVehiculo;
    boolean b1 = false, b2=false, b3=false;
    ControladorVehiculo CV = new ControladorVehiculo();
    DatosSistema DS = new DatosSistema();
    
    public pnlRegistrarExoneracion() {
        initComponents();
        Home.lblTitulo.setText("REGISTRAR SOLICITUD DE EXONERACION");
        JDate.setTextoFecha(DS.ObtenerFecha());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JDate = new rojerusan.RSDateChooser();
        txtPlaca = new rojeru_san.RSMTextFull();
        txtPadron = new rojeru_san.RSMTextFull();
        jLabel1 = new javax.swing.JLabel();
        lblFoto = new rojerusan.RSLabelImage();
        lblFoto3 = new rojerusan.RSLabelImage();
        lblFoto2 = new rojerusan.RSLabelImage();
        btnRecibo1 = new rojeru_san.RSButton();
        btnRecibo2 = new rojeru_san.RSButton();
        btnRecibo3 = new rojeru_san.RSButton();
        jPanel2 = new javax.swing.JPanel();
        btnExo = new rojeru_san.RSButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JDate.setFormatoFecha("dd/MM/yyyy");

        txtPlaca.setEditable(false);
        txtPlaca.setForeground(new java.awt.Color(255, 0, 0));
        txtPlaca.setPlaceholder("AAA-000");

        txtPadron.setSoloNumeros(true);
        txtPadron.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPadronKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("PADRON");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(JDate, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salvador.jpg"))); // NOI18N

        lblFoto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salvador.jpg"))); // NOI18N

        lblFoto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salvador.jpg"))); // NOI18N

        btnRecibo1.setText("AÑADIR RECIBO");
        btnRecibo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibo1ActionPerformed(evt);
            }
        });

        btnRecibo2.setText("AÑADIR RECIBO");
        btnRecibo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibo2ActionPerformed(evt);
            }
        });

        btnRecibo3.setText("AÑADIR RECIBO");
        btnRecibo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibo3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnExo.setBackground(new java.awt.Color(0, 102, 204));
        btnExo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnExo.setText("EXONERAR PAGO");
        btnExo.setColorHover(new java.awt.Color(255, 0, 0));
        btnExo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnExo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFoto3, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnRecibo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188)
                        .addComponent(btnRecibo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(btnRecibo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(lblFoto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFoto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecibo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecibo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecibo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecibo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibo1ActionPerformed
        String url = Controlador.ControladorExoneracion.Factura(fis1,lb,1);
        if (url.equals("")){
            Image imagen = new ImageIcon(getClass().getResource("/Imagenes/Salvador.jpg")).getImage();
            lblFoto.setIcon(new ImageIcon(imagen));
        }else{
            rsscalelabel.RSScaleLabel.setScaleLabel(lblFoto,url);
            b1 = true;
        }
    }//GEN-LAST:event_btnRecibo1ActionPerformed

    private void btnExoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExoActionPerformed
        ControladorExoneracion Ex = new ControladorExoneracion();
        
        int codigoexo = Ex.RegistrarSolcitudEP(CodVehiculo, DS.ObtenerFecha());
        if(codigoexo != 0){
            if(b1){
                Ex.AñadirRecibos(codigoexo, fis1, lb);
            }if (b2){
                Ex.AñadirRecibos(codigoexo, fis2, lb2);
            }if (b3){
                Ex.AñadirRecibos(codigoexo, fis3, lb3);
            }
        }
        b1=false;
        b2=false;
        b3=false;
        Image imagen = new ImageIcon(getClass().getResource("/Imagenes/Salvador.jpg")).getImage();
        lblFoto.setIcon(new ImageIcon(imagen));
        lblFoto2.setIcon(new ImageIcon(imagen));
        lblFoto3.setIcon(new ImageIcon(imagen));        
    }//GEN-LAST:event_btnExoActionPerformed

    private void txtPadronKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER|| evt.getKeyCode()==KeyEvent.VK_TAB){           
           if(CV.ExistePadron(txtPadron.getText())){               
               txtPlaca.setText(CV.Placa(txtPadron.getText()));
               CodVehiculo=CV.Codigo(txtPlaca.getText());
           }else{
               JOptionPane.showMessageDialog(null,"EL PADRON NO ESTA REGISTRADO","ERROR",0);
               txtPlaca.setText("");
           }
        }
    }//GEN-LAST:event_txtPadronKeyPressed

    private void btnRecibo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibo2ActionPerformed
        String url = Controlador.ControladorExoneracion.Factura(fis2,lb2,2);
        if (url.equals("")){
            Image imagen = new ImageIcon(getClass().getResource("/Imagenes/Salvador.jpg")).getImage();
            lblFoto2.setIcon(new ImageIcon(imagen));
        }else{
            rsscalelabel.RSScaleLabel.setScaleLabel(lblFoto2,url);
            b2 = true;
        }
    }//GEN-LAST:event_btnRecibo2ActionPerformed

    private void btnRecibo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibo3ActionPerformed
        String url = Controlador.ControladorExoneracion.Factura(fis3,lb3,3);
        if (url.equals("")){
            Image imagen = new ImageIcon(getClass().getResource("/Imagenes/Salvador.jpg")).getImage();
            lblFoto3.setIcon(new ImageIcon(imagen));
        }else{
            rsscalelabel.RSScaleLabel.setScaleLabel(lblFoto3,url);
            b3 = true;
        }
    }//GEN-LAST:event_btnRecibo3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSDateChooser JDate;
    private rojeru_san.RSButton btnExo;
    private rojeru_san.RSButton btnRecibo1;
    private rojeru_san.RSButton btnRecibo2;
    private rojeru_san.RSButton btnRecibo3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojerusan.RSLabelImage lblFoto;
    private rojerusan.RSLabelImage lblFoto2;
    private rojerusan.RSLabelImage lblFoto3;
    private rojeru_san.RSMTextFull txtPadron;
    private rojeru_san.RSMTextFull txtPlaca;
    // End of variables declaration//GEN-END:variables
}
