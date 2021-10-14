package Tasks.chapter03;
/*

 */

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int n;
        int d;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите первую  часть двухзначного числа ");
        n =reader.nextInt();
        System.out.println("Введите вторую часть двухзначного числа ");
        d =reader.nextInt();
        int a = n+d;
        System.out.println(a);

    }
}
