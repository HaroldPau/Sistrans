
package Modelo.Dao;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harold7v7
 */
public class PagoDaoTest {
    
    public PagoDaoTest() {
    }

    @Test
    public void testRegistroPago() {
        System.out.println("RegistroPago");
        int codigo = 31;
        String fecha = "17/11/2020";
        float total = 50.0F;
        int usuario = 1;
        PagoDao instance = new PagoDao();
        boolean expResult = false;
        boolean result = instance.RegistroPago(codigo, fecha, total,usuario);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testContadorPago() {
        System.out.println("ContadorPago");
        PagoDao instance = new PagoDao();
        int expResult = 29;
        int result = instance.ContadorPago();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testRegistroDetallePagoV() {
        System.out.println("RegistroDetallePagoV");
        int recibo = 11;
        String CD = "DV0000008";
        PagoDao instance = new PagoDao();
        boolean expResult = true;
        boolean result = instance.RegistroDetallePagoV(recibo, CD);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testRegistroDetallePagoP() {
        System.out.println("RegistroDetallePagoP");
        int recibo = 11;
        String CD = "DP0000008";
        PagoDao instance = new PagoDao();
        boolean expResult = true;
        boolean result = instance.RegistroDetallePagoP(recibo, CD);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    //FAIL TEST
    
    @Test
    public void testRegistroPagoFail() {
        System.out.println("RegistroPagofail");
        int codigo = -1;
        String fecha = "";
        float total = 0.0F;
        PagoDao instance = new PagoDao();
        boolean expResult = false;
        boolean result = instance.RegistroPago(codigo, fecha, total,1);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testRegistroDetallePagoVFail() {
        System.out.println("RegistroDetallePagoVfail");
        int recibo = -1;
        String CD = "-";
        PagoDao instance = new PagoDao();
        boolean expResult = false;
        boolean result = instance.RegistroDetallePagoV(recibo, CD);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testRegistroDetallePagoPFail() {
        System.out.println("RegistroDetallePagoPfail");
        int recibo = -1;
        String CD = "1";
        PagoDao instance = new PagoDao();
        boolean expResult = false;
        boolean result = instance.RegistroDetallePagoP(recibo, CD);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
