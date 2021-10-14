package Tasks.chapter02;

import java.util.Scanner;
/*
Известны объем и масса тела. Определить плотность материала этого тела
 */

public class Task11 {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите объем тела");
        a = reader.nextDouble();
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Введите массу тела");
        b = reader2.nextDouble();
        System.out.println(b/a);
    }
}
