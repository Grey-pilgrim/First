package Second;

/**
 * Сладость.
 */
public class Sweetness {
    private final String name;
    private final int weight;
    private final double price;

    Sweetness(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
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
