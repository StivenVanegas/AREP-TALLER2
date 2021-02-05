/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.stat;

import junit.framework.TestCase;
/**
 *
 * @author StivenVanegas
 */
public class CalculatorTest extends TestCase {

    /**
     * Test of mean method, of class Calculator.
     */
    public void testMean() {
        System.out.println("mean");
        LinkedList<Double> list = new LinkedList<>();
        list.add(160.0);
        list.add(591.0);
        list.add(114.0);
        list.add(229.0);
        list.add(230.0);
        list.add(270.0);
        list.add(128.0);
        list.add(1657.0);
        list.add(624.0);
        list.add(1503.0);
        double expResult = 550.6;
        double result = Calculator.mean(list);
        assertEquals(expResult, result);
    }
    
        /**
     * Test of mean method, of class Calculator.
     */
    public void testMean2() {
        System.out.println("mean");
        LinkedList<Double> list = new LinkedList<>();
        list.add(15.0);
        list.add(69.9);
        list.add(6.5);
        list.add(22.4);
        list.add(28.4);
        list.add(65.9);
        list.add(19.4);
        list.add(198.7);
        list.add(38.8);
        list.add(138.2);
        double expResult = 60.32;
        double result = Calculator.mean(list);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of stdDev method, of class Calculator.
     */
    public void testStdDev() {
        System.out.println("stdDev");
        LinkedList<Double> list = new LinkedList<>();
        list.add(160.0);
        list.add(591.0);
        list.add(114.0);
        list.add(229.0);
        list.add(230.0);
        list.add(270.0);
        list.add(128.0);
        list.add(1657.0);
        list.add(624.0);
        list.add(1503.0);
        double expResult = 572.03;
        double result = Calculator.stdDev(list);
        assertEquals(expResult, result);

    }
    
        public void testStdDev2() {
        System.out.println("stdDev");
        LinkedList<Double> list = new LinkedList<>();
        list.add(15.0);
        list.add(69.9);
        list.add(6.5);
        list.add(22.4);
        list.add(28.4);
        list.add(65.9);
        list.add(19.4);
        list.add(198.7);
        list.add(38.8);
        list.add(138.2);
        double expResult = 62.26;
        double result = Calculator.stdDev(list);
        assertEquals(expResult, result);

    }

}
