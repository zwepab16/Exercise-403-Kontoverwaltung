
package com.mycompany.exercise.kontoverwaltungmv;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class KontoTest {
    
    public KontoTest() {
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
     * Test of überweisen method, of class Konto.
     */
    @org.junit.Test
    public void testÜberweisen() {
        System.out.println("überweisen");
        int geld = 20;
        Konto instance = new Konto(30, "Konto2");
        instance.überweisen(geld);
        assertTrue(0<instance.getSaldo());
    }

    /**
     * Test of abheben method, of class Konto.
     */
    @org.junit.Test
    public void testAbheben() throws NoMoneyException {
        System.out.println("abheben");
        int geld = 50;
        Konto instance= new Konto(60, "Konto1");
        instance.abheben(geld);
           assertTrue(0<instance.getSaldo());
    }


 
    
}
