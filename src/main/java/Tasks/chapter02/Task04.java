package Tasks.chapter02;
/*
Дана сторона квадрата. Найти его периметр.
 */

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        double a;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите сторону  квадрата");
        a = reader.nextDouble();
        System.out.println(a*4 +" см - периметр вашего квадрата.");
    }
}
