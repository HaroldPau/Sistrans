/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imprimir;

import Modelo.Bean.DistribucionBoletos;
import Modelo.Dao.DistribucionBoletoDao;
import Modelo.Dao.VehiculoDao;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Harold7v7
 */
public class ImprimirBol extends javax.swing.JDialog {

    DefaultTableModel tb;
    DistribucionBoletoDao DBD = new DistribucionBoletoDao();
    static public String Codigo;
    static public String Padron;
    VehiculoDao VD = new VehiculoDao();
    int contador = 0;
    
    Calendar fecha = new GregorianCalendar();        
            int ano = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH)+1;
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
            String Fecha= String.valueOf(dia)+"/" +String.valueOf(mes+1)+ "/" +String.valueOf(ano);
            
            
    public ImprimirBol(java.awt.Frame parent, boolean modal) {        
        super(parent, modal);        
        String Sdia,Saño,Smes;
        
        if(dia<10){
            Sdia="0"+dia;
        }else{
            Sdia=String.valueOf(dia);
        }
        
        if(mes<10){
            Smes="0"+mes;
        }else{
            Smes=String.valueOf(mes);
        }
        Saño=String.valueOf(ano);
        
        String Fecha= Sdia+"/" +Smes+ "/" +Saño.substring(2,4);        
        initComponents();        
        
        String [] data = DBD.Pegado(Codigo);        
        
        String Responsable=data[1];
        int hora, minutos;
        Calendar calendario = new GregorianCalendar();
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        String Shora, Sminutos;
        if(hora < 10){
            Shora="0"+hora;
        }else{
            Shora= String.valueOf(hora);
        }
        if(minutos<10){
           Sminutos = "0"+ minutos; 
        }else{
            Sminutos = String.valueOf(minutos);
        }
        String horas = Shora + ":" + Sminutos;
        
        
        
            LlenarTabla(cuatro,"5.00",Codigo);
            LlenarTabla(tres50,"4.00",Codigo);
            LlenarTabla(tres,"3.00",Codigo);
            LlenarTabla(dos50,"2.50",Codigo);
            LlenarTabla(dos,"2.00",Codigo);
            LlenarTabla(uno50,"1.50",Codigo);
            LlenarTabla(uno20,"1.20",Codigo);
            LlenarTabla(uno,"1.00",Codigo);
            LlenarTabla(setenta,"0.70",Codigo);
            LlenarTabla(cincuenta,"0.50",Codigo);
            lblFecha.setText(Fecha);
            lblHora.setText(horas);
            lblPadron.setText(Padron);
            lblPadron2.setText(Padron);
            lblResponsable.setText(Responsable);
            lblContador.setText("NUMERO   DE   BOLETOS: "+contador);
        
    }
    
    void LlenarTabla(javax.swing.JTable tabla, String precio, String padron){
        
        ArrayList<DistribucionBoletos> ListaBoletos;
        ListaBoletos = DBD.ObtenerBoletos(precio, padron);
        tb =(DefaultTableModel)tabla.getModel();
        ListaBoletos.forEach((obj) -> {
            tb.addRow(new Object[] {obj.getInicio()});
            contador++;
        });
    }
    
    static public void Imprimir(){
        printRecord(controlboleto1);
        
    }
        
    static public void printRecord(JPanel panel){
        // Create PrinterJob Here
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        // Set Printer Job Name
        printerJob.setJobName("HOJA CONTROL BOLETOS");
        // Set Printable
        printerJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                // Check If No Printable Content
                if(pageIndex > 0){
                    return Printable.NO_SUCH_PAGE;
                }                
                // Make 2D Graphics to map content
                Graphics2D graphics2D = (Graphics2D)graphics;
                // Set Graphics Translations
                // A Little Correction here Multiplication was not working so I replaced with addition
                graphics2D.translate(pageFormat.getImageableX()+10, pageFormat.getImageableY()+10);
                // This is a page scale. Default should be 0.3 I am using 0.5
                graphics2D.scale(0.6, 0.8);                
                // Now paint panel as graphics2D
                panel.paint(graphics2D);                
                // return if page exists
                return Printable.PAGE_EXISTS;            }
        });
        // Store printerDialog as boolean
        boolean returningResult = printerJob.printDialog();
        // check if dilog is showing
        if(returningResult){
            // Use try catch exeption for failure
            try{
                // Now call print method inside printerJob to print
                printerJob.print();
               
            }catch (PrinterException printerException){
            }
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        controlboleto1 = new javax.swing.JPanel();
        lblPadron2 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tres50 = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        cuatro = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        tres = new javax.swing.JTable();
        jScrollPane14 = new javax.swing.JScrollPane();
        dos50 = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        uno20 = new javax.swing.JTable();
        jScrollPane16 = new javax.swing.JScrollPane();
        uno = new javax.swing.JTable();
        jScrollPane17 = new javax.swing.JScrollPane();
        uno50 = new javax.swing.JTable();
        jScrollPane18 = new javax.swing.JScrollPane();
        dos = new javax.swing.JTable();
        jScrollPane19 = new javax.swing.JScrollPane();
        cincuenta = new javax.swing.JTable();
        jScrollPane20 = new javax.swing.JScrollPane();
        setenta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblPadron = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblResponsable = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblContador = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        controlboleto1.setBackground(new java.awt.Color(255, 255, 255));
        controlboleto1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BOLETOS     DISPONIBLES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        controlboleto1.setForeground(new java.awt.Color(102, 102, 102));
        controlboleto1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPadron2.setFont(new java.awt.Font("Tahoma", 1, 165)); // NOI18N
        lblPadron2.setForeground(new java.awt.Color(102, 102, 102));
        lblPadron2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPadron2.setText("jLabel2");
        controlboleto1.add(lblPadron2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 890, -1));

        tres50.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tres50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tres50.setForeground(new java.awt.Color(102, 102, 102));
        tres50.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "4.00"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(tres50);

        controlboleto1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 56, 82, 256));

        cuatro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cuatro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cuatro.setForeground(new java.awt.Color(102, 102, 102));
        cuatro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "5.00"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(cuatro);

        controlboleto1.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 56, 82, 256));

        tres.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tres.setForeground(new java.awt.Color(102, 102, 102));
        tres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "3.00"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(tres);

        controlboleto1.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 56, 82, 256));

        dos50.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dos50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dos50.setForeground(new java.awt.Color(102, 102, 102));
        dos50.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "2.50"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(dos50);

        controlboleto1.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 56, 82, 256));

        uno20.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        uno20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        uno20.setForeground(new java.awt.Color(102, 102, 102));
        uno20.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1.20"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane15.setViewportView(uno20);

        controlboleto1.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 56, 82, 256));

        uno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        uno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        uno.setForeground(new java.awt.Color(102, 102, 102));
        uno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1.00"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane16.setViewportView(uno);

        controlboleto1.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 56, 82, 256));

        uno50.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        uno50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        uno50.setForeground(new java.awt.Color(102, 102, 102));
        uno50.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1.50"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane17.setViewportView(uno50);

        controlboleto1.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 56, 82, 256));

        dos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dos.setForeground(new java.awt.Color(102, 102, 102));
        dos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "2.00"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane18.setViewportView(dos);

        controlboleto1.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 56, 82, 256));

        cincuenta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cincuenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cincuenta.setForeground(new java.awt.Color(102, 102, 102));
        cincuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "0.50"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane19.setViewportView(cincuenta);

        controlboleto1.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 56, 82, 256));

        setenta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setenta.setForeground(new java.awt.Color(102, 102, 102));
        setenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "0.70"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane20.setViewportView(setenta);

        controlboleto1.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 56, 82, 256));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("PADRON");
        controlboleto1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, 60, -1));

        lblPadron.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lblPadron.setForeground(new java.awt.Color(102, 102, 102));
        lblPadron.setText("999");
        controlboleto1.add(lblPadron, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("RESPONSABLE:");
        controlboleto1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 28, 108, -1));

        lblResponsable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResponsable.setForeground(new java.awt.Color(102, 102, 102));
        lblResponsable.setText("jLabel3");
        controlboleto1.add(lblResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 27, 564, -1));

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(102, 102, 102));
        lblFecha.setText("jLabel4");
        controlboleto1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 330, 82, -1));

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblHora.setForeground(new java.awt.Color(102, 102, 102));
        lblHora.setText("jLabel4");
        controlboleto1.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 330, 106, -1));

        lblContador.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblContador.setForeground(new java.awt.Color(102, 102, 102));
        lblContador.setText("jLabel3");
        controlboleto1.add(lblContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 330, 258, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NOTA:  EL  OPERADOR  SE  HARÁ  RESPONSABLE  POR  LA  PERDIDA  O  MAL  USO  DE  LOS  BOLETOS");
        controlboleto1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 364, 881, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LA  PERDIDA  DE  ESTA  HOJA DE  LIQUIDACIÓN  AMERITA  UNA  MULTA  DE  S/10.00");
        controlboleto1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 881, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlboleto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(controlboleto1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ImprimirBol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImprimirBol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImprimirBol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImprimirBol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ImprimirBol dialog = new ImprimirBol(new javax.swing.JFrame(), true);
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
    public static javax.swing.JTable cincuenta;
    public static javax.swing.JPanel controlboleto1;
    public static javax.swing.JTable cuatro;
    public static javax.swing.JTable dos;
    public static javax.swing.JTable dos50;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JLabel lblContador;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblPadron;
    private javax.swing.JLabel lblPadron2;
    private javax.swing.JLabel lblResponsable;
    public static javax.swing.JTable setenta;
    public static javax.swing.JTable tres;
    public static javax.swing.JTable tres50;
    public static javax.swing.JTable uno;
    public static javax.swing.JTable uno20;
    public static javax.swing.JTable uno50;
    // End of variables declaration//GEN-END:variables
}
