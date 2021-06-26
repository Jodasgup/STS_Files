package CalculatorTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
 public class CalculatorTest {
	

    @Test
    public void Testsum() {
        // Given
        Calculator calculator = new Calculator();
        // When
        int result = calculator.sum(2, 2);
        // Then
        if (result != 4) {   // if 2 + 2 != 4
            Assert.fail();
        }
    }

   @Test
    public void Testminus() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.minus(2, 2));
    }

 

    @Test
    public void Testdivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
    }
    @Test
    public void Testmultiply() {
    	Calculator calculator = new Calculator();
    	Assert.assertEquals(16, calculator.multiply(4,4));


 
    }
}

