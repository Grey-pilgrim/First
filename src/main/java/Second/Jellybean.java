package Second;

public class Jellybean extends Sweetness {
    private final String packageColor;

    public Jellybean(String name, int weight, double price, String packageColor) {
        super(name, weight, price);
        this.packageColor = packageColor;
    }

    public String getPackageColor() {
        return packageColor;
    }

    @Override
    public String toString() {
        return "Название: " + getName() +
                "; Вес: " + getWeight() +
                "; Цена: " + getPrice() +
                "; Цвет упаковки: " + getPackageColor();
    }
}
