package HomeWork2.loops;

import java.util.Scanner;

public class HW2_loops_Task1_1_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите любое число от 0 до 10");

        if (console.hasNextInt()) {
            int number = console.nextInt();
            if (number < 11){
                if (number > -1) {
                    int total = 1;
                    if(number == 0){
                        System.out.println(number + " = " + 1);
                    }
                    for (int i = 1; i <= number; i++) {
                        total = total * i;
                        if (i < number) {
                            System.out.print(i + "*");
                        } else {
                            System.out.print(i + "=" + total);
                        }
                    }
                } else {
                    System.out.println("Вы ввели число меньше чем вас просили, попробуйте еще раз.");
                }
            }else{
                System.out.println("Вы ввели число больше чем вас просили, попробуйте еще раз.");
            }
        } else {
            System.out.println("Это не число, вас просили ввести именно число!");
        }
    }
}



