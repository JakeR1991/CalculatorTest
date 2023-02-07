import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void twoPlusEightEqualsTen() {
        // create object to test
        var cal = new Calculator();
        assertEquals(10, cal.add (2, 8));
    }
    @Test
    void twoPlusSixEqualsEight() {
        // create object to test
        var cal = new Calculator();
        assertEquals(8, cal.add (2, 6));
    }
}