/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techshop_sale;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zarin Hossain
 */
public class SalesTest {
    
    public SalesTest() {
        Sales sales=new Sales();
        int solution=76100,actual;
        String []values={"1000","12000","60000","3000","100"};
        actual=sales.summation(values);
        assertEquals(actual,solution);
    }

    /**
     * Test of summation method, of class Sales.
     */
    @Test
    public void testSummation() {
    }

    /**
     * Test of main method, of class Sales.
     */
    @Test
    public void testMain() {
    }
    
}
