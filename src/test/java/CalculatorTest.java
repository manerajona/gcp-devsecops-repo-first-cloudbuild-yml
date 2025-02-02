import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void verifyAdditionOne() {

        Calculator calculator = new Calculator();
        int sum = calculator.addition("5+2");
        assertEquals(7, sum);
    }

    @Test
    public void verifyAdditionTwo() {

        Calculator calculator = new Calculator();
        int sum = calculator.addition("13+27");
        assertEquals(40, sum);
    }
}