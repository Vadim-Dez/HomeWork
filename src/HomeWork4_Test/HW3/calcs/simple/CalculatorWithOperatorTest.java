package HomeWork4_Test.HW3.calcs.simple;


import HomeWork3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithOperatorTest {
    private CalculatorWithOperator calculator = new CalculatorWithOperator();


    @Test
    public void add1() {
        Assertions.assertEquals(5, calculator.add(2, 3));

    }

    @Test
    public void add2() {
        Assertions.assertEquals(1, calculator.add(-2, 3));

    }

    @Test
    public void add3() {
        Assertions.assertEquals(5, calculator.add(0, 5));

    }


    @Test
    public void subtraction1() {
        Assertions.assertEquals(5, calculator.subtraction(10, 5));
    }

    @Test
    public void subtraction2() {
        Assertions.assertEquals(-10, calculator.subtraction(-5, 5));
    }

    @Test
    public void subtraction3() {
        Assertions.assertEquals(-5, calculator.subtraction(0, 5));
    }


    @Test
    public void multiply1() {
        Assertions.assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    public void multiply2() {
        Assertions.assertEquals(-25, calculator.multiply(-5, 5));
    }

    @Test
    public void multiply3() {
        Assertions.assertEquals(0, calculator.multiply(5, 0));
    }


    @Test
    public void division1() {
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









