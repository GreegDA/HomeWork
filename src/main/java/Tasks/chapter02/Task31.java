package Tasks.chapter02;
/*
Известна стоимость 1 кг  конфет, печенья и яблок. Найти
стоимость всей покупки, если купили х кг конфет, у кг печенья
и z кг яблок
 */

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите сумму за 1 кг  конфет, печенья и яблок");
        System.out.println("Введите количество кг конфет");
        int x = reader.nextInt();
        System.out.println("Введите количество кг печенья");
        int y = reader.nextInt();
        System.out.println("Введите количество кг яблок");
        int z = reader.nextInt();
        System.out.println(x + y + z + " грн");
    }
}
