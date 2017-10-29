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

public class Main {

    public static void main (String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(

                new FileInputStream(
                        new File("test.txt"))
        );
        Map<String, Integer> map = new HashMap<>();
        for (; scanner.hasNextLine();) {
            String [] nextLane = scanner.nextLine(). toLowerCase().split("[^a-z]+");
            for (String word: nextLane) {
                map.put(word, (map.containsKey(word) ? map.get(word) + 1 : 1));
                }
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        String word = "";
        int max = 0;
        for (Map.Entry <String, Integer> entry : entrySet) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            word = entry.getKey();
            }
        }
        System.out.println ("Word - " + word + ". Count = " + max);
    }

  }
