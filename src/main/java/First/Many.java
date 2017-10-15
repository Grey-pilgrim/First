

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
        Scanner in = new Scanner(System.in);
        String str = "",max = "";
        while (in.hasNextLine()){
            str += " " + in.nextLine();
        }
        String[] strL = new String[10]; //массив слов
        for (int i = 0; i<strL.length; i++) {
            strL[i] = "";
        }
        for (int i=0,k=0;i<str.length(); i++){
            int chr = str.charAt(i); //номер символа
            if ((chr > 47 && chr < 58) || (chr > 64 && chr < 91 ) || (chr > 96 && chr < 123) || (chr == 95)){
                strL[k] = strL[k]+str.charAt(i); // проверяю, находится ли символ, разделяющий слова, если нет, прибавляю символ к слову, иначе, перехожу к следующему
            }
            else {k++;}
        }
        for (String aStrL : strL) {        //нахожу наибольшее слово
            if (aStrL.length() > max.length()) {
                max = aStrL;
            }
        }
        System.out.println(max);
    }
}