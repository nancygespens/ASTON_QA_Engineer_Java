import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialTest {

    @Test
    public void testFactorial() {
        assertEquals(FactorialCalculator.calculateFactorial(0), 1);
        assertEquals(FactorialCalculator.calculateFactorial(1), 1);
        assertEquals(FactorialCalculator.calculateFactorial(2), 2);
        assertEquals(FactorialCalculator.calculateFactorial(3), 6);
        assertEquals(FactorialCalculator.calculateFactorial(4), 24);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeNumber() {
        FactorialCalculator.calculateFactorial(-1);
    }
}
