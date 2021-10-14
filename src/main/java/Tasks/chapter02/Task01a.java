package Tasks.chapter02;
/*
Составить программу вычесления функции у = 17х^2 - 6х + 13 при любом значении х;
 */

import java.util.Scanner;

public class Task01a {
    public static void main(String[] args) {
        double x;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число");
        x = reader.nextDouble();
        double y = 17 * x * x - 6 * x + 13;
        System.out.printf("%.3f",y);
    }
}
