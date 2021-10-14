package Tasks.chapter03;
/*
Дано натуральное число n (n>99). Найти:
a)число десятков в нем
 */

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        double n;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число которое больше 99");
        n =reader.nextDouble();
        double c =n/10;
        System.out.printf("%0.0f",c);
        double a =n/100;
        System.out.printf("%0.0f",a);
    }

}
