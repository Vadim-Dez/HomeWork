package HomeWork2.loops;

public class HW2_loops_Task1_6 {
    public static void main(String[] args) {

        System.out.println("Таблица умножения");

        int number;
        int startNumb = 2;
        int endNumb = 9;
        int averageNumb = 5;
        int newTabNumb = 6;
        int zer = 0;
        int i;
        System.out.println("-----------------------------------------------");
        for (i = 1; i <= 10; i++) {
            for (number = startNumb; number <= averageNumb; number++) {
                zer = number * i;
                String rezult3 = number + " * " + i + " = " + zer;
                if (rezult3.length() == 9) {
                    System.out.print(number + " * " + i + " = " + zer + "   ");
                } else if (rezult3.length() == 10) {
                    System.out.print(number + " * " + i + " = " + zer + "  ");
                } else if (rezult3.length() == 11) {
                    System.out.print(number + " * " + i + " = " + zer + " ");
                }
            }
            System.out.println("|");
        } System.out.println("------------------------------------------------");
        for (i = 1; i <= 10; i++) {
            for (number = newTabNumb; number <= endNumb; number++) {
                zer = number * i;
                String rezult4 = number + " * " + i + " = " + zer;
                if (rezult4.length() == 9) {
                    System.out.print(number + " * " + i + " = " + zer + "   ");
                } else if (rezult4.length() == 10) {
                    System.out.print(number + " * " + i + " = " + zer + "  ");
                } else if (rezult4.length() == 11) {
                    System.out.print(number + " * " + i + " = " + zer + " ");
                }
            }
            System.out.println("|");

        }
        System.out.println("-------------------------------------------------");

        System.out.println("ЭТО");
        System.out.println("НУЖНО");
        System.out.println("ЗНАТЬ!");

    }
}
