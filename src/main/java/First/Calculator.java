/**
 * Calculator for adding fractions
 *
 * @author Ivan Adamov
 *
 */
package First;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два дробных числа");
        System.out.println("Введите первое число");
        a = sc.nextDouble();
        System.out.println("Введите второе число");
        b = sc.nextDouble();
        c = a + b;
        System.out.printf ("Сумма ваших чисел равна " + "%-8.4f", c);

        }
}
