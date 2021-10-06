package Modelo.Dao;
import Modelo.Bean.Personal;
import Util.ConexionBD;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class PersonalDao extends ConexionBD {
    Connection cn = null;
    Statement stmt = null;
    PreparedStatement pt = null;
        
    public ArrayList<Personal> ListadoPersonal(int cargo){
        ArrayList<Personal> ListaPersonal = new ArrayList<>();
        try {           
            cn=super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery("SELECT nombre,apellido_pa,apellido_ma, t.nombre_ti ,numeroIdentificacion,sexo,direccion,Distrito,celular FROM PERSONAL p " +
            "inner join  tipoIdentificacion t on t.codigo_ti = p.tipo_identificacion where cargo = "+cargo+" order by apellido_pa asc");
              
            while(rset.next()){    
                Personal beanPersonal = new Personal();                  
                beanPersonal.setNombre(rset.getString(1));
                beanPersonal.setApellidopa(rset.getString(2));
                beanPersonal.setApellidoma(rset.getString(3));                    
                beanPersonal.setTidentificacion(rset.getString(4));
                beanPersonal.setNidentificacion(rset.getString(5));
                beanPersonal.setSexo(rset.getString(6));
                beanPersonal.setDireccion(rset.getString(7));
                beanPersonal.setDistrito(rset.getString(8));                    
                beanPersonal.setCelular(rset.getString(9));                    
                ListaPersonal.add(beanPersonal);
            }                
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE PERSONAL SACTIFACTORIO");    
        } catch (SQLException ex) {System.err.println("PROBLEMAS CON LISTADO DE PERSONAL"); }
        return ListaPersonal;
    }    
    public Blob BuscarFoto(String nIdentificacion){
        Blob foto = null;
        try {
            String sql="select foto from personal where numeroIdentificacion ="+nIdentificacion;            
            
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
        }return foto;
    }    
    public ArrayList<Personal> FiltrarPersonal (String Letra,int cargo){
        ArrayList<Personal> ListaPersonal;
        ListaPersonal = new ArrayList<>();
        try {         
            cn=super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery("SELECT nombre,apellido_pa,apellido_ma, t.nombre_ti ,numeroIdentificacion,sexo,direccion,Distrito,celular FROM PERSONAL p " +
            "inner join  tipoIdentificacion t on t.codigo_ti = p.tipo_identificacion  where nombre+' '+apellido_pa+' '+apellido_ma like '%"+Letra+"%' and cargo = "+cargo +" and activo = 1 order by apellido_pa asc");
              
            while(rset.next()){
                    Personal beanPersonal = new Personal(); 
                    beanPersonal.setNombre(rset.getString(1));
                    beanPersonal.setApellidopa(rset.getString(2));
                    beanPersonal.setApellidoma(rset.getString(3));                    
                    beanPersonal.setTidentificacion(rset.getString(4));
                    beanPersonal.setNidentificacion(rset.getString(5));
                    beanPersonal.setSexo(rset.getString(6));
                    beanPersonal.setDireccion(rset.getString(7));
                    beanPersonal.setDistrito(rset.getString(8));                    
                    beanPersonal.setCelular(rset.getString(9));                    
                    ListaPersonal.add(beanPersonal);
                }            
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE PERSONAL SACTIFACTORIO");     
        } catch (SQLException ex) {
            System.err.println("PROBLEMA EN EL LISTADO DE PERSONAL "+ex);
        } return ListaPersonal;
    }
    public String ObtenerCodigo(String identificacion){
        String codigo = null;
        try {
            String sql="select codigo_personal from personal where numeroIdentificacion = "+identificacion;            
            System.out.println(sql);
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql);
                if(rset.next()){
                    codigo= rset.getString(1);                    
                }else{
                    codigo="";
                }                
                cn.close();
                stmt.close();
            }       
        catch (SQLException e) {
            System.err.println("NO SE PUEDE OBTENER CODIGO PAPA" + e);        
        }        
        return codigo;
    }
    public ArrayList<Personal> ListadoTotalPersonal(){
        ArrayList<Personal> ListaPersonal = new ArrayList<>();
        try {           
            cn=super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery("SELECT nombre,apellido_pa,apellido_ma, t.nombre_ti ,numeroIdentificacion,sexo,direccion,Distrito,celular FROM PERSONAL p " +
            "inner join  tipoIdentificacion t on t.codigo_ti = p.tipo_identificacion where activo= 1 order by apellido_pa asc");              
            while(rset.next()){    
                Personal beanPersonal = new Personal();                  
                beanPersonal.setNombre(rset.getString(1));
                beanPersonal.setApellidopa(rset.getString(2));
                beanPersonal.setApellidoma(rset.getString(3));                    
                beanPersonal.setTidentificacion(rset.getString(4));
                beanPersonal.setNidentificacion(rset.getString(5));
                beanPersonal.setSexo(rset.getString(6));
                beanPersonal.setDireccion(rset.getString(7));
                beanPersonal.setDistrito(rset.getString(8));                    
                beanPersonal.setCelular(rset.getString(9));                    
                ListaPersonal.add(beanPersonal);
            }                
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE PERSONAL SACTIFACTORIO");    
        } catch (SQLException ex) {System.err.println("PROBLEMAS CON LISTADO DE PERSONAL"); }
        return ListaPersonal;
    }
    public ArrayList<Personal> FiltrarTotalPersonal (String Letra){
        ArrayList<Personal> ListaPersonal;
        ListaPersonal = new ArrayList<>();
        try {         
            cn=super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery("SELECT nombre,apellido_pa,apellido_ma, t.nombre_ti ,numeroIdentificacion,sexo,direccion,Distrito,celular FROM PERSONAL p " +
            "inner join  tipoIdentificacion t on t.codigo_ti = p.tipo_identificacion  where nombre+' '+apellido_pa+' '+apellido_ma like '%"+Letra+"%' and activo = 1 order by apellido_pa asc");
              
            while(rset.next()){
                    Personal beanPersonal = new Personal(); 
                    beanPersonal.setNombre(rset.getString(1));
                    beanPersonal.setApellidopa(rset.getString(2));
                    beanPersonal.setApellidoma(rset.getString(3));                    
                    beanPersonal.setTidentificacion(rset.getString(4));
                    beanPersonal.setNidentificacion(rset.getString(5));
                    beanPersonal.setSexo(rset.getString(6));
                    beanPersonal.setDireccion(rset.getString(7));
                    beanPersonal.setDistrito(rset.getString(8));                    
                    beanPersonal.setCelular(rset.getString(9));                    
                    ListaPersonal.add(beanPersonal);
                }            
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE PERSONAL SACTIFACTORIO");     
        } catch (SQLException ex) {
            System.err.println("PROBLEMA EN EL LISTADO DE PERSONAL "+ex);
        } return ListaPersonal;
    }
   
}    
  