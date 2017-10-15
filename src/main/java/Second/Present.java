package Second;

import Second.Sweetness;

import java.util.ArrayList;
import java.util.List;

/**
 * Подарок.
 */
public class Present {
    private final List<Sweetness> sweetStuff;   // Сладости.

    /**
     * Конструктор по умолчанию.
     */
    public Present() {
        this.sweetStuff = new ArrayList<>();
    }

    /**
     * Добавить сладость.
     * @return Подарок.
     */
    public Present addSweetness(Sweetness sweetness) {
        this.sweetStuff.add(sweetness);
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
}
