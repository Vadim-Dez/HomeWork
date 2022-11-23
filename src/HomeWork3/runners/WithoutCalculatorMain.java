package HomeWork3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {

        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        int f = 2;

        // a + b * c + (d / e) ^ f
        // 4.1 + (15 * 7) + ((28 / 5.0) * (28 / 5.0)) = 140.45999999999998

        double result1 = d/e;
        double result2 = ((result1) * (result1));
        double result3 = b * c;
        double result4 = a + result3;
        double finalResult = result4 + result2;


        System.out.println ("Результат: " + finalResult);
    }

}
