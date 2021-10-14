package Tasks.chapter02;
/*
Известна стоимость монитора, системого блока, клавиатуры и мыши.
Сколько будут стоить 3 компьютера из этих элементов? N компьютеров?
 */

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        int f;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите стоимость монитора, системого блока, клавиатуры и мыши.");
        f = reader.nextInt();
        int n;
        Scanner reader1 = new Scanner(System.in);
        System.out.println("Введите n");
        n = reader1.nextInt();
        System.out.println("Cтоимость " + n+ " таких комплектов составляет " + (f*n) +" грн.");
        System.out.println("Cтоимость трех таких комплектов состовляет " + (f*3)+" грн. ");
    }
}
