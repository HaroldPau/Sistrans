
package Controlador;
import Modelo.Dao.DistribucionBoletoDao;


public class ControladorDistibucionBol {
    DistribucionBoletoDao DBD = new DistribucionBoletoDao();
    
    public String aumentar(String num){             
        int numero = Integer.parseInt(num);
        String last="";
        if(numero>0){            
            numero+=100;
            last=String.valueOf(numero);
            for(int i  = last.length();i<6;i++){
                last= "0"+last;
            }                
        }else{
            return "";
        }
        return last;
    }
    
    public int RegistrarDistribucion(String Responsable,String fecha,int usuario,String Padron,String hora){
        int id = DBD.Iddistribucion();
        DBD.RegistrarDistibucion(id, Responsable, fecha, usuario, Padron, hora);
        return id;
    }    
    public void RegistrarDetalle(String dato, int codigoDistribucion,double precio){
        String inicio = dato;
        if(!"".equals(dato)){
            int numero = Integer.parseInt(dato);
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
            }
             DBD.RegistrarDetalleDis(DBD.IdDetalledistribucion(), inicio, last, precio, codigoDistribucion);
            }
    }
    public String[] Informacion(String codigo,String precio, String padron){
        return DBD.Busqueda2(codigo, precio, padron);
    }
    public String[] Informacion(String padron){               
        return DBD.Pegado(padron);
    }
    public String[] BuscarBoleto(String codigo, String precio){
        return DBD.Busqueda(codigo, precio);
    }
}
