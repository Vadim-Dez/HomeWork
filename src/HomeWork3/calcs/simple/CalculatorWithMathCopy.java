package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    // сумму двух дробных чисел
    public double add (double a, double b) {
        return a + b;
    }

    // разность двух чисел
    public double subtraction (double a, double b) {
        return a - b;
    }

    // произведение двух чисел
    public double multiply (double a, double b) {
        return a * b;
    }

    // частное двух чисел
    public double division (double a, double b) {
        return a / b;
    }

    // возведения дробного положительного числа в целую степень
    public double degree (double a, int b) {
        return Math.pow (a, b);
    }

    // модуль числа
    public double module (double a) {
        return Math.abs(a);
    }

    // квадратный корень
    public double squareRoot (double a) {
        return Math.sqrt(a);
    }
}
