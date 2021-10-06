
package Modelo.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Util.ConexionBD;

/**
 *
 * @author Harold7v7
 */
public class ValidarLogin extends ConexionBD {
    
     Connection cn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public boolean logeo(String usu, String clave){
        
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("Select * from Usuario where nombre_usu = '"+usu+"' and clave_usu ='"+clave+"'");
            
            if(rs.next()){
                rs.close();
                stmt.close();
                cn.close();
                return true;
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            System.err.println(ex);}
       return false;
    }
    
    public int nivel(String usu){
        int nv =1;
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("select codigo_usu from usuario where nombre_usu ='"+usu+"'");
            
            if(rs.next()){
                nv=rs.getInt(1);
                rs.close();
                stmt.close();
                cn.close();
                return nv;
            }
            
        } catch (SQLException ex) {
            System.err.println(ex);}
       return nv;
    }
    
    
    
}
