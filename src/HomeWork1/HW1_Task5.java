package HomeWork1;

import java.util.Scanner;

public class HW1_Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println ("Введите какой сегодня день недели по счету ");
        int number = console.nextInt();

        System.out.println ("В настоящее время вы находитесь в отпуске? Введите true либо false ");
        boolean vacation = console.nextBoolean();
        boolean weekday = false;
        boolean offday = true;

        if (number >=6 && number<=7){
            weekday = offday;
        }
        boolean result = sleepIn(weekday, vacation);
        if (result){
            System.out.println ("Можно спать дальше");
        } else{
            System.out.println ("Пора идти на работу");
        }
        System.out.println("Конец");

    }

    public static boolean sleepIn (boolean offday, boolean vacation){
        if (offday || vacation){
            return true;
        } else {
            return false;
        }
    }
}
