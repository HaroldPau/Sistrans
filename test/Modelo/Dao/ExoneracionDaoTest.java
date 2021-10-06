
package Modelo.Dao;

import Modelo.Bean.ExoPagoV;
import java.io.FileInputStream;
import java.sql.Blob;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harold7v7
 */
public class ExoneracionDaoTest {
    
    public ExoneracionDaoTest() {
    }

    @Test
    public void testRegistroExoneriacionP() {
        System.out.println("RegistroExoneriacionP");
        String codigoexo = "DV00018";
        String codigoDeuda = "DV0000008";
        FileInputStream foto = null;
        int longitud = 0;
        String fecha = "17/11/2020";
        ExoneracionDao instance = new ExoneracionDao();
        boolean expResult = true;
        //boolean result = instance.RegistroExoneriacionP(codigoexo, codigoDeuda, foto, longitud, fecha);
        //assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testContadorExoneracion() {
        System.out.println("ContadorExoneracion");
        ExoneracionDao instance = new ExoneracionDao();
        int expResult = 11;
        int result = instance.ContadorExoneracion();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testListadoExoPago() {
        System.out.println("ListadoExoPago");
        String fecha = "17/11/2020";
        ExoneracionDao instance = new ExoneracionDao();
        ArrayList<ExoPagoV> expResult = null;
        ArrayList<ExoPagoV> result = instance.ListadoExoPago(fecha);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMostrarBoleta() {
        System.out.println("MostrarBoleta");
        String CodigoD = "DV00008";
        ExoneracionDao instance = new ExoneracionDao();
        Blob expResult = null;
        //Blob result = instance.MostrarBoleta(CodigoD);
        //assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testActualizarEstado() {
        System.out.println("ActualizarEstado");
        String codigo = "DV00008";
        String estado = "APROBADO";
        ExoneracionDao instance = new ExoneracionDao();
        boolean expResult = true;
        //boolean result = instance.ActualizarEstado(codigo, estado);
        //assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testObtenerCodigoDeuda() {
        System.out.println("ObtenerCodigoDeuda");
        String CodigoED = "DV00008";
        ExoneracionDao instance = new ExoneracionDao();
        String expResult = "DV0000100";
        String result = instance.ObtenerCodigoDeuda(CodigoED);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    //FAIL TEST
    
    @Test
    public void testRegistroExoneriacionPFail() {
        System.out.println("RegistroExoneriacionPfail");
        String codigoexo = "'";
        String codigoDeuda = "DV00001011";
        FileInputStream foto = null;
        int longitud = 0;
        String fecha = "17/11/2020";
        ExoneracionDao instance = new ExoneracionDao();
        boolean expResult = true;
        //boolean result = instance.RegistroExoneriacionP(codigoexo, codigoDeuda, foto, longitud, fecha);
       // assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testContadorExoneracionfail() {
        System.out.println("ContadorExoneracion");
        ExoneracionDao instance = new ExoneracionDao();
        int expResult = 10;
        int result = instance.ContadorExoneracion();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testListadoExoPagofail() {
        System.out.println("ListadoExoPago");
        String fecha = "'";
        ExoneracionDao instance = new ExoneracionDao();
        ArrayList<ExoPagoV> expResult = null;
        ArrayList<ExoPagoV> result = instance.ListadoExoPago(fecha);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMostrarBoletafaiL() {
        System.out.println("MostrarBoleta");
        String CodigoD = "'";
        ExoneracionDao instance = new ExoneracionDao();
        Blob expResult = null;
        //Blob result = instance.MostrarBoleta(CodigoD);
        //assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testActualizarEstadofail() {
        System.out.println("ActualizarEstado");
        String codigo = "'";
        String estado = "APROBADO";
        ExoneracionDao instance = new ExoneracionDao();
        boolean expResult = false;
        //boolean result = instance.ActualizarEstado(codigo, estado);
        //assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testObtenerCodigoDeudafail() {
        System.out.println("ObtenerCodigoDeuda");
        String CodigoED = "'";
        ExoneracionDao instance = new ExoneracionDao();
        String expResult = "DV0000100";
        String result = instance.ObtenerCodigoDeuda(CodigoED);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }    
    @Test
    public void testObtenerCodigoDeudaVacio() {
        System.out.println("ObtenerCodigoDeuda");
        String CodigoED = "DV-000";
        ExoneracionDao instance = new ExoneracionDao();
        String expResult = "";
        String result = instance.ObtenerCodigoDeuda(CodigoED);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMostrarBoletaVacio() {
        System.out.println("MostrarBoleta");
        String CodigoD = "DV-00001";
        ExoneracionDao instance = new ExoneracionDao();
        Blob expResult = null;
       // Blob result = instance.MostrarBoleta(CodigoD);
        //assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
