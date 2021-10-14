package Tasks.chapter02;
/*
Найти площадь кольца по заданым внешнему и внутреннему радиусам.
 */

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int b;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите первое число");
        b = reader.nextInt();
        int a;
        System.out.println("Введите второе число");
        a = reader.nextInt();
        double pi = Math.PI;
        double sx = pi * b * b;
        double sy = pi * a * a;
        double s = sx - sy;
        System.out.println(s);
    }
}
