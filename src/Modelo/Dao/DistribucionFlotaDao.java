
package Modelo.Dao;
import Util.ConexionBD;
import Modelo.Bean.ListaEspera;
import Modelo.Bean.SalidaVehicular;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DistribucionFlotaDao extends ConexionBD{
    Connection cn = null;
    Statement stmt = null;
    PreparedStatement pt = null;    
     public boolean RegistroListaEspera(int Codigo, String Padron , String hora, String lado,String fecha, int frecuencia){
        boolean bandera = false;
        try {
            String sql="insert into ListaEspera values (?,?,?,?,?,?)";   
            cn = super.getConexion();
            pt = cn.prepareStatement(sql);
            pt.setInt(1, Codigo);
            pt.setString(2, Padron);
            pt.setString(3, hora);
            pt.setString(4, lado);
            pt.setString(5, fecha);
            pt.setInt(6, frecuencia);
            pt.execute();
            cn.close();
            pt.close();
            System.out.println("Añadido a lista de espera");
        } catch (SQLException e) {
            System.err.println("Error al añadir a lista de espera" + e);
        }
        return bandera;
    }
     public int idListaEspera(){
        int codigo = 0;
        try {
            String sql="select max(CodigoLE) from ListaEspera ";   
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql);
            if(rset.next()){
                codigo= rset.getInt(1)+1;                
            }
            cn.close();
            stmt.close();
            rset.close(); 
            return codigo;
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE OBTENER CODIGO lista espera" + e);
        }
        return codigo;
    }     
     public ArrayList<ListaEspera> ListadoEspera(String Lado, String Fecha){
        ArrayList<ListaEspera> ListadoEspera = new ArrayList<>();
        try {           
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("select ROW_NUMBER() over(order by hora ASC)as orden, v.padron,v.placa,le.hora,(select count(codigo_ab)from abastecimiento_Boleto ab where ab.padron = le.padron and ab.fecha =le.fecha) as boletos,"+
            " (select isnull (dv.activo + 0,0)from deuda_vehiculo dv where dv.vehiculo = le.padron and dv.fecha = le.fecha and dv.descripcion='COTIZACION')as cotizacion from ListaEspera le " +
            " inner join vehiculo v on v.codigo_vehiculo = le.padron where fecha = '"+Fecha+"' and le.terminal = '"+Lado+"'")) {
                    while(rset.next()){
                    ListaEspera ODB = new ListaEspera();
                    ODB.setOrden(rset.getInt(1));
                    ODB.setPadron(rset.getString(2));
                    ODB.setPlaca(rset.getString(3));
                    ODB.setHora(rset.getString(4));
                    if(rset.getInt(5)==0){
                        ODB.setBoletos("NO ABASTECIDO");
                    }else{
                        ODB.setBoletos("ABASTECIDO");
                    }                    
                        switch (rset.getInt(6)) {
                            case 1:
                                ODB.setCotizacion("ESPERANDO PAGO");
                                break;
                            case 2:
                                ODB.setCotizacion("EXONERADO");
                                break;
                            case 0:
                                ODB.setCotizacion("1 vez");
                                break;
                            case 3:
                                ODB.setCotizacion("PAGO");
                                break;
                        }                    
                    ListadoEspera.add(ODB);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE Lista de espera SACTIFACTORIO");
        } catch (SQLException ex) {
            System.err.println("PROBLEMA EN EL LISTADO DE PERSONAL "+ex);
        }
        return ListadoEspera;
    }
     public boolean ActualizarCobradorxVehiculo(String CodigoVehiculo , String CodigoCobrador) {
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            String sql = "update VehiculoxPersonal set cobrador = '"+CodigoCobrador+"' where vehiculo = '"+CodigoVehiculo+"'" ;
            stmt.executeUpdate(sql);            
            System.out.println("!!ACTUALIZACION DE cobradorxvehiculo EXITOSO!!");
            stmt.close();
            cn.close();            
            return true;
        } catch (SQLException e) {
            System.err.println("problemas en la actualizacion de de cobradorxvehiculo " + e);
        }
        return false;
    }
     public boolean ActualizarConductorxVehiculo(String CodigoVehiculo , String CodigoConductor) {
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            String sql = "update VehiculoxPersonal set conductor = '"+CodigoConductor+"' where vehiculo = '"+CodigoVehiculo+"'" ;
            stmt.executeUpdate(sql);            
            System.out.println("!!ACTUALIZACION DE conductorrxvehiculo EXITOSO!!");
            stmt.close();
            cn.close();            
            return true;
        } catch (SQLException e) {
            System.err.println("problemas en la actualizacion de de conductorrxvehiculo " + e);
        }
        return false;
    }
     public String ConductorXvehiculo(String Padron){
        String ope = "REGISTRE OPERADOR";
        try {
            String sql="select (p.nombre+' '+p.apellido_pa+' '+p.apellido_pa) from vehiculoxpersonal vp inner join " +
            "personal p on vp.conductor = p.codigo_personal where vehiculo= '"+Padron+"'";   
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql);
            if(rset.next()){
                ope= rset.getString(1);                
            }
            cn.close();
            stmt.close();
            rset.close(); 
            
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE OBTENER CODIGO VXP" + e);
        }
        return ope;
    } 
     public String CobradorXvehiculo(String Padron){
        String ope = "REGISTRE OPERADOR";
        try {
            String sql="select (p.nombre+' '+p.apellido_pa+' '+p.apellido_pa) from vehiculoxpersonal vp inner join " +
            "personal p on vp.cobrador = p.codigo_personal where vehiculo= '"+Padron+"'";   
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql);
            if(rset.next()){
                ope= rset.getString(1);                
            }
            cn.close();
            stmt.close();
            rset.close(); 
            
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE OBTENERCobradorXvehiculo" + e);
        }
        return ope;
    }
     public String[] DatosPxV(String CodVehiculo){
            
        ResultSet rset =null;
        String[] datos = new String[3];
        try {
            String sql="select * from VehiculoxPersonal where vehiculo = '"+CodVehiculo+"'";
            cn = super.getConexion();
            stmt = cn.createStatement();
            rset = stmt.executeQuery(sql);
            rset.next();
            datos[0]=rset.getString(1);
            datos[1]=rset.getString(2);
            datos[2]=rset.getString(3);
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE CONSULTAR DATOS VXP" + e);
        }
        return datos;
    }
     public boolean RegistroSalidaV(int Codigo, String Terminal, String Hora, String CodConductor, String CodCobrador, String CodPadron, String fecha, int frecuencia){
        boolean bandera = false;
        try {
            String sql="insert into SalidaVehicular values (?,?,?,?,?,?,?,?,?)";   
            cn = super.getConexion();
            pt = cn.prepareStatement(sql);
            pt.setInt(1, Codigo);
            pt.setString(2, Terminal);
            pt.setString(3, Hora);
            pt.setString(4, CodConductor);
            pt.setString(5, CodCobrador);
            pt.setString(6, CodPadron);
            pt.setString(7, fecha);
            pt.setInt(8, frecuencia);
            pt.setDouble(9,0.5);
            pt.execute();
            cn.close();
            pt.close();
            System.out.println("Añadido a SalidaVehicular");
        } catch (SQLException e) {
            System.err.println("Error al añadir a SalidaVehicular" + e);
        }
        return bandera;
    }
     public int idSalidaVehicular(){
        int codigo = 0;
        try {
            String sql="select max(Codigo_dist) from SalidaVehicular ";   
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql);
            if(rset.next()){
                codigo= rset.getInt(1)+1;                
            }
            cn.close();
            stmt.close();
            rset.close(); 
            return codigo;
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE OBTENER CODIGO lista espera" + e);
        }
        return codigo;
    }
     public void eliminar(String padron, String lado){        
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            stmt.executeUpdate("delete ListaEspera where padron = '"+padron+"' and terminal = '"+lado+"'");         
            stmt.close();
            cn.close();
            System.out.println("SE PUDO ELIMINAR ListaEspera");
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO ELIMINAR ListaEspera"+ex);
        }
        
    }
     public int ObtenerFrecuencia(String Padron, String Lado){
        int ope = 0;
        try {
            String sql="select frecuencia from ListaEspera where padron ='"+Padron+"' and terminal ='"+Lado+"'";   
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql);
            if(rset.next()){
                ope= rset.getInt(1);                
            }
            cn.close();
            stmt.close();
            rset.close(); 
            
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE OBTENER CODIGO lista espera" + e);
        }
        return ope;
    }
     public ArrayList<SalidaVehicular> HistorialSalida (String CodVehiculo, String Fecha){
        ArrayList<SalidaVehicular> ListadoEspera = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("select terminal, Nvuelta,(Select CONVERT(varchar,hora,8)),"
                    + "(Select CONVERT(varchar,DATEADD(mi,25, (DATEADD(hh,2, hora))),8)) as llegada from SalidaVehicular where fecha ='"+Fecha+"' and padron = '"+CodVehiculo+"' ")) {
                    double vuelta = 0;
                    while(rset.next()){
                    vuelta+=rset.getDouble(2) ; 
                    SalidaVehicular ODB = new SalidaVehicular();
                    ODB.setLado(rset.getString(1));
                    ODB.setNsalida(vuelta);
                    ODB.setHoraSalida(rset.getString(3));
                    ODB.setHorallegada(rset.getString(4));                                     
                    ListadoEspera.add(ODB);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE Lista de espera SalidaVehicular");
        } catch (SQLException ex) {
            System.err.println("PROBLEMA EN EL SalidaVehicularL "+ex);
        }
        return ListadoEspera;
    }             
}

 
    

