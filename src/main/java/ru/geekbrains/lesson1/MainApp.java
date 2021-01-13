package ru.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {
        // Тask 2
        byte b1 = 60;
        short s1 = 750;
        int i1 = 888999;
        long l1 = 444455556666L;

        float f1 = 132.6f;
        double d1 = 57.8;

        boolean bool = true;
        char c1 = 'v';

        String str = "Java";

        // Тask 3
        float result = calcNumber(9.5f, 5.3f, 18.7f, 6.4f);
        System.out.println(result);

        // Тask 4
        boolean res = limitNumber(7,9);
        System.out.println(res);

        // Тask 5
        isPosOrNeg(15);

        // Тask 6
        boolean res1 = isNeg(-10);
        System.out.println(res1);

        // Тask 7
        myName("Андрей");

        // Тask 8
        leapYear(2012);

    }

    public static float calcNumber(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean limitNumber (int a, int b) {
        int c = a + b;
        if (c < 10 || c > 20) {
            return false;
        }
        return true;
    }

    public static void isPosOrNeg(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean isNeg (int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static void myName (String name) {
        System.out.println("Привет, " + name);
    }

    public static void leapYear(int year) {
        if (year % 100 == 0) {
            System.out.println("Не високосный год");
        } else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
    }

}
