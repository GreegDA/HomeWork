package Tasks.chapter03;
/*
В купейном вагоне имеется 9 купе с четырьмя местами
для пассажиров в каждом. Определить номер купе, в котором
 находится место с заданым номером (нумерация мест сквозная,
 начинается с 1).
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int x;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите номер места");
        x = reader.nextInt();
        System.out.println("Оно находится в "+ (x/4 +1)+" купе.");

    }
}
