import java.util.Hashtable;
import java.util.Optional;

/**
 * Created by gUser on 2016-01-06.
 */
public class RomanArabic {

    static private Hashtable<Character, Integer> romanCharsWeight = setRomanCharsWeight();

    private String roman;
    private Integer arabic;

    private RomanArabic(){}

    static Hashtable<Character, Integer> setRomanCharsWeight(){
        Hashtable<Character, Integer> romanCharsWeight = new Hashtable<>();
        romanCharsWeight.put('i',1);
        romanCharsWeight.put('x',10);
        romanCharsWeight.put('c',100);
        romanCharsWeight.put('m',1000);
        romanCharsWeight.put('v',5);
        romanCharsWeight.put('l',50);
        romanCharsWeight.put('d',500);
        return romanCharsWeight;
    }

    public RomanArabic(Object object) {

        Optional<Object> optional = Optional.ofNullable(object);

        if( !optional.isPresent() ){ throw new NullPointerException(); }

        String roman = optional.get().toString().toLowerCase();
        setRoman(roman);
        setArabic(roman);
    }

    public Boolean validateRoman(Object roman){
        // very simple validation
        return roman.toString().toLowerCase().matches("(i|x|c|m|v|l|d){1,}");
    }

    private void setRoman(String roman){
        if( roman.isEmpty() ){ throw new NullPointerException(); }
        if( !validateRoman(roman)){ throw new IllegalStateException(); }
        this.roman = roman;
    }

    private String getRoman(){
        return this.roman;
    }

    private void setArabic(String roman) throws IllegalStateException {
        int arabic = 0;
        int previous = 0;
        int countedInRow = 1;

        for(int i = roman.length()-1; i>=0 ; i--) {

            int current = romanCharsWeight.get(roman.charAt(i));
            countedInRow = (current == previous) ? countedInRow+1 : 1;
            if (current <= previous){
                if (countedInRow > 1) throw new IllegalStateException();
                arabic -= current;
            }else {
                if (countedInRow > 3) throw new IllegalStateException();
                arabic += current;
            }
            previous = current;

        }
        this.arabic = arabic;
    }

    public int getArabic(){
        return this.arabic;
    }
}
