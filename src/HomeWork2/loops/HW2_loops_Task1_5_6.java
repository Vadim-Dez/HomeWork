package HomeWork2.loops;

import java.util.Scanner;

public class HW2_loops_Task1_5_6 {
    public static void main(String[] args) {
            Scanner console = new Scanner(System.in);

            System.out.println("Введите ваше число, двухзначное и больше: ");

            int number = console.nextInt();
            int number1 = 0;
            while (number > 0) {
                number1 = number1 * 10 + number % 10;
                number = number / 10;
            }
            System.out.println("Переворот введенного вами числа выглядит: " + number1);
        }
    }
