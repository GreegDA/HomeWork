package Tasks.chapter02;
/*
Даны длины  сторон прямоугольного параллелепипеда.
Найти его объем и площадь боковой поверхности.
 */

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        int x;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите длину");
        x = reader.nextInt();
        int y;
        System.out.println("Введите ширину");
        y = reader.nextInt();
        int z;
        System.out.println("Введите высоту");
        z = reader.nextInt();
        System.out.println("Площадь боковой поверхности " + 2 * (z * y + x * z + x * y));
        System.out.println("Обьем " + x * y * z);
    }
}
