/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CALVIN
 */
public class RegistroTest {
    
    public RegistroTest() {
    }

    /**
     * Test of gravaRegistro method, of class Registro.
     */
    @Test
    public void testGravaRegistro() {
        System.out.println("gravaRegistro");
        Registro instance = null;
        instance.gravaRegistro();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Registro.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Registro instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Registro.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Registro instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFamilia method, of class Registro.
     */
    @Test
    public void testGetFamilia() {
        System.out.println("getFamilia");
        Registro instance = null;
        String expResult = "";
        String result = instance.getFamilia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExp method, of class Registro.
     */
    @Test
    public void testGetExp() {
        System.out.println("getExp");
        Registro instance = null;
        float expResult = 0.0F;
        float result = instance.getExp();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTamanho method, of class Registro.
     */
    @Test
    public void testGetTamanho() {
        System.out.println("getTamanho");
        Registro instance = null;
        float expResult = 0.0F;
        float result = instance.getTamanho();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Registro.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Registro instance = null;
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
