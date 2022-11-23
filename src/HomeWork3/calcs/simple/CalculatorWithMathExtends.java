package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    //Возведение в целую степень дробного положительного числа
    @Override
    public double degree (double a, int b) {
        return Math.pow (a, b);
    }

    // Модуль числа
    @Override
    public double module (double a) {
        return Math.abs(a);
    }

    // Корень из числа
    @Override
    public double squareRoot (double a) {
        return Math.sqrt(a);
    }
}
