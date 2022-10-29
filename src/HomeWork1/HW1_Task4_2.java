package HomeWork1;

import java.util.Scanner;

public class HW1_Task4_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Вам необходимо ввести 3 разных числа");

        System.out.println("Введите число №1");
        int number1 = console.nextInt();
        System.out.println("Число №1 принято");

        System.out.println("Введите число №2");
        int number2 = console.nextInt();
        System.out.println("Число №2 принято");

        System.out.println("Введите число №3");
        int number3 = console.nextInt();
        System.out.println("Число №3 принято");

        System.out.println("Вы ввели числа: "+"Число №1:"+number1+", Число №2:"+number2+", Число №3:"+number3);

        if ((number1 > number2 && number1 < number3 && number2 < number3) || (number1 < number2 && number1 > number3 && number2 > number3)) {
            System.out.println("Среднее число" +number1);
        } else if ((number1 > number2 && number1 > number3 && number2 > number3) || (number1 < number2 && number1 < number3 && number2 < number3)) {
            System.out.println("Среднее число" +number2);
        } else if ((number1 > number2 && number1 > number3 && number2 < number3) || (number1 < number2 && number1 < number3 && number2 > number3)){
            System.out.println("Среднее число" +number3);
        } else {
            System.out.println("Введенные вами числа совпадают, пропробуйте еще раз");
        }
        System.out.println("Конец");
    }
}
