package Tasks.chapter01;
/*
 Составить програму вывода на экран числа, вводимого
  с клавиатуры. Выводимому числу должно предшествовать сообще-
  ние <<Вы ввели число >>.
 */

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        int a;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число");
        a = reader.nextInt();
        System.out.println("Вы ввели число " + a);
    }
}
