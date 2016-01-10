import org.testng.annotations.Test;

/**
 * Created by gUser on 2016-01-06.
 */
public class RomanArabicNegativeTest {

    /*
        Negative test cases:

        Empty String - NullPointerException
        MIIII - IllegalStateException
        MCCM - IllegalStateException
        IIII - IllegalStateException
        CCM - IllegalStateException
        MLMCMX - IllegalStateException
        LMCMXM - IllegalStateException
        XM - IllegalStateException
        KAROL - IllegalStateException
        IXCM - IllegalStateException
        ICXM - IllegalStateException

     */

    @Test( expectedExceptions = NullPointerException.class )
    public void expectedNullPointerExceptionTest(){
        RomanArabic romanArabic = new RomanArabic("");
        romanArabic.getArabic();
    }

    @Test( expectedExceptions = IllegalStateException.class )
    public void expectedException_MIIII_Test(){
        RomanArabic romanArabic = new RomanArabic("MIIII");
        romanArabic.getArabic();
    }

    @Test( expectedExceptions = IllegalStateException.class )
    public void expectedException_MCCM_Test(){
        RomanArabic romanArabic = new RomanArabic("MCCM");
        romanArabic.getArabic();
    }

    @Test( expectedExceptions = IllegalStateException.class )
    public void expectedException_IIII_Test(){
        RomanArabic romanArabic = new RomanArabic("IIII");
        romanArabic.getArabic();
    }

    @Test( expectedExceptions = IllegalStateException.class )
    public void expectedException_CCM_Test(){
        RomanArabic romanArabic = new RomanArabic("CCM");
        romanArabic.getArabic();
    }

    @Test( expectedExceptions = IllegalStateException.class )
    public void expectedException_MLMCMX_Test(){
        RomanArabic romanArabic = new RomanArabic("MLMCMX");
        romanArabic.getArabic();
    }

    @Test( expectedExceptions = IllegalStateException.class )
    public void expectedException_LMCMXM_Test(){
        RomanArabic romanArabic = new RomanArabic("LMCMXM");
        romanArabic.getArabic();
    }

    @Test( expectedExceptions = IllegalStateException.class )
    public void expectedException_XM_Test(){
        RomanArabic romanArabic = new RomanArabic("XM");
        romanArabic.getArabic();
    }

    @Test( expectedExceptions = IllegalStateException.class )
    public void expectedException_KAROL_Test(){
        RomanArabic romanArabic = new RomanArabic("KAROL");
        romanArabic.getArabic();
    }

    @Test( expectedExceptions = IllegalStateException.class )
    public void expectedException_IXCM_Test(){
        RomanArabic romanArabic = new RomanArabic("IXCM");
        romanArabic.getArabic();
    }

    @Test( expectedExceptions = IllegalStateException.class )
    public void expectedException_ICXM_Test(){
        RomanArabic romanArabic = new RomanArabic("ICXM");
        romanArabic.getArabic();
    }

}
