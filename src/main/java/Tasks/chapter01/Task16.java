package Tasks.chapter01;
/*
Составить программу вывода на экран следующей информации:
   a)2 кг     b)а 1      c)x y
     13 17      19 b       5 y

     a, b, x и y - переменные величины целого типа, значения
     которых вводятся с клавиатуры и должны быть выведены
     вместо имен величин.
 */

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int t;
        int v;
        int x;
        int y;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число");
        t = reader.nextInt();
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Введите второе число");
        v = reader2.nextInt();
        Scanner reader3 = new Scanner(System.in);
        System.out.println("Введите третье число");
        x = reader3.nextInt();
        Scanner reader4 = new Scanner(System.in);
        System.out.println("Введите четвёртое число");
        y = reader4.nextInt();
        System.out.println("а) 5 10      б) 100 " +t+ "     в) " +x+" 25" );
        System.out.println("   7 cm         1949 "+v+"       "+x + " " + y);
    }
}
