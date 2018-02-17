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
        
        // --Test Case 1--
        // input variables
        int huntingSkill = 7;
        int wildLife = 3;
        // expected output
        int expResult = 21;
        // call the method
        int result = ComplexCalculations.huntSuccess(huntingSkill, wildLife);
        //test to see if result returned equals the expected result
        assertEquals(expResult, result);
        
        // --Test Case 2--
        // input variables
        huntingSkill = -2;
        wildLife = 99;
        // expected output
        expResult = -1;
        // call the method
        result = ComplexCalculations.huntSuccess(huntingSkill, wildLife);
        //test to see if result returned equals the expected result
        assertEquals(expResult, result);
        
        // --Test Case 3--
        // input variables
        huntingSkill = 11;
        wildLife = -2;
        // expected output
        expResult = -1;
        // call the method
        result = ComplexCalculations.huntSuccess(huntingSkill, wildLife);
        //test to see if result returned equals the expected result
        assertEquals(expResult, result);
        
        // --Test Case 4--
        // input variables
        huntingSkill = 99;
        wildLife = 11;
        // expected output
        expResult = -1;
        // call the method
        result = ComplexCalculations.huntSuccess(huntingSkill, wildLife);
        //test to see if result returned equals the expected result
        assertEquals(expResult, result);
        
        // --Test Case 5--
        // input variables
        huntingSkill = 1;
        wildLife = 1;
        // expected output
        expResult = 1;
        // call the method
        result = ComplexCalculations.huntSuccess(huntingSkill, wildLife);
        //test to see if result returned equals the expected result
        assertEquals(expResult, result);
        
        // --Test Case 6--
        // input variables
        huntingSkill = 10;
        wildLife = 10;
        // expected output
        expResult = 100;
        // call the method
        result = ComplexCalculations.huntSuccess(huntingSkill, wildLife);
        //test to see if result returned equals the expected result
        assertEquals(expResult, result);
        
        // --Test Case 7--
        // input variables
        huntingSkill = 1;
        wildLife = 10;
        // expected output
        expResult = 10;
        // call the method
        result = ComplexCalculations.huntSuccess(huntingSkill, wildLife);
        //test to see if result returned equals the expected result
        assertEquals(expResult, result);
        
        // --Test Case 8--
        // input variables
        huntingSkill = 10;
        wildLife = 1;
        // expected output
        expResult = 10;
        // call the method
        result = ComplexCalculations.huntSuccess(huntingSkill, wildLife);
        //test to see if result returned equals the expected result
        assertEquals(expResult, result);
    }

    /**
     * Test of calcRiverSuccess method, of class ComplexCalculations.
     */
    @Test
    public void testCalcRiverSuccess() {
        System.out.println("calcRiverSuccess");
        //--Test 1--
        int weightOfWagon = 32;
        int depthOfRiver = 35;
        int randomNumber = 15;
        int strenghtOfOxen = 39;
        int expResult = 43;
        int result = ComplexCalculations.calcRiverSuccess(weightOfWagon, depthOfRiver, randomNumber, strenghtOfOxen);
        assertEquals(expResult, result);
    }

   @Test
   public void testCase2() {
        //--Test 2--
        int weightOfWagon = 40;
        int depthOfRiver = 35;
        int randomNumber = 15;
        int strenghtOfOxen = 39;
        int expResult = -1;
        int result = ComplexCalculations.calcRiverSuccess(weightOfWagon, depthOfRiver, randomNumber, strenghtOfOxen);
        assertEquals(expResult, result);
   } 
   
   @Test
   public void testCase3() {
        //--Test 3--
        int weightOfWagon = 32;
        int depthOfRiver = 5;
        int randomNumber = 15;
        int strenghtOfOxen = 39;
        int expResult = -1;
        int result = ComplexCalculations.calcRiverSuccess(weightOfWagon, depthOfRiver, randomNumber, strenghtOfOxen);
        assertEquals(expResult, result);
   }    
   @Test
   public void testCase4() {
        //--Test 3--
        int weightOfWagon = 32;
        int depthOfRiver = 35;
        int randomNumber = 0;
        int strenghtOfOxen = 39;
        int expResult = -1;
        int result = ComplexCalculations.calcRiverSuccess(weightOfWagon, depthOfRiver, randomNumber, strenghtOfOxen);
        assertEquals(expResult, result);
   } 
        
   @Test
   public void testCase5() {
        //--Test 3--
        int weightOfWagon = 32;
        int depthOfRiver = 35;
        int randomNumber = 15;
        int strenghtOfOxen = 50;
        int expResult = -1;
        int result = ComplexCalculations.calcRiverSuccess(weightOfWagon, depthOfRiver, randomNumber, strenghtOfOxen);
        assertEquals(expResult, result);
   } 
   
   @Test
   public void testCase6() {
        //--Test 3--
        int weightOfWagon = 14;
        int depthOfRiver = 14;
        int randomNumber = 2;
        int strenghtOfOxen = 2;
        int expResult = 28;
        int result = ComplexCalculations.calcRiverSuccess(weightOfWagon, depthOfRiver, randomNumber, strenghtOfOxen);
        assertEquals(expResult, result);
   } 
   
   @Test
   public void testCase7() {
        //--Test 3--
        int weightOfWagon = 32;
        int depthOfRiver = 47;
        int randomNumber = 24;
        int strenghtOfOxen = 39;
        int expResult = 64;
        int result = ComplexCalculations.calcRiverSuccess(weightOfWagon, depthOfRiver, randomNumber, strenghtOfOxen);
        assertEquals(expResult, result);
   } 
   
    
}
