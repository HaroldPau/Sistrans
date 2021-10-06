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
public class DeudaVehiculoTest {
    
    public DeudaVehiculoTest() {
    }

    @Test
    public void testGetConcepto() {
        System.out.println("getConcepto");
        DeudaVehiculo instance = new DeudaVehiculo();
        String expResult = "";
        String result = instance.getConcepto();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetConcepto() {
        System.out.println("setConcepto");
        String concepto = "";
        DeudaVehiculo instance = new DeudaVehiculo();
        instance.setConcepto(concepto);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        DeudaVehiculo instance = new DeudaVehiculo();
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "";
        DeudaVehiculo instance = new DeudaVehiculo();
        instance.setFecha(fecha);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetResponsable() {
        System.out.println("getResponsable");
        DeudaVehiculo instance = new DeudaVehiculo();
        String expResult = "";
        String result = instance.getResponsable();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetResponsable() {
        System.out.println("setResponsable");
        String responsable = "";
        DeudaVehiculo instance = new DeudaVehiculo();
        instance.setResponsable(responsable);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDeuda() {
        System.out.println("getDeuda");
        DeudaVehiculo instance = new DeudaVehiculo();
        float expResult = 0.0F;
        float result = instance.getDeuda();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDeuda() {
        System.out.println("setDeuda");
        float deuda = 0.0F;
        DeudaVehiculo instance = new DeudaVehiculo();
        instance.setDeuda(deuda);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        DeudaVehiculo instance = new DeudaVehiculo();
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String Codigo = "";
        DeudaVehiculo instance = new DeudaVehiculo();
        instance.setCodigo(Codigo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetActivo() {
        System.out.println("getActivo");
        DeudaVehiculo instance = new DeudaVehiculo();
        int expResult = 0;
        int result = instance.getActivo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetActivo() {
        System.out.println("setActivo");
        int activo = 0;
        DeudaVehiculo instance = new DeudaVehiculo();
        instance.setActivo(activo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetVehiculo() {
        System.out.println("getVehiculo");
        DeudaVehiculo instance = new DeudaVehiculo();
        String expResult = "";
        String result = instance.getVehiculo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetVehiculo() {
        System.out.println("setVehiculo");
        String Vehiculo = "";
        DeudaVehiculo instance = new DeudaVehiculo();
        instance.setVehiculo(Vehiculo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        DeudaVehiculo instance = new DeudaVehiculo();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        DeudaVehiculo instance = new DeudaVehiculo();
        instance.setEstado(estado);
        fail("The test case is a prototype.");
    }
    
}
