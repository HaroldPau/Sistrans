/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Bean;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harold7v7
 */
public class DeudaPersonalTest {
    
    public DeudaPersonalTest() {
    }

    @Test
    public void testGetConcepto() {
        System.out.println("getConcepto");
        DeudaPersonal instance = new DeudaPersonal();
        String expResult = "";
        String result = instance.getConcepto();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetConcepto() {
        System.out.println("setConcepto");
        String concepto = "";
        DeudaPersonal instance = new DeudaPersonal();
        instance.setConcepto(concepto);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        DeudaPersonal instance = new DeudaPersonal();
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "";
        DeudaPersonal instance = new DeudaPersonal();
        instance.setFecha(fecha);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetResponsable() {
        System.out.println("getResponsable");
        DeudaPersonal instance = new DeudaPersonal();
        String expResult = "";
        String result = instance.getResponsable();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetResponsable() {
        System.out.println("setResponsable");
        String responsable = "";
        DeudaPersonal instance = new DeudaPersonal();
        instance.setResponsable(responsable);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        DeudaPersonal instance = new DeudaPersonal();
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String Codigo = "";
        DeudaPersonal instance = new DeudaPersonal();
        instance.setCodigo(Codigo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        DeudaPersonal instance = new DeudaPersonal();
        float expResult = 0.0F;
        float result = instance.getMonto();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMonto() {
        System.out.println("setMonto");
        float monto = 0.0F;
        DeudaPersonal instance = new DeudaPersonal();
        instance.setMonto(monto);
        fail("The test case is a prototype.");
    }
    
}
