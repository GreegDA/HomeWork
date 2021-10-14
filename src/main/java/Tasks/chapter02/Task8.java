package Tasks.chapter02;
/*
Дан радиус окружности. Найти длину окружности и
площадь круга.
 */

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        double r;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите радиус окружности");
        r = reader.nextDouble();

        System.out.printf("Площадь круга " +"%5.2f",Math.PI * (r*r));
        System.out.println( );
        System.out.printf("Диаметр окружности " + "%5.2f",Math.PI * r);
    }
}