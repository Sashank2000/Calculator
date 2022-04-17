package cal;

import org.junit.Test;

import static org.junit.Assert.*;
public class CalculatorTest {
    private static final double e = 1e-5;
    Calculator calc = new Calculator();

    @Test
    public void squarerootTrue()
    {
        assertEquals ("Square root of 0", 0 , calc.SquareRoot(0), e);
        assertEquals ("Square root of 25", 5, calc.SquareRoot(25), e);
        assertEquals ("Square root of 0.16", 0.4, calc.SquareRoot(0.16), e);
        assertEquals ("Square root of -5", Double.NaN, calc.SquareRoot(-5), e);
    }

    @Test
    public void squarerootFalse()
    {
        assertNotEquals ("False Positive of Square root of 0", 1 , calc.SquareRoot(0), e);
        assertNotEquals ("False Positive of Square root of 16", 1, calc.SquareRoot(16), e);
        assertNotEquals ("False Positive of Square root of 10", 1, calc.SquareRoot(10), e);
        assertNotEquals ("False Positive of Square root of 0.16", 1, calc.SquareRoot(0.16), e);
    }

    @Test
    public void factorialTrue()
    {
        assertEquals ("Factorial of 1", 1, calc.factorial(1), e);
        assertEquals ("Factorial of 2", 2, calc.factorial(2), e);
        assertEquals ("Factorial of 10", 3628800, calc.factorial(10), e);
        assertEquals ("Factorial of 5", 120, calc.factorial(5), e);
    }

    @Test
    public void factorialFalse()
    {
        assertNotEquals ("False Positive of Factorial of 0", 2, calc.factorial(0), e);
        assertNotEquals ("False Positive of Factorial of 10", 30, calc.factorial(10), e);
        assertNotEquals ("False Positive of Factorial of -2", 4, calc.factorial(-2), e);
        assertNotEquals ("False Positive of Factorial of 3", 12, calc.factorial(3), e);
    }

    @Test
    public void logTrue()
    {
        assertEquals ("Log of 0", Double.NEGATIVE_INFINITY, calc.log(0), e);
        assertEquals ("Log of 1", 0, calc.log(1), e);
        assertEquals ("Log of 10", 2.302585, calc.log(10), e);
        assertEquals ("Log of e", 1, calc.log(Math.E), e);
    }

    @Test
    public void logFalse()
    {
        assertNotEquals ("False Positive of Log of 0", 1, calc.log(0), e);
        assertNotEquals ("False Positive of Log of 1", 10, calc.log(1), e);
        assertNotEquals ("False Positive of Log of -2", 2, calc.log(-2), e);
        assertNotEquals ("False Positive of Log of e", 5, calc.log(Math.E), e);
    }

    @Test
    public void powerTrue()
    {
        assertEquals ("-1 Power -1.5", Double.NaN, calc.power(-1, -1.5), e);
        assertEquals ("10 Power 2", 100, calc.power(10, 2), e);
        assertEquals ("0 Power 0", 1, calc.power(0, 0), e);
        assertEquals ("2 Power -2", 0.25, calc.power(2, -2), e);
    }

    @Test
    public void powerFalse()
    {
        assertNotEquals ("False Positive of -1 Power -1.5", 10, calc.power(-1, -1.5), e);
        assertNotEquals ("False Positive of 10 Power 2", -3, calc.power(10, 2), e);
        assertNotEquals ("False Positive of 0 Power 0", 0, calc.power(0, 0), e);
        assertNotEquals ("False Positive of 2 Power -2", 4, calc.power(2, -2), e);
    }
}