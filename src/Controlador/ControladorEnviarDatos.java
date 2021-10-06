
package Controlador;

import Modelo.Dao.PersonalDao;
import static Vista.Listas.ListaCobradores.opt;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class ControladorEnviarDatos {
    private int opcion;
    PersonalDao PD = new PersonalDao();

    
    public void enviar(String Nidentificacion, String Nombre,int opt){

        Image fotos;
        /*
        0 = REGISTRO PAGO
        1 = GENERAR DEUDA
        2 = GENERAR DEUDA V
        3 = DISTRIBUCION FLOTA -COBRADOR
        4 = DISTRIBUCION FLOTA -CONDUCTOR
        5 = DISTRIBUCION DE BOLETO
        6 = LIQUIDACION
        */
        switch (opt){                
            case 0:
                Vista.Economia.pnlRegistrarPago.txtOperador.setText(Nombre);
                Vista.Economia.pnlRegistrarPago.CodPersonal = PD.ObtenerCodigo(Nidentificacion);
                break;
            case 1:
                Vista.Economia.pnlGenerar_Deuda.txtOperador.setText(Nombre);
                Vista.Economia.pnlGenerar_Deuda.CodigoPersonal= PD.ObtenerCodigo(Nidentificacion);
                //PASAR FOTO A REGISTRO DEUDASp                
                fotos = enviarFoto(Nidentificacion);                
                Vista.Economia.pnlGenerar_Deuda.lblFoto.setIcon(new ImageIcon (fotos));                
                break;                    
                case 2:
                Vista.Economia.pnlGenerarDeudaV.txtOperador.setText(Nombre);
                Vista.Economia.pnlGenerarDeudaV.CodigoPersonal= PD.ObtenerCodigo(Nidentificacion);
                //PASAR FOTO A REGISTRO DEUDASv                
                fotos = enviarFoto(Nidentificacion);                
                Vista.Economia.pnlGenerarDeudaV.lblFoto.setIcon(new ImageIcon (fotos));
                
                break;
                case 3:                    
                    Vista.Despacho.DistribucionDeFlota.txtCobrador.setText(Nombre);
                    Vista.Despacho.DistribucionDeFlota.CodCobrador = PD.ObtenerCodigo(Nidentificacion);
                    break;
                    
                case 4 :
                    Vista.Despacho.DistribucionDeFlota.txtConductor.setText(Nombre);
                    Vista.Despacho.DistribucionDeFlota.CodConductor= PD.ObtenerCodigo(Nidentificacion);
                    break;
                    
                case 5 :
                Vista.Boletaje.AbastercerBoletos.txtOperador.setText(Nombre);
                Vista.Boletaje.AbastercerBoletos.CodigoResponsable= PD.ObtenerCodigo(Nidentificacion);
                break;
                
                case 6 :
                Vista.Boletaje.LiqudacionBoletos.txtOperador.setText(Nombre);
                Vista.Boletaje.LiqudacionBoletos.CodOpe= PD.ObtenerCodigo(Nidentificacion);
                break;
                    
                default: break;
        }            
    }
    public Image enviarFoto(String Identificacion) {
        Image imagen = null;
        try{
        Blob fotos = PD.BuscarFoto(Identificacion);                 
        if(fotos != null){
            byte []recuperar = fotos.getBytes(1,(int)fotos.length());
            BufferedImage img = ImageIO.read(new ByteArrayInputStream(recuperar));                
            imagen = img.getScaledInstance(210,210,Image.SCALE_SMOOTH);
        }else{           
            imagen = new ImageIcon(getClass().getResource("/Imagenes/Salvador.jpg")).getImage();
        }    
        }catch (SQLException | IOException ex) {
                System.out.println(ex);
            }            
        return imagen;  
    }
    public int getDatoUsuario(){
        return Vista.Menu.Home.usuario;
    }
    
    
}
