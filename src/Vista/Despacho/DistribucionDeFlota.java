
package Vista.Despacho;


import Controlador.ControladorDeuda;
import Controlador.ControladorDistribucionFL;
import Controlador.ControladorVehiculo;
import Controlador.DatosSistema;
import Controlador.Tablas;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;



public class DistribucionDeFlota extends javax.swing.JPanel implements Runnable {

    Thread hilo;
    ControladorVehiculo CV = new ControladorVehiculo();
    ControladorDistribucionFL CDF = new ControladorDistribucionFL();
    DatosSistema DS = new DatosSistema();
    static public String CodConductor;
    static public String CodCobrador;
    String CodigoVehiculo; 
    public DistribucionDeFlota() {
        initComponents();
        hilo=new Thread(this);
        hilo.start();
        jFecha.setTextoFecha(DS.ObtenerFecha());   
        Tablas.LlenarTablaListaEspera((DefaultTableModel) tCola.getModel(), cbxLado.getSelectedItem().toString(), jFecha.getFechaSeleccionada());
    }    

        @Override
        public void run() {
            Thread current=Thread.currentThread();
            while(current==hilo){
                lblhora.setText(DS.ObtenerHora());
            }
                        
        }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCola = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tRuta = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tExcluidos = new javax.swing.JTable();
        jFecha = new rojerusan.RSDateChooser();
        cbxLado = new rojerusan.RSComboMetro();
        lblhora = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtConductor = new rojeru_san.RSMTextFull();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCobrador = new rojeru_san.RSMTextFull();
        btnBuscarCob = new rojeru_san.RSButtonRiple();
        txtPadron = new rojeru_san.RSMTextFull();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tSalidas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cbxFrecuencia = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.HOUR);
        SpHora = new javax.swing.JSpinner(sm);
        btnBuscarCon = new rojeru_san.RSButtonRiple();
        txtPlaca = new rojeru_san.RSMTextFull();
        rSButtonRiple3 = new rojeru_san.RSButtonRiple();
        btnEnviarCola = new rojeru_san.RSButtonRiple();

        jTextField1.setText("jTextField1");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tCola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "PADRON", "PLACA", "HORA", "BOLETOS", "COTIZACION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tCola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tColaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tCola);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("COLA", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tRuta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "PADRON", "H. SALIDA", "H. LLEGADA"
            }
        ));
        jScrollPane3.setViewportView(tRuta);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("RUTA", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tExcluidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "PADRON", "H. SALIDA", "H. LLEGADA"
            }
        ));
        jScrollPane4.setViewportView(tExcluidos);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("EXCLUIDOS", jPanel5);

        jFecha.setFormatoFecha("dd/MM/yyyy");

        cbxLado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "A", "B" }));
        cbxLado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbxLado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxLadoItemStateChanged(evt);
            }
        });

        lblhora.setBackground(new java.awt.Color(0, 0, 0));
        lblhora.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblhora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhora.setText("00:00:00");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtConductor.setEditable(false);

        jLabel2.setText("CONDUCTOR");

        jLabel3.setText("COBRADOR");

        txtCobrador.setEditable(false);

        btnBuscarCob.setBackground(java.awt.Color.gray);
        btnBuscarCob.setEnabled(false);
        btnBuscarCob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCobActionPerformed(evt);
            }
        });

        txtPadron.setBackground(java.awt.Color.gray);
        txtPadron.setBotonColor(new java.awt.Color(255, 0, 51));
        txtPadron.setEnabled(false);
        txtPadron.setSoloNumeros(true);
        txtPadron.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPadronKeyPressed(evt);
            }
        });

        jLabel4.setText("PADRON");

        tSalidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VUELTA", "LADO", "H.SALIDA", "H.LLEGADA"
            }
        ));
        jScrollPane2.setViewportView(tSalidas);

        jLabel5.setText("FRECUENCIA");

        cbxFrecuencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "4", "5", "6", "7", "8", "9", "10", "12", "15" }));

        jLabel6.setText("PLACA");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );

        jLabel7.setText("HORA");

        JSpinner.DateEditor de = new JSpinner.DateEditor(SpHora, "HH:mm");
        SpHora.setEditor(de);
        SpHora.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SpHora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarCon.setBackground(java.awt.Color.gray);
        btnBuscarCon.setEnabled(false);
        btnBuscarCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarConActionPerformed(evt);
            }
        });

        txtPlaca.setEditable(false);
        txtPlaca.setOpaque(false);
        txtPlaca.setPlaceholder("");
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPlacaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCobrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)
                                .addComponent(btnBuscarCob, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtConductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuscarCon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addGap(3, 3, 3)
                                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SpHora, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(28, 28, 28))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(SpHora, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscarCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCobrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnBuscarCob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        rSButtonRiple3.setText("VENTANA ADICIONAL");
        rSButtonRiple3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple3ActionPerformed(evt);
            }
        });

        btnEnviarCola.setBackground(new java.awt.Color(102, 102, 102));
        btnEnviarCola.setText("ENVIAR COLA");
        btnEnviarCola.setEnabled(false);
        btnEnviarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarColaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(cbxLado, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(rSButtonRiple3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnviarCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblhora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonRiple3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviarCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void btnBuscarCobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCobActionPerformed
        Vista.Listas.ListaCobradores.opt=3;
        new  Vista.Listas.ListaCobradores (null, true).setVisible(true);
        if(!CodCobrador.equals(null)){
            CDF.ActualizarCobradorxVehi(CodigoVehiculo, CodCobrador);
        }
        
    }//GEN-LAST:event_btnBuscarCobActionPerformed
    private void txtPadronKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER|| evt.getKeyCode()==KeyEvent.VK_TAB){
            if(CV.ExistePadron(txtPadron.getText())){
                txtPlaca.setText(CV.Placa(txtPadron.getText()));
                CodigoVehiculo =  CV.Codigo(txtPlaca.getText());
                btnBuscarCon.setEnabled(true);
                btnBuscarCon.setBackground(new java.awt.Color(0,112,192));
                btnBuscarCob.setBackground(new java.awt.Color(0,112,192));
                btnBuscarCob.setEnabled(true);
                String[] data =CDF.DatosPxV(CodigoVehiculo);
                CodConductor =data[1];
                CodCobrador = data[2];
                txtCobrador.setText(CDF.CobradorxV(CodigoVehiculo));
                txtConductor.setText(CDF.ConductorxV(CodigoVehiculo));
                btnEnviarCola.setEnabled(true);
                btnEnviarCola.setBackground(new java.awt.Color(0,112,192));
                Tablas.LimpiarTabla((DefaultTableModel) tSalidas.getModel());
                Tablas.LLenarTablaHSalida((DefaultTableModel) tSalidas.getModel(), CodigoVehiculo, jFecha.getFechaSeleccionada());
            }else{
                JOptionPane.showMessageDialog(null,"NO SE ENCONTRO EL PADRON","ERROR",0);
                vacio();
            }                
        }
    }//GEN-LAST:event_txtPadronKeyPressed
    private void txtPlacaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPlacaKeyPressed
    private void btnBuscarConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarConActionPerformed
        Vista.Listas.ListaConductores.opt=4;
        new  Vista.Listas.ListaConductores (null, true).setVisible(true);
        if(!CodConductor.equals(null)){
            CDF.ActualizarConductorxVehi(CodigoVehiculo, CodConductor);
        }
        
    }//GEN-LAST:event_btnBuscarConActionPerformed
    private void btnEnviarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarColaActionPerformed
        CDF.RegistrarLE(CodigoVehiculo, CDF.getHoraSpinner(SpHora.getValue()), cbxLado.getSelectedItem().toString(), jFecha.getFechaSeleccionada(),Integer.parseInt(cbxFrecuencia.getSelectedItem().toString()));
        Tablas.LimpiarTabla((DefaultTableModel) tCola.getModel());
        Tablas.LlenarTablaListaEspera((DefaultTableModel) tCola.getModel(), cbxLado.getSelectedItem().toString(), jFecha.getFechaSeleccionada());
        vacio();
        try {
            SpHora.setValue(CDF.HoraSumada(Integer.parseInt(cbxFrecuencia.getSelectedItem().toString()),CDF.getHoraSpinner(SpHora.getValue())));

        } catch (ParseException ex) {
            System.err.println("NO SE PUEDE OBTENER NUEVA HORA "+ex);
        }
        
    }//GEN-LAST:event_btnEnviarColaActionPerformed

    private void rSButtonRiple3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRiple3ActionPerformed

    private void cbxLadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxLadoItemStateChanged
        switch (cbxLado.getSelectedIndex()) {
            case 0:
                Tablas.LimpiarTabla((DefaultTableModel) tCola.getModel());
                txtPadron.setEnabled(false);
                txtPadron.setBackground(Color.GRAY);
                vacio();
                break;
            case 1:
                txtPadron.setEnabled(true);
                txtPadron.setBackground(new java.awt.Color(240,240,240));
                Tablas.LimpiarTabla((DefaultTableModel) tCola.getModel());
                Tablas.LlenarTablaListaEspera((DefaultTableModel) tCola.getModel(), cbxLado.getSelectedItem().toString(), jFecha.getFechaSeleccionada());
                vacio();
                break;
            case 2:
                txtPadron.setEnabled(true);
                txtPadron.setBackground(new java.awt.Color(240,240,240));
                Tablas.LimpiarTabla((DefaultTableModel) tCola.getModel());
                Tablas.LlenarTablaListaEspera((DefaultTableModel) tCola.getModel(), cbxLado.getSelectedItem().toString(), jFecha.getFechaSeleccionada());
                vacio();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cbxLadoItemStateChanged

    private void tColaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tColaMouseClicked
        if(evt.getClickCount()==2){
            int FilaSelec = tCola.getSelectedRow();
            if(FilaSelec==-1){            
            }else{
                CodigoVehiculo =  CV.Codigo(tCola.getValueAt(FilaSelec,2).toString());
                String[] data =CDF.DatosPxV(CodigoVehiculo);
                CodConductor =data[1];
                CodCobrador = data[2];
                int rspt = JOptionPane.showConfirmDialog(null,"PADRON : "+tCola.getValueAt(FilaSelec, 1).toString()+"\nCONDUCTOR : "+CDF.ConductorxV(CodigoVehiculo)
                        +"\nCOBRADOR: "+CDF.CobradorxV(CodigoVehiculo), "VERIFICACION", JOptionPane.YES_NO_OPTION);
        
                if (rspt == JOptionPane.YES_OPTION) {
                    CDF.RegistroSalida(cbxLado.getSelectedItem().toString(), tCola.getValueAt(FilaSelec, 3).toString(), CodConductor, CodCobrador, CodigoVehiculo, jFecha.getFechaSeleccionada());
                    CDF.eliminarListaEspera(CodigoVehiculo, cbxLado.getSelectedItem().toString());
                    ControladorDeuda CD = new ControladorDeuda();
                    if(tCola.getValueAt(FilaSelec, 5).toString().equals("1 vez"))
                    CD.RegistroDeudaV(CodigoVehiculo, "COTIZACION", CodConductor, 70);
                    Tablas.LimpiarTabla((DefaultTableModel) tCola.getModel());
                    Tablas.LlenarTablaListaEspera((DefaultTableModel) tCola.getModel(), cbxLado.getSelectedItem().toString(), jFecha.getFechaSeleccionada());
                    
                    
                }
                
                
            }
        }
    }//GEN-LAST:event_tColaMouseClicked
    private void vacio (){
        CodConductor =null;
        CodCobrador = null;
        CodigoVehiculo = null;
        txtPlaca.setText("");
        txtPadron.setText("");
        txtConductor.setText("");
        txtCobrador.setText("");
        txtPadron.requestFocus();
        btnBuscarCon.setEnabled(false);
        btnBuscarCob.setEnabled(false);
        CodConductor =null;
        CodCobrador = null;
        CodigoVehiculo = null;
        btnEnviarCola.setEnabled(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JSpinner SpHora;
    private rojeru_san.RSButtonRiple btnBuscarCob;
    private rojeru_san.RSButtonRiple btnBuscarCon;
    private rojeru_san.RSButtonRiple btnEnviarCola;
    private javax.swing.JComboBox<String> cbxFrecuencia;
    private rojerusan.RSComboMetro cbxLado;
    private rojerusan.RSDateChooser jFecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblhora;
    private rojeru_san.RSButtonRiple rSButtonRiple3;
    public static javax.swing.JTable tCola;
    private javax.swing.JTable tExcluidos;
    private javax.swing.JTable tRuta;
    private javax.swing.JTable tSalidas;
    public static rojeru_san.RSMTextFull txtCobrador;
    public static rojeru_san.RSMTextFull txtConductor;
    private rojeru_san.RSMTextFull txtPadron;
    private rojeru_san.RSMTextFull txtPlaca;
    // End of variables declaration//GEN-END:variables
}
