package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class HW1_Task4_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите любое целое число на ваш выбор, но больше 0");
        int a = console.nextInt();


        System.out.println("Выберите букву B- для перевода вашего числа в байты и букву KB-для перевода вашего числа в килобайты (латиница)");
        String choice = console.next();

        if (Objects.equals(choice, "B")) {
            System.out.println("Ваше число " +a+ ", при переводе в байты оно преобразуется в " +(a * 1024));
        } else if (Objects.equals(choice, "KB")) {
            System.out.println("Ваше число " +a+ ", при переводе в килобайты оно преобразуется в " +(a / 1024));
        } else {
            System.out.println("Вы ввели некоретные данные, начните заново");
        }
        System.out.println("Конец");

    }
}
