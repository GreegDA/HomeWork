package Tasks.chapter01;
/*
Составить программу выводана экран числа, вводимого
с клавиатуры.  После выводимого числа должно следовать сообщение
<<- вот какое число Вы ввели>>
 */

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        int a;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число");
        a = reader.nextInt();
        System.out.println(a + " - вот какое число Вы ввели");
    }
}
