package Tasks.chapter01;
/*
Составить программу вывода на экран следующей информации:
   a)5 10     b)100 t      c)x 25
     7 см       1949 v       x y

     t, v, x и y - переменные величины целого типа, значения
     которых вводятся с клавиатуры и должны быть выведены
     вместо имен величин.
 */

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int a;
        int b;
        int x;
        int y;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число");
        a = reader.nextInt();
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Введите второе число");
        b = reader2.nextInt();
        Scanner reader3 = new Scanner(System.in);
        System.out.println("Введите третье число");
        x = reader3.nextInt();
        Scanner reader4 = new Scanner(System.in);
        System.out.println("Введите четвёртое число");
        y = reader4.nextInt();
        System.out.println("а) 2 кг      б) " +a+ "1     в) " +x+" "+ y );
        System.out.println("  13 17         19 "+b+"      5 " + y);
    }
}
