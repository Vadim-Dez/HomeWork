package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {

        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();

        double a,b,c,d,e;
        int f;

        double subResult1, subResult2, subResult3, subResult4, subFinalResult;

        {
            a = 4.1;
            b = 15;
            c = 7;
            d = 28;
            e = 5;
            f = 2;
        }

        subResult1 = calc.division(d, e);
        subResult2 = calc.degree(subResult1, f);
        subResult3 = calc.multiply(b, c);
        subResult4 = calc.add(a, subResult3);
        subFinalResult = calc.add(subResult2, subResult4);

        System.out.println("Результат: " + subFinalResult);



    }
}
