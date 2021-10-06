
package Vista.Menu;

import Controlador.CambiaPanel;
import Vista.Despacho.DistribucionDeFlota;
import Vista.Menu.Home;
import static Vista.Menu.Home.pnlPrincipal;

public class MenuDespacho extends javax.swing.JPanel {

    CambiaPanel cambiaPanel;
    public MenuDespacho() {
        initComponents();
        Home.lblTitulo.setText("MENU VEHICULOS");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        rSButtonIconD6 = new rojerusan.RSButtonIconD();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("DISTRIBUCION DE FLOTA");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 311, -1, 23));

        rSButtonIconD6.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonIconD6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DEUDAVEHICULO.png"))); // NOI18N
        rSButtonIconD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconD6ActionPerformed(evt);
            }
        });
        add(rSButtonIconD6, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 162, 174, 143));
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonIconD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconD6ActionPerformed
        cambiaPanel = new CambiaPanel(pnlPrincipal, new DistribucionDeFlota() );
    }//GEN-LAST:event_rSButtonIconD6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel9;
    private rojerusan.RSButtonIconD rSButtonIconD6;
    // End of variables declaration//GEN-END:variables
}
