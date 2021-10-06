/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harold7v7
 */
public class ControladorReportesTest {
    
    public ControladorReportesTest() {
    }

    @Test
    public void testReporteBoletajeDiario() {
        System.out.println("ReporteBoletajeDiario");
        String Fecha = "07/12/2020";
        ControladorReportes instance = new ControladorReportes();
        instance.ReporteBoletajeDiario(Fecha);
        
    }
    
}
