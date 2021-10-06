
package Controlador;
import Util.ConexionBD;
import java.net.URL;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
public class ControladorReportes {
    
    public void ReporteBoletajeDiario(String Fecha){
         try {
            ConexionBD con = new ConexionBD();
            Connection conn = con.getConexion();                
            Map parametro = new HashMap();
            JasperPrint jprint = null;
            parametro.put("fecha",Fecha); 
            URL path = this.getClass().getResource("/reportes/LiquidacionDiaria.jasper");
            JasperReport reporte = (JasperReport) JRLoader.loadObject(path);
            jprint = JasperFillManager.fillReport(reporte, parametro,conn);
            JasperViewer view = new JasperViewer(jprint,false); 
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            view.toFront();
        }catch (JRException ex) {
            System.err.println(ex);
        }
    }
    public void ReporteBoletajeDiarioDetallado(String Fecha,String Vehiculo, String Padron){
         try {
            ConexionBD con = new ConexionBD();
            Connection conn = con.getConexion();                
            Map parametro = new HashMap();
            JasperPrint jprint = null;
            parametro.put("fecha",Fecha);
            parametro.put("vehiculo",Vehiculo);
            parametro.put("padron",Padron);
            URL path = this.getClass().getResource("/reportes/LiquidacionDetallada.jasper");
            JasperReport reporte = (JasperReport) JRLoader.loadObject(path);
            jprint = JasperFillManager.fillReport(reporte, parametro,conn);
            JasperViewer view = new JasperViewer(jprint,false); 
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            view.toFront();
        }catch (JRException ex) {
            System.err.println(ex);
        }
    }
    
    public void ReporteBoletajeDiarioDetallado(String Fecha){
         try {
            ConexionBD con = new ConexionBD();
            Connection conn = con.getConexion();                
            Map parametro = new HashMap();
            JasperPrint jprint = null;
            parametro.put("Fecha",Fecha);
            URL path = this.getClass().getResource("/reportes/ReporteSalidaDiaria.jasper");
            JasperReport reporte = (JasperReport) JRLoader.loadObject(path);
            jprint = JasperFillManager.fillReport(reporte, parametro,conn);
            JasperViewer view = new JasperViewer(jprint,false); 
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            view.toFront();
        }catch (JRException ex) {
            System.err.println(ex);
        }
    }
    
    
}
