package Second;


import Second.RandomArray;
import Second.Present;
import Second.Candy;
import Second.Jellybean;

public class Main {
    public static void main(String[] args) {
        new Main().runTaskOne();
        new Main().runTaskTwo();
    }

    private void runTaskOne() {
        RandomArray array = new RandomArray(20).init();
        array.print();
        System.out.println("Максимально отрицательное значение: " + array.maxNegative());
        System.out.println("Минимально положительное значение: " + array.minPositive());
    }

    private void runTaskTwo() {
        Present present = new Present();
        present.addSweetness(new Candy("Candy", 50, 55.6))
                .addSweetness(new Jellybean("Jellybean", 80, 85, "Синий"))
                .addSweetness(new Jellybean("JellybeanSUPER", 95, 120, "Красный"));

        present.info();

        System.out.println("Вес подарка: " + present.totalWeight());
        System.out.println("Стоимость подарка: " + present.totalPrice());
    }
}
