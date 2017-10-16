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
        int capacity = 10;     // Количество сладостей / объем подарка
        Present present = new Present(capacity)
                .addPossibleSweets(new Candy("Candy", 50))
                .addPossibleSweets(new Jellybean("Jellybean", "Синий"))
                .addPossibleSweets(new Jellybean("JellybeanSUPER", "Красный")).init();

        present.info();

        System.out.println("Вес подарка: " + present.totalWeight());
        System.out.println("Стоимость подарка: " + present.totalPrice());
    }
}
