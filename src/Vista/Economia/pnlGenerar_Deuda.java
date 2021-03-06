
package Vista.Economia;

import Controlador.ControladorDeuda;
import Controlador.DatosSistema;
import Modelo.Dao.DeudaDao;
import Vista.Menu.Home;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class pnlGenerar_Deuda extends javax.swing.JPanel {

    /**
     *
     */
    static public String CodigoPersonal;
    DeudaDao DD = new DeudaDao();
    float monto=0;
    
    public pnlGenerar_Deuda() {
        initComponents();
        Home.lblTitulo.setText("REGISTRAR DEUDA AL PERSONAL");
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
        txtOperador = new rojeru_san.RSMTextFull();
        btnBOperador = new rojerusan.RSButtonCircle();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMonto = new rojeru_san.RSMTextFull();
        cbxConcepto = new rojerusan.RSComboMetro();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrar = new rojeru_san.RSButton();
        lblFoto = new rojerusan.RSLabelCircleImage();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtOperador.setEditable(false);
        txtOperador.setPlaceholder("SELECCIONE OPERADOR ---->>.");

        btnBOperador.setText("rSButtonCircle1");
        btnBOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBOperadorActionPerformed(evt);
            }
        });

        jLabel1.setText("OPERADOR");

        jLabel2.setText("MONTO");

        txtMonto.setPlaceholder("S/.00.00");
        txtMonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMontoMouseClicked(evt);
            }
        });
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMontoKeyPressed(evt);
            }
        });

        cbxConcepto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MULTA", "CURSO" }));

        jLabel3.setText("CONCEPTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtOperador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(cbxConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salvador.jpg"))); // NOI18N
        lblFoto.setColorBorde(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBOperadorActionPerformed
        Vista.Listas.ListaOperadores.opt=1;
        new  Vista.Listas.ListaOperadores(null, true).setVisible(true);
        
        

    }//GEN-LAST:event_btnBOperadorActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(!txtOperador.getText().equals("") && monto!=0){
            ControladorDeuda CD = new ControladorDeuda();
            DatosSistema DS = new DatosSistema();
            CD.RegistroDeudaP(cbxConcepto.getSelectedItem().toString() ,CodigoPersonal,monto,DS.ObtenerFecha());

            JOptionPane.showMessageDialog(null,"DEUDA GENERADA", "NOTIFICACION", 1);
            txtOperador.setText("");
            txtMonto.setText("");
            monto=0;
            Image imagen = new ImageIcon(getClass().getResource("/Imagenes/Salvador.jpg")).getImage();
            lblFoto.setIcon(new ImageIcon(imagen));
        }else{
            JOptionPane.showMessageDialog(null,"LLENE TODOS LOS CAMPOS", "ERROR", 0);
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtMontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER|| evt.getKeyCode()==KeyEvent.VK_TAB){
        monto = Float.parseFloat(txtMonto.getText());
        txtMonto.setText("S/."+monto+"0");
        }
        if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE){
            txtMonto.setText("");
            monto=0;
        }
    }//GEN-LAST:event_txtMontoKeyPressed

    private void txtMontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMontoMouseClicked
        if(evt.getClickCount()==1){
            txtMonto.setText("");
            monto=0;
        }
    }//GEN-LAST:event_txtMontoMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonCircle btnBOperador;
    private rojeru_san.RSButton btnRegistrar;
    private rojerusan.RSComboMetro cbxConcepto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public static rojerusan.RSLabelCircleImage lblFoto;
    private rojeru_san.RSMTextFull txtMonto;
    public static rojeru_san.RSMTextFull txtOperador;
    // End of variables declaration//GEN-END:variables
}
