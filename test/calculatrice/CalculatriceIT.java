/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author xafree
 */
public class CalculatriceIT {
  
    
    @BeforeAll
    public static void setUpClass() {
       
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of somme method, of class Calculatrice.
     */
    @Test
    public void testSomme() {
        System.out.println("somme");
        int a = 3;
        int b = 3;
        Calculatrice instance = new Calculatrice();
        int expResult = 6;
        int result = instance.somme(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of soustraction method, of class Calculatrice.
     */
    @Test    
    public void testSoustraction() {
        System.out.println("soustraction");
        int a = 10;
        int b = 5;
        Calculatrice instance = new Calculatrice();
        int expResult = 5;
        int result = instance.soustraction(a, b);
        assertEquals(expResult, result,"Correct");

    }

    /**
     * Test of division method, of class Calculatrice.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int diviseur = 2;
        int diviser = 10;
        Calculatrice instance = new Calculatrice();
        int expResult = 5;
        int result = instance.division(diviseur, diviser);
        assertEquals(expResult, result);    
    }

    /**
     * Test of mutiplication method, of class Calculatrice.
     */
    @Test
    public void testMutiplication() {
        System.out.println("mutiplication");
        int a = 2;
        int b = 5;
        Calculatrice instance = new Calculatrice();
        int expResult = 10;
        int result = instance.mutiplication(a, b);
        assertEquals(expResult, result);
     
       
    }
    
}
