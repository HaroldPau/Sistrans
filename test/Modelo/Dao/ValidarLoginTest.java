package Modelo.Dao;
import org.junit.Test;
import static org.junit.Assert.*;
public class ValidarLoginTest {    
    public ValidarLoginTest() {
    }
    @Test
    public void testLogeo() {
        System.out.println("logeo");
        String usu = "admin";
        String clave = "admin";
        ValidarLogin instance = new ValidarLogin();
        boolean expResult = false;
        boolean result = instance.logeo(usu, clave);
        assertEquals(expResult, result);
    }
    @Test
    public void testLogeo2() {
        System.out.println("TEST logeo 2 ");
        String usu = "'";
        String clave = "123";
        ValidarLogin instance = new ValidarLogin();
        boolean expResult = false;
        boolean result = instance.logeo(usu, clave);
        assertEquals(expResult, result);
    }
    @Test
    public void testLogeo3() {
        System.out.println("logeo 3");
        String usu = "";
        String clave = "";
        ValidarLogin instance = new ValidarLogin();
        boolean expResult = false;
        boolean result = instance.logeo(usu, clave);
        assertEquals(expResult, result);
    }
}
