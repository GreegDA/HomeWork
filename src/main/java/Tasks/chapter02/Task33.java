package Tasks.chapter02;
/*
Возраст Тани - Х лет, а возраст Мити - У. Найти их средний возраст,
а также определить, на сколько отличается возраст  кождого ребенка от среднего возраста.
 */
import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        int x;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите возраст Тани");
        x = reader.nextInt();
        int y;
        System.out.println("Введите возраст Мити");
        y = reader.nextInt();
        System.out.println("Средний возраст Тани и Мити " + (x + y) / 2);
        System.out.println("Разница между Таниным возрастом и средним " + (x - (x + y) / 2));
        System.out.println("Разница между Митиным возрастом и средним " + (y - (x + y) / 2));
    }
}
