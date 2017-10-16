

/**
 * Calculator for adding fractions
 *
 * @author Ivan Adamov
 *
 */
package First;
import java.util.Scanner;
public class Many {
    public static void run() {
        System.out.println("Введите несколько слов различной длины");
        Scanner in = new Scanner(System.in);
        final char underLine = '_';
        final char nextLine = '\n';
        String line, max = "";
        int start = 0;
        while (in.hasNextLine()){
            line = in.nextLine();
            for (int i=0; i<line.length(); i++){
                int chr = line.charAt(i); //номер символа
                if ((chr > 47 && chr < 58) || (chr > 64 && chr < 91 ) || (chr > 96 && chr < 123) || (chr == 95)){
                } else {
                    if ( i - start > max.length() ) {
                        max = line.substring( start, i );
                    }
                    start = i+1;
                }
            }
            start = 0;
        }
        System.out.println("Самое длинное слово" + max);
    }
}