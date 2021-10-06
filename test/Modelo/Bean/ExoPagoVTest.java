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
public class ExoPagoVTest {
    
    public ExoPagoVTest() {
    }

    @Test
    public void testGetCodigoE() {
        System.out.println("getCodigoE");
        ExoPagoV instance = new ExoPagoV();
        String expResult = "";
        String result = instance.getCodigoE();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCodigoE() {
        System.out.println("setCodigoE");
        String CodigoE = "";
        ExoPagoV instance = new ExoPagoV();
        instance.setCodigoE(CodigoE);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        ExoPagoV instance = new ExoPagoV();
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "";
        ExoPagoV instance = new ExoPagoV();
        instance.setFecha(fecha);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPlaca() {
        System.out.println("getPlaca");
        ExoPagoV instance = new ExoPagoV();
        String expResult = "";
        String result = instance.getPlaca();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPlaca() {
        System.out.println("setPlaca");
        String Placa = "";
        ExoPagoV instance = new ExoPagoV();
        instance.setPlaca(Placa);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFechaDeuda() {
        System.out.println("getFechaDeuda");
        ExoPagoV instance = new ExoPagoV();
        String expResult = "";
        String result = instance.getFechaDeuda();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFechaDeuda() {
        System.out.println("setFechaDeuda");
        String fechaDeuda = "";
        ExoPagoV instance = new ExoPagoV();
        instance.setFechaDeuda(fechaDeuda);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFechaSolicitud() {
        System.out.println("getFechaSolicitud");
        ExoPagoV instance = new ExoPagoV();
        String expResult = "";
        String result = instance.getFechaSolicitud();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFechaSolicitud() {
        System.out.println("setFechaSolicitud");
        String FechaSolicitud = "";
        ExoPagoV instance = new ExoPagoV();
        instance.setFechaSolicitud(FechaSolicitud);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        ExoPagoV instance = new ExoPagoV();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        ExoPagoV instance = new ExoPagoV();
        instance.setEstado(estado);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        ExoPagoV instance = new ExoPagoV();
        float expResult = 0.0F;
        float result = instance.getMonto();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMonto() {
        System.out.println("setMonto");
        float monto = 0.0F;
        ExoPagoV instance = new ExoPagoV();
        instance.setMonto(monto);
        fail("The test case is a prototype.");
    }
    
}
