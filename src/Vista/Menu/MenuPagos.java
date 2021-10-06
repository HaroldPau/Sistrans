
package Vista.Menu;

import Controlador.CambiaPanel;
import Vista.Menu.Home;
import Vista.Economia.pnlGenerarDeudaV;
import Vista.Economia.pnlGenerar_Deuda;
import Vista.Economia.pnlListaExoPV;
import Vista.Economia.pnlRegistrarExoneracion;
import Vista.Economia.pnlRegistrarPago;
import static Vista.Menu.Home.pnlPrincipal;

public class MenuPagos extends javax.swing.JPanel {

    CambiaPanel cambiaPanel;
    public MenuPagos() {
        initComponents();
        Home.lblTitulo.setText("MENU PAGOS");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSButtonIconD2 = new rojerusan.RSButtonIconD();
        jLabel1 = new javax.swing.JLabel();
        rSButtonIconD3 = new rojerusan.RSButtonIconD();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rSButtonIconD5 = new rojerusan.RSButtonIconD();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rSButtonIconD6 = new rojerusan.RSButtonIconD();
        rSButtonIconD7 = new rojerusan.RSButtonIconD();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonIconD2.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonIconD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRARPAGO.png"))); // NOI18N
        rSButtonIconD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconD2ActionPerformed(evt);
            }
        });
        add(rSButtonIconD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 51, 165, 143));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("GENERAR DEUDA");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 212, 165, 23));

        rSButtonIconD3.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonIconD3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DEUDAOPERADOR.png"))); // NOI18N
        rSButtonIconD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconD3ActionPerformed(evt);
            }
        });
        add(rSButtonIconD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 51, 165, 143));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("REGISTRAR PAGO");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 226, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PERSONAL");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 241, 165, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("EXONERACION DE PAGO");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 474, -1, 25));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("SOLICITUD DE");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 440, -1, 23));

        rSButtonIconD5.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonIconD5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EXONERACION.png"))); // NOI18N
        rSButtonIconD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconD5ActionPerformed(evt);
            }
        });
        add(rSButtonIconD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 284, 162, 143));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("EXONERACION DE PAGO");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, -1, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("CONTROL DE");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, -1, 23));

        rSButtonIconD6.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonIconD6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CONTROLEXONERACION.png"))); // NOI18N
        rSButtonIconD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconD6ActionPerformed(evt);
            }
        });
        add(rSButtonIconD6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 174, 143));

        rSButtonIconD7.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonIconD7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte_1.png"))); // NOI18N
        rSButtonIconD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconD7ActionPerformed(evt);
            }
        });
        add(rSButtonIconD7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, 170));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("REPORTE DE RECAUDO");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonIconD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconD2ActionPerformed
        cambiaPanel = new CambiaPanel(pnlPrincipal, new pnlRegistrarPago() );
    }//GEN-LAST:event_rSButtonIconD2ActionPerformed

    private void rSButtonIconD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconD3ActionPerformed
        cambiaPanel = new CambiaPanel(pnlPrincipal, new pnlGenerar_Deuda() );
    }//GEN-LAST:event_rSButtonIconD3ActionPerformed

    private void rSButtonIconD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconD5ActionPerformed
        cambiaPanel = new CambiaPanel(pnlPrincipal, new pnlRegistrarExoneracion() );
    }//GEN-LAST:event_rSButtonIconD5ActionPerformed

    private void rSButtonIconD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconD6ActionPerformed
        cambiaPanel = new CambiaPanel(pnlPrincipal, new pnlListaExoPV() );
    }//GEN-LAST:event_rSButtonIconD6ActionPerformed

    private void rSButtonIconD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconD7ActionPerformed
        new  Vista.Economia.ReporteFecha(null, true).setVisible(true);
    }//GEN-LAST:event_rSButtonIconD7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private rojerusan.RSButtonIconD rSButtonIconD2;
    private rojerusan.RSButtonIconD rSButtonIconD3;
    private rojerusan.RSButtonIconD rSButtonIconD5;
    private rojerusan.RSButtonIconD rSButtonIconD6;
    private rojerusan.RSButtonIconD rSButtonIconD7;
    // End of variables declaration//GEN-END:variables
}