package Tasks.chapter02;

import java.util.Scanner;
/*
Известны количество жытелей в государстве и площадь его территории.
 Определить плотность населения в этом государстве
 */

public class Task12 {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите площадь государства");
        a = reader.nextDouble();
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Введите количество жытелей");
        b = reader2.nextDouble();
        System.out.println(b/a);
    }
}
