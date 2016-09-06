/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marlon
 */
public class TipoDesarrolladorIT {
    
    public TipoDesarrolladorIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class TipoDesarrollador.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        TipoDesarrollador instance = new TipoDesarrollador();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isWeb method, of class TipoDesarrollador.
     */
    @Test
    public void testIsWeb() {
        System.out.println("isWeb");
        TipoDesarrollador instance = new TipoDesarrollador();
        boolean expResult = false;
        boolean result = instance.isWeb();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isJava method, of class TipoDesarrollador.
     */
    @Test
    public void testIsJava() {
        System.out.println("isJava");
        TipoDesarrollador instance = new TipoDesarrollador();
        boolean expResult = false;
        boolean result = instance.isJava();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCel method, of class TipoDesarrollador.
     */
    @Test
    public void testIsCel() {
        System.out.println("isCel");
        TipoDesarrollador instance = new TipoDesarrollador();
        boolean expResult = false;
        boolean result = instance.isCel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class TipoDesarrollador.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        TipoDesarrollador instance = new TipoDesarrollador();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeb method, of class TipoDesarrollador.
     */
    @Test
    public void testSetWeb() {
        System.out.println("setWeb");
        boolean web = false;
        TipoDesarrollador instance = new TipoDesarrollador();
        instance.setWeb(web);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJava method, of class TipoDesarrollador.
     */
    @Test
    public void testSetJava() {
        System.out.println("setJava");
        boolean java = false;
        TipoDesarrollador instance = new TipoDesarrollador();
        instance.setJava(java);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCel method, of class TipoDesarrollador.
     */
    @Test
    public void testSetCel() {
        System.out.println("setCel");
        boolean cel = false;
        TipoDesarrollador instance = new TipoDesarrollador();
        instance.setCel(cel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
