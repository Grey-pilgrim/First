package Second;
import java.util.Random;

/**
 * Сладость.
 */
public class Sweetness {
    private final static int MIN_WEIGHT = 28;
    private final static int MAX_WEIGHT = 32;
    private final static int MIN_PRICE = 30;
    private final static int MAX_PRICE = 40;

    private final String name;
    private final int weight;
    private final double price;

    Sweetness(String name) {
        this.name = name;
        this.weight = MIN_WEIGHT + (new Random(System.currentTimeMillis()).nextInt(MAX_WEIGHT - MIN_WEIGHT + 1));
        this.price = MIN_PRICE + (new Random(System.currentTimeMillis()).nextInt(MAX_PRICE - MIN_PRICE + 1));
    }

    String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
}
