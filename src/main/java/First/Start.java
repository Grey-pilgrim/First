package First;

import First.calculator.CalculatorAdamov;

import java.util.Scanner;

public class Start {

    public static void main (String[]args) {
        System.out.println("Выберите операцию:");
        System.out.print("1 - калькулятор\t");
        System.out.println("2 - сравнение множества слов\t");
        Scanner sc = new Scanner(System.in);
        int w;
        w = sc.nextInt();
        switch(w) {
            case 1: {
                CalculatorAdamov.run();
                break;
            }
            case 2: {
                Many.run();
                break;
            }
            default: System.out.println("Недопустимая операция!!!");
                break;
        }
    }
}