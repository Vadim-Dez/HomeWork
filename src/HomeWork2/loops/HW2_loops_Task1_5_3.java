package HomeWork2.loops;

import java.util.Scanner;

public class HW2_loops_Task1_5_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите числа без пробела:");

        long number = console.nextInt();
        int number1 = 0;
        int number2 = 0;

        while (number > 0) {
            if (number % 2 == 0) {
                number2 += 1;
                number = number / 10;
            } else {
                number1 += 1;
                number = number / 10;
            }
        }
        System.out.println("Четных цифр вышло: " + number2 +"\n"+ "Нечетных цифр вышло: "+ number1);
        System.out.println("Конец");
    }
}
