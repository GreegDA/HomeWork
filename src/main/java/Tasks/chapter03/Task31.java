package Tasks.chapter03;
/*
Дано натуральное число n (n>999). Найти:
a)число сотен в нем
b)число тысяч в нем
 */

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        double n;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число которое больше 999");
        n =reader.nextDouble();
        double c =n/100;
        System.out.printf("%0.0f",c);
        double a =n/1000;
        System.out.printf("%0.0f",a);
    }

}
