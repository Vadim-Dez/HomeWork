package HomeWork1;

import java.util.Scanner;

public class HW1_Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите число №1: ");
        // двоичный код первого числа 1 = 1
        int number1 = console.nextInt();

        System.out.println("Введите число №2: ");
        // двоичный код второго числа 4 = 100
        int number2 = console.nextInt();

        int save1 = number1&number2;
        System.out.println(save1);
        //двоичный код результата с И 0 = 0

        int save2 = number1|number2;
        System.out.println(save2);
        // двоичный код результата с ИЛИ 5 = 101
    }
}
