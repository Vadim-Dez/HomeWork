package HomeWork1;

public class HW1_Task3 {
    public static void main(String[] args) {

        //Внес много примеров для себя.
        // возвращает максимальное число из двух аргументов
        int a = 2;
        int b = 4;
        System.out.println(Math.max(a, b));


        System.out.println("--------------");
        //возвращает меньшее из двух аргументов.
        System.out.println(Math.min(a, b));



        System.out.println("--------------");
        // возвращает абсолютное значение аргумента (модуль числа)
        Integer c = -8;
        double d = -100;
        float f = -90;
        System.out.println(Math.abs(c));
        System.out.println(Math.abs(d));
        System.out.println(Math.abs(f));

        System.out.println("--------------");
        //возвращает целое число, которое ближайшее к числу аргумента справа.
        // Возвращается в виде double.
        double d1 = 0.3;
        double d2 = -10.75;
        double d3 = 8.4;
        double d4 = 11;
        double d5 = -11;

        float f1 = -0.3f;
        float f2 = -5.75f;
        float f3 = 3.4f;
        float f4 = 8;
        float f5 = -8;

        System.out.println("d1 = " + Math.ceil(d1));
        System.out.println("d2 = " + Math.ceil(d2));
        System.out.println("d3 = " + Math.ceil(d3));
        System.out.println("d4 = " + Math.ceil(d4));
        System.out.println("d5 = " + Math.ceil(d5));

        System.out.println("f1 = " + Math.ceil(f1));
        System.out.println("f2 = " + Math.ceil(f2));
        System.out.println("f3 = " + Math.ceil(f3));
        System.out.println("f4 = " + Math.ceil(f4));
        System.out.println("f5 = " + Math.ceil(f5));



        System.out.println("--------------");
        //возвращает целое число, которое ближайшее к числу аргумента слева.
        // Возвращается в виде double.
        double d1_1 = 0.4;
        double d2_1 = -7.75;
        double d3_1 = 8.6;
        double d4_1 = 1;
        double d5_1 = -1;

        float f1_1 = -0.4f;
        float f2_1 = -5.75f;
        float f3_1 = 3.4f;
        float f4_1 = 7;
        float f5_1 = -7;

        System.out.println("d1_1 = " + Math.floor(d1_1));
        System.out.println("d2_1 = " + Math.floor(d2_1));
        System.out.println("d3_1 = " + Math.floor(d3_1));
        System.out.println("d4_1 = " + Math.floor(d4_1));
        System.out.println("d5_1 = " + Math.floor(d5_1));

        System.out.println("f1_1 = " + Math.floor(f1_1));
        System.out.println("f2_1 = " + Math.floor(f2_1));
        System.out.println("f3_1 = " + Math.floor(f3_1));
        System.out.println("f4_1 = " + Math.floor(f4_1));
        System.out.println("f5_1 = " + Math.floor(f5_1));



        System.out.println("--------------");
        //возвращает целое число, которое ближайшее по значению аргумента.
        // Возвращается в виде double.
        double a1 = 10.200;
        double b1 = 10.500;
        double c1 = 10.501;
        double d1_11 = 10.675;
        double e1 = 1.5;
        double f1_11 = 2.5;

        System.out.println("a1 = " + Math.rint(a1));
        System.out.println("b1 = " + Math.rint(b1));
        System.out.println("c1 = " + Math.rint(c1));
        System.out.println("d1 = " + Math.rint(d1_11));
        System.out.println("e1 = " + Math.rint(e1));
        System.out.println("f1 = " + Math.rint(f1_11));



        System.out.println("--------------");
        //возвращает целое число (long или int), ближайшее к вещественному числу,
        // double или float, аргумента.
        double d11 = 1.49;
        double d21 = 1.50;
        double d31 = 1.75;
        double d41 = -1.49;
        double d51 = -1.50;
        double d61 = -1.75;

        float f11 = 10;
        float f21 = 9f;
        float f31 = -10;
        float f41 = -9f;

        System.out.println("d1 = " + Math.round(d11));
        System.out.println("d2 = " + Math.round(d21));
        System.out.println("d3 = " + Math.round(d31));
        System.out.println("d4 = " + Math.round(d41));
        System.out.println("d5 = " + Math.round(d51));
        System.out.println("d6 = " + Math.round(d61));

        System.out.println("f1 = " + Math.round(f11));
        System.out.println("f2 = " + Math.round(f21));
        System.out.println("f3 = " + Math.round(f31));
        System.out.println("f4 = " + Math.round(f41));



        System.out.println("--------------");
        //возвращает натуральный логарифм по основанию е и аргументу – показателю степени.
        double x = 11.635;

        System.out.printf("Значение e = %.3f%n", Math.E);
        System.out.printf("exp(%.3f) = %.3f%n", x, Math.exp(x));



        System.out.println("--------------");
        //возвращает натуральный логарифм аргумента
        double x1 = 11.635;

        System.out.printf("Значение e = %.3f%n", Math.E);
        System.out.printf("log(%.3f) = %.3f%n", x1, Math.log(x));


        System.out.println("--------------");
        //возвращает double значение первого аргумента,
        // возведенное в степень второго аргумента.
        // Возведение в квадрат числа 3
        int a11 = 3;
        int b11 = 2;
        System.out.printf("Число 3 в квадрате равно %.0f \n", Math.pow(a11, b11));

        // Возведение в квадрат числа 5
        int a2 = 5;
        int b2 = 2;
        System.out.println("Число 5 в квадрате равно " + Math.pow(a2, b2));

        // Возведение в куб числа 2
        int a3 = 2;
        int b3 = 3;
        System.out.printf("Число 2 в кубе равно %.0f \n", Math.pow(a3, b3));

        // Возведение в куб числа 3
        int a4 = 3;
        int b4 = 3;
        System.out.println("Число 3 в кубе равно " + Math.pow(a4, b4));



        System.out.println("--------------");
        //возвращает квадратный корень из аргумента.
        double x11 = 16;
        double x2 = 2.25;
        double x3 = 0.25;
        double x4 = 88.675;

        System.out.printf("sqrt(%.3f) = %.3f%n", x11, Math.sqrt(x1));
        System.out.printf("sqrt(%.3f) = %.3f%n", x2, Math.sqrt(x2));
        System.out.printf("sqrt(%.3f) = %.3f%n", x3, Math.sqrt(x3));
        System.out.printf("sqrt(%.3f) = %.3f%n", x4, Math.sqrt(x4));


        System.out.println("--------------");
        //возвращает синус указанного в радианах double значения
        double degrees1 = 0.0;
        double radians1 = Math.toRadians(degrees1);
        double degrees2 = 30.0;
        double radians2 = Math.toRadians(degrees2);
        double degrees3 = 45.0;
        double radians3 = Math.toRadians(degrees3);
        double degrees4 = 60.0;
        double radians4 = Math.toRadians(degrees4);
        double degrees5 = 90.0;
        double radians5 = Math.toRadians(degrees5);
        double degrees6 = 180.0;
        double radians6 = Math.toRadians(degrees6);
        double degrees7 = 270.0;
        double radians7 = Math.toRadians(degrees7);
        double degrees8 = 360.0;
        double radians8 = Math.toRadians(degrees8);

        System.out.format("Синус %.1f градусов равен %.4f%n", degrees1, Math.sin(radians1));
        System.out.format("Синус %.1f градусов равен %.4f%n", degrees2, Math.sin(radians2));
        System.out.format("Синус %.1f градусов равен %.4f%n", degrees3, Math.sin(radians3));
        System.out.format("Синус %.1f градусов равен %.4f%n", degrees4, Math.sin(radians4));
        System.out.format("Синус %.1f градусов равен %.4f%n", degrees5, Math.sin(radians5));
        System.out.format("Синус %.1f градусов равен %.4f%n", degrees6, Math.sin(radians6));
        System.out.format("Синус %.1f градусов равен %.4f%n", degrees7, Math.sin(radians7));
        System.out.format("Синус %.1f градусов равен %.4f%n", degrees8, Math.sin(radians8));


        System.out.println("--------------");
        //возвращает косинус указанного в радианах double значения
        double degrees11 = 0.0;
        double radians11 = Math.toRadians(degrees11);
        double degrees21 = 30.0;
        double radians21 = Math.toRadians(degrees21);
        double degrees31 = 45.0;
        double radians31 = Math.toRadians(degrees31);
        double degrees41 = 60.0;
        double radians41 = Math.toRadians(degrees41);
        double degrees51 = 90.0;
        double radians51 = Math.toRadians(degrees51);
        double degrees61 = 180.0;
        double radians61 = Math.toRadians(degrees61);
        double degrees71 = 270.0;
        double radians71 = Math.toRadians(degrees71);
        double degrees81 = 360.0;
        double radians81 = Math.toRadians(degrees81);

        System.out.format("Косинус %.1f градусов равен %.4f%n", degrees11, Math.cos(radians11));
        System.out.format("Косинус %.1f градусов равен %.4f%n", degrees21, Math.cos(radians21));
        System.out.format("Косинус %.1f градусов равен %.4f%n", degrees31, Math.cos(radians31));
        System.out.format("Косинус %.1f градусов равен %.4f%n", degrees41, Math.cos(radians41));
        System.out.format("Косинус %.1f градусов равен %.4f%n", degrees51, Math.cos(radians51));
        System.out.format("Косинус %.1f градусов равен %.4f%n", degrees61, Math.cos(radians61));
        System.out.format("Косинус %.1f градусов равен %.4f%n", degrees71, Math.cos(radians71));
        System.out.format("Косинус %.1f градусов равен %.4f%n", degrees81, Math.cos(radians81));


        System.out.println("--------------");
        //возвращает тангенс указанного в радианах double значения.
        double degrees111 = 0.0;
        double radians111 = Math.toRadians(degrees111);
        double degrees211 = 30.0;
        double radians211 = Math.toRadians(degrees211);
        double degrees311 = 45.0;
        double radians311 = Math.toRadians(degrees311);
        double degrees411 = 60.0;
        double radians411 = Math.toRadians(degrees411);
        double degrees511 = 180.0;
        double radians511 = Math.toRadians(degrees511);
        double degrees611 = 360.0;
        double radians611 = Math.toRadians(degrees611);

        System.out.format("Тангенс %.1f градусов равен %.4f%n", degrees111, Math.tan(radians111));
        System.out.format("Тангенс %.1f градусов равен %.4f%n", degrees211, Math.tan(radians211));
        System.out.format("Тангенс %.1f градусов равен %.4f%n", degrees311, Math.tan(radians311));
        System.out.format("Тангенс %.1f градусов равен %.4f%n", degrees411, Math.tan(radians411));
        System.out.format("Тангенс %.1f градусов равен %.4f%n", degrees511, Math.tan(radians511));
        System.out.format("Тангенс %.1f градусов равен %.4f%n", degrees611, Math.tan(radians611));

        System.out.println("--------------");
        //возвращает арксинус указанного в радианах double значения.
        double degrees12 = -90.0;
        double radians12 = Math.toRadians(degrees12);
        double degrees22 = -60.0;
        double radians22 = Math.toRadians(degrees22);
        double degrees32 = -45.0;
        double radians32 = Math.toRadians(degrees32);
        double degrees42 = -30.0;
        double radians42 = Math.toRadians(degrees42);
        double degrees52 = 0.0;
        double radians52 = Math.toRadians(degrees52);
        double degrees62 = 30.0;
        double radians62 = Math.toRadians(degrees62);
        double degrees72 = 45.0;
        double radians72 = Math.toRadians(degrees72);
        double degrees82 = 60.0;
        double radians82 = Math.toRadians(degrees82);
        double degrees92 = 90.0;
        double radians92 = Math.toRadians(degrees92);

        System.out.format("Арксинус %.4f равен %.2f градусам %n", Math.sin(radians12), Math.toDegrees(Math.asin(Math.sin(radians12))));
        System.out.format("Арксинус %.4f равен %.2f градусам %n", Math.sin(radians22), Math.toDegrees(Math.asin(Math.sin(radians22))));
        System.out.format("Арксинус %.4f равен %.2f градусам %n", Math.sin(radians32), Math.toDegrees(Math.asin(Math.sin(radians32))));
        System.out.format("Арксинус %.4f равен %.2f градусам %n", Math.sin(radians42), Math.toDegrees(Math.asin(Math.sin(radians42))));
        System.out.format("Арксинус %.4f равен %.2f градусам %n", Math.sin(radians52), Math.toDegrees(Math.asin(Math.sin(radians52))));
        System.out.format("Арксинус %.4f равен %.2f градусам %n", Math.sin(radians62), Math.toDegrees(Math.asin(Math.sin(radians62))));
        System.out.format("Арксинус %.4f равен %.2f градусам %n", Math.sin(radians72), Math.toDegrees(Math.asin(Math.sin(radians72))));
        System.out.format("Арксинус %.4f равен %.2f градусам %n", Math.sin(radians82), Math.toDegrees(Math.asin(Math.sin(radians82))));
        System.out.format("Арксинус %.4f равен %.2f градусам %n", Math.sin(radians92), Math.toDegrees(Math.asin(Math.sin(radians92))));



        System.out.println("--------------");
        //возвращает арккосинус указанного в радианах double значения.
        double degrees13 = 180.0;
        double radians13 = Math.toRadians(degrees13);
        double degrees23 = 150.0;
        double radians23 = Math.toRadians(degrees23);
        double degrees33 = 135.0;
        double radians33 = Math.toRadians(degrees33);
        double degrees43 = 120.0;
        double radians43 = Math.toRadians(degrees43);
        double degrees53 = 90.0;
        double radians53 = Math.toRadians(degrees53);
        double degrees63 = 60.0;
        double radians63 = Math.toRadians(degrees63);
        double degrees73 = 45.0;
        double radians73 = Math.toRadians(degrees73);
        double degrees83 = 30.0;
        double radians83 = Math.toRadians(degrees83);
        double degrees93 = 0.0;
        double radians93 = Math.toRadians(degrees93);

        System.out.format("Арккосинус %.4f равен %.2f градусам %n", Math.cos(radians13), Math.toDegrees(Math.acos(Math.cos(radians13))));
        System.out.format("Арккосинус %.4f равен %.2f градусам %n", Math.cos(radians23), Math.toDegrees(Math.acos(Math.cos(radians23))));
        System.out.format("Арккосинус %.4f равен %.2f градусам %n", Math.cos(radians33), Math.toDegrees(Math.acos(Math.cos(radians33))));
        System.out.format("Арккосинус %.4f равен %.2f градусам %n", Math.cos(radians43), Math.toDegrees(Math.acos(Math.cos(radians43))));
        System.out.format("Арккосинус %.4f равен %.2f градусам %n", Math.cos(radians53), Math.toDegrees(Math.acos(Math.cos(radians53))));
        System.out.format("Арккосинус %.4f равен %.2f градусам %n", Math.cos(radians63), Math.toDegrees(Math.acos(Math.cos(radians63))));
        System.out.format("Арккосинус %.4f равен %.2f градусам %n", Math.cos(radians73), Math.toDegrees(Math.acos(Math.cos(radians73))));
        System.out.format("Арккосинус %.4f равен %.2f градусам %n", Math.cos(radians83), Math.toDegrees(Math.acos(Math.cos(radians83))));
        System.out.format("Арккосинус %.4f равен %.2f градусам %n", Math.cos(radians93), Math.toDegrees(Math.acos(Math.cos(radians93))));


        System.out.println("--------------");
        //возвращает арктангенс указанного в радианах double значения.
        double degrees14 = -60.0;
        double radians14 = Math.toRadians(degrees14);
        double degrees24 = -45.0;
        double radians24 = Math.toRadians(degrees24);
        double degrees34 = -30.0;
        double radians34 = Math.toRadians(degrees34);
        double degrees44 = 0.0;
        double radians44 = Math.toRadians(degrees44);
        double degrees54 = 30.0;
        double radians54 = Math.toRadians(degrees54);
        double degrees64 = 45.0;
        double radians64 = Math.toRadians(degrees64);
        double degrees74 = 60.0;
        double radians74 = Math.toRadians(degrees74);

        System.out.format("Арктангенс %.4f равен %.2f градусам %n", Math.tan(radians14), Math.toDegrees(Math.atan(Math.tan(radians14))));
        System.out.format("Арктангенс %.4f равен %.2f градусам %n", Math.tan(radians24), Math.toDegrees(Math.atan(Math.tan(radians24))));
        System.out.format("Арктангенс %.4f равен %.2f градусам %n", Math.tan(radians34), Math.toDegrees(Math.atan(Math.tan(radians34))));
        System.out.format("Арктангенс %.4f равен %.2f градусам %n", Math.tan(radians44), Math.toDegrees(Math.atan(Math.tan(radians44))));
        System.out.format("Арктангенс %.4f равен %.2f градусам %n", Math.tan(radians54), Math.toDegrees(Math.atan(Math.tan(radians54))));
        System.out.format("Арктангенс %.4f равен %.2f градусам %n", Math.tan(radians64), Math.toDegrees(Math.atan(Math.tan(radians64))));
        System.out.format("Арктангенс %.4f равен %.2f градусам %n", Math.tan(radians74), Math.toDegrees(Math.atan(Math.tan(radians74))));



        System.out.println("--------------");
        //возвращает тета из полярных координат (r, тета).
        double x5 = 45.0;
        double y5 = 30.0;

        System.out.println(Math.atan2(x5, y5));



        System.out.println("--------------");
        //преобразует радианы в градусы и возвращает значение double типа.
        double a5 = 90.0;
        double b5 = 45.0;
        double c5 = 0.017453;

        System.out.format("%.1f радиан = %.3f градусов %n", a5, Math.toDegrees(a5));
        System.out.format("%.1f радиан = %.3f градусов %n", b5, Math.toDegrees(b5));
        System.out.format("%.6f радиан = %.5f градусу %n", c5, Math.toDegrees(c5));



        System.out.println("--------------");
        //преобразует градусы в радианы и возвращает значение double типа
        double a6 = 90.0;
        double b6 = 45.0;
        double c6 = 57.295780;

        System.out.format("%.1f градусов = %.3f радиану %n", a6, Math.toRadians(a6));
        System.out.format("%.1f градусов = %.3f радиану %n", b6, Math.toRadians(b6));
        System.out.format("%.6f градусов = %.5f радиану %n", c6, Math.toRadians(c6));


        System.out.println("--------------");
        //возвращает случайное double значение с положительным знаком
        // в диапазоне больше или равно 0.0 и меньше 1.0 (0.0 <= Math.random() < 1.0).
        System.out.println("1-ое случайное число: " + Math.random());
        System.out.println("2-ое случайное число: " + Math.random());
        System.out.println("3-е случайное число: " + Math.random());


    }
}
