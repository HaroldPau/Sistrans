
package Modelo.Dao;

import Util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class PagoDao extends ConexionBD {
    Connection cn = null;
    Statement stmt = null;
    PreparedStatement pt = null;
    public boolean RegistroPago(int codigo,String fecha, float total, int usuario){
        boolean bandera = false;
        try {
            String sql="insert into Pago values(?,?,?,?)";            
            
            cn = super.getConexion();
            pt = cn.prepareStatement(sql);            
            pt.setInt(1, codigo);
            pt.setString(2, fecha);
            pt.setFloat(3, total);
            pt.setInt(4, usuario);
            pt.execute();
            cn.close();
            pt.close();
            System.out.println("PAGO REGISTRADO");
            JOptionPane.showMessageDialog(null,"PAGO REGISTRADO","MENSAJE",2);
        } catch (SQLException e) {
            System.err.println("ERROR AL REGISTRAR PAGO  " + e);}        
        return bandera;
    }
    public int ContadorPago(){
        int numero=0;
        try {
            String sql="select max(codigo_rec) from Pago";        
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql);
                rset.next();
                numero= rset.getInt(1);            
            cn.close();
            stmt.close();
            rset.close();            
        } catch (SQLException e) {
            System.err.println("ERROR EN CONTAR ID PAGO "+e);
        }
        return numero;
    }
    public boolean RegistroDetallePagoV(int recibo,String CD){
        boolean bandera = false;
        try {
            String sql="insert into detalle_Rp_Vehiculo values(?,?)";    
            cn = super.getConexion();
            pt = cn.prepareStatement(sql);            
            pt.setInt(1, recibo);
            pt.setString(2, CD);                       
            pt.execute();
            cn.close();
            pt.close();
            System.out.println("DETALLEPAGOV REGISTRADO");                                    
        } catch (SQLException e) {
            System.err.println("ERROR AL REGISTRAR DETALLEPAGOV" + e);
        }        
        return bandera;
    }
    public boolean RegistroDetallePagoP(int recibo,String CD){
        boolean bandera = false;
        try {
            String sql="insert into detalle_Rp_Personal values(?,?)";
            cn = super.getConexion();
            pt = cn.prepareStatement(sql);            
            pt.setInt(1, recibo);
            pt.setString(2, CD);                       
            pt.execute();
            cn.close();
            pt.close();
            System.out.println("RegistroDetallePagoP REGISTRADO");
            bandera = true;
        } catch (SQLException e) {
            System.err.println("ERROR AL REGISTRAR RegistroDetallePagoP" + e);}        
        return bandera;
    }
    
}
