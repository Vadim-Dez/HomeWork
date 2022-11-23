package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    private final CalculatorWithOperator calculator;

    public CalculatorWithCounterAutoComposite () {
        calculator = new CalculatorWithOperator();
    }

    private long counter;

    private void incrementCountOperation() {
        counter ++;
    }

    public long getCountOperation () {
        return counter;
    }

    public double add (double a, double b) {
        incrementCountOperation();
        return calculator.add(a, b);
    }

    public double subtraction (double a, double b) {
        incrementCountOperation();
        return calculator.subtraction(a, b);
    }

    public double multiply (double a, double b) {
        incrementCountOperation();
        return calculator.multiply(a, b);
    }

    public double division (double a, double b) {
        incrementCountOperation();
        return calculator.division(a, b);
    }


    public double degree (double a, int b) {
        incrementCountOperation();
        return calculator.degree(a, b);
    }

    public double module (double a) {
        incrementCountOperation();
        return calculator.module(a);
    }

    public double squareRoot (double a) {
        incrementCountOperation();
        return calculator.squareRoot(a);
    }




}
