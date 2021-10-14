package Tasks.chapter02;
/*
Составить прграмму вычесления функции у = 3a^2 + 5a - 21 при
любом значениих;
 */


import java.util.Scanner;

public class Task01b {
    public static void main(String[] args) {
        double a;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число");
        a = reader.nextDouble();
        double y = 3 * a * a + 5 * a - 21;
        System.out.println(y);
    }
}
