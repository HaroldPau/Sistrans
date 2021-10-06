
package Vista.Listas;

import Controlador.ControladorEnviarDatos;
import Modelo.Dao.PersonalDao;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class ListaCobradores extends javax.swing.JDialog {
    static public int opt;
    PersonalDao DP = new PersonalDao();
    DefaultTableModel modelo;
    int Cargo = 2;
    ControladorEnviarDatos CED = new ControladorEnviarDatos();            
    public ListaCobradores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);      
        this.setLocationRelativeTo(null);
        initComponents();
        Controlador.Tablas.LlenarTablaPersonal((DefaultTableModel)tPersonal.getModel(),Cargo);   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscar = new rojeru_san.RSMTextFull();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPersonal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblFoto = new rojerusan.RSLabelCircleImage();
        rSButton1 = new rojeru_san.RSButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtBuscar.setSoloLetras(true);
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        tPersonal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDO P.", "APELLIDO M.", "IDENTIFICACION", "NUMERO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tPersonal.setGridColor(new java.awt.Color(255, 255, 255));
        tPersonal.setSelectionBackground(new java.awt.Color(255, 0, 0));
        tPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPersonalMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tPersonalMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tPersonal);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("FILTRAR");

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salvador.jpg"))); // NOI18N

        rSButton1.setText("ENVIAR");
        rSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(rSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void tPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPersonalMouseClicked
       if(evt.getClickCount()==2){
            int FilaSelec = tPersonal.getSelectedRow();
            if(FilaSelec==-1){            
            }else{
            CED.enviar(tPersonal.getValueAt(FilaSelec,4).toString(), tPersonal.getValueAt(FilaSelec,0).toString()+" " +tPersonal.getValueAt(FilaSelec,1).toString()+" "+tPersonal.getValueAt(FilaSelec,2).toString(), opt);
            this.dispose();
            }
        }    
    }//GEN-LAST:event_tPersonalMouseClicked

    private void tPersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPersonalMousePressed
        Image imagen; 
        int FilaSelec = tPersonal.getSelectedRow();
        if(FilaSelec==-1){            
        }else{
            imagen = CED.enviarFoto(tPersonal.getValueAt(FilaSelec,4).toString());
            lblFoto.setIcon(new ImageIcon(imagen));
        }
    }//GEN-LAST:event_tPersonalMousePressed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        Controlador.Tablas.FiltrarTablaPersonal((DefaultTableModel) tPersonal.getModel(),txtBuscar.getText(),Cargo);        
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed
        int FilaSelec = tPersonal.getSelectedRow();
        if(FilaSelec==-1){            
        }else{
        CED.enviar(tPersonal.getValueAt(FilaSelec,4).toString(), tPersonal.getValueAt(FilaSelec,0).toString()+" " +tPersonal.getValueAt(FilaSelec,1).toString()+" "+tPersonal.getValueAt(FilaSelec,2).toString(), opt);
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
            java.util.logging.Logger.getLogger(ListaCobradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaCobradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaCobradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaCobradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            ListaCobradores dialog = new ListaCobradores(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSLabelCircleImage lblFoto;
    private rojeru_san.RSButton rSButton1;
    private javax.swing.JTable tPersonal;
    private rojeru_san.RSMTextFull txtBuscar;
    // End of variables declaration//GEN-END:variables
}
