
package Modelo.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import Util.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VehiculoDao extends ConexionBD {
    Connection cn = null;
    Statement stmt = null;
    PreparedStatement pt = null;
    public boolean BuscarVehiculo(String Padron){
        boolean bandera = false;
        try {
            String sql="SELECT * FROM VEHICULO WHERE padron="+Padron;  
            cn = super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery(sql)) {
                boolean resultado = rset.next();
                if(resultado){
                    bandera = true;
                } else{
                    return false;
                }
                cn.close();
                stmt.close();
            }
        } catch (SQLException e) {
            System.err.println("ERROR AL BUSCAR" + e);
        }        
        return bandera;
    }
     public String ObtenerPlaca(String padron){
        String codigo = null;
        try {
            String sql="select placa from vehiculo where padron = "+padron;
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql);
            boolean resultado = rset.next();
            if(resultado){
                codigo= rset.getString(1);                
            }
                cn.close();
                stmt.close();
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE OBTENER PLACA PAPA" + e);
        }
        return codigo;
    }
     public String ObtenerCodigo(String placa){
        String codigo = null;
        try {
            String sql="select codigo_vehiculo from vehiculo where placa = '"+placa+"'";            
            
            cn = super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery(sql)) {
                boolean resultado = rset.next();
                if(resultado){
                    codigo= rset.getString(1);                
                }
                else{
                    return codigo;
                }
                cn.close();
                stmt.close();
            }
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE OBTENER CODIGO PAPA" + e);
        }
        return codigo;
    }
}