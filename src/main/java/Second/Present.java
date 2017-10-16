package Second;

import Second.Sweetness;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Подарок.
 */
public class Present {
    private final List<Sweetness> possibleSweets;   // Возможные сладости.
    private final List<Sweetness> sweetStuff;       // Сформированный список сладостей.
    private final Random random;
    private final int capacity;

    /**
     * Конструктор по умолчанию.
     */
    public Present(int capacity) {
        this.capacity = capacity;
        this.possibleSweets = new ArrayList<>();
        this.sweetStuff = new ArrayList<>(capacity);
        this.random = new Random(System.currentTimeMillis());
    }

    /**
     * Добавить возможную сладость.
     * @return Подарок.
     */
    public Present addPossibleSweets(Sweetness sweetness) {
        this.possibleSweets.add(sweetness);
        return this;
    }

    /**
     * Получить общий вес подарка.
     * @return Общий вес.
     */
    public int totalWeight() {
        int weight = 0;

        // Проходим по списку сладостей и суммируем их вес в переменную аккумулятор weight.
        for (Sweetness sweetness : sweetStuff) {
            weight += sweetness.getWeight();
        }
        return weight;
    }

    /**
     * Получить стоимость подарка.
     * @return Общая стоимость.
     */
    public double totalPrice() {
        double price = 0;

        for (Sweetness sweetness : sweetStuff) {
            price += sweetness.getPrice();
        }
        return price;
    }

    /**
     * Информация о сладостях.
     */
    public void info() {
        for (Sweetness sweetness : sweetStuff) {
            System.out.println(sweetness.toString());
        }
    }

    /**
     * Инициализация подарка (заполнение сладостями)
     * @return Подарок.
     */
    public Present init() {
        for (int i = 0; i < capacity; i++) {
            sweetStuff.add(possibleSweets.get(random.nextInt(possibleSweets.size())));
        }
        return this;
    }
}
