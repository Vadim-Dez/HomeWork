package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {

    public static void main(String[] args) {

        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();

        double a,b,c,d,e;
        int f;
        double subResult1, subResult2, subResult3, subResult4, subFinalResult;

        {
            a = 4.1; b = 15; c = 7;  d = 28; e = 5;
            f = 2;
        }


        subResult1 = calc.division(d, e);
        calc.incrementCountOperation();

        subResult2 = calc.degree(subResult1, f);
        calc.incrementCountOperation();

        subResult3 = calc.multiply(b, c);
        calc.incrementCountOperation();

        subResult4 = calc.add(a, subResult3);
        calc.incrementCountOperation();

        subFinalResult = calc.add(subResult2, subResult4);
        calc.incrementCountOperation();

        System.out.println("Результат: " + subFinalResult);
        System.out.println("Актуальное значение счетчика: " + calc.getCountOperation());
    }
}
