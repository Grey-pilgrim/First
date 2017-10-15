package Second;

public class Candy extends Sweetness {
    private static final int DEFAULT_CAL = 80;
    private final int calorificValue;   // Каллорийность.

    public Candy(String name, int weight, double price, int calorificValue) {
        super(name, weight, price);
        this.calorificValue = calorificValue;
    }

    public Candy(String name, int weight, double price) {
        this(name, weight, price, DEFAULT_CAL);
    }

    /**
     * Получить каллорийность сладости.
     * @return Каллорийность.
     */
    private int getCalorificValue() {
        return calorificValue;
    }

    @Override
    public String toString() {
        return "Название: " + getName() +
                "; Вес: " + getWeight() +
                "; Цена: " + getPrice() +
                "; Каллорийность: " + getCalorificValue();
    }
}

