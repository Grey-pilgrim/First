/**
 * Calculator for adding fractions
 *
 * @author Ivan Adamov
 *
 */
package First;

import java.util.Scanner;

public class CalculatorAdamov
{


    public static void main(String[] args)
    {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два дробных числа"); //Системное сообщение
        System.out.println("Введите первое число");//Системное сообщение
        a = sc.nextDouble();
        System.out.println("Введите второе число");//Системное сообщение
        b = sc.nextDouble();
        c = a + b;
        System.out.printf ("Сумма ваших чисел равна " + "%-8.4f", c); //Системное сообщение

        }
}
