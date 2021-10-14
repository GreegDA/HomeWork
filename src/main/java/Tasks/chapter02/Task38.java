package Tasks.chapter02;
/*
Напишите программу, в которой вычисляется сума, разность
произведение, частное и среднее арифметическое двух целых
 чисел, введеных с клавиатуры.
 */

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        double x;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите первое число");
        x = reader.nextDouble();
        double y;
        System.out.println("Введите второе число");
        y = reader.nextDouble();
        double a = x + y;
        double d = x -y;
        double b = x* y;
        while (y==0){
            System.out.println("На ноль делить нельзя, повторите ввод.");
            y = reader.nextDouble();
        }

        double c = x/y;
        double e =(x +y)/2;
        System.out.println(x+"+"+y+"="+a);
        System.out.println(x+"-"+y+"="+d);
        System.out.println(x+"*"+y+"="+b);
        System.out.println(x+"/"+y+"="+c);
          System.out.println("("+x+"+"+y+")/2="+e);
    }
}
