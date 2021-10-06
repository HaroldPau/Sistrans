/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.Bean.Personal;
import java.sql.Blob;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harold7v7
 */
public class PersonalDaoTest {
    
    public PersonalDaoTest() {
    }

    @Test
    public void testListadoCobradores() {
        System.out.println("ListadoCobradores");
        PersonalDao instance = new PersonalDao();
        ArrayList<Personal> expResult = null;
        //ArrayList<Personal> result = instance.ListadoCobradores();
        //assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testFiltrarCobrador() {
        System.out.println("FiltrarCobrador");
        String Letra = "jose";
        PersonalDao instance = new PersonalDao();
        ArrayList<Personal> expResult = new ArrayList<Personal>();
        //ArrayList<Personal> result = instance.FiltrarCobrador(Letra);
        //assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBuscarFoto() {
        System.out.println("BuscarFoto");
        String nIdentificacion = "44465799";
        PersonalDao instance = new PersonalDao();
        Blob expResult = null;
        Blob result = instance.BuscarFoto(nIdentificacion);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testObtenerCodigo() {
        System.out.println("ObtenerCodigo");
        String identificacion = "44465799";
        PersonalDao instance = new PersonalDao();
        String expResult = "DP-0010";
        String result = instance.ObtenerCodigo(identificacion);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    //FAIL TEST
    @Test
    public void testFiltrarCobradorFAIL() {
        System.out.println("FiltrarCobrador");
        String Letra = "'";
        PersonalDao instance = new PersonalDao();
        ArrayList<Personal> expResult = new ArrayList<Personal>();
        //ArrayList<Personal> result = instance.FiltrarCobrador(Letra);
       // assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBuscarFotoFAIL() {
        System.out.println("BuscarFoto");
        String nIdentificacion = "'";
        PersonalDao instance = new PersonalDao();
        Blob expResult = null;
        Blob result = instance.BuscarFoto(nIdentificacion);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testObtenerCodigoFAIL() {
        System.out.println("ObtenerCodigo");
        String identificacion = "'";
        PersonalDao instance = new PersonalDao();
        String expResult = "DP-0010";
        String result = instance.ObtenerCodigo(identificacion);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testObtenerCodigoVacio() {
        System.out.println("ObtenerCodigo");
        String identificacion = "477144";
        PersonalDao instance = new PersonalDao();
        String expResult = "DP-0010";
        String result = instance.ObtenerCodigo(identificacion);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBuscarFotoVacio() {
        System.out.println("BuscarFoto");
        String nIdentificacion = "4448744";
        PersonalDao instance = new PersonalDao();
        Blob expResult = null;
        Blob result = instance.BuscarFoto(nIdentificacion);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
}
