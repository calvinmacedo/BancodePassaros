/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho;

import java.sql.Connection;
import java.sql.Statement;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CALVIN
 */
public class TesteConexaoSingletonTest {
    
    public TesteConexaoSingletonTest() {
    }

    /**
     * Test of gravaRegistro method, of class TesteConexaoSingleton.
     */
    @Test
    public void testGravaRegistro() throws Exception {
        System.out.println("gravaRegistro");
        Registro f = null;
        TesteConexaoSingleton.gravaRegistro(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatement method, of class TesteConexaoSingleton.
     */
    @Test
    public void testGetStatement() {
        System.out.println("getStatement");
        TesteConexaoSingleton instance = new TesteConexaoSingleton();
        Statement expResult = null;
        Statement result = instance.getStatement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConexao method, of class TesteConexaoSingleton.
     */
    @Test
    public void testGetConexao() {
        System.out.println("getConexao");
        TesteConexaoSingleton instance = new TesteConexaoSingleton();
        Connection expResult = null;
        Connection result = instance.getConexao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstanciaBD method, of class TesteConexaoSingleton.
     */
    @Test
    public void testGetInstanciaBD() {
        System.out.println("getInstanciaBD");
        TesteConexaoSingleton expResult = null;
        TesteConexaoSingleton result = TesteConexaoSingleton.getInstanciaBD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
