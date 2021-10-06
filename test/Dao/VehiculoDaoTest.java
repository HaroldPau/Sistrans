
package Dao;

import Modelo.Dao.VehiculoDao;
import org.junit.Test;
import static org.junit.Assert.*;

public class VehiculoDaoTest {
    
    public VehiculoDaoTest() {
    }

    @Test
    public void testBuscarVehiculo() {
        System.out.println("BuscarVehiculo");
        String Padron = "56";
        VehiculoDao instance = new VehiculoDao();
        boolean expResult = true;
        boolean result = instance.BuscarVehiculo(Padron);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testObtenerPlaca() {
        System.out.println("ObtenerPlaca");
        String padron = "56";
        VehiculoDao instance = new VehiculoDao();
        String expResult = "AUK-909";
        String result = instance.ObtenerPlaca(padron);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testObtenerCodigo() {
        System.out.println("ObtenerCodigo");
        String placa = "AUK-909";
        VehiculoDao instance = new VehiculoDao();
        String expResult = "NG-056";
        String result = instance.ObtenerCodigo(placa);
        assertEquals(expResult, result);
        
    }
    //FAIL TEST
    @Test
    public void testBuscarVehiculoFail() {
        System.out.println("BuscarVehiculo");
        String Padron = "";
        VehiculoDao instance = new VehiculoDao();
        boolean expResult = false;
        boolean result = instance.BuscarVehiculo(Padron);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testObtenerPlacaFail() {
        System.out.println("ObtenerPlaca");
        String padron = "";
        VehiculoDao instance = new VehiculoDao();
        String expResult = "";
        String result = instance.ObtenerPlaca(padron);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testObtenerCodigoFail() {
        System.out.println("ObtenerCodigo");
        String placa = "'";
        VehiculoDao instance = new VehiculoDao();
        String expResult = "";
        String result = instance.ObtenerCodigo(placa);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testBuscarVehiculoINEXISTENTE() {
        System.out.println("BuscarVehiculo");
        String Padron = "135";
        VehiculoDao instance = new VehiculoDao();
        boolean expResult = false;
        boolean result = instance.BuscarVehiculo(Padron);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testObtenerPlacaInexistente() {
        System.out.println("ObtenerPlaca");
        String padron = "150";
        VehiculoDao instance = new VehiculoDao();
        String expResult = "";
        String result = instance.ObtenerPlaca(padron);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testObtenerCodigoVACIO() {
        System.out.println("ObtenerCodigo");
        String placa = "A1K-900";
        VehiculoDao instance = new VehiculoDao();
        String expResult = "";
        String result = instance.ObtenerCodigo(placa);
        assertEquals(expResult, result);
        
    }
    
}
