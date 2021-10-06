
package Vista.Economia;
import Controlador.ControladorVehiculo;
import Controlador.Tablas;
import Vista.Menu.Home;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Harold7v7
 */
public class pnlRegistrarPago extends javax.swing.JPanel {
    
   
    String PlacaFija;
    String CodigoVehiculo;
    static public String CodPersonal;
    DefaultTableModel modelo;
    ControladorVehiculo Cod = new ControladorVehiculo();
    Tablas tabla = new Tablas();
    
            
    public pnlRegistrarPago() {
        initComponents();
        Home.lblTitulo.setText("REGISTRAR PAGO");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtPadron = new rojeru_san.RSMTextFull();
        txtOperador = new rojeru_san.RSMTextFull();
        rbPadron = new javax.swing.JRadioButton();
        rbOperador = new javax.swing.JRadioButton();
        btnBOperador = new rojerusan.RSButtonCircle();
        btnBuscar = new rojeru_san.RSButton();
        txtPlaca = new rojeru_san.RSMTextFull();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDeuda = new javax.swing.JTable();
        btnRegistrar = new rojeru_san.RSButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPadron.setSoloNumeros(true);
        txtPadron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPadronMouseClicked(evt);
            }
        });
        txtPadron.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPadronKeyPressed(evt);
            }
        });

        txtOperador.setEditable(false);
        txtOperador.setPlaceholder("SELECCIONE OPERADOR ---->>.");

        buttonGroup1.add(rbPadron);
        rbPadron.setSelected(true);
        rbPadron.setText("PADRON");
        rbPadron.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbPadronStateChanged(evt);
            }
        });

        buttonGroup1.add(rbOperador);
        rbOperador.setText("OPERADOR");
        rbOperador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbOperadorStateChanged(evt);
            }
        });

        btnBOperador.setText("rSButtonCircle1");
        btnBOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBOperadorActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtPlaca.setEditable(false);
        txtPlaca.setForeground(new java.awt.Color(255, 0, 0));
        txtPlaca.setPlaceholder("AAA-000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbOperador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOperador, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbPadron)
                                .addGap(18, 18, 18)
                                .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbPadron)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbOperador)
                    .addComponent(btnBOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 39, -1, -1));

        tDeuda.setAutoCreateRowSorter(true);
        tDeuda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tDeuda);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 224, 593, 170));

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPadronKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER|| evt.getKeyCode()==KeyEvent.VK_TAB){
           if(Cod.ExistePadron(txtPadron.getText())){                            
               txtPlaca.setText(Cod.Placa(txtPadron.getText()));
               Controlador.Tablas.LimpiarTabla((DefaultTableModel) tDeuda.getModel());
               modelotablaDV();
               Controlador.Tablas.llenarTablaDV((DefaultTableModel) tDeuda.getModel(),Cod.Codigo(txtPlaca.getText()));
           }else{
               JOptionPane.showMessageDialog(null,"EL PADRON NO ESTA REGISTRADO","ERROR",0);
               txtPlaca.setText("");
           }
        }
    }//GEN-LAST:event_txtPadronKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(rbOperador.isSelected()){
            modelotablaDP();
            Controlador.Tablas.llenarTablaDP((DefaultTableModel) tDeuda.getModel(),CodPersonal);
        }else{
            if(Cod.ExistePadron(txtPadron.getText())){
               
               txtOperador.setText("");
               txtPlaca.setText(Cod.Placa(txtPadron.getText()));
               modelotablaDV();
               Controlador.Tablas.LimpiarTabla((DefaultTableModel) tDeuda.getModel());               
               Controlador.Tablas.llenarTablaDV((DefaultTableModel) tDeuda.getModel(),Cod.Codigo(txtPlaca.getText()));
           }else{
               JOptionPane.showMessageDialog(null,"EL PADRON NO ESTA REGISTRADO","ERROR",0);
               txtPlaca.setText("");               
           }
        }
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBOperadorActionPerformed
        rbPadron.setSelected(false);
        rbOperador.setSelected(true);
        txtPlaca.setText("");
        txtPadron.setText("");
        Vista.Listas.ListaOperadores.opt=0;        
        new  Vista.Listas.ListaOperadores(null, true).setVisible(true);
       
    }//GEN-LAST:event_btnBOperadorActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Controlador.Pago.Registrar(rbOperador.isSelected(), (DefaultTableModel)tDeuda.getModel());
        if(rbOperador.isSelected()){
            modelotablaDP();
            Controlador.Tablas.llenarTablaDP((DefaultTableModel) tDeuda.getModel(),CodPersonal);
        }else{
            modelotablaDV();
            Controlador.Tablas.llenarTablaDV((DefaultTableModel) tDeuda.getModel(),Cod.Codigo(txtPlaca.getText()));
            
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtPadronMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPadronMouseClicked
        if(evt.getClickCount()==1){
           rbOperador.setSelected(false);
           rbPadron.setSelected(true);
           txtOperador.setText("");
        }
    }//GEN-LAST:event_txtPadronMouseClicked

    private void rbPadronStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbPadronStateChanged
        if(rbPadron.isSelected()){
            txtOperador.setText("");
        }
    }//GEN-LAST:event_rbPadronStateChanged

    private void rbOperadorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbOperadorStateChanged
        if(rbOperador.isSelected()){
            txtPlaca.setText("");
            txtPadron.setText("");
        }
    }//GEN-LAST:event_rbOperadorStateChanged
    private void modelotablaDV(){
        tDeuda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Concepto", "Monto", "fecha", "Responsable", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };
            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
            
        });
        jScrollPane1.setViewportView(tDeuda);
    }
    private void modelotablaDP(){
        tDeuda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Concepto", "Monto", "fecha", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };
            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tDeuda);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonCircle btnBOperador;
    private rojeru_san.RSButton btnBuscar;
    private rojeru_san.RSButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbOperador;
    private javax.swing.JRadioButton rbPadron;
    public static javax.swing.JTable tDeuda;
    public static rojeru_san.RSMTextFull txtOperador;
    private rojeru_san.RSMTextFull txtPadron;
    private rojeru_san.RSMTextFull txtPlaca;
    // End of variables declaration//GEN-END:variables
}
