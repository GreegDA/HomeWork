package Tasks.chapter02;
/*
Даны два числа. Найти их сумму, разность, произведение,
а также часное от деления первого числа на второе.
 */

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        double x;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите первое число");
        x = reader.nextDouble();
        double y;
        System.out.println("Введите второе число");
        y = reader.nextDouble();
        double a = x + y;
        double d = x -y;
        double b = x* y;
        while ( y==0){
            System.out.println("На ноль делить нельзя, повторите ввод.");
            y = reader.nextDouble();
        }

        double c = x/y;
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(c);
    }
}
