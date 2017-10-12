package First;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа");
        System.out.println("Введите первое число");
        a = sc.nextDouble();
        System.out.println("Введите второе число");
        b = sc.nextDouble();
        c = a + b;
        System.out.printf ("Сумма ваших чисел равна " + c,"%-8.4f\n");

        }
}
