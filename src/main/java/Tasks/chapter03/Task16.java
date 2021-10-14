package Tasks.chapter03;
/*
Дано двухзначное число. Найти:
a)число десятков в нем
b)число единиц в нем;
 */

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        double n;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите двухзначное число ");
        n =reader.nextDouble();
        double c =n/10;
        System.out.printf("%0.0f",c);
        double q =n/1;
        System.out.printf("%0.0f",q);

    }
}
