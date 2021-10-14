package Tasks.chapter02;
/*
Дана длина ребра куба. Найти объем куба и
площадь его боковой поверхности.
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double d;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите длину ребра куба");
        d = reader.nextDouble();
        double s = d*d;
        double p = d * d * d;
        System.out.println("Объем куба "+ p);
        System.out.println("Площадь боковой поверхности "+ s*6);
        // System.out.println("Площадей всех боковых поверхностей "+ s *6);
    }
}
