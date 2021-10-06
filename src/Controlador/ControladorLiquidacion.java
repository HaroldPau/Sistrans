
package Controlador;
import Modelo.Dao.DistribucionBoletoDao;
import Modelo.Dao.LiquidacionDao;
import java.applet.AudioClip;
import javax.swing.JOptionPane;
import static Vista.Boletaje.LiqudacionBoletos.tLiquidacion;
import static Vista.Boletaje.LiqudacionBoletos.lblactivo;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Harold7v7
 */
public class ControladorLiquidacion {
    int Bcontador=0;
    DefaultTableModel tb = (DefaultTableModel) tLiquidacion.getModel();
    DistribucionBoletoDao DBD = new DistribucionBoletoDao();
    LiquidacionDao LD = new LiquidacionDao();
    ControladorEnviarDatos CED = new ControladorEnviarDatos();    
    @SuppressWarnings("empty-statement")
    public void autorrellenar(String numero){
        
        DefaultTableModel tb = (DefaultTableModel) tLiquidacion.getModel();
        
        AudioClip sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/error.wav"));;
        if(numero.length()<=5 &&numero.length()>0 ){
                sonido.play();
                JOptionPane.showMessageDialog(null,"DIGITE LOS 6 DIGITOS");   
        }else{
            
            int contador= 0;
            String[] Datos = {"5.00","4.00","3.00","2.50","2.00","1.50","1.20","1.00","0.70","0.50"};
            String n2=numero;
            String inicio,precio;
            double preciod;
            int fila=0;
            for(int i=tb.getRowCount()-1; i>=0; i=i-1){                
                inicio=(String)tLiquidacion.getValueAt(i,1);                
                if(inicio.substring(0, 4).equals(n2.substring(0,4)) ){                    
                    contador= contador+ 1;                    
                    fila=i;
                }                
            }
            if(contador==1){
                int numero1 = Integer.parseInt((String)tLiquidacion.getValueAt(fila,1));
                int numero2 = Integer.parseInt(numero);
                if(numero1>numero2){
                    sonido.play();
                    JOptionPane.showMessageDialog(null,"BOLETO MAL DIGITADO");
                }else{
                    if(tLiquidacion.getValueAt(fila, 2).equals("")){
                        Bcontador++;                            
                    }                   
                    tLiquidacion.setValueAt(n2, fila,2);
                    lblactivo.setText(""+Bcontador);
                }

            }else if (contador > 1) {
                precio= JOptionPane.showInputDialog(null,"Selecciona precio", "PRECIO",JOptionPane.QUESTION_MESSAGE,null,Datos, Datos[0]).toString();
                for(int i=tb.getRowCount()-1; i>=0; i=i-1){
                    preciod = (double)tLiquidacion.getValueAt(i,0);
                    inicio=(String)tLiquidacion.getValueAt(i,1);                
                    if((inicio.substring(0, 4).equals(n2.substring(0,4))) && preciod == Double.parseDouble(precio)  ){                    
                        contador= contador+ 1;                    
                        fila=i;
                    }                    
                }
                int numero1 = Integer.parseInt((String)tLiquidacion.getValueAt(fila,1));
                int numero2 = Integer.parseInt(numero);
                if(numero1>numero2){
                    sonido.play();
                    JOptionPane.showMessageDialog(null,"BOLETO MAL DIGITADO");
                }else{
                    if(tLiquidacion.getValueAt(fila, 2).equals("")){
                        Bcontador++;                            
                    }
                    tLiquidacion.setValueAt(n2, fila,2);
                    lblactivo.setText(""+Bcontador);
                }
            }else{
                sonido.play();
                JOptionPane.showMessageDialog(null,"BOLETO NO COINCIDE");

            }

        }
    }    
    public void GrabarDetalleLiquidacion(int codigoLiquidacion){
        DefaultTableModel tb = (DefaultTableModel) tLiquidacion.getModel();
        boolean Activo;
        String Ninicio,inicio;
        int activo;
        double precio;
        int cantidad;
        
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            Activo=(boolean)tLiquidacion.getValueAt(i,3);
            Ninicio=(String)tLiquidacion.getValueAt(i,2);
            inicio=(String)tLiquidacion.getValueAt(i,1);
            precio=(double)tLiquidacion.getValueAt(i,0);
            if(!"".equals(Ninicio)){                
                cantidad=Integer.parseInt(Ninicio)-Integer.parseInt(inicio);
                if(Activo){
                    activo=1;
                }else{
                    activo=0;
                    cantidad+=1;
                }                
                if(cantidad!=0){
                int CodDetAbasBolet = DBD.IdDetalledistribucion(precio, inicio);
                DBD.ActualizarEstadoDistribucion(Ninicio,CodDetAbasBolet,activo);                
                LD.RegistrarDetalleLiquidacion(LD.idDetalleLiquidacion(), precio, cantidad, codigoLiquidacion,CodDetAbasBolet);
                }
            }
        }
    }
    public double Sumar(){
        
        String Ninicio,inicio;
        double precio ,total1 = 0;
        int cantidad;
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            Ninicio=(String)tLiquidacion.getValueAt(i,2);
            inicio=(String)tLiquidacion.getValueAt(i,1);
            precio=(double)tLiquidacion.getValueAt(i,0);      
            if(!"".equals(Ninicio)){                
                cantidad=Integer.parseInt(Ninicio)+1-Integer.parseInt(inicio);
                total1 = total1+(precio*cantidad);
            }
        }
        return total1;    }    
    public int GrabarLiquidacion(String Padron, String fecha , String operador, int vuelta){
        int CodLiquidacion = LD.idLiquidacion();
        LD.RegistrarLiquidacion(CodLiquidacion, Padron, fecha, operador, CED.getDatoUsuario(),vuelta );        
        return CodLiquidacion;
    }    
    public void FinalizarBoleto(int FilaSelec){
        if(FilaSelec==-1){
            JOptionPane.showMessageDialog(null,"POR FAVOR SELECCIONE ALGUNA FILA");
        }else{
           int FilaSelect=FilaSelec;
               String NumeroI=(String)tLiquidacion.getValueAt(FilaSelect, 1);
               int numero = Integer.parseInt(NumeroI);
               String last="";
            if(numero>99999){
                int d3,d4,d5,d6;
		d3 = numero % 1000 / 100;
		d4 = numero % 10000 / 1000;
		d5 = numero % 100000 / 10000;
                d6 = numero % 1000000 / 100000;
                numero =(d6*100000)+(d5*10000)+(d4*1000)+((d3+1)*100);
            }else if(numero>9999 && numero<=99999) {
                int d3,d4,d5;                
		d3 = numero % 1000 / 100;
		d4 = numero % 10000 / 1000;
		d5 = numero % 100000 / 10000;
                numero =(d5*10000)+(d4*1000)+((d3+1)*100);
            }else if(numero>999 && numero<=9999){
                int d3,d4;                
		d3 = numero % 1000 / 100;
		d4 = numero % 10000 / 1000;		
                numero =(d4*1000)+((d3+1)*100);
            }else{
                if(numero>=1&&numero<=99){
                }else{                   
                    int d3;               
                    d3 = numero % 1000 / 100;			
                    numero =((d3+1)*100);
                }
            }            
            last=String.valueOf(numero);
            while(last.length()<6){
                last= "0"+last;
            }tLiquidacion.setValueAt(last, FilaSelect, 2);
        }
    }
    public void LlenarFinalBoleto(){
        String ultimo;
        int fila;
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){                
            ultimo=(String)tLiquidacion.getValueAt(i,2);
            if(ultimo.equals("")){
                fila=i;
                FinalizarBoleto(fila);
                tLiquidacion.setValueAt(false, fila,3);
            }
        }
    }
    
}
