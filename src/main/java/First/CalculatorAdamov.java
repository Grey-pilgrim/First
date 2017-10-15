/**
 * Console Calculator
 *
 * @author Ivan Adamov
 *
 */
package First;

import java.util.Scanner;

public class CalculatorAdamov {

    public static void run (String[]args){
        //  Создаем экземпляр класса MyOpFactory
        MyOpFactory myOpFactory = new MyOpFactory();
        //  Создаем экземпляр класса Calculator
        //  с агрументом в виде объекта MyOpFactory
        //  СОЗДАЕТ КАЛЬКУЛЯТОР
        Calculator calc = new Calculator(myOpFactory);
        //  Выполняем метод exec для объекта Calculator
        //  ЗАПУСКАЕМ КАЛЬКУЛЯТОР
        calc.exec();
    }
}
/*
   Интерфейс Operation олицетворяет классы, выполняющие некую операцию над
   двумя аргументами.
 */
interface Operation{
    double exec( double valueOne, double valueTwo );
}
/*
   Создайте реализации интерфейса Operation для операций сложения, вычитания,
   умножения, деления (OpPlus, OpMinus, OpMul, OpDiv соответственно).
 */
//  Операция СУММИРОВАНИЯ
class OpPlus implements Operation{

    public double exec(double valueOne, double valueTwo ) {
        return (valueOne + valueTwo );
    }
}
//  Операция ВЫЧИТАНИЯ
class OpMinus implements Operation{

    public double exec(double valueOne, double valueTwo ) {
        return (valueOne - valueTwo );
    }
}
//  Операция УМНОЖЕНИЯ
class OpMultiply implements Operation{

    public double exec(double valueOne, double valueTwo ) {
        return (valueOne * valueTwo );
    }
}
//  Операция ДЕЛЕНИЯ
class OpDivision implements Operation{

    public double exec(double valueOne, double valueTwo ) {
        return (valueOne / valueTwo );
    }
}
/*
   Интерфейс OperationFactory - это шаблон класса, который
   по коду операции способен создать экземпляр класса, реализующего интерфейс
   Operation и созданного специально для выполнения операции с указанным кодом.
   Если передан некорректный код операции, метод getOpInstance возвращает null.

   Создайте реализацию интерфейса OperationFactory, создающую перечисленные выше
   объекты (MyOpFactory).
 */
interface OperationFactory
{
    Operation getOpInstance( int op );
}
// Фабрика операций
class MyOpFactory implements OperationFactory{

    int operationCode;
    private Operation operation;

    //  Получает код операции, по которому
    //  создает соответствующий объект операции
    public Operation getOpInstance(int op) {
        this.operationCode = op;
        switch (operationCode){
            case '+':{
                operation = new OpPlus();
                break;
            }
            case '-':{
                operation = new OpMinus();
                break;
            }
            case '*':{
                operation = new OpMultiply();
                break;
            }
            case '/':{
                operation = new OpDivision();
                break;
            }
            default:{
                operation = null;
            }
        }
        return operation;
    }
}
/* Создайте класс Calculator, который принимает в качестве аргумента конструктора
   экземпляр класса, реализующего интерфейс OperationFactory. Класс Calculator
   должен содержать метод exec, который обеспечивает цикл ввода оргументов и кода
   операции, выполнение операции путем получения соответствующего объекта через
   OperationFactory и вывод результата.
 */
class Calculator {

    MyOpFactory myOpFactory;

    public Calculator(MyOpFactory myOpFactory){
        this.myOpFactory = myOpFactory;
    }
    //  Обеспечивает цикл ввода аргументов и вида операции
    //  и вывод результата операции
    public void exec(){

        boolean nextStep = true;                //  Условие выхода из цикла
        Scanner in = new Scanner(System.in);    //  Объявление потока ввода
        do {
            //  Ввод превого аргумента
            System.out.println("Введите первый аргумент");
            double arg1 = in.nextDouble();        //  Ввод числа с клавиатуры

            //  Ввод операции
            System.out.println("Выберите операцию:");
            System.out.print("1 - сумма\t");
            System.out.print("2 - разность\t");
            System.out.print("3 - умножение\t");
            System.out.print("4 - деление");
            System.out.println();
            int operation = in.nextInt();

            //  Ввод второго агрумента
            System.out.println("Введите второй аргумент");
            double arg2 = in.nextDouble();

            //  Обработка операций над аргемунтами
            //System.out.print("Результат равен:\t");
            Operation op = myOpFactory.getOpInstance(operation);

            if (op != null)System.out.printf(("%-8.4f"), op.exec(arg1, arg2));
            else System.out.println("Недопустимая операция!!!");

            // Проверка на выход из цикла
            System.out.println("Хотите продолжить?");
            System.out.print("1 - Продолжить\t");
            System.out.println("2 - Выйти");
            int whatDo = in.nextInt();
            if (whatDo == 2) nextStep = false;
        } while (nextStep);
    }
}