
package Controlador;

import Modelo.Dao.DistribucionFlotaDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

public class ControladorDistribucionFL {
    
    DistribucionFlotaDao DF = new DistribucionFlotaDao();
    
    public void RegistrarLE (String padron, String Hora, String lado, String fecha, int frecuencia){        
        DF.RegistroListaEspera(DF.idListaEspera(), padron, Hora, lado, fecha,frecuencia);
    }
    public String getHoraSpinner(Object Hora){   
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.MINUTE);
        JSpinner spinner = new JSpinner(sm);
        JSpinner.DateEditor de = new JSpinner.DateEditor(spinner, "HH:mm");
        de.getTextField().setEditable( false );
        spinner.setEditor(de);
        
        return de.getFormat().format(Hora);  
    }
    public Date HoraSumada(int minutosASumar, String HoraBase) throws ParseException{        
        Date FechaBase = new SimpleDateFormat("HH:mm").parse(HoraBase);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(FechaBase); 
        calendar.add(Calendar.MINUTE, minutosASumar); 
        Date NuevaHora = calendar.getTime();
        System.out.println(NuevaHora);
        return NuevaHora;
    }
    
    
    public void ActualizarCobradorxVehi(String CodigoVehiculo,String CodigoCobrador){
        DF.ActualizarCobradorxVehiculo(CodigoVehiculo, CodigoCobrador);
    }
    public void ActualizarConductorxVehi(String CodigoVehiculo,String CodigoConductor){
        DF.ActualizarConductorxVehiculo(CodigoVehiculo, CodigoConductor);
    }
    public String ConductorxV(String CodigoVehiculo){
        return DF.ConductorXvehiculo(CodigoVehiculo);
    }
    public String CobradorxV(String CodigoVehiculo){
        return DF.CobradorXvehiculo(CodigoVehiculo);
    }
    public String[] DatosPxV(String CodigoVehiculo){
        return DF.DatosPxV(CodigoVehiculo);
    }
    public void eliminarListaEspera(String padron, String lado){
        DF.eliminar(padron, lado);
    }
    public void RegistroSalida(String Terminal, String Hora, String CodConductor, String CodCobrador, String CodPadron, String fecha){
        DF.RegistroSalidaV(DF.idSalidaVehicular(), Terminal, Hora, CodConductor, CodCobrador, CodPadron, fecha, DF.ObtenerFrecuencia(CodPadron, Terminal));
    }
    
    
    
}
