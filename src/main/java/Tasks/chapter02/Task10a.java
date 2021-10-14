package Tasks.chapter02;
/*
Даны два целых числа. Найти:
а) их среднее арифметическое.
 */

import java.util.Scanner;

public class Task10a {
    public static void main(String[] args) {
        int b;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите первое число");
        b = reader.nextInt();
        int a;
        System.out.println("Введите второе число");
        a = reader.nextInt();
        double c = (b +a) *2;
        System.out.println(c);
    }
}
