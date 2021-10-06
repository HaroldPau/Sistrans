
package Controlador;

import Modelo.Dao.DistribucionBoletoDao;
import javax.swing.table.DefaultTableModel;

public class ControladorAnular {
    DistribucionBoletoDao DBD = new DistribucionBoletoDao();
    public void GrabarDetalleLiquidacion(DefaultTableModel mod){        
        boolean Activo;
        String inicio;
        double precio;        
        for(int i=mod.getRowCount()-1; i>=0; i=i-1){
            Activo=(boolean)mod.getValueAt(i,2);
            inicio=(String)mod.getValueAt(i,1);
            precio=(double)mod.getValueAt(i,0);             
            if(Activo){
                DBD.ActualizarEstadoDistribucion(DBD.IdDetalledistribucion(precio, inicio));
            }
        }
    }
}
