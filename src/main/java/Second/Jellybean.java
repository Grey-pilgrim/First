package Second;


public class Jellybean extends Sweetness {
    private final String packageColor;

    public Jellybean(String name, String packageColor) {
        super(name);
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
