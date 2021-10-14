package Tasks.chapter02;
/*
Два автомобиля едут  друг за другом с постоянными
скоростями V1 и V2 км/ч (V1>V2). Опредилить, какое растояние будет между ними
через 30 минут после того,как первый автомобиль опередил второй на S км.
 */

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        int x;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите V1");
        x = reader.nextInt();
        int y;
        System.out.println("Введите V2");
        y = reader.nextInt();
        while (y>x)
            System.out.println("Введите V2 Ещё раз.");
            y = reader.nextInt();
        int s;
        System.out.println("Введите S");
        s = reader.nextInt();
        System.out.println(s +(x/2));
    }
}
