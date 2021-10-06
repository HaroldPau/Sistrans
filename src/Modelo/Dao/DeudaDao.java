package Modelo.Dao;
import Modelo.Bean.DeudaPersonal;
import Modelo.Bean.DeudaVehiculo;
import Util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DeudaDao extends ConexionBD{
    Connection cn = null;
    Statement stmt = null;
    PreparedStatement pt = null;    
    
    public ArrayList<DeudaVehiculo> ListadoDeudaV(String CodigoV){
        ArrayList<DeudaVehiculo> ListaDeudaV = new ArrayList<>();
        try {    
            cn=super.getConexion();
            stmt = cn.createStatement();
            String sql = "select codigo_deudav,descripcion,monto,fecha,(p.nombre + ' ' + p.apellido_pa+' '+p.apellido_ma ) as responsable from deuda_vehiculo dv inner join personal p on p.codigo_personal = dv.responsable where dv.vehiculo = '"+CodigoV+"' and dv.activo = 1";
            System.out.println(sql);
            ResultSet rset = stmt.executeQuery(sql);
                while(rset.next()){
                    DeudaVehiculo ODV = new DeudaVehiculo();
                    ODV.setCodigo(rset.getString(1));
                    ODV.setConcepto(rset.getString(2));
                    ODV.setDeuda(rset.getFloat(3));
                    ODV.setFecha(rset.getString(4));
                    ODV.setResponsable(rset.getString(5));
                    ListaDeudaV.add(ODV);
                }            
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE ListadoDeudaV SACTIFACTORIO");    
        } catch (SQLException ex) {
            System.err.println("PROBLEMA EN EL LISTADO DE ListadoDeudaV "+ex);
        }
        return ListaDeudaV;
    }    
    public boolean ActualizarDeudaV(String Codigo,int estado) {
        boolean bandera = false;
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            String sql = "update deuda_vehiculo set activo = "+estado+" where codigo_deudav='"+Codigo+"'" ;
            stmt.executeUpdate(sql);
            System.out.println("!!ACTUALIZACION DE DeudaV EXITOSO!!");            
            stmt.close();
            cn.close();
            bandera = true;            
        } catch (SQLException e) {
            System.err.println("problemas en la actualizacion de DeudaV " + e);
        }
        return bandera;
    }    
    public boolean RegistroDeudaP(String codigo,String descripcion,String responsable,float monto,String fecha){
        boolean bandera = false;
        try {
            String sql="insert into deuda_personal values(?,?,?,?,?,?)";           
            cn = super.getConexion();
            pt = cn.prepareStatement(sql);
            pt.setString(1,codigo);
            pt.setString(2,descripcion);
            pt.setString(3,responsable);
            pt.setFloat(4,monto);
            pt.setString(5,fecha);
            pt.setInt(6,1);
            pt.execute();
            cn.close();
            pt.close();
            System.out.println("DEUDA REGISTRADA");
            bandera = true;
                                    
        } catch (SQLException e) {
            System.err.println("ERROR AL REGISTRAR DEUDA" + e);}        
        return bandera;
    }
    public int ContadorDeudaP(){
        int numero=1;
        try {
            String sql="select count(codigo_deudap) from deuda_personal";        
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
    public ArrayList<DeudaPersonal> ListadoDeudaP(String CodigoV){
        ArrayList<DeudaPersonal> ListaDeudaV = new ArrayList<>();
        try {           
            cn=super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery("select codigo_deudap,descripcion,monto,fecha from deuda_personal where responsable = '"+CodigoV+"' and activo = 1");
                while(rset.next()){
                    DeudaPersonal ODV = new DeudaPersonal();
                    ODV.setCodigo(rset.getString(1));
                    ODV.setConcepto(rset.getString(2));
                    ODV.setMonto(rset.getFloat(3));
                    ODV.setFecha(rset.getString(4));
                    ListaDeudaV.add(ODV);
                }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE ListadoDeudaP SACTIFACTORIO");
        } catch (SQLException ex) {
            System.err.println("PROBLEMA EN EL LISTADO DE ListadoDeudaP "+ex);
        }
        return ListaDeudaV;
    }
    public boolean ActualizarDeudaP(String Codigo) {
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            String sql = "update deuda_personal set activo = 0 where codigo_deudap='"+Codigo+"'" ;
            stmt.executeUpdate(sql);            
            System.out.println("!!ACTUALIZACION DE DeudaP EXITOSO!!");
            stmt.close();
            cn.close();            
            return true;
        } catch (SQLException e) {
            System.err.println("problemas en la actualizacion de DeudaP " + e);
        }
        return false;
    }
    public int ContadorDeudav(){
        int numero=1;
        try {
            String sql="select count(codigo_deudav) from deuda_VEHICULO";        
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
    public boolean RegistroDeudaV(String codigo,String CodVehi,String descripcion,String responsable,float monto,String fecha){
        boolean bandera = false;
        try {
            String sql="insert into deuda_vehiculo values(?,?,?,?,?,?,?)";           
            cn = super.getConexion();
            pt = cn.prepareStatement(sql);
            pt.setString(1,codigo);
            pt.setString(2,CodVehi);
            pt.setString(3,descripcion);
            pt.setString(4,responsable);
            pt.setFloat(5,monto);
            pt.setString(6,fecha);
            pt.setInt(7,1);
            pt.execute();
            cn.close();
            pt.close();
            System.out.println("DEUDA VEHICULO REGISTRADA");            
            bandera=true;                                    
        } catch (SQLException e) {
            System.err.println("ERROR AL REGISTRAR DEUDA VEHICULO" + e);}        
        return bandera;
    }
    public String ObtenerCodigoDV(String CodigoV,String fecha){
        String Codigo="";
        try {
            String sql="select codigo_deudav from deuda_VEHICULO where vehiculo ='"+CodigoV+"' and fecha ='"+fecha+"'";        
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql);            
            if(rset.next()){
                Codigo= rset.getString(1);                
            }else{
                Codigo="";
            }     
            cn.close();
            stmt.close();
            rset.close();            
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE OBTENER CODIGO DEUDA VEHICULO " + e);
        }
        
        return Codigo;
    }
}
