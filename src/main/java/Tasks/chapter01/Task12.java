package Tasks.chapter01;
/*
Напишите программу, в которую вводится имя человека и выводется на экран приветствие в виде слова <<Привет>>,
после которого должна стоять запятая, введенное имя и восклецательный знак. После запятой должен стоять пробел,
а перед восклицательным знаком пробела быть не должно.

 */

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        String a;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите cвоё имя");
        a = reader.nextLine();
        System.out.println("Привет, " + a +  "!");
    }
}
