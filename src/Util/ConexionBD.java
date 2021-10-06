
package Util;

import java.sql.*;

public class ConexionBD {
    Connection cn=null;
    public Connection getConexion() {
                
        String url ="jdbc:sqlserver://192.168.1.19:1433;databaseName=BDSisTrans;";        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");            
            } catch (ClassNotFoundException ex) {
            System.out.println("Driver No es Correcto."+ex.getMessage());
        }
            try {
                cn= DriverManager.getConnection(url,"Pruebas","123");                
            } catch (SQLException ex) {
                System.out.println("no Conectadoi."+ ex);
            }
        return cn;
    }
    public static void main(String[] args) {
        ConexionBD c = new ConexionBD();
        c.getConexion();
    }
}
