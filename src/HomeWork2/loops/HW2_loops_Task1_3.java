package HomeWork2.loops;

import java.util.Scanner;

public class HW2_loops_Task1_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите число, возводимое в степень, оно должно быть дробным и может быть отрицательным.");

        double number = console.nextDouble();
        System.out.println("Теперь введите степень, это число должно быть положительным и целым");
        if (console.hasNextInt()) {
            int deg = console.nextInt();
            double totalRes = number;
            if (deg > 0) {
                if (number > 0) {
                    for (int i = 1; i < deg; i++) {
                        totalRes = totalRes * deg;
                    }
                    System.out.println(number + " ^ " + deg + " = " + totalRes);
                }
            } else {
                System.out.println("Вы ввели отрицательное число в качестве степени. Попробуйте заново.");
            }
        } else {
            System.out.println("Вы ввели не число а символы либо введено дробное число в качестве степени. Попробуйте заново.");
        }
    }
}
