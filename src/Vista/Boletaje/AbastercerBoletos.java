
package Vista.Boletaje;

import Controlador.ControladorDistibucionBol;
import Controlador.ControladorEnviarDatos;
import Controlador.DatosSistema;
import Controlador.Tablas;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class AbastercerBoletos extends javax.swing.JDialog {
    
    static public String CodigoResponsable,CodVehiculo;
    ControladorDistibucionBol CDB = new ControladorDistibucionBol();

    
    public AbastercerBoletos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        String[] data = CDB.Informacion(CodVehiculo);
        if(data!=null){
            CodigoResponsable = data[0];
            txtOperador.setText(data[1]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtOperador = new rojeru_san.RSMTextFull();
        btnBOperador = new rojerusan.RSButtonCircle();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtb4_1 = new javax.swing.JTextField();
        txtb4_2 = new javax.swing.JTextField();
        txtb4_3 = new javax.swing.JTextField();
        txtb4_4 = new javax.swing.JTextField();
        txtb4_5 = new javax.swing.JTextField();
        txtb35_5 = new javax.swing.JTextField();
        txtb35_4 = new javax.swing.JTextField();
        txtb35_3 = new javax.swing.JTextField();
        txtb35_2 = new javax.swing.JTextField();
        txtb35_1 = new javax.swing.JTextField();
        txtb3_5 = new javax.swing.JTextField();
        txtb3_4 = new javax.swing.JTextField();
        txtb3_3 = new javax.swing.JTextField();
        txtb3_2 = new javax.swing.JTextField();
        txtb3_1 = new javax.swing.JTextField();
        txtb25_5 = new javax.swing.JTextField();
        txtb25_4 = new javax.swing.JTextField();
        txtb25_3 = new javax.swing.JTextField();
        txtb25_2 = new javax.swing.JTextField();
        txtb25_1 = new javax.swing.JTextField();
        txtb2_5 = new javax.swing.JTextField();
        txtb2_4 = new javax.swing.JTextField();
        txtb2_3 = new javax.swing.JTextField();
        txtb2_2 = new javax.swing.JTextField();
        txtb2_1 = new javax.swing.JTextField();
        txtb15_5 = new javax.swing.JTextField();
        txtb15_4 = new javax.swing.JTextField();
        txtb15_3 = new javax.swing.JTextField();
        txtb15_2 = new javax.swing.JTextField();
        txtb15_1 = new javax.swing.JTextField();
        txtb12_5 = new javax.swing.JTextField();
        txtb12_4 = new javax.swing.JTextField();
        txtb12_3 = new javax.swing.JTextField();
        txtb12_2 = new javax.swing.JTextField();
        txtb12_1 = new javax.swing.JTextField();
        txtb1_5 = new javax.swing.JTextField();
        txtb1_4 = new javax.swing.JTextField();
        txtb1_3 = new javax.swing.JTextField();
        txtb1_2 = new javax.swing.JTextField();
        txtb1_1 = new javax.swing.JTextField();
        txtb7_5 = new javax.swing.JTextField();
        txtb7_4 = new javax.swing.JTextField();
        txtb7_3 = new javax.swing.JTextField();
        txtb7_2 = new javax.swing.JTextField();
        txtb7_1 = new javax.swing.JTextField();
        txtb5_5 = new javax.swing.JTextField();
        txtb5_4 = new javax.swing.JTextField();
        txtb5_3 = new javax.swing.JTextField();
        txtb5_2 = new javax.swing.JTextField();
        txtb5_1 = new javax.swing.JTextField();
        cbx5 = new javax.swing.JCheckBox();
        cbx4 = new javax.swing.JCheckBox();
        cbx3 = new javax.swing.JCheckBox();
        cbx25 = new javax.swing.JCheckBox();
        cbx2 = new javax.swing.JCheckBox();
        cbx15 = new javax.swing.JCheckBox();
        cbx12 = new javax.swing.JCheckBox();
        cbx1 = new javax.swing.JCheckBox();
        cbx70 = new javax.swing.JCheckBox();
        cbx50 = new javax.swing.JCheckBox();
        btn250 = new javax.swing.JButton();
        btn200 = new javax.swing.JButton();
        btn150 = new javax.swing.JButton();
        btn120 = new javax.swing.JButton();
        btn100 = new javax.swing.JButton();
        btn70 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        rSButton1 = new rojeru_san.RSButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("OPERADOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtOperador, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtb4_1.setEnabled(false);
        txtb4_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb4_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb4_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 99, 70, -1));

        txtb4_2.setEnabled(false);
        txtb4_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb4_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb4_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 134, 70, -1));

        txtb4_3.setEnabled(false);
        txtb4_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb4_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb4_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 169, 70, -1));

        txtb4_4.setEnabled(false);
        txtb4_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb4_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb4_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 204, 70, -1));

        txtb4_5.setEnabled(false);
        txtb4_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb4_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb4_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 239, 70, -1));

        txtb35_5.setEnabled(false);
        txtb35_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb35_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb35_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 239, 70, -1));

        txtb35_4.setEnabled(false);
        txtb35_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb35_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb35_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 204, 70, -1));

        txtb35_3.setEnabled(false);
        txtb35_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb35_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb35_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 169, 70, -1));

        txtb35_2.setEnabled(false);
        txtb35_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb35_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb35_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 134, 70, -1));

        txtb35_1.setEnabled(false);
        txtb35_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb35_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb35_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 99, 70, -1));

        txtb3_5.setBackground(new java.awt.Color(255, 204, 51));
        txtb3_5.setEnabled(false);
        txtb3_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb3_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb3_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 239, 70, -1));

        txtb3_4.setBackground(new java.awt.Color(255, 204, 51));
        txtb3_4.setEnabled(false);
        txtb3_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb3_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb3_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 204, 70, -1));

        txtb3_3.setBackground(new java.awt.Color(255, 204, 51));
        txtb3_3.setEnabled(false);
        txtb3_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb3_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb3_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 169, 70, -1));

        txtb3_2.setBackground(new java.awt.Color(255, 204, 51));
        txtb3_2.setEnabled(false);
        txtb3_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb3_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb3_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 134, 70, -1));

        txtb3_1.setBackground(new java.awt.Color(255, 204, 51));
        txtb3_1.setEnabled(false);
        txtb3_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb3_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 99, 70, -1));

        txtb25_5.setEnabled(false);
        txtb25_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb25_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb25_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 239, 70, -1));

        txtb25_4.setEnabled(false);
        txtb25_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb25_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb25_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 204, 70, -1));

        txtb25_3.setEnabled(false);
        txtb25_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb25_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb25_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 169, 70, -1));

        txtb25_2.setEnabled(false);
        txtb25_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb25_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb25_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 134, 70, -1));

        txtb25_1.setEnabled(false);
        txtb25_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb25_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb25_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 99, 70, -1));

        txtb2_5.setForeground(new java.awt.Color(255, 255, 255));
        txtb2_5.setEnabled(false);
        txtb2_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb2_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb2_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 239, 70, -1));

        txtb2_4.setForeground(new java.awt.Color(255, 255, 255));
        txtb2_4.setEnabled(false);
        txtb2_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb2_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb2_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 204, 70, -1));

        txtb2_3.setForeground(new java.awt.Color(255, 255, 255));
        txtb2_3.setEnabled(false);
        txtb2_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb2_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb2_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 169, 70, -1));

        txtb2_2.setForeground(new java.awt.Color(255, 255, 255));
        txtb2_2.setEnabled(false);
        txtb2_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb2_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 134, 70, -1));

        txtb2_1.setForeground(new java.awt.Color(255, 255, 255));
        txtb2_1.setEnabled(false);
        txtb2_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb2_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb2_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 99, 70, -1));

        txtb15_5.setEnabled(false);
        txtb15_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb15_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb15_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 239, 70, -1));

        txtb15_4.setEnabled(false);
        txtb15_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb15_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb15_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 204, 70, -1));

        txtb15_3.setEnabled(false);
        txtb15_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb15_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb15_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 169, 70, -1));

        txtb15_2.setEnabled(false);
        txtb15_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb15_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb15_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 134, 70, -1));

        txtb15_1.setEnabled(false);
        txtb15_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb15_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb15_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 99, 70, -1));

        txtb12_5.setEnabled(false);
        txtb12_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb12_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb12_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 239, 70, -1));

        txtb12_4.setEnabled(false);
        txtb12_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb12_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb12_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 204, 70, -1));

        txtb12_3.setEnabled(false);
        txtb12_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb12_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb12_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 169, 70, -1));

        txtb12_2.setEnabled(false);
        txtb12_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb12_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb12_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 134, 70, -1));

        txtb12_1.setEnabled(false);
        txtb12_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb12_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb12_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 99, 70, -1));

        txtb1_5.setBackground(new java.awt.Color(240, 240, 240));
        txtb1_5.setEnabled(false);
        txtb1_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb1_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb1_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 239, 70, -1));

        txtb1_4.setBackground(new java.awt.Color(240, 240, 240));
        txtb1_4.setEnabled(false);
        txtb1_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb1_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 204, 70, -1));

        txtb1_3.setBackground(new java.awt.Color(240, 240, 240));
        txtb1_3.setEnabled(false);
        txtb1_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtb1_3KeyReleased(evt);
            }
        });
        jPanel2.add(txtb1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 169, 70, -1));

        txtb1_2.setBackground(new java.awt.Color(240, 240, 240));
        txtb1_2.setEnabled(false);
        txtb1_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb1_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 134, 70, -1));

        txtb1_1.setBackground(new java.awt.Color(240, 240, 240));
        txtb1_1.setEnabled(false);
        txtb1_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb1_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 99, 70, -1));

        txtb7_5.setBackground(new java.awt.Color(255, 255, 153));
        txtb7_5.setEnabled(false);
        txtb7_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb7_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb7_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 239, 70, -1));

        txtb7_4.setBackground(new java.awt.Color(255, 255, 153));
        txtb7_4.setEnabled(false);
        txtb7_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb7_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb7_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 204, 70, -1));

        txtb7_3.setBackground(new java.awt.Color(255, 255, 153));
        txtb7_3.setEnabled(false);
        txtb7_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb7_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb7_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 169, 70, -1));

        txtb7_2.setBackground(new java.awt.Color(255, 255, 153));
        txtb7_2.setEnabled(false);
        txtb7_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb7_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb7_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 134, 70, -1));

        txtb7_1.setBackground(new java.awt.Color(255, 255, 153));
        txtb7_1.setEnabled(false);
        txtb7_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb7_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb7_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 99, 70, -1));

        txtb5_5.setEnabled(false);
        txtb5_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb5_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb5_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 239, 70, -1));

        txtb5_4.setEnabled(false);
        txtb5_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb5_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb5_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 204, 70, -1));

        txtb5_3.setEnabled(false);
        txtb5_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb5_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb5_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 169, 70, -1));

        txtb5_2.setEnabled(false);
        txtb5_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb5_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb5_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 134, 70, -1));

        txtb5_1.setEnabled(false);
        txtb5_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb5_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb5_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 99, 70, -1));

        cbx5.setText("5.00");
        cbx5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbx5StateChanged(evt);
            }
        });
        cbx5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx5ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 31, -1, -1));

        cbx4.setText("4.00");
        cbx4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx4ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx4, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 31, -1, -1));

        cbx3.setText("3.00");
        cbx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx3ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        cbx25.setText("2.50");
        cbx25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx25ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        cbx2.setText("2.00");
        cbx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx2ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        cbx15.setText("1.50");
        cbx15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx15ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        cbx12.setText("1.20");
        cbx12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx12ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        cbx1.setText("1.00");
        cbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx1ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        cbx70.setText("0.70");
        cbx70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx70ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx70, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        cbx50.setText("0.50");
        cbx50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx50ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx50, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, -1));

        btn250.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn250ActionPerformed(evt);
            }
        });
        jPanel2.add(btn250, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 30, 18));

        btn200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn200ActionPerformed(evt);
            }
        });
        jPanel2.add(btn200, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 30, 18));

        btn150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn150ActionPerformed(evt);
            }
        });
        jPanel2.add(btn150, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 30, 18));

        btn120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn120ActionPerformed(evt);
            }
        });
        jPanel2.add(btn120, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 30, 18));

        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });
        jPanel2.add(btn100, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 30, 18));

        btn70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn70ActionPerformed(evt);
            }
        });
        jPanel2.add(btn70, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 30, 18));

        btn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50ActionPerformed(evt);
            }
        });
        jPanel2.add(btn50, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 30, 18));

        rSButton1.setText("ABASTECER");
        rSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtb4_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb4_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }else{

        }if(txtb4_1.getText().length()>5){
            evt.consume();}
    }//GEN-LAST:event_txtb4_1KeyTyped

    private void txtb4_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb4_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb4_2.getText().length()>5){
            evt.consume();}
    }//GEN-LAST:event_txtb4_2KeyTyped

    private void txtb4_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb4_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb4_3.getText().length()>5){
            evt.consume();}
    }//GEN-LAST:event_txtb4_3KeyTyped

    private void txtb4_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb4_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb4_4.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb4_4KeyTyped

    private void txtb4_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb4_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb4_5.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb4_5KeyTyped

    private void txtb35_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb35_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb35_5.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb35_5KeyTyped

    private void txtb35_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb35_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb35_4.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb35_4KeyTyped

    private void txtb35_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb35_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb35_3.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb35_3KeyTyped

    private void txtb35_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb35_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb35_2.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb35_2KeyTyped

    private void txtb35_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb35_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb35_1.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb35_1KeyTyped

    private void txtb3_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb3_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb3_5.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb3_5KeyTyped

    private void txtb3_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb3_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb3_4.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb3_4KeyTyped

    private void txtb3_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb3_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb3_3.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb3_3KeyTyped

    private void txtb3_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb3_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb3_2.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb3_2KeyTyped

    private void txtb3_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb3_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb3_1.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb3_1KeyTyped

    private void txtb25_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb25_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb25_5.getText().length()>5){
            evt.consume();}
    }//GEN-LAST:event_txtb25_5KeyTyped

    private void txtb25_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb25_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb25_4.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb25_4KeyTyped

    private void txtb25_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb25_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb25_3.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb25_3KeyTyped

    private void txtb25_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb25_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb25_2.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb25_2KeyTyped

    private void txtb25_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb25_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb25_1.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb25_1KeyTyped

    private void txtb2_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb2_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb2_5.getText().length()>5){
            evt.consume();}
    }//GEN-LAST:event_txtb2_5KeyTyped

    private void txtb2_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb2_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb2_4.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb2_4KeyTyped

    private void txtb2_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb2_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb2_3.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb2_3KeyTyped

    private void txtb2_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb2_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb2_2.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb2_2KeyTyped

    private void txtb2_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb2_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb2_1.getText().length()>5){
            evt.consume();}
    }//GEN-LAST:event_txtb2_1KeyTyped

    private void txtb15_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb15_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb15_5.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb15_5KeyTyped

    private void txtb15_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb15_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb15_4.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb15_4KeyTyped

    private void txtb15_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb15_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb15_3.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb15_3KeyTyped

    private void txtb15_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb15_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb15_2.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb15_2KeyTyped

    private void txtb15_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb15_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb15_1.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb15_1KeyTyped

    private void txtb12_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb12_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb12_5.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb12_5KeyTyped

    private void txtb12_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb12_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb12_4.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb12_4KeyTyped

    private void txtb12_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb12_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb12_3.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb12_3KeyTyped

    private void txtb12_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb12_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb12_2.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb12_2KeyTyped

    private void txtb12_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb12_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb12_1.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb12_1KeyTyped

    private void txtb1_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb1_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb1_5.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb1_5KeyTyped

    private void txtb1_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb1_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb1_4.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb1_4KeyTyped

    private void txtb1_3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb1_3KeyReleased
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb1_3.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb1_3KeyReleased

    private void txtb1_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb1_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb1_2.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb1_2KeyTyped

    private void txtb1_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb1_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb1_1.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb1_1KeyTyped

    private void txtb7_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb7_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb7_5.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb7_5KeyTyped

    private void txtb7_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb7_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb7_4.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb7_4KeyTyped

    private void txtb7_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb7_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb7_3.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb7_3KeyTyped

    private void txtb7_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb7_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb7_2.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb7_2KeyTyped

    private void txtb7_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb7_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb7_1.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb7_1KeyTyped

    private void txtb5_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb5_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb5_5.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb5_5KeyTyped

    private void txtb5_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb5_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb5_4.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb5_4KeyTyped

    private void txtb5_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb5_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb5_3.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb5_3KeyTyped

    private void txtb5_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb5_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb5_2.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb5_2KeyTyped

    private void txtb5_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb5_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();

        }else{

        }if(txtb5_1.getText().length()>5){
            evt.consume();}
    }//GEN-LAST:event_txtb5_1KeyTyped

    private void cbx5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbx5StateChanged

    }//GEN-LAST:event_cbx5StateChanged

    private void cbx5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx5ActionPerformed

        if(cbx5.isSelected()){
            txtb4_1.setEnabled(true);
            txtb4_2.setEnabled(true);
            txtb4_3.setEnabled(true);
            txtb4_4.setEnabled(true);
            txtb4_5.setEnabled(true);
        }else{
            txtb4_1.setEnabled(false);
            txtb4_2.setEnabled(false);
            txtb4_3.setEnabled(false);
            txtb4_4.setEnabled(false);
            txtb4_5.setEnabled(false);
        }

    }//GEN-LAST:event_cbx5ActionPerformed

    private void cbx4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx4ActionPerformed
        if(cbx4.isSelected()){
            txtb35_1.setEnabled(true);
            txtb35_2.setEnabled(true);
            txtb35_3.setEnabled(true);
            txtb35_4.setEnabled(true);
            txtb35_5.setEnabled(true);
        }else{
            txtb35_1.setEnabled(false);
            txtb35_2.setEnabled(false);
            txtb35_3.setEnabled(false);
            txtb35_4.setEnabled(false);
            txtb35_5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx4ActionPerformed

    private void cbx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx3ActionPerformed
        if(cbx3.isSelected()){
            txtb3_1.setEnabled(true);
            txtb3_2.setEnabled(true);
            txtb3_3.setEnabled(true);
            txtb3_4.setEnabled(true);
            txtb3_5.setEnabled(true);
        }else{
            txtb3_1.setEnabled(false);
            txtb3_2.setEnabled(false);
            txtb3_3.setEnabled(false);
            txtb3_4.setEnabled(false);
            txtb3_5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx3ActionPerformed

    private void cbx25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx25ActionPerformed
        if(cbx25.isSelected()){
            txtb25_1.setEnabled(true);
            txtb25_2.setEnabled(true);
            txtb25_3.setEnabled(true);
            txtb25_4.setEnabled(true);
            txtb25_5.setEnabled(true);

            txtb25_1.setBackground(new java.awt.Color(193, 139, 123));
            txtb25_2.setBackground(new java.awt.Color(193, 139, 123));
            txtb25_3.setBackground(new java.awt.Color(193, 139, 123));
            txtb25_4.setBackground(new java.awt.Color(193, 139, 123));
            txtb25_5.setBackground(new java.awt.Color(193, 139, 123));
        }else{
            txtb25_1.setEnabled(false);
            txtb25_2.setEnabled(false);
            txtb25_3.setEnabled(false);
            txtb25_4.setEnabled(false);
            txtb25_5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx25ActionPerformed

    private void cbx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx2ActionPerformed
        if(cbx2.isSelected()){
            txtb2_1.setEnabled(true);
            txtb2_2.setEnabled(true);
            txtb2_3.setEnabled(true);
            txtb2_4.setEnabled(true);
            txtb2_5.setEnabled(true);

            txtb2_1.setBackground(new java.awt.Color(132, 132, 135));
            txtb2_2.setBackground(new java.awt.Color(132, 132, 135));
            txtb2_3.setBackground(new java.awt.Color(132, 132, 135));
            txtb2_4.setBackground(new java.awt.Color(132, 132, 135));
            txtb2_5.setBackground(new java.awt.Color(132, 132, 135));

        }else{
            txtb2_1.setEnabled(false);
            txtb2_2.setEnabled(false);
            txtb2_3.setEnabled(false);
            txtb2_4.setEnabled(false);
            txtb2_5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx2ActionPerformed

    private void cbx15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx15ActionPerformed
        if(cbx15.isSelected()){
            txtb15_1.setEnabled(true);
            txtb15_2.setEnabled(true);
            txtb15_3.setEnabled(true);
            txtb15_4.setEnabled(true);
            txtb15_5.setEnabled(true);

            txtb15_1.setBackground(new java.awt.Color(127, 144, 249));
            txtb15_2.setBackground(new java.awt.Color(127, 144, 249));
            txtb15_3.setBackground(new java.awt.Color(127, 144, 249));
            txtb15_4.setBackground(new java.awt.Color(127, 144, 249));
            txtb15_5.setBackground(new java.awt.Color(127, 144, 249));

        }else{
            txtb15_1.setEnabled(false);
            txtb15_2.setEnabled(false);
            txtb15_3.setEnabled(false);
            txtb15_4.setEnabled(false);
            txtb15_5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx15ActionPerformed

    private void cbx12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx12ActionPerformed
        if(cbx12.isSelected()){
            txtb12_1.setEnabled(true);
            txtb12_2.setEnabled(true);
            txtb12_3.setEnabled(true);
            txtb12_4.setEnabled(true);
            txtb12_5.setEnabled(true);
        }else{
            txtb12_1.setEnabled(false);
            txtb12_2.setEnabled(false);
            txtb12_3.setEnabled(false);
            txtb12_4.setEnabled(false);
            txtb12_5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx12ActionPerformed

    private void cbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx1ActionPerformed
        if(cbx1.isSelected()){
            txtb1_1.setEnabled(true);
            txtb1_2.setEnabled(true);
            txtb1_3.setEnabled(true);
            txtb1_4.setEnabled(true);
            txtb1_5.setEnabled(true);

            txtb1_1.setBackground(new java.awt.Color(151, 253, 164));
            txtb1_2.setBackground(new java.awt.Color(151, 253, 164));
            txtb1_3.setBackground(new java.awt.Color(151, 253, 164));
            txtb1_4.setBackground(new java.awt.Color(151, 253, 164));
            txtb1_5.setBackground(new java.awt.Color(151, 253, 164));

            txtb1_1.requestFocus();

        }else{
            txtb1_1.setEnabled(false);
            txtb1_2.setEnabled(false);
            txtb1_3.setEnabled(false);
            txtb1_4.setEnabled(false);
            txtb1_5.setEnabled(false);

        }
    }//GEN-LAST:event_cbx1ActionPerformed

    private void cbx70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx70ActionPerformed
        if(cbx70.isSelected()){
            txtb7_1.setEnabled(true);
            txtb7_2.setEnabled(true);
            txtb7_3.setEnabled(true);
            txtb7_4.setEnabled(true);
            txtb7_5.setEnabled(true);
        }else{
            txtb7_1.setEnabled(false);
            txtb7_2.setEnabled(false);
            txtb7_3.setEnabled(false);
            txtb7_4.setEnabled(false);
            txtb7_5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx70ActionPerformed

    private void cbx50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx50ActionPerformed
        if(cbx50.isSelected()){
            txtb5_1.setEnabled(true);
            txtb5_2.setEnabled(true);
            txtb5_3.setEnabled(true);
            txtb5_4.setEnabled(true);
            txtb5_5.setEnabled(true);

            txtb5_1.setBackground(new java.awt.Color(255, 153, 153));
            txtb5_2.setBackground(new java.awt.Color(255, 153, 153));
            txtb5_3.setBackground(new java.awt.Color(255, 153, 153));
            txtb5_4.setBackground(new java.awt.Color(255, 153, 153));
            txtb5_5.setBackground(new java.awt.Color(255, 153, 153));

        }else{
            txtb5_1.setEnabled(false);
            txtb5_2.setEnabled(false);
            txtb5_3.setEnabled(false);
            txtb5_4.setEnabled(false);
            txtb5_5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx50ActionPerformed

    private void btn250ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn250ActionPerformed
        if(!"".equals(txtb25_4.getText())){
            txtb25_5.setText(CDB.aumentar(txtb25_4.getText()));
        }if(!"".equals(txtb25_3.getText())){
            txtb25_4.setText(CDB.aumentar(txtb25_3.getText()));
        }if(!"".equals(txtb25_2.getText())){
            txtb25_3.setText(CDB.aumentar(txtb25_2.getText()));
        }if(!"".equals(txtb25_1.getText())){
            txtb25_2.setText(CDB.aumentar(txtb25_1.getText()));
        }
    }//GEN-LAST:event_btn250ActionPerformed

    private void btn200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn200ActionPerformed
        if(!"".equals(txtb2_4.getText())){
            txtb2_5.setText(CDB.aumentar(txtb2_4.getText()));
        }if(!"".equals(txtb2_3.getText())){
            txtb2_4.setText(CDB.aumentar(txtb2_3.getText()));
        }if(!"".equals(txtb2_2.getText())){
            txtb2_3.setText(CDB.aumentar(txtb2_2.getText()));
        }if(!"".equals(txtb2_1.getText())){
            txtb2_2.setText(CDB.aumentar(txtb2_1.getText()));
        }
    }//GEN-LAST:event_btn200ActionPerformed

    private void btn150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn150ActionPerformed
        if(!"".equals(txtb15_4.getText())){
            txtb15_5.setText(CDB.aumentar(txtb15_4.getText()));
        }if(!"".equals(txtb15_3.getText())){
            txtb15_4.setText(CDB.aumentar(txtb15_3.getText()));
        }if(!"".equals(txtb15_2.getText())){
            txtb15_3.setText(CDB.aumentar(txtb15_2.getText()));
        }if(!"".equals(txtb15_1.getText())){
            txtb15_2.setText(CDB.aumentar(txtb15_1.getText()));
        }
    }//GEN-LAST:event_btn150ActionPerformed

    private void btn120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn120ActionPerformed
        if(!"".equals(txtb12_4.getText())){
            txtb12_5.setText(CDB.aumentar(txtb12_4.getText()));
        }if(!"".equals(txtb12_3.getText())){
            txtb12_4.setText(CDB.aumentar(txtb12_3.getText()));
        }if(!"".equals(txtb12_2.getText())){
            txtb12_3.setText(CDB.aumentar(txtb12_2.getText()));
        }if(!"".equals(txtb12_1.getText())){
            txtb12_2.setText(CDB.aumentar(txtb12_1.getText()));
        }
    }//GEN-LAST:event_btn120ActionPerformed

    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
        if(!"".equals(txtb1_4.getText())){
            txtb1_5.setText(CDB.aumentar(txtb1_4.getText()));
        }if(!"".equals(txtb1_3.getText())){
            txtb1_4.setText(CDB.aumentar(txtb1_3.getText()));
        }if(!"".equals(txtb1_2.getText())){
            txtb1_3.setText(CDB.aumentar(txtb1_2.getText()));
        }if(!"".equals(txtb1_1.getText())){
            txtb1_2.setText(CDB.aumentar(txtb1_1.getText()));
        }
    }//GEN-LAST:event_btn100ActionPerformed

    private void btn70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn70ActionPerformed
        if(!"".equals(txtb7_4.getText())){
            txtb7_5.setText(CDB.aumentar(txtb7_4.getText()));
        }if(!"".equals(txtb7_3.getText())){
            txtb7_4.setText(CDB.aumentar(txtb7_3.getText()));
        }if(!"".equals(txtb7_2.getText())){
            txtb7_3.setText(CDB.aumentar(txtb7_2.getText()));
        }if(!"".equals(txtb7_1.getText())){
            txtb7_2.setText(CDB.aumentar(txtb7_1.getText()));
        }
    }//GEN-LAST:event_btn70ActionPerformed

    private void btn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50ActionPerformed
        if(!"".equals(txtb5_4.getText())){
            txtb5_5.setText(CDB.aumentar(txtb5_4.getText()));
        }if(!"".equals(txtb5_3.getText())){
            txtb5_4.setText(CDB.aumentar(txtb5_3.getText()));
        }if(!"".equals(txtb5_2.getText())){
            txtb5_3.setText(CDB.aumentar(txtb5_2.getText()));
        }if(!"".equals(txtb5_1.getText())){
            txtb5_2.setText(CDB.aumentar(txtb5_1.getText()));
        }
    }//GEN-LAST:event_btn50ActionPerformed

    private void btnBOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBOperadorActionPerformed
        Vista.Listas.ListaOperadores.opt=5; 
        new  Vista.Listas.ListaOperadores(null, true).setVisible(true);
    }//GEN-LAST:event_btnBOperadorActionPerformed

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed
        DatosSistema DS = new DatosSistema();
        ControladorEnviarDatos CED = new ControladorEnviarDatos();
        if("".equals(CodigoResponsable)){
            JOptionPane.showMessageDialog(null, "ELIJA RESPONSABLE DE LOS BOLETOS");
        }else{            
            int id = CDB.RegistrarDistribucion(CodigoResponsable, DS.ObtenerFecha(), CED.getDatoUsuario() , CodVehiculo, DS.ObtenerHora());
            Double Precio;   
            if(cbx5.isSelected()){
                Precio=5.00;
                CDB.RegistrarDetalle(txtb4_1.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb4_2.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb4_3.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb4_4.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb4_5.getText(),id,Precio);
            }if(cbx4.isSelected()){
                Precio=4.00;
                CDB.RegistrarDetalle(txtb35_1.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb35_2.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb35_3.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb35_4.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb35_5.getText(),id,Precio);
            }if(cbx3.isSelected()){
                Precio=3.00;
                CDB.RegistrarDetalle(txtb3_1.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb3_2.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb3_3.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb3_4.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb3_5.getText(),id,Precio);
            }if(cbx25.isSelected()){
                Precio=2.50;
                CDB.RegistrarDetalle(txtb25_1.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb25_2.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb25_3.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb25_4.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb25_5.getText(),id,Precio);
            }if(cbx2.isSelected()){
                Precio=2.00;
                CDB.RegistrarDetalle(txtb2_1.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb2_2.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb2_3.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb2_4.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb2_5.getText(),id,Precio);
            }if(cbx15.isSelected()){
                Precio=1.50;
                CDB.RegistrarDetalle(txtb15_1.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb15_2.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb15_3.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb15_4.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb15_5.getText(),id,Precio);
            }if(cbx12.isSelected()){
                Precio=1.20;
                CDB.RegistrarDetalle(txtb12_1.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb12_2.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb12_3.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb12_4.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb12_5.getText(),id,Precio);
            }if(cbx1.isSelected()){
                Precio=1.00;
                CDB.RegistrarDetalle(txtb1_1.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb1_2.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb1_3.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb1_4.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb1_5.getText(),id,Precio);
            }if(cbx70.isSelected()){
                Precio=0.70;
                CDB.RegistrarDetalle(txtb7_1.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb7_2.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb7_3.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb7_4.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb7_5.getText(),id,Precio);
            }if(cbx50.isSelected()){
                Precio=0.50;
                CDB.RegistrarDetalle(txtb5_1.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb5_2.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb5_3.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb5_4.getText(),id,Precio);
                CDB.RegistrarDetalle(txtb5_5.getText(),id,Precio);                
            }
            
            JOptionPane.showMessageDialog(null, "Boletos Abastecidos correctamente");
            Tablas tab = new Tablas();
            tab.actualizarTablaControlBol(CodVehiculo);
            this.dispose();
        }
        
    }//GEN-LAST:event_rSButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AbastercerBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbastercerBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbastercerBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbastercerBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the dialog */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AbastercerBoletos dialog = new AbastercerBoletos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn120;
    private javax.swing.JButton btn150;
    private javax.swing.JButton btn200;
    private javax.swing.JButton btn250;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn70;
    private rojerusan.RSButtonCircle btnBOperador;
    private javax.swing.JCheckBox cbx1;
    private javax.swing.JCheckBox cbx12;
    private javax.swing.JCheckBox cbx15;
    private javax.swing.JCheckBox cbx2;
    private javax.swing.JCheckBox cbx25;
    private javax.swing.JCheckBox cbx3;
    private javax.swing.JCheckBox cbx4;
    private javax.swing.JCheckBox cbx5;
    private javax.swing.JCheckBox cbx50;
    private javax.swing.JCheckBox cbx70;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private rojeru_san.RSButton rSButton1;
    public static rojeru_san.RSMTextFull txtOperador;
    private javax.swing.JTextField txtb12_1;
    private javax.swing.JTextField txtb12_2;
    private javax.swing.JTextField txtb12_3;
    private javax.swing.JTextField txtb12_4;
    private javax.swing.JTextField txtb12_5;
    private javax.swing.JTextField txtb15_1;
    private javax.swing.JTextField txtb15_2;
    private javax.swing.JTextField txtb15_3;
    private javax.swing.JTextField txtb15_4;
    private javax.swing.JTextField txtb15_5;
    private javax.swing.JTextField txtb1_1;
    private javax.swing.JTextField txtb1_2;
    private javax.swing.JTextField txtb1_3;
    private javax.swing.JTextField txtb1_4;
    private javax.swing.JTextField txtb1_5;
    private javax.swing.JTextField txtb25_1;
    private javax.swing.JTextField txtb25_2;
    private javax.swing.JTextField txtb25_3;
    private javax.swing.JTextField txtb25_4;
    private javax.swing.JTextField txtb25_5;
    private javax.swing.JTextField txtb2_1;
    private javax.swing.JTextField txtb2_2;
    private javax.swing.JTextField txtb2_3;
    private javax.swing.JTextField txtb2_4;
    private javax.swing.JTextField txtb2_5;
    private javax.swing.JTextField txtb35_1;
    private javax.swing.JTextField txtb35_2;
    private javax.swing.JTextField txtb35_3;
    private javax.swing.JTextField txtb35_4;
    private javax.swing.JTextField txtb35_5;
    private javax.swing.JTextField txtb3_1;
    private javax.swing.JTextField txtb3_2;
    private javax.swing.JTextField txtb3_3;
    private javax.swing.JTextField txtb3_4;
    private javax.swing.JTextField txtb3_5;
    private javax.swing.JTextField txtb4_1;
    private javax.swing.JTextField txtb4_2;
    private javax.swing.JTextField txtb4_3;
    private javax.swing.JTextField txtb4_4;
    private javax.swing.JTextField txtb4_5;
    private javax.swing.JTextField txtb5_1;
    private javax.swing.JTextField txtb5_2;
    private javax.swing.JTextField txtb5_3;
    private javax.swing.JTextField txtb5_4;
    private javax.swing.JTextField txtb5_5;
    private javax.swing.JTextField txtb7_1;
    private javax.swing.JTextField txtb7_2;
    private javax.swing.JTextField txtb7_3;
    private javax.swing.JTextField txtb7_4;
    private javax.swing.JTextField txtb7_5;
    // End of variables declaration//GEN-END:variables


    
}
