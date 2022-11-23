package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {

        CalculatorWithOperator calc = new CalculatorWithOperator();

        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        int f = 2;


        double subResult1 = calc.division(d, e);
        double subResult2 = calc.degree(subResult1, f);
        double subResult3 = calc.multiply(b, c);
        double subResult4 = calc.add(a, subResult3);
        double subFinalResult = calc.add(subResult4, subResult2);

        System.out.println("Результат: " + subFinalResult);
    }
}
