
package Controlador;

import Modelo.Bean.DeudaPersonal;
import Modelo.Bean.DeudaVehiculo;
import Modelo.Bean.DistribucionBoletos;
import Modelo.Bean.ExoPagoV;
import Modelo.Bean.ListaEspera;
import Modelo.Bean.Personal;
import Modelo.Bean.SalidaVehicular;
import Modelo.Dao.DeudaDao;
import Modelo.Dao.DistribucionBoletoDao;
import Modelo.Dao.DistribucionFlotaDao;
import Modelo.Dao.ExoneracionDao;
import Modelo.Dao.PersonalDao;
import Vista.Boletaje.ControlBoletos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Tablas {    
        static PersonalDao DP = new PersonalDao();
        static DefaultTableModel modelo;
        static DeudaDao ODeuda = new DeudaDao();
        static DistribucionFlotaDao DF = new DistribucionFlotaDao();
        static DistribucionBoletoDao DBD = new DistribucionBoletoDao();
        static ExoneracionDao EX = new ExoneracionDao();        
        
    public static void LlenarTablaPersonal(DefaultTableModel model, int cargo){
            ArrayList<Personal> ListadoPersonal;                 
            ListadoPersonal= DP.ListadoPersonal(cargo);        
            modelo = model;
            ListadoPersonal.forEach((obj) -> 
            { modelo.addRow(new Object[] {obj.getNombre(),obj.getApellidopa(),obj.getApellidoma(), obj.getTidentificacion(),obj.getNidentificacion()} );
            });
    }
    
    public static void LlenarTablaPersonal(DefaultTableModel model){
        //LISTA EL TOTAL DE LOS OPERADORES
            ArrayList<Personal> ListadoPersonal;                 
            ListadoPersonal= DP.ListadoTotalPersonal();        
            modelo = model;
            ListadoPersonal.forEach((obj) -> 
            { modelo.addRow(new Object[] {obj.getNombre(),obj.getApellidopa(),obj.getApellidoma(), obj.getTidentificacion(),obj.getNidentificacion()} );
            });
    }
    
    
    static public void LimpiarTabla(DefaultTableModel model){
            for(int i=model.getRowCount()-1; i>=0; i=i-1){
            model.removeRow(i);} 
    }
    
    static public void llenarTablaDP(DefaultTableModel modelo , String CodigoPersonal){
        ArrayList<DeudaPersonal>ListaDeudaP;
        ListaDeudaP= ODeuda.ListadoDeudaP(CodigoPersonal);
        ListaDeudaP.forEach((obj) ->{
        modelo.addRow(new Object[]{obj.getCodigo(),obj.getConcepto(),obj.getMonto(),obj.getFecha(),false} );
        });
    }
    static public void llenarTablaDV(DefaultTableModel modelo , String Codigo){   
        ArrayList<DeudaVehiculo>ListaDeudaV;
        ListaDeudaV= ODeuda.ListadoDeudaV(Codigo);
        ListaDeudaV.forEach((obj) ->{
        modelo.addRow(new Object[]{obj.getCodigo(),obj.getConcepto(),obj.getDeuda(),obj.getFecha(),obj.getResponsable(),false} );
        });
    }
    public static void FiltrarTablaPersonal(DefaultTableModel model,String busqueda, int cargo){
        for(int i=model.getRowCount()-1; i>=0; i=i-1){
            model.removeRow(i);}        
            ArrayList<Personal> ListadoPersonal; 
            ListadoPersonal= DP.FiltrarPersonal(busqueda,cargo);
            ListadoPersonal.forEach((obj) -> {
            model.addRow(new Object[] {obj.getNombre(),obj.getApellidopa(),obj.getApellidoma(), obj.getTidentificacion(),obj.getNidentificacion()} );
        });
    }
    public static void FiltrarTablaPersonal(DefaultTableModel model,String busqueda){
        for(int i=model.getRowCount()-1; i>=0; i=i-1){
            model.removeRow(i);}        
            ArrayList<Personal> ListadoPersonal; 
            ListadoPersonal= DP.FiltrarTotalPersonal(busqueda);
            ListadoPersonal.forEach((obj) -> {
            model.addRow(new Object[] {obj.getNombre(),obj.getApellidopa(),obj.getApellidoma(), obj.getTidentificacion(),obj.getNidentificacion()} );
        });
    }
    public static void LlenarTablaListaEspera(DefaultTableModel model, String Lado, String Fecha){
            ArrayList<ListaEspera> ListadoLE;                 
            ListadoLE= DF.ListadoEspera(Lado, Fecha);
            modelo = model;
            ListadoLE.forEach((obj) -> 
            { modelo.addRow(new Object[] {obj.getOrden(), obj.getPadron(),obj.getPlaca(),obj.getHora(),obj.getBoletos(),obj.getCotizacion()} );
            });
    }
    public static void LlenarTablaControlBoleto(DefaultTableModel model,String precio, String padron){
        ArrayList<DistribucionBoletos> ListaBoletos;
        ListaBoletos = DBD.ObtenerBoletos(precio, padron);        
        ListaBoletos.forEach((obj) -> {
            model.addRow(new Object[] {obj.getInicio()});
        });
    }
    static public void LLenarTablaLiquidacion(DefaultTableModel tb,String Padron){
        ArrayList<DistribucionBoletos> ListaBoletos;
        ListaBoletos = DBD.ObtenerBoletosLiquidacion(Padron);        
        ListaBoletos.forEach((obj) -> {
            tb.addRow(new Object[]{obj.getPrecio(),obj.getInicio(),"",true});            
        });
    }
    public void actualizarTablaControlBol(String CodVehiculo){
        LimpiarTabla((DefaultTableModel) ControlBoletos.tb5.getModel());
        LimpiarTabla((DefaultTableModel) ControlBoletos.tb4.getModel());
        LimpiarTabla((DefaultTableModel) ControlBoletos.tb3.getModel());
        LimpiarTabla((DefaultTableModel) ControlBoletos.tb25.getModel());
        LimpiarTabla((DefaultTableModel) ControlBoletos.tb2.getModel());
        LimpiarTabla((DefaultTableModel) ControlBoletos.tb15.getModel());
        LimpiarTabla((DefaultTableModel) ControlBoletos.tb12.getModel());
        LimpiarTabla((DefaultTableModel) ControlBoletos.tb1.getModel());
        LimpiarTabla((DefaultTableModel) ControlBoletos.tb70.getModel());
        LimpiarTabla((DefaultTableModel) ControlBoletos.tb50.getModel());

        LlenarTablaControlBoleto((DefaultTableModel) ControlBoletos.tb5.getModel(),"5.00",CodVehiculo);
        LlenarTablaControlBoleto((DefaultTableModel) ControlBoletos.tb4.getModel(),"4.00",CodVehiculo);
        LlenarTablaControlBoleto((DefaultTableModel) ControlBoletos.tb3.getModel(),"3.00",CodVehiculo);
        LlenarTablaControlBoleto((DefaultTableModel) ControlBoletos.tb25.getModel(),"2.50",CodVehiculo);
        LlenarTablaControlBoleto((DefaultTableModel) ControlBoletos.tb2.getModel(),"2.00",CodVehiculo);
        LlenarTablaControlBoleto((DefaultTableModel) ControlBoletos.tb15.getModel(),"1.50",CodVehiculo);
        LlenarTablaControlBoleto((DefaultTableModel) ControlBoletos.tb12.getModel(),"1.20",CodVehiculo);
        LlenarTablaControlBoleto((DefaultTableModel) ControlBoletos.tb1.getModel(),"1.00",CodVehiculo);
        LlenarTablaControlBoleto((DefaultTableModel) ControlBoletos.tb70.getModel(),"0.70",CodVehiculo);
        LlenarTablaControlBoleto((DefaultTableModel) ControlBoletos.tb50.getModel(),"0.50",CodVehiculo);
    }
    
    static public void LLenarTablaAnular(DefaultTableModel tb,String Padron){
        ArrayList<DistribucionBoletos> ListaBoletos;
        ListaBoletos = DBD.ObtenerBoletosLiquidacion(Padron);        
        ListaBoletos.forEach((obj) -> {
            tb.addRow(new Object[]{obj.getPrecio(),obj.getInicio(),false});            
        });
    }
    
    static public void LLenarTablaSolicitudExo(DefaultTableModel tb,String Fecha){
        ArrayList<ExoPagoV> ListaBoletos;
        ListaBoletos = EX.ListadoExoPago(Fecha);
        ListaBoletos.forEach((obj) -> {
            tb.addRow(new Object[]{obj.getCodigoE(),obj.getPlaca(),obj.getMonto(),obj.getFecha(),obj.getEstado()});            
        });
    }
    static public void LLenarTablaRecibo(DefaultTableModel tb,String cod){
        ArrayList<ExoPagoV> ListaBoletos;
        ListaBoletos = EX.ListadoRecibo(cod);
        ListaBoletos.forEach((obj) -> {
            tb.addRow(new Object[]{obj.getCodigoE()});            
        });
    }
    static public void LLenarTablaHSalida(DefaultTableModel tb,String CodVehi, String Fecha){
        ArrayList<SalidaVehicular> ListaBoletos;
        ListaBoletos = DF.HistorialSalida(CodVehi, Fecha);
        ListaBoletos.forEach((obj) -> {
            tb.addRow(new Object[]{obj.getNsalida(),obj.getLado(),obj.getHoraSalida(),obj.getHorallegada()});            
        });
    }

    
}
