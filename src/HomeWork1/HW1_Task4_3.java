package HomeWork1;

import java.util.Scanner;

public class HW1_Task4_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Вам необходимо ввести 2 целых числа");

        System.out.println("Введите число №1");
        int number1 = console.nextInt();
        System.out.println("Число №1 принято");

        System.out.println("Введите число №2, не должно быть нулем");
        int number2 = console.nextInt();
        System.out.println("Число №2 принято");


        if (number2 == 0){
            System.out.println("Вас просили: ЧИСЛО №2 НЕ ДОЛЖНО БЫТЬ НУЛЕМ, пробуйте заново");
        } else {
            if (number1 % number2 == 0) {
                System.out.println("Число " +number1+ " делится на " + number2 + " без остатка");
            } else {

                System.out.println("Число " +number1 + " не делится на " + number2 + "без остатка");
                System.out.println("Остаток после деления составляет:" + (number1 % number2));
            }

            System.out.println("Частное составляет: " + number1 / number2);

        }
        System.out.println("Конец");
    }
}
