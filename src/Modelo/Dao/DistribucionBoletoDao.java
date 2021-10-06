package Modelo.Dao;
import Modelo.Bean.DistribucionBoletos;
import Util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class DistribucionBoletoDao extends ConexionBD {    
    Connection cn = null;
    Statement stmt = null;
    PreparedStatement pt = null;
    ResultSet rs = null;    
    public int Iddistribucion(){
        int id;
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("select max(codigo_ab) from abastecimiento_Boleto");
            if(rs.next()){
                id=rs.getInt(1)+1;
                rs.close();
                cn.close();
                return id;
            }
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO CONTAR DISTRIBUCION"+ex);
        }
        return 1;
    }
    public int IdDetalledistribucion(){
        int id;
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("select max(codigo_dab) from detalle_Abs_Boleto");
            if(rs.next()){
                id=rs.getInt(1)+1;
                rs.close();
                cn.close();
                return id;
            }
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO CONTAR DISTRIBUCION"+ex);
        }
        return 1;
    }
    public int IdDetalledistribucion(double precio, String inicio){
        int id;
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("select codigo_dab from detalle_Abs_Boleto where inicio = '"+inicio+"' and activo = 1 and precio = "+precio);
            if(rs.next()){
                id=rs.getInt(1);
                rs.close();
                cn.close();
                return id;
            }
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO obtener id detalleDISTRIBUCION"+ex);
        }
        return 0;
    }
    public void RegistrarDistibucion(int id, String Responsable, String fecha, int usuario, String Padron,String hora){
        try {
            cn = super.getConexion();
            pt =cn.prepareStatement("Insert into abastecimiento_Boleto Values(?,?,?,?,?,?)");
            pt.setInt(1, id);
            pt.setInt(2, usuario);
            pt.setString(3, Responsable);
            pt.setString(4, Padron);
            pt.setString(5, fecha);
            pt.setString(6, hora);
            pt.execute();
            pt.close();
            cn.close();
            System.out.println("----------");
            System.out.println(fecha);
            System.out.println("DISTRIBUCION OK");
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO REGISTRAR DISTRIBUCION "+ex);
        }
    }    
    public void RegistrarDetalleDis(int id, String inicio, String Final, double precio,int codDistribucion){
        try {
            cn = super.getConexion();
            pt = cn.prepareStatement("insert into detalle_Abs_Boleto values(?,?,?,?,?,?,?)");
            pt.setInt(1, id);
            pt.setDouble(2, precio);
            pt.setString(3, inicio);
            pt.setString(4, inicio);
            pt.setString(5,Final);
            pt.setInt(6,1);
            pt.setInt(7,codDistribucion);
            pt.execute();
            pt.close();
            cn.close();
            System.out.println("DETALLE OK");
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO REGISTRAR DISTRIBUCION "+ex);
        }
    }     
    public ArrayList<DistribucionBoletos> ObtenerBoletos(String precio, String padron){
            ArrayList<DistribucionBoletos> ListaBoletos;
            ListaBoletos = new ArrayList<>();
        try {          
            cn=super.getConexion();
            stmt = cn.createStatement();
            rs = stmt.executeQuery("SELECT dt.INICIO FROM detalle_Abs_Boleto dt inner join abastecimiento_Boleto d on dt.Distribucion = d.codigo_ab where activo = 1 and d.padron='"+padron+"' and dt.precio="+precio);
            while(rs.next()){
                    DistribucionBoletos ODB = new DistribucionBoletos();
                    ODB.setInicio(rs.getString(1));
                    ListaBoletos.add(ODB);
                }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE BOLETO EXITOSO");
            rs.close();
            } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR BOLETOS "+ex);
        }
        return ListaBoletos;
    }
    public boolean ActualizarDatosDistribucion(String operador , int codigo ) {
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            String sql = "update distribucion  set operador = '"+operador+"' where codigo = "+codigo ;
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);
            System.out.println(sql);
            if (n>0){
                System.out.println("!!ACTUALIZACION DE BOLETOS EXITOSA!!");
            }
            stmt.close();
            cn.close();
            
            return true;
        } catch (SQLException e) {
            System.err.println("problemas en la actualizacion de datos boletos " + e);
        }
        return false;
    }
    public boolean ActualizarEstadoDistribucion(String inicio, int iddetallebol , int estado ) {
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            String sql = "update detalle_Abs_Boleto set inicio ="+inicio+" , activo = "+estado+" where codigo_dab = "+iddetallebol;
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);
            
            System.out.println(sql);
            if (n>0){
                System.out.println("!!ACTUALIZACION DE BOLETOS EXITOSA!!");
            }
            stmt.close();
            cn.close();
            
            return true;
        } catch (SQLException e) {
            System.err.println("problemas en la actualizacion de estado boletos " + e);
        }
        return false;
    } 
    /**
     *
     * @param iddetallebol
     * USADO PARA ANULAR BOLETOS
     * @return
     */
    public boolean ActualizarEstadoDistribucion(int iddetallebol) {
        //dao para anular
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            String sql = "update detalle_Abs_Boleto set activo = 0 where codigo_dab = "+iddetallebol;
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);            
            System.out.println(sql);
            if (n>0){
                System.out.println("!!ANULACION DE BOLETOS EXITOSA!!");
            }
            stmt.close();
            cn.close();
            
            return true;
        } catch (SQLException e) {
            System.err.println("problemas en la ANULACION de estado boletos " + e);
        }
        return false;
    }
    public ArrayList<DistribucionBoletos> ObtenerBoletosLiquidacion( String padron){
        ArrayList<DistribucionBoletos> ListaBoletos;
        ListaBoletos = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("SELECT precio, inicio FROM detalle_Abs_Boleto dt inner join abastecimiento_Boleto ab on ab.codigo_ab = dt.distribucion  WHERE ACTIVO = 1 AND PADRON = '"+padron+"' ORDER BY PRECIO DESC")) {
                while(rset.next()){
                    DistribucionBoletos BDB = new DistribucionBoletos();                    
                    BDB.setPrecio(rset.getDouble(1));
                    BDB.setInicio(rset.getString(2));
                    ListaBoletos.add(BDB);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE BOLETO para liquidacion EXITOSO");
            
            
        } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR BOLETOS para liquidacion "+ex);
        }
        return ListaBoletos;
    }
    public String[] Busqueda2(String codigo,String precio, String padron){
        //DETALLA RESPONSABLE, HORA, FECHA Y USUARIO QUE DIO BOLETO        
        ResultSet rset =null;
        String[] datos = new String[4];
        try {
            String sql="select (p.nombre+' '+p.apellido_pa+' '+p.apellido_ma),(select convert(varchar(30),d.fecha,3)),u.nombre_usu,(Select CONVERT(varchar,d.hora,8)) from abastecimiento_Boleto d inner join personal p on d.responsable = p.codigo_personal " +
            "inner join detalle_Abs_Boleto dt on d.codigo_ab = dt.distribucion  inner join usuario u on u.codigo_usu = d.usuario where inicio = '"+codigo+"' and precio = "+precio+" and dt.activo = 1 and d.padron = '"+padron+"'";
            cn = super.getConexion();
            stmt = cn.createStatement();
            rset = stmt.executeQuery(sql);
            rset.next();
            datos[0]=rset.getString(1);
            datos[1]=rset.getString(2);
            datos[2]=rset.getString(3);
            datos[3]=rset.getString(4);
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE CONSULTAR" + e);
        }
        return datos;
    }
    public String[] Pegado(String padron){
        ResultSet rset =null;
        String[] datos = new String[2];        
        try {
            String sql="select d.responsable, (p.nombre +' '+p.apellido_pa + ' '+p.apellido_ma) from abastecimiento_Boleto d inner join personal p on p.codigo_personal = d.responsable where padron= '"+padron+"' order by fecha desc, d.codigo_ab desc";
            System.out.println(sql);
            cn = super.getConexion();
            stmt = cn.createStatement();
            rset = stmt.executeQuery(sql);
            rset.next();
            datos[0]=rset.getString(1);
            datos[1]=rset.getString(2);
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE CONSULTAR PEGADO" + e);
        }        
        return datos;
    }        
    // OK    
    public String[] Busqueda(String codigo,String precio){
        String [] cod = new String [4];
        try {
            String sql="select v.padron,(p.apellido_pa+' '+p.apellido_ma +', ' + p.nombre),p.numeroIdentificacion,(select convert(varchar(30),fecha,3)) as fecha from Personal p \n" +
        " inner join abastecimiento_Boleto d on  d.responsable = p.codigo_personal inner join vehiculo v on d.padron =  v.codigo_vehiculo " +
        " inner join  detalle_Abs_Boleto da on d.codigo_ab = da.distribucion where da.iniciofijo <= '"+codigo+"' and da.fin >= '"+codigo+"' and precio = "+precio+" order by fecha desc";
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql);
            if(rset.next()){
                cod[0]=rset.getString(1);
                cod[1]=rset.getString(2);
                cod[2]=rset.getString(3);
                cod[3]=rset.getString(4);
            }else{
                JOptionPane.showMessageDialog(null,"NO SE ENCONTRARON DATOS");
            }            
            

        } catch (SQLException e) {
            System.err.println("NO SE PUEDE REGISTRAR" + e);
        }
        return cod;
    }
 
    public int idDetalle(String inicio, double precio, String padron){
        int id;
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("SELECT dt.codigo FROM DETALLEDISTRIBUCION dt inner join distribucion d on d.codigo = dt.distribucion  WHERE dt.ACTIVO = 'SI' AND d.PADRON = '"+padron+"' and dt.inicio ='"+inicio+"' and dt.precio ="+precio+"  ORDER BY PRECIO DESC");
            
            if(rs.next()){
                id=rs.getInt(1);
                rs.close();
                cn.close();
                return id;
            }
            
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO obtener ID DETALLE"+ex);
        }
        return 0;
    }

    public int idDetalle(String inicio, double precio, String padron,String fecha){
        int id;
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("SELECT dt.codigo FROM HISTORIALBOLETO dt inner join distribucion d on d.codigo = dt.distribucion  WHERE d.PADRON = '"+padron+"' and dt.inicio ='"+inicio+"' and dt.precio ="+precio+" and d.fecha ='"+fecha+"'   ORDER BY PRECIO DESC");
            
            if(rs.next()){
                id=rs.getInt(1);
                rs.close();
                cn.close();
                return id;
            }
            
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO obtener id Detalle 2 "+ex);
        }
        return 0;
    }    
    public ArrayList<DistribucionBoletos> HistorialBoleto( String padron, String Fecha){
        ArrayList<DistribucionBoletos> ListaBoletos;
        ListaBoletos = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("SELECT PRECIO, INICIO ,(p.nombre+' '+p.apellido_pa+' '+p.apellido_ma) as nombre FROM HISTORIALBOLETO dt inner join distribucion d on d.codigo = dt.distribucion inner join Personal p on d.operador = p.codigo  WHERE PADRON = '"+padron+"' AND D.fecha= '"+Fecha+"' order BY  nombre desc , precio desc")) {
                while(rset.next()){
                    DistribucionBoletos ODB = new DistribucionBoletos();
                    ODB.setPrecio(rset.getDouble(1));
                    ODB.setInicio(rset.getString(2));
                    ODB.setOperador(rset.getString(3));
                    ListaBoletos.add(ODB);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE BOLETO EXITOSO");
            
            
        } catch (SQLException ex) {

            System.err.println("ERROR AL LISTAR HISTORIAL BOLETOS "+ex);
        }
        return ListaBoletos;
    }
      
      
      public ArrayList<DistribucionBoletos> ResponsablePorMes( String codigo, int mes, int año){
        ArrayList<DistribucionBoletos> ListaBoletos;
        ListaBoletos = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("SELECT v.padron, (select convert(varchar(30),d.fecha,3)), d.hora FROM Distribucion d inner join vehiculo v on d.padron = v.codigo WHERE operador = '"+codigo+"' and DATEPART(MONTH, d.fecha) =  "+mes+" and DATEPART(YEAR,d.fecha)= "+año)) {
                while(rset.next()){
                    DistribucionBoletos ODB = new DistribucionBoletos();
                    ODB.setPadron(rset.getInt(1));
                    ODB.setFecha(rset.getString(2));
                    ODB.setHora(rset.getString(3));
                    
                    ListaBoletos.add(ODB);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE BOLETO EXITOSO");
            
            
        } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR HISTORIAL BOLETOS "+ex);
        }
        return ListaBoletos;
    }
      
      
    
    
    
}
