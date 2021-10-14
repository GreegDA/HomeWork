package Tasks.chapter03;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int n;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите n");
        n = reader.nextInt();
        double a = n /60/60;
        double c =n /60;
        double b =a / (c/60);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
