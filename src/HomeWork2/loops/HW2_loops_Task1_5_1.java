package HomeWork2.loops;

import java.util.Scanner;

public class HW2_loops_Task1_5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        int a = scanner.nextInt();
        int b = (Math.abs(a));
        int max = 0;
        if (a != 0) {
            while (a > 0) {
                if (a % 10 > max) max = (int) (a % 10);
                a /= 10;
            }
            System.out.println("Наибольшей цифрой из всего введенного вами значения является  " + max);
        } else {
            System.out.println("Заданное число не является натуральным!");
            System.out.println("Попробуйте ещё раз");
        }
    }
}
