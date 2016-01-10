import java.util.Hashtable;
import java.util.Optional;

/**
 * Created by gUser on 2016-01-06.
 */
public class RomanArabic {

    final private Hashtable<Character, Integer> romanCharsWeight = setRomanCharsWeight();

    private String roman;
    private Integer arabic;

    private RomanArabic(){}

    private Hashtable<Character, Integer> setRomanCharsWeight(){
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

    private Boolean validateRoman(Object roman){
        return roman
                .toString()
                .toLowerCase()
                .chars()
                .mapToObj(operand -> (char)operand)
                .allMatch( character -> romanCharsWeight.containsKey(character));
    }

    private void setRoman(String roman){
        if( roman.isEmpty() ){ throw new NullPointerException(); }
        if( !validateRoman(roman)){ throw new IllegalStateException(); }
        this.roman = roman;
    }

    private String getRoman(){
        return this.roman;
    }

    private int opositeSign(int number){
        return number * -1;
    }

    private void setArabic(String roman) throws IllegalStateException {
        int previous = romanCharsWeight.get(roman.charAt(roman.length()-1));
        int sum = previous;

        int countedInRow = 1;
        int currentSign = 1;
        int fallingTrend = 0;

        for(int i = roman.length()-2; i>=0 ; i--) {

            int current = romanCharsWeight.get(roman.charAt(i));

            countedInRow = (current == previous) ? countedInRow+1 : 1;
            currentSign = ( (current < previous) || (current > previous && currentSign < 0 ) ) ? opositeSign(currentSign):currentSign;
            fallingTrend = ( current < previous )? fallingTrend+1 : 0;

            if(
                ( fallingTrend > 1 ) ||
                ( currentSign < 0 && countedInRow > 1 ) ||
                ( currentSign < 0 && countedInRow == 1 && current*10/previous != 1 && current*10/previous != 2 ) ||
                ( currentSign > 0 && countedInRow > 3 )
            ){
                throw new IllegalStateException();
            }

            sum += current*currentSign;
            previous = current;

        }
        this.arabic = sum;
    }

    public int getArabic(){
        return this.arabic;
    }
}