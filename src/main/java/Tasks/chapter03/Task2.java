package Tasks.chapter03;
/*
Дано массу в килограммах. Найти число полных центнеров в нем.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int x;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите массу в килограммах");
        x = reader.nextInt();
        System.out.println(x /100 + " ц");
    }
}
