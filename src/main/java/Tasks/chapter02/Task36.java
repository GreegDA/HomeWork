package Tasks.chapter02;
/*
Известно значение темпертуры по шкале Цельсия. Най-
ти соотствующее значение температуры по шкале:
    a)Фаренгейта.
    б)Кельвина.
Для пересчета по шкале Фаренгейта необходимо исходное значение
температуры умножить на 1,8 и к результату прибавить 32, а по
шкале Кельвина абсолютное значение нуля соотвецтвует -273,15
градуса по шкале Цельсия.
 */

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        int x;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите температуру");
        x = reader.nextInt();
        double a= x + 273.15;
        double b= (x * 9/5) + 32;
        System.out.println(a);
        System.out.println(b);
    }
}
