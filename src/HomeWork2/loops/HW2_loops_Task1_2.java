package HomeWork2.loops;

import java.util.Scanner;

public class HW2_loops_Task1_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите целые числа, обязательно через пробел. 0 вводить нельзя!");

        if(console.hasNextInt()) {
            String number = console.nextLine();
            if(!number.contains("0")) {
                int totalRes = 1;
                String strArray[] = number.split(" ");
                int numArr[] = new int[strArray.length];
                for (int i = 0; i < strArray.length; i++) {
                    numArr[i] = Integer.parseInt(strArray[i]);
                    if (i < strArray.length -1) {
                        System.out.print(numArr[i] + " * ");
                    } else {
                        System.out.print(numArr[i]);
                    }
                    totalRes = totalRes * numArr[i];
                }
                System.out.println(" = " + totalRes);
            }else{
                System.out.println("Вы ввели 0 либо ввели не целое число, а десятичное число с присутствующим 0. Попробуйте заново.");
            }
        }else{
            System.out.println("Введены не корректные данные. Вы ввели не число либо вы ввели число с дробью. Попробуйте заново.");
        }
    }
}
