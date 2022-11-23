package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long counter;
    private void incrementCountOperation() {
        counter ++;
    }
    public long getCountOperation () {
        return counter;
    }


    @Override
    public double add(double a, double b) {
        incrementCountOperation();
        return super.add(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        incrementCountOperation();
        return super.subtraction(a, b);
    }

    @Override
    public double multiply(double a, double b) {
        incrementCountOperation();
        return super.multiply(a, b);
    }

    @Override
    public double division (double a, double b) {
        incrementCountOperation();
        return super.division(a, b);
    }


    @Override
    public double degree (double a, int b) {
        incrementCountOperation();
        return super.degree(a, b);
    }

    @Override
    public double module (double a) {
        incrementCountOperation();
        return super.module(a);
    }

    @Override
    public double squareRoot (double a) {
        incrementCountOperation();
        return super.squareRoot(a);
    }


}
