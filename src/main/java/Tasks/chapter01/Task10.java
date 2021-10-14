package Tasks.chapter01;
/*
Cоставить программу, которая запрашивает имя человека
и повтаряет его на экране.
 */

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        String a;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите cвоё имя");
        a = reader.nextLine();
        System.out.println(a);
    }
}
