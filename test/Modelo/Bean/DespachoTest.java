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
public class DespachoTest {
    
    public DespachoTest() {
    }

    @Test
    public void testGetHoraSalida() {
        System.out.println("getHoraSalida");
        Despacho instance = new Despacho();
        String expResult = "";
        String result = instance.getHoraSalida();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHoraSalida() {
        System.out.println("setHoraSalida");
        String HoraSalida = "";
        Despacho instance = new Despacho();
        instance.setHoraSalida(HoraSalida);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHoraTurno() {
        System.out.println("getHoraTurno");
        Despacho instance = new Despacho();
        String expResult = "";
        String result = instance.getHoraTurno();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHoraTurno() {
        System.out.println("setHoraTurno");
        String HoraTurno = "";
        Despacho instance = new Despacho();
        instance.setHoraTurno(HoraTurno);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPlaca() {
        System.out.println("getPlaca");
        Despacho instance = new Despacho();
        String expResult = "";
        String result = instance.getPlaca();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPlaca() {
        System.out.println("setPlaca");
        String Placa = "";
        Despacho instance = new Despacho();
        instance.setPlaca(Placa);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Despacho instance = new Despacho();
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String Fecha = "";
        Despacho instance = new Despacho();
        instance.setFecha(Fecha);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLado() {
        System.out.println("getLado");
        Despacho instance = new Despacho();
        String expResult = "";
        String result = instance.getLado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetLado() {
        System.out.println("setLado");
        String Lado = "";
        Despacho instance = new Despacho();
        instance.setLado(Lado);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPadron() {
        System.out.println("getPadron");
        Despacho instance = new Despacho();
        int expResult = 0;
        int result = instance.getPadron();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPadron() {
        System.out.println("setPadron");
        int padron = 0;
        Despacho instance = new Despacho();
        instance.setPadron(padron);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        Despacho instance = new Despacho();
        int expResult = 0;
        int result = instance.getFrecuencia();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFrecuencia() {
        System.out.println("setFrecuencia");
        int frecuencia = 0;
        Despacho instance = new Despacho();
        instance.setFrecuencia(frecuencia);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetExceso() {
        System.out.println("getExceso");
        Despacho instance = new Despacho();
        int expResult = 0;
        int result = instance.getExceso();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetExceso() {
        System.out.println("setExceso");
        int exceso = 0;
        Despacho instance = new Despacho();
        instance.setExceso(exceso);
        fail("The test case is a prototype.");
    }
    
}
