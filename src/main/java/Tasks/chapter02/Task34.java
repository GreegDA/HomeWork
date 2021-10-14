package Tasks.chapter02;
/*
Два автомобиля едут навстречу друг другу с постоянными
скоростями V1 и V2 км/ч. Определить, через какое время
автомобили встретятся, если растояние между ними было S км.
 */

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        int x;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите V1");
        x = reader.nextInt();
        int y;
        System.out.println("Введите V2");
        y = reader.nextInt();
        int s;
        System.out.println("Введите S");
        s = reader.nextInt();
        System.out.println(s/(x+y));
    }
}
