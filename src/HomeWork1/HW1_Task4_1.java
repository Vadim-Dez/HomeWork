package HomeWork1;

public class HW1_Task4_1 {
    public static void main(String[] args) {

        int a = (int) (Math.random()*(10+10)+1);
        // проверяем его на нечетность: если оно четное, то делаем его нечетным,
        // иначе - оставляем как есть
        a = a % 2 == 0 ? a + 1 : a;


        int b = (int) (Math.random()*100);
        // проверяем его на четность: если оно нечетное, то делаем его четным,
        // иначе - оставляем как есть
        b = !(b % 2 == 0) ? b + 1 : b;

        int result = a % 2 != 0 ? a : b;

        System.out.println ("Нечетное число = " + result);

        System.out.println("Конец");

    }
}
