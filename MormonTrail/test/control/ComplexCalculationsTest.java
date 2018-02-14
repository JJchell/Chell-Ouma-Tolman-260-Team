/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author scott
 */
public class ComplexCalculationsTest {
    
    public ComplexCalculationsTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of huntSuccess method, of class ComplexCalculations.
     */
    @Test
    public void testHuntSuccess() {
        System.out.println("huntSuccess");
        int huntingSkill = 0;
        int wildLife = 0;
        int expResult = 0;
        int result = ComplexCalculations.huntSuccess(huntingSkill, wildLife);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
