
package Controlador;

import org.junit.Test;
import static org.junit.Assert.*;

public class ControladorLoginTest {
    
    public ControladorLoginTest() {
    }

    @Test
    public void testLogeo1() {
        System.out.println("Test Logeo 1");
        String Usuario = "admin";
        String Pass = "admin";
        ControladorLogin instance = new ControladorLogin();
        Boolean expResult = true;
        Boolean result = instance.logeo(Usuario, Pass);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testLogeo2() {
        System.out.println("Test Logeo 2");
        String Usuario = "";
        String Pass = "";
        ControladorLogin instance = new ControladorLogin();
        Boolean expResult = false;
        Boolean result = instance.logeo(Usuario, Pass);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testLogeo3() {
        System.out.println("Test Logeo 3");
        String Usuario = "jose";
        String Pass = "martines";
        ControladorLogin instance = new ControladorLogin();
        Boolean expResult = false;
        Boolean result = instance.logeo(Usuario, Pass);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    
}
