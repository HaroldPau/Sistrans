
package Controlador;

import Modelo.Dao.VehiculoDao;

public class ControladorVehiculo {
    VehiculoDao VehiculoD = new VehiculoDao(); 
    public boolean ExistePadron (String Padron){        
       return VehiculoD.BuscarVehiculo(Padron);
    }
    public String Codigo(String Placa){
        return VehiculoD.ObtenerCodigo(Placa);
    }
    public String Placa(String Padron){
        return VehiculoD.ObtenerPlaca(Padron);
    }

}
