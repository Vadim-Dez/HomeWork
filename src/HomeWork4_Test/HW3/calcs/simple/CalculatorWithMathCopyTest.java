package HomeWork4_Test.HW3.calcs.simple;



import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMathCopyTest {
    private CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

    @Test
    public void add() {
        Assertions.assertEquals(5, calculator.add(2.5, 2.5));

    }

    @Test
    public void subtraction() {
        Assertions.assertEquals(5, calculator.subtraction(10, 5));
    }

    @Test
    public void multiply() {
        Assertions.assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    public void division() {
        Assertions.assertEquals(2.5, calculator.division(5, 2));
    }

    @Test
    public void degree() {
        Assertions.assertEquals(30.25, calculator.degree(5.5, 2));
    }

    @Test
    public void module1() {
        Assertions.assertEquals(5, calculator.module(5));
    }

    @Test
    public void module2() {
        Assertions.assertEquals(5, calculator.module(-5));
    }

    @Test
    public void SquareRoot() {
        Assertions.assertEquals(5, calculator.squareRoot(25));
    }



}









