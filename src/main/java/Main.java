import java.io.Console;
import java.util.Scanner;

/**
 * Created by gUser on 2016-01-06.
 */
public class Main {
    public static void main(String[] args){
        Console c = System.console();
        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }

        RomanArabic romanArabic = new RomanArabic( c.readLine("Enter roman number: ") );
        romanArabic.getArabic();
    }
}
