/**
 * Console Calculator
 *
 * @author Ivan Adamov
 *
 */
package First;

import java.util.Scanner;

public class CalculatorAdamov2 {


    public static void main(String[]args){

        //  Создаем экземпляр класса MyOpFactory
        MyOpFactory First = new MyOpFactory();
        //  Создаем экземпляр класса Calculator
        //  с аргументом в виде объекта MyOpFactory
        //  Создаем калькулятор
        Calculator calc = new Calculator(First);
        //  Выполняем метод exec для объекта Calculator
        //  Запускаем калькулятор
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
//  Операция суммирования
class OpPlus implements Operation{
        public double exec(double valueOne, double valueTwo ) {
        return (valueOne + valueTwo );
    }
}
//  Операция вычитания
class OpMinus implements Operation{
        public double exec(double valueOne, double valueTwo ) {
        return (valueOne - valueTwo );
    }
}
//  Операция умножения
class OpMultiply implements Operation{
        public double exec(double valueOne, double valueTwo ) {
        return (valueOne * valueTwo );
    }
}
//  Операция деления
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
    Operation getOpInstance(int op);
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
            case 1:{
                operation = new OpPlus();
                break;
            }
            case 2:{
                operation = new OpMinus();
                break;
            }
            case 3:{
                operation = new OpMultiply();
                break;
            }
            case 4:{
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

class Chose {
    public void Chose (int w){
        System.out.println("Выберите операцию:");
        System.out.print("1 - калькулятор\t");
        System.out.print("2 - сравнение множества слов\t");
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        switch (w) {
            case 1:

                break;

            case 2:

                break;

            default: System.out.println("Недопустимая операция!!!");
            break;

        }
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

class Start {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String str = "",max = "";
        while (in.hasNextLine()){
            str += " " + in.nextLine();
        }
        String[] strL = new String[90000]; //массив слов
        for (int i = 0; i<strL.length; i++) {
            strL[i] = "";
        }
        for (int i=0,k=0;i<str.length(); i++){
            int chr = str.charAt(i); //номер символа
            if ((chr > 47 && chr < 58) || (chr > 64 && chr < 91 ) || (chr > 96 && chr < 123) || (chr == 95)){
                strL[k] = strL[k]+str.charAt(i); // проверяю, находится ли символ, разделяющий слова, если нет, прибавляю символ к слову, иначе, перехожу к следующему
            }
            else {k++;}
        }
        for (String aStrL : strL) {        //нахожу наибольшее слово
            if (aStrL.length() > max.length()) {
                max = aStrL;
            }
        }
        System.out.println(max);
    }
}