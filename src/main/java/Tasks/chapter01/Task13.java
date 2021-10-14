package Tasks.chapter01;
/*
Напишите программу, в которую вводится целое число, после чего
на экран выводится  следующее и предыдущее целое число. Например,
при вводе числа 15 на экран должно быть выведено:
       Следующее за числом 15 число - 16.
       Для числа 15 предыдущее число 14.
 */


import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int a;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число");
        a = reader.nextInt();
        System.out.println("Следующее за числом " + a + " число - " + (a + 1));
        System.out.println("Для числа " + a + " предыдущее число - " + (a - 1));
    }
}
