package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
       calc = new Calculator(); 
    }
   
    @Test
    public void testAddPositiveNumbers() {
        // arrange
        int a = 10;
        int b = 20;
        
        // act
        int result =  calc.add(a, b);
        
        // assert
        assertEquals(30, result);
    }

    @Test
    public void testAddZeroToPositive() {
        // arrange
        Calculator calc = new Calculator();
        int a = 10;
        int b = 0;
        
        // act
        int result =  calc.add(a, b);
        
        // assert
        assertEquals(10, result);
    }

}
