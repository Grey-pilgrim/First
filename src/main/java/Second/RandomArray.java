package Second;

import java.util.Arrays;
import java.util.Random;

/**
 * Случайный массив.
 */
public class RandomArray {
    private final static int DEFAULT_RANGE_FROM = -10;
    private final static int DEFAULT_RANGE_UP_TO = 10;
    private final int[] array;
    private final Random random;
    private final int rangeFrom;    // Диапазон от
    private final int rangeUpTo;    // Диапазон до

    /**
     * Конструктор по умолчанию.
     */
    public RandomArray(int size) {
        this(size, DEFAULT_RANGE_FROM, DEFAULT_RANGE_UP_TO);
    }

    /**
     * Конструктор с диапазоном значений.
     * @param rangeFrom диапазон от.
     * @param rangeUpTo диапазон до.
     */
    public RandomArray(int size, int rangeFrom, int rangeUpTo) {
        this.random = new Random(System.currentTimeMillis());
        this.rangeFrom = rangeFrom;
        this.rangeUpTo = rangeUpTo;
        this.array = new int[size];
    }

    /**
     * Инициализация массива случайными значениями.
     * @return массив случайных значений.
     */
    public RandomArray init() {
        for (int i = 0; i < array.length; i++) {
            array[i] = rangeFrom + random.nextInt(rangeUpTo - rangeFrom + 1);
        }
        return this;
    }

    /**
     * Печать массива.
     */
    public void print() {
        System.out.println(Arrays.toString(array));
    }

    /**
     * Получить максимально отрицательный элемент.
     * @return Максимально отрицательный элемент массива.
     */
    public int maxNegative() {
        int max = 0;
        for (int item : array) {
            if (item < 0 && item < max) {
                max = item;
            }
        }
        return max;
    }

    /**
     * Получить минимально положительный элемент.
     * @return Минимально положительный элемент.
     */
    public int minPositive() {
        int min = rangeUpTo;
        for (int item : array) {
            if (item > 0 && item < min) {
                min = item;
            }
        }
        return min;
    }
}
