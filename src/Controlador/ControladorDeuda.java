/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Dao.DeudaDao;
import Modelo.Dao.ExoneracionDao;

/**
 *
 * @author Harold7v7
 */
public class ControladorDeuda {
    DeudaDao DD = new DeudaDao();
    DatosSistema DS = new DatosSistema();
    ExoneracionDao  ED = new ExoneracionDao();
    
    public String GenerarCodigoDV(){
        
        String Codigo;
        String n = String.valueOf(DD.ContadorDeudav());
        String Cpart = "DV";
        for(int i = 7 - n.length();i>0;i--){
            Cpart = Cpart + "0";
        }  
        Codigo=Cpart+n;
    return Codigo;
    }
    public String GenerarCodigoDP(){
        String n = String.valueOf(DD.ContadorDeudaP());
        String Cpart = "DP";
        for(int i = 7 - n.length();i>0;i--){
            Cpart = Cpart + "0";
        }
        return Cpart+n;
    }
    public void RegistroDeudaP(String descripcion,String responsable,float monto,String fecha){
        DD.RegistroDeudaP(GenerarCodigoDP(), descripcion, responsable, monto, fecha);
    }
    public void RegistroDeudaV(String CodVehi,String descripcion,String responsable,float monto){
        DD.RegistroDeudaV(GenerarCodigoDV(), CodVehi, descripcion, responsable, monto, DS.ObtenerFecha());
    }
    public void ActualizarDeuda(String CodigoED){
        DD.ActualizarDeudaV(ED.ObtenerCodigoDeuda(CodigoED), 2);
    }
    
    
}
