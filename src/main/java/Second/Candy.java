package Second;

public class Candy extends Sweetness {
    private final int calorificValue;   // Калорийность.

    public Candy(String name, int calorificValue) {
        super(name);
        this.calorificValue = calorificValue;
    }

    /**
     * Получить калорийность сладости.
     * @return Калорийность.
     */
    private int getCalorificValue() {
        return calorificValue;
    }

    @Override
    public String toString() {
        return "Название: " + getName() +
                "; Вес: " + getWeight() +
                "; Цена: " + getPrice() +
                "; Калорийность: " + getCalorificValue();
    }
}

