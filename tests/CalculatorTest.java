import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest{
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int a = 1234;
        int b = 5678;
        int actual = calculator.add(a, b);

        int expected = 6912;

        assertEquals(expected, actual);
    }
}