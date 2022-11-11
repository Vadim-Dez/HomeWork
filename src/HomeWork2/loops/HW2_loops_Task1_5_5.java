package HomeWork2.loops;

import java.util.Scanner;

public class HW2_loops_Task1_5_5 {
    public static void main(String[] args) {
        System.out.println("Введите след. числа:");

        Scanner console = new Scanner(System.in);

        System.out.println("1)Максимальное: ");
        int number1 = console.nextInt();

        System.out.println("2)Минимальное: ");
        int number2 = console.nextInt();

        System.out.println("3)Установите шаг чисел: ");
        int number3 = console.nextInt();

        for (int i = number2; i <= number1; i = i + number3){
            System.out.println(i);
        }
        System.out.println("Конец");
    }
}
