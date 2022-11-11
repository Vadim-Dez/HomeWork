package HomeWork2.loops;

public class HW2_loops_Task1_5_2 {
    public static void main(String[] args) {
        int number = 10;
        int a = 0;

        int random;
        int b;
        for (int i = 0; i < number; i++){
            random = (int) (Math.random()*1000);
            if (random % 2 == 0){
                a += 1;
            }
        }
        b =  a * 100 / number ;
        System.out.println("Вероятность четных случайных числе составляет " + b + " %");
        System.out.println("Конец");
    }
}
