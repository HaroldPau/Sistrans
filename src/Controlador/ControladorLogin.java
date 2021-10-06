package Controlador;

import Modelo.Dao.ValidarLogin;

public class ControladorLogin {
    ValidarLogin VL = new ValidarLogin();   
    public Boolean logeo(String Usuario, String Pass){
             
        return VL.logeo(Usuario,Pass);
    }
    public void setDatoUsuario(String Usuario){        
        
        Vista.Menu.Home.usuario = VL.nivel(Usuario);
    }
    
}
