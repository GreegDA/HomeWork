package Tasks.chapter02;
/*
Дан радиус окружности. Найти его диаметр.
 */

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        double a;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите радиус окружности");
        a = reader.nextDouble();
        System.out.println(a*2 +" см - диаметр вашой окружности.");
    }
}
