import java.io.Console;
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

        while(true) {
            try {
                System.out.println("Enter roman number or enter empty string to leave: ");
                RomanArabic romanArabic = new RomanArabic(c.readLine());
                System.out.println("Arabian: " + romanArabic.getArabic());
            } catch(NullPointerException nullPointerException){
                System.exit(1);
            } catch(IllegalStateException illegalStateException){
                System.out.println("Mismatched syntax for roman value");
            }
        }
    }
}
