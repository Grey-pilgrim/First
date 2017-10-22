

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
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите слова через пробел");
        String str=sc.nextLine();
        str=str+"";
        int len=str.length();
        String k="",max="";

        char ch;
        int p,max1=0;

        for (int i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if ( ch!=' ')
            {
                k=k+ch;
            }
            else {
                p=k.length();
                if (p>max1) {
                    max1=p;
                    max=k;
                }
                k="";
            }

        }
        System.out.println("Самое длинное словл это "+max+"\n Длина слова "+max1);
    }


}