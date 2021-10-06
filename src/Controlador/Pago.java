
package Controlador;

import Modelo.Dao.DeudaDao;
import Modelo.Dao.PagoDao;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Pago {
    static DefaultTableModel modelo;
    static ControladorEnviarDatos CED = new ControladorEnviarDatos();
    
    static public void Registrar(boolean estado, DefaultTableModel modelo){
        
        boolean bandera=false;
        PagoDao PD = new PagoDao();
        DeudaDao ODeuda = new DeudaDao();
        int n;
        if(estado){
            n=1;
        }else{
            n=0;
        }        
        //Fecha Actual        
        Calendar fecha = new GregorianCalendar();        
        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);       
        String fechaActual= String.valueOf(ano)+"/" +String.valueOf(mes+1)+ "/" +String.valueOf(dia);
        
        int codigo = PD.ContadorPago()+1;
        float total =0;
        int nfilas =modelo.getRowCount();            
        for(int i=0; i<nfilas; i++){            
            if((boolean)modelo.getValueAt(i, 5-n)){
                bandera=true;
                total += (float)modelo.getValueAt(i,2);
             }            
        }
        if (bandera){
            PD.RegistroPago(codigo, fechaActual, total,CED.getDatoUsuario());            
        }else{
            JOptionPane.showMessageDialog(null, "SELECCIONE ALGUN REGISTRO","ERROR",0);
        } 
        
        for(int i=modelo.getRowCount()-1; i>=0; i=i-1){
            if((boolean)modelo.getValueAt(i, 5-n)){
                
                if(estado){
                    PD.RegistroDetallePagoP(codigo,modelo.getValueAt(i, 0).toString());
                    ODeuda.ActualizarDeudaP(modelo.getValueAt(i, 3).toString());                    
                }else{
                    PD.RegistroDetallePagoV(codigo,modelo.getValueAt(i, 0).toString());
                    ODeuda.ActualizarDeudaV(modelo.getValueAt(i, 0).toString(),3);                    
                }                                
             }            
        }
    }

}
