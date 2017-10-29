package Third;

import com.sun.javafx.collections.MappingChange;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        InputStream in = System.in;

        File file = new File("test.txt");
        in = new FileInputStream(file);

        Scanner scanner = new Scanner(in);

        Map<String, Integer> stat = new HashMap<>();

        for (; scanner.hasNextLine(); ) {
            String[] nextLine = scanner.nextLine().toLowerCase().split("[^a-zA-Z]+");
            for (String word : nextLine) {
                if (!word.isEmpty()) {
                    stat.put(word, 1 + Optional
                            .ofNullable(stat.get(word))
                            .orElse(0));
                }
            }
        }

        Set<Map.Entry<String, Integer>> entrySet = stat.entrySet();
        TreeSet<Map.Entry<String, Integer>> sorted
                = new TreeSet<>((e1, e2) -> {
            int cmp = e1.getValue().compareTo(e2.getValue());
            return -1 * (cmp == 0 ? e1.getKey().compareTo(e2.getKey()) : cmp);
        });
        sorted.addAll(entrySet);
        sorted.forEach(e -> System.out.println(e.getValue() + "\t" + e.getKey()));

        Scanner s2 = new Scanner(System.in);
        for (; s2.hasNextLine(); ) {
            String line = s2.nextLine();
            System.out.println(line);
        }
    }
}
