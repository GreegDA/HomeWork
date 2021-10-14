import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        double num1;
        double num2;
        char op;
        char errorOp;
        Scanner reader = new Scanner(System.in);

        System.out.println("Введіть два числа ");
        num1 = reader.nextDouble();
        while (num1 == 0) {
            System.out.println("Введіть ще раз ");
            num1 = reader.nextDouble();
        }
        System.out.println("Й ще одне ");
        num2 = reader.nextDouble();
        while (num2 == 0) {
            System.out.println("Error! Error! Error!");
            System.out.println("Введіть ще раз ");
            num2 = reader.nextDouble();
        }
        System.out.println("Введіть дію: +, -, * або / ");
        op = reader.next().charAt(0);
        if (op == '+') {
//            System.out.printf("%.3f", num1);
//            System.out.printf("%.3f", num2);
            System.out.println(num1 + num2);
        }
        if (op == '*') {
//            System.out.printf("%.3f", num1);
//            System.out.printf("%.3f", num2);
            System.out.println(num1 * num2);
        }
        if (op == '-') {
//            System.out.printf("%.3f", num1);
//            System.out.printf("%.3f", num2);
            System.out.println(num1 - num2);
        }
        if (op == '/') {
//            System.out.printf("%.3f", num1);
//            System.out.printf("%.3f", num2);
            System.out.println(num1 / num2);
        } else {
            System.out.println("Error! Enter +, -, * or / ");
            errorOp = reader.next().charAt(0);

            if (errorOp == '+') {
                System.out.println(num1 + num2);
            }
            if (errorOp == '*') {
                System.out.println(num1 * num2);
            }
            if (errorOp == '-') {
                System.out.println(num1 - num2);
            }
            if (errorOp == '/') {
                System.out.println(num1 / num2);
            } else {
                System.out.println("Error 404! Please restart the program");
            }
        }
    }
}
