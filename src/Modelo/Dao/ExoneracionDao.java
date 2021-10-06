
package Modelo.Dao;
import Modelo.Bean.ExoPagoV;
import Util.ConexionBD;
import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ExoneracionDao extends ConexionBD {
    Connection cn = null;
    Statement stmt = null;
    PreparedStatement pt = null;
    
    public boolean RegistroExoneriacionP(int codigoexo,String codigoDeuda,String fecha){
        boolean bandera = false;
        try {
            String sql="insert into solicitud_exclusion_dv values(?,?,?,?)";
            cn = super.getConexion();
            pt = cn.prepareStatement(sql);            
            pt.setInt(1,codigoexo);
            pt.setInt(2,0);
            pt.setString(3, fecha);
            pt.setString(4,codigoDeuda); 
            pt.execute();
            cn.close();
            pt.close();
            JOptionPane.showMessageDialog(null, "EXONERACION REGISTRADA");
            bandera = true;                                    
        } catch (SQLException e) {
            System.err.println("ERROR AL RegistroExoneriacionP" + e);}        
        return bandera;
    }
    public boolean RegistroFacturaExoneriacion(int CodigoRecibo,FileInputStream foto,int longitud,int codigoexo){
        boolean bandera = false;
        try {
            String sql="insert into recibosExo values(?,?,?)";
            cn = super.getConexion();
            pt = cn.prepareStatement(sql);            
            pt.setInt(1,CodigoRecibo);          
            pt.setBlob(2,foto,longitud);
            pt.setInt(3,codigoexo); 
            pt.execute();
            cn.close();
            pt.close();
            System.out.println("RegistroExoneriacionP REGISTRADA");
            bandera = true;                                    
        } catch (SQLException e) {
            System.err.println("ERROR AL RegistroExoneriacionP" + e);}        
        return bandera;
    }
    public int ContadorExoneracion(){
        int numero=1;
        try {
            String sql="select count(codigo_ed) from solicitud_exclusion_dv";        
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql);            
            rset.next();
            numero= rset.getInt(1)+1;     
            cn.close();
            stmt.close();
            rset.close();            
        } catch (SQLException e) {}        
        return numero;
    }
    public int ContadorFactura(){
        int numero=1;
        try {
            String sql="select count(codRecibo) from recibosExo";        
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql);            
            rset.next();
            numero= rset.getInt(1)+1;     
            cn.close();
            stmt.close();
            rset.close();            
        } catch (SQLException e) {}        
        return numero;
    }    
    public ArrayList<ExoPagoV> ListadoExoPago(String fecha){
        ArrayList<ExoPagoV> ListaExoP = new ArrayList<>();                
        try {    
        cn=super.getConexion();
        stmt = cn.createStatement();            
                ResultSet rset = stmt.executeQuery("select EP.codigo_ed,v.padron, dv.monto,ep.fechaex,EP.estado from solicitud_exclusion_dv EP inner join deuda_vehiculo dv on dv.codigo_deudav = ep.codigo_deuda " +
                                                    "inner join vehiculo v on v.codigo_vehiculo = dv.vehiculo where ep.fechaex='"+fecha+"'");
                while(rset.next()){
                    ExoPagoV EPV = new ExoPagoV();
                    EPV.setCodigoE(rset.getString(1));
                    EPV.setPlaca(rset.getString(2));
                    EPV.setMonto(rset.getFloat(3));
                    EPV.setFecha(rset.getString(4));
                    switch (rset.getInt(5)) {
                        case 0:
                            EPV.setEstado("Pendiente");
                            break;
                        case 1:
                            EPV.setEstado("Aprobado");
                            break;
                        case 2:
                            EPV.setEstado("Rechazado");
                            break;
                        default:
                            break;
                    }
                    ListaExoP.add(EPV);
                }            
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE ListadoExoPago SACTIFACTORIO");  
        } catch (SQLException ex) {
            System.err.println("PROBLEMA EN EL LISTADO DE ListadoExoPago "+ex);
        }
        return ListaExoP;
    }
    public ArrayList<ExoPagoV> ListadoRecibo(String codigosol){
        ArrayList<ExoPagoV> ListaExoP = new ArrayList<>();                
        try {    
        cn=super.getConexion();
        stmt = cn.createStatement();            
                ResultSet rset = stmt.executeQuery("select codRecibo from recibosExo where CodigoSolicExlcu = "+codigosol);
                while(rset.next()){
                    ExoPagoV EPV = new ExoPagoV();
                    EPV.setCodigoE(rset.getString(1));
                    ListaExoP.add(EPV);
                }            
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE ListadoExoPago SACTIFACTORIO");  
        } catch (SQLException ex) {
            System.err.println("PROBLEMA EN EL LISTADO DE ListadoExoPago "+ex);
        }
        return ListaExoP;
    }
    
    
    public Blob MostrarBoleta(int CodigoD){
        Blob foto = null;
        try {
            String sql="select foto from recibosExo where codRecibo = "+CodigoD;  
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql); 
                if(rset.next()){
                    foto= rset.getBlob(1);                    
                }else{
                    foto=null;
                }                
                cn.close();
                stmt.close();   
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE OBTENER FOTO" + e);
        }        
        return foto;
    }  
    public boolean ActualizarEstado(int codigo, int estado) {
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            String sql = "update solicitud_exclusion_dv set estado = "+estado+" where codigo_ed = "+codigo ;
            stmt.executeUpdate(sql);
            String est;
            if(estado==1){
                est = "APROBADO";
            }else{
                est = "RECHAZADO";
            }
            JOptionPane.showMessageDialog(null, "EXONERACION DE COTIZACION "+estado,"MENSAJE",2);            
            stmt.close();
            cn.close();            
            return true;
        } catch (SQLException e) {
            System.err.println("problemas en la actualizacion de la exoneracion " + e);
        }
        return false;
    }
    public String ObtenerCodigoDeuda(String CodigoED){
        String Codigo="";
        try {
            String sql="select codigo_deuda from solicitud_exclusion_dv where codigo_ed = "+CodigoED;        
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql);            
            if(rset.next()){
                Codigo= rset.getString(1);                
            }else{
                Codigo = "";
            }     
            cn.close();
            stmt.close();
            rset.close();            
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE OBTENER CODIGO DEUDA VEHICULO EN TABLA EXONERACION " + e);
        }        
        return Codigo;
    }
}
