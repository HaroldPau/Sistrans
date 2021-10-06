/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harold7v7
 */
public class ConexionBDTest {
    
    public ConexionBDTest() {
    }

    @Test
    public void testGetConexion() {
        System.out.println("getConexion");
        ConexionBD instance = new ConexionBD();
        Connection expResult = null;
        Connection result = instance.getConexion();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ConexionBD.main(args);
        //fail("The test case is a prototype.");
    }
    
}
