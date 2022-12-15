package HomeWork4_Test.HW3.calcs.simple;



import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMathExtendsTest {
    private CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();


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









