package Tasks.chapter01;
/*
Составить программу вывода на экран в одну строку трех любых чисел,
вводимых с клавиатуры, с двумя пробелами между ними.
 */

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число");
        a = reader.nextInt();
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Введите второе число");
        b = reader2.nextInt();
        Scanner reader3 = new Scanner(System.in);
        System.out.println("Введите третье число");
        c = reader3.nextInt();
        System.out.println(a +"  " + b + "  " + c);
    }
}
