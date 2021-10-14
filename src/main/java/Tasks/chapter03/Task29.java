package Tasks.chapter03;
/*
Дано натуральное число n (n>9). Найти:
b)число десятков в нем
 */

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        double n;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число которое больше 9");
        n =reader.nextDouble();
        double c =n/10;
        System.out.printf("%0.0f",c);
        double a = n / 1;
        System.out.printf("%0.0f", a);
    }

}
