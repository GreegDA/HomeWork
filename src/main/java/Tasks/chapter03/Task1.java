package Tasks.chapter03;
/*
Дано расстояние в сантиметрах. Найти число полных метров в нем.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int x;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите расстояние в сантиметрах");
        x = reader.nextInt();
        System.out.println(x / 100 + " m");
    }
}
