/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.wolfmanfp.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author wolfman
 */
public class StringCalcTest {
    StringCalculator calculator;
    
    @Before
    public void setUp() {
        calculator = new StringCalculator();
    }
    
    public StringCalcTest() {
    }
    
    @Test
    public void emptyString() {
        assertEquals(0,calculator.add(""));
    }
    
    @Test
    public void oneNumber() {
        assertEquals(1,calculator.add("1"));
        assertEquals(2,calculator.add("2"));
    }
}
