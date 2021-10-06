
package Controlador;

import Modelo.Dao.DeudaDao;
import Modelo.Dao.ExoneracionDao;
import Vista.Economia.pnlRegistrarExoneracion;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ControladorExoneracion {
    static String ruta;
    DatosSistema DS = new DatosSistema();
    ExoneracionDao ED = new ExoneracionDao();

    
    static public String Factura (FileInputStream fis, int longitudBytes, int indice ){
        
        
        String url = "";
        JFileChooser Fc = new JFileChooser();
        Fc.setDialogTitle("BUSCAR IMAGEN");  
        Fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos tipo Imagen","JPEG","JPG","PNG");
        Fc.setFileFilter(filtro);
        if(Fc.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){ 
            url=Fc.getSelectedFile().toString();
            try{
                switch (indice) {
                    case 1:
                        pnlRegistrarExoneracion.fis1 = new FileInputStream(Fc.getSelectedFile());
                        pnlRegistrarExoneracion.lb = (int)Fc.getSelectedFile().length();
                        break;
                    case 2:
                        pnlRegistrarExoneracion.fis2 = new FileInputStream(Fc.getSelectedFile());
                        pnlRegistrarExoneracion.lb2 = (int)Fc.getSelectedFile().length();
                        break;
                    case 3:
                        pnlRegistrarExoneracion.fis3 = new FileInputStream(Fc.getSelectedFile());
                        pnlRegistrarExoneracion.lb3 = (int)Fc.getSelectedFile().length();
                        break;
                    default:
                        break;
                }                
                
            }catch(FileNotFoundException ex){  
                System.err.println(ex);
            }      
        }
        return url;        
    }
    
    public int RegistrarSolcitudEP(String CodVeh , String fechaSelect){
        int CodigoExo = 0;
        
        DeudaDao DD = new DeudaDao();
        String CodigoDeuda = DD.ObtenerCodigoDV(CodVeh, fechaSelect);
        if(CodigoDeuda.equals("")){
            JOptionPane.showMessageDialog(null, "LA UNIDAD NO CUENTA CON DEUDA EN ESTA FECHA","MENSAJE",3);
        }else{
            CodigoExo = ED.ContadorExoneracion();
            ED.RegistroExoneriacionP(CodigoExo, CodigoDeuda, DS.ObtenerFecha());
        }        
        return CodigoExo;
    }
    public void AñadirRecibos(int codigoexo,FileInputStream foto,int longitud){
        ED.RegistroFacturaExoneriacion(ED.ContadorFactura(), foto, longitud, codigoexo);
    }
    public void ActualizarEstadoSolicitud(int codigo, int estado){
        ED.ActualizarEstado(codigo, estado);
    }
    public Image enviarFactura(int Codigo) {
        Image imagen = null;
        try{
        Blob fotos = ED.MostrarBoleta(Codigo);
        if(fotos != null){
            byte []recuperar = fotos.getBytes(1,(int)fotos.length());
            BufferedImage img = ImageIO.read(new ByteArrayInputStream(recuperar));                
            imagen = img.getScaledInstance(670,735,Image.SCALE_SMOOTH);
        }else{           
            imagen = new ImageIcon(getClass().getResource("/Imagenes/Salvador.jpg")).getImage();
        }    
        }catch (SQLException | IOException ex) {
                System.out.println(ex);
            }            
        return imagen;  
    }

    
    /*
    public void RegistrarSolcitudEP(String Codigo, String CodVeh , String fechaSelect,String FechaSistema){
        ExoneracionDao ED = new ExoneracionDao();
        DeudaDao DD = new DeudaDao();
        String CodigoDeuda = DD.ObtenerCodigoDV(CodVeh, fechaSelect);
        if(CodigoDeuda.equals("")){
            JOptionPane.showMessageDialog(null, "LA UNIDAD NO CUENTA CON DEUDA EN ESTA FECHA","MENSAJE",3);
        }else{
            ED.RegistroExoneriacionP(Codigo, CodigoDeuda, fis, longitudBytes, FechaSistema);
        }
    }
    */
}
