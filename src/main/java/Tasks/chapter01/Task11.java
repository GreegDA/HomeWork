package Tasks.chapter01;
/*
Составить программу, которая запрашивает  название
футбольной команды и повторяет его на экране со
словами << - это чемпион!>>
 */

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        String a;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите название футбольной команды");
        a = reader.nextLine();
        System.out.println(a + " - это чемпион!");
    }
}
