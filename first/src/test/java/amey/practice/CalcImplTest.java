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
        assertNotEquals(10, calc.add(15, 5));
        assertNotEquals(0, calc.add(1, 0));
        assertEquals(0, calc.add(0, 0));        
    }

    @Test
    public void subTest(){
        assertEquals(10, calc.sub(15, 5));
        assertEquals(-10, calc.sub(10, 20));
        assertNotEquals(-5, calc.sub(15, 5));
        assertNotEquals(0, calc.sub(1, 0));
        assertEquals(-5, calc.sub(0, 5)); 
    }
}
