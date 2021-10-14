package Tasks.chapter01;
/*
Число ПИ примерно равно 3.1415926. Вывести на экран это число с тремя цифрами в дробной части.
Текст '3.142' не использавать.
 */

public class Task06 {
    public static void main(String[] args) {
        double a = Math.PI;
        System.out.printf("%6.3f", a);
        System.out.println();
        System.out.printf("%.3f", a);
    }
}
