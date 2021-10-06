
package Vista.Economia;
import Controlador.ControladorDeuda;
import Modelo.Dao.DeudaDao;
import Modelo.Dao.VehiculoDao;
import Vista.Menu.Home;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Harold7v7
 */
public class pnlGenerarDeudaV extends javax.swing.JPanel {
    static public String CodigoPersonal;
    VehiculoDao VDao = new VehiculoDao();
    String PlacaFija;
    String CodigoVehiculo;
    DefaultTableModel modelo;
    DeudaDao ODeuda = new DeudaDao();
    float monto=0;
            
    public pnlGenerarDeudaV() {
        initComponents();
        Home.lblTitulo.setText("REGISTRAR DEUDA DE VEHICULO");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtPadron = new rojeru_san.RSMTextFull();
        txtOperador = new rojeru_san.RSMTextFull();
        btnBOperador = new rojerusan.RSButtonCircle();
        txtPlaca = new rojeru_san.RSMTextFull();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMonto = new rojeru_san.RSMTextFull();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrar = new rojeru_san.RSButton();
        Calendario = new rojerusan.RSCalendar();
        lblFoto = new rojerusan.RSLabelCircleImage();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPadron.setSoloNumeros(true);
        txtPadron.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPadronKeyPressed(evt);
            }
        });

        txtOperador.setEditable(false);
        txtOperador.setPlaceholder("SELECCIONE OPERADOR ---->>.");

        btnBOperador.setText("rSButtonCircle1");
        btnBOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBOperadorActionPerformed(evt);
            }
        });

        txtPlaca.setEditable(false);
        txtPlaca.setForeground(new java.awt.Color(255, 0, 0));
        txtPlaca.setPlaceholder("AAA-000");

        jLabel1.setText("PADRON");

        jLabel2.setText("RESPONSABLE");

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

        jLabel3.setText("MONTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47)
                        .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 292, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtOperador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 19, -1, 170));

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 280, 60));
        add(Calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salvador.jpg"))); // NOI18N
        lblFoto.setColorBorde(new java.awt.Color(255, 102, 0));
        add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 250, 250));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPadronKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER|| evt.getKeyCode()==KeyEvent.VK_TAB){
           if(VDao.BuscarVehiculo(txtPadron.getText())){
               PlacaFija =VDao.ObtenerPlaca(txtPadron.getText());
               CodigoVehiculo=VDao.ObtenerCodigo(PlacaFija);
               txtPlaca.setText(PlacaFija);
               
           }else{
               JOptionPane.showMessageDialog(null,"EL PADRON NO ESTA REGISTRADO","ERROR",0);
               txtPlaca.setText("");
           }
        }
    }//GEN-LAST:event_txtPadronKeyPressed

    private void btnBOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBOperadorActionPerformed
        Vista.Listas.ListaOperadores.opt=2;        
        new  Vista.Listas.ListaOperadores(null, true).setVisible(true);
       
    }//GEN-LAST:event_btnBOperadorActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        ControladorDeuda CD = new ControladorDeuda();
        if(!txtPlaca.getText().equals("")&&monto!=0&&!txtOperador.getText().equals("")){
            CD.RegistroDeudaV(CodigoVehiculo, "COTIZACION", CodigoPersonal, monto);
            txtPadron.setText("");
            txtPlaca.setText("");
            txtOperador.setText("");
            txtMonto.setText("");
            
            
        }else{
            JOptionPane.showMessageDialog(null,"LLENE TODOS LOS CAMPOS", "ERROR", 0);
        }       
           
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtMontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMontoMouseClicked
        if(evt.getClickCount()==1){
            txtMonto.setText("");
            monto=0;
        }
    }//GEN-LAST:event_txtMontoMouseClicked

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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSCalendar Calendario;
    private rojerusan.RSButtonCircle btnBOperador;
    private rojeru_san.RSButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public static rojerusan.RSLabelCircleImage lblFoto;
    private rojeru_san.RSMTextFull txtMonto;
    public static rojeru_san.RSMTextFull txtOperador;
    private rojeru_san.RSMTextFull txtPadron;
    private rojeru_san.RSMTextFull txtPlaca;
    // End of variables declaration//GEN-END:variables
}
