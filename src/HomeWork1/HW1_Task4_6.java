package HomeWork1;

import java.util.Scanner;

public class HW1_Task4_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите год для начала работы программы");
        int a = console.nextInt();

        if ((a % 4 == 0) && a % 100 != 0) {
            System.out.println(a + " это високосный год");
        } else if ((a % 4 == 0) && (a % 100 == 0) && (a % 400 == 0)) {
            System.out.println(a + " это високосный год");
        } else {
            System.out.println(a + " это не високосный год");
        }
        System.out.println("Конец");
    }
}
