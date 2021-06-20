package amey.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CalcImplTest {
    
    CalcImpl calc = new CalcImpl();    

    @Test
    public void addTest(){
        assertEquals(10, calc.add(5, 5));
        assertEquals(20, calc.add(15, 5));        
        assertEquals(0, calc.add(0, 0));    

        assertNotEquals(10, calc.add(15, 5));
        assertNotEquals(0, calc.add(1, 0));    
    }

    @Test
    public void subTest(){
        assertEquals(10, calc.sub(15, 5));
        assertEquals(-10, calc.sub(10, 20));        
        assertEquals(-5, calc.sub(0, 5)); 

        assertNotEquals(-5, calc.sub(15, 5));
        assertNotEquals(0, calc.sub(1, 0));
    }

    @Test
    public void divTest(){
        assertEquals(3, calc.divide(15, 5));
        assertEquals(2, calc.divide(20, 10));        
        assertEquals(0, calc.divide(1, 0)); 

        assertNotEquals(-3, calc.divide(15, 5));
        assertNotEquals(3, calc.divide(30, 3));
    }

    @Test
    public void multiTest(){
        assertEquals(75, calc.multiply(15, 5));
        assertEquals(200, calc.multiply(10, 20));        
        assertEquals(0, calc.multiply(0, 5)); 

        assertNotEquals(-5, calc.multiply(15, 5));
        assertNotEquals(2, calc.multiply(1, 0));
    }

    @Test
    public void addSubTest(){
        assertEquals(5, calc.addSub(5, 5));
    }
}
