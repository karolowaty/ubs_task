import org.testng.annotations.Test;

/**
 * Created by gUser on 2016-01-06.
 */
public class RomanArabicNegativeTest {

    /*
        Negative test cases:

        Empty String - NullPointerException
        IIII - Exception
        CCM - Exception

     */

    @Test( expectedExceptions = NullPointerException.class )
    public void expectedNullPointerExceptionTest(){
        RomanArabic romanArabic = new RomanArabic("");
        romanArabic.getArabic();
    }

    @Test( expectedExceptions = Exception.class )
    public void expectedException_IIII_Test(){
        RomanArabic romanArabic = new RomanArabic("IIII");
        romanArabic.getArabic();
    }

    @Test( expectedExceptions = NullPointerException.class )
    public void expectedException_CCM_Test(){
        RomanArabic romanArabic = new RomanArabic("CCM");
        romanArabic.getArabic();
    }
}
