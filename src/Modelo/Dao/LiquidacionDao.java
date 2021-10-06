
package Modelo.Dao;

import Modelo.Bean.Liquidacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import Util.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LiquidacionDao extends ConexionBD {
    
    Connection cn = null;
    Statement stmt = null;
    PreparedStatement pt = null;
    ResultSet rs = null;
    
    public boolean RegistrarLiquidacion(int id, String padron,String fecha, String operador, int Usuario, int vuelta){
        
        try {
            cn = super.getConexion();
            System.out.println("INSERT INTO LIQUIDACION VALUES ("+id+","+fecha+","+operador+","+padron+","+Usuario+","+vuelta+")");
            pt = cn.prepareStatement("INSERT INTO LIQUIDACION VALUES (?,?,?,?,?,?)");            
            pt.setInt(1, id);
            pt.setString(2, fecha);
            pt.setString(3,operador);
            pt.setString(4, padron);
            pt.setInt(5, Usuario);
            pt.setInt(6, vuelta);

            
            pt.execute();
            pt.close();
            cn.close();
            System.out.println("LIQUIDACION GOZUEL");
            return true;
        } catch (SQLException e) {
            System.err.println("ERROR AL LIQUIDAR" + e);
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR LIQUIDACION"+ e);
        }
        return false;
    }
    public boolean RegistrarDetalleLiquidacion(int id, double  precio , int cantidad , int codliquidacion, int codDetaBolt){
        try {
            System.err.println("INSERT INTO det_LIQUIDACION VALUES ("+id+","+precio+","+cantidad+","+codliquidacion+","+codDetaBolt+")");
            cn = super.getConexion();
            pt = cn.prepareStatement("INSERT INTO det_LIQUIDACION VALUES (?,?,?,?,?)");
            pt.setInt(1, id);
            pt.setDouble(2, precio);
            pt.setInt(3,cantidad);
            pt.setInt(4, codliquidacion);
            pt.setInt(5, codDetaBolt);
            pt.execute();
            pt.close();
            cn.close();
            System.out.println("LIQUIDACION GOZUEL");
            return true;
        } catch (SQLException e) {
            System.err.println("ERROR AL detalleLIQUIDAR" + e);
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR detalle LIQUIDACION"+ e);
        }
        
        return false;
    }
    public ArrayList<Liquidacion> ObtenerLiquidacion( String inicio, String padron){
        ArrayList<Liquidacion> ListaLiquidacion;
        ListaLiquidacion = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("select  precio ,sum (cantidad), sum (cantidad * precio) as total ,(select convert(varchar(30),fecha,3)), (p.nombre +' ' +p.apellido_pa + ' '+p.apellido_ma) ,vueltas, p.codigo from liquidacion l inner join Personal p on l.operador = p.codigo where fecha = '"+inicio+"' and padron = '"+padron+"' group by precio,fecha,nombre,apellido_pa,apellido_ma,VUELTAS,p.codigo ORDER BY NOMBRE")) {
                while(rset.next()){
                    Liquidacion OL = new Liquidacion();
                    OL.setPrecio(rset.getDouble(1));
                    OL.setCantidad(rset.getInt(2));
                    OL.setTotal(rset.getDouble(3));
                    OL.setFecha(rset.getString(4));
                    OL.setNombre(rset.getString(5));
                    OL.setVuelta(rset.getInt(6));
                    OL.setCodigoe(rset.getString(7));
                    ListaLiquidacion.add(OL);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE LIQUIDACION");
            
            
        } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR LIQUIDACION "+ex);
            
        }
        return ListaLiquidacion;
    }
    public int idLiquidacion(){
        int id;
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("select max(codigo_liq) from Liquidacion");
            
            if(rs.next()){
                id=rs.getInt(1)+1;
                rs.close();
                cn.close();
                return id;
            }
            
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO CONTAR liquidacion"+ex);
        }
        return 1;
    }
    public int idDetalleLiquidacion(){
        int id;
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("select max(codigo_dl) from det_liquidacion");
            
            if(rs.next()){
                id=rs.getInt(1)+1;
                rs.close();
                cn.close();
                return id;
            }
            
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO CONTAR liquidacion"+ex);
        }
        return 1;
    }
    //OK
    
    public ArrayList<Liquidacion> ObtenerLiquidacionFiltro( String inicio, String padron,String codigo){
        ArrayList<Liquidacion> ListaLiquidacion;
        ListaLiquidacion = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("select  precio ,sum (cantidad), sum (cantidad * precio) as total ,(select convert(varchar(30),fecha,3)), (p.nombre +' ' +p.apellido_pa + ' '+p.apellido_ma) ,vueltas, p.codigo from liquidacion l inner join Personal p on l.operador = p.codigo where fecha = '"+inicio+"' and padron = '"+padron+"' and l.operador= '"+codigo+"' group by precio,fecha,nombre,apellido_pa,apellido_ma,VUELTAS,p.codigo")) {
                while(rset.next()){
                    Liquidacion OL = new Liquidacion();
                    OL.setPrecio(rset.getDouble(1));
                    OL.setCantidad(rset.getInt(2));
                    OL.setTotal(rset.getDouble(3));
                    OL.setFecha(rset.getString(4));
                    OL.setNombre(rset.getString(5));
                    OL.setVuelta(rset.getInt(6));
                    OL.setCodigoe(rset.getString(7));
                    ListaLiquidacion.add(OL);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE LIQUIDACION");
            
            
        } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR LIQUIDACION "+ex);
        }
        return ListaLiquidacion;
    }    
    public ArrayList<Liquidacion> LiquidacionDiaria( String fecha){
        ArrayList<Liquidacion> ListaLiquidacion;
        ListaLiquidacion = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("select v.padron, (p.nombre +' '+p.apellido_pa+' '+p.apellido_ma), l.vueltas, sum (cantidad * precio) as total  from liquidacion l inner join vehiculo v on l.padron = v.codigo inner join personal p on l.operador = p.codigo where fecha = '"+fecha+"' group by v.padron, p.nombre, apellido_pa, apellido_ma, l.vueltas order by v.padron")) {
                while(rset.next()){
                    Liquidacion OL = new Liquidacion();
                    OL.setPadron(rset.getString(1));
                    OL.setNombre(rset.getString(2));
                    OL.setVuelta(rset.getInt(3));
                    OL.setTotal(rset.getDouble(4));
                    
                    ListaLiquidacion.add(OL);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE LIQUIDACION DIARIA");
            
            
        } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR LIQUIDACION DIARIA "+ex);
        }
        return ListaLiquidacion;
    }    
    public ArrayList<Liquidacion> ListaLiquiActualizar( String fecha, String padron){
        ArrayList<Liquidacion> ListaLiquidacion;
        ListaLiquidacion = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("select l.codigo, precio, inicio,(p.nombre +' '+ p.apellido_pa +' '+ p.apellido_ma),  vueltas, CodigoDB,guia from liquidacion l inner join Personal p on l.operador= p.codigo where fecha = '"+fecha+"' and padron ='"+padron+"'")) {
                while(rset.next()){
                    Liquidacion OL = new Liquidacion();
                    OL.setCodigoL(rset.getInt(1));
                    OL.setPrecio(rset.getDouble(2));
                    OL.setInicio(rset.getString(3));
                    OL.setNombre(rset.getString(4));
                    OL.setVuelta(rset.getInt(5));
                    OL.setCodigob(rset.getInt(6));
                    OL.setGuia(rset.getInt(7));
                    
                    ListaLiquidacion.add(OL);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE LIQUIDACION DIARIA");
            
            
        } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR LIQUIDACION DIARIA "+ex);
        }
        return ListaLiquidacion;
    }
    public void eliminar(int id){
        
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            stmt.executeUpdate("delete liquidacion where codigo = "+id);
            
            
            stmt.close();
            cn.close();
            
            System.out.println("SE PUDO ELIMINAR liquidacion");
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO ELIMINAR liquidacion"+ex);
        }
        
    }
    public void anularliquidacion(String inicio, int id){
        
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            stmt.executeUpdate("update Detalledistribucion set inicio = '"+inicio+"' , activo = 'SI' WHERE codigo = '"+id+"'");
            
            
            stmt.close();
            cn.close();
            
            System.out.println("LIQUIDACION DESEECHA");
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO DESECHAR liquidacion"+ex);
        }
        
    }
    public void editarvuelta(int guia,int vuelta){
        
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            stmt.executeUpdate("update liquidacion set vueltas ="+vuelta+" where guia = "+guia);
            
            
            stmt.close();
            cn.close();
            
            System.out.println("SE PUDO actualizar vuelta liquidacion");
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO actualizar vuelta liquidacion"+ex);
        }
        
    }

}


