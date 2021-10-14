package Tasks.chapter03;
/*
В подъезде № 1 пятиэтажного жилого дома 15 квартир.
Определить, на каком этаже этого подъезда находится квартира
 с заданым номером.
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int x;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите номер квартиры ");
        x = reader.nextInt();
        System.out.println("Она находится на "+ ((x/3) +1)+" этаже.");

    }
}
