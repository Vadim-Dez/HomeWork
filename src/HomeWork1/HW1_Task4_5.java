package HomeWork1;

import java.util.Scanner;

public class HW1_Task4_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите любой символ на ваше усмотрение: ");
        String str = console.next();
        char symbol = str.charAt(0);
        System.out.println("Выбранный Вами символ для ввода: " + symbol);

        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Вы ввели латиницу в нижнем регистре");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Вы ввели латиницу в верхнем регистре");

        } else if (symbol >= 'а' && symbol <= 'я') {
            System.out.println("Вы ввели кириллицу в нижнем регистре");
        } else if (symbol >= 'А' && symbol <= 'Я') {
            System.out.println("Вы ввели кириллицу в верхнем регистре");


        } else {
            System.out.println("Вы ввели символ не являющийся буквой (латиницей либо кириллицей), значит вы ввели иной символ");
        }
        System.out.println("Конец");

    }
}
