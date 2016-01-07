import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by gUser on 2016-01-06.
 */
public class RomanArabicPositiveTest {

    /*

        According to rules we can use only one set of chars from 10^n group, i.e: I - IX - only one symbol will have any sense

        I = 1
        II = 2
        III = 3
        IV = 4
        V = 5
        VI = 6
        VII = 7
        VIII = 8
        IX = 9

        Positive test cases:

        I = 1
        V = 5
        X = 10
        V = 50
        C = 100
        D = 500
        M = 1000

        III = 3
        IV = 4 = -1 + 5
        VI = 6 = 5 + 1
        IX = 9 = -1 + 10
        XI = 11 = 10 + 1
        XIII = 13
        XIV = 14
        XVI = 16
        XIX = 19
        XX = 20
        XXI = 21
        MDLV = 1555
        MCMXCIX = 1999
        MMCXI = 2111

     */

    @Test
    public void checkValidRoman_I_Test(){
        RomanArabic romanArabic = new RomanArabic("I");
        Assert.assertEquals( romanArabic.getArabic(), 1 );
    }

    @Test
    public void checkValidRoman_V_Test(){
        RomanArabic romanArabic = new RomanArabic("V");
        Assert.assertEquals( romanArabic.getArabic(), 5 );
    }

    @Test
    public void checkValidRoman_X_Test(){
        RomanArabic romanArabic = new RomanArabic("X");
        Assert.assertEquals( romanArabic.getArabic(), 10 );
    }

    @Test
    public void checkValidRoman_L_Test(){
        RomanArabic romanArabic = new RomanArabic("L");
        Assert.assertEquals( romanArabic.getArabic(), 50 );
    }

    @Test
    public void checkValidRoman_C_Test(){
        RomanArabic romanArabic = new RomanArabic("C");
        Assert.assertEquals( romanArabic.getArabic(), 100 );
    }

    @Test
    public void checkValidRoman_D_Test(){
        RomanArabic romanArabic = new RomanArabic("D");
        Assert.assertEquals( romanArabic.getArabic(), 500 );
    }

    @Test
    public void checkValidRoman_M_Test(){
        RomanArabic romanArabic = new RomanArabic("M");
        Assert.assertEquals( romanArabic.getArabic(), 1000 );
    }

    @Test
    public void checkValidRoman_III_Test(){
        RomanArabic romanArabic = new RomanArabic("III");
        Assert.assertEquals( romanArabic.getArabic(), 3 );
    }

    @Test
    public void checkValidRoman_IV_Test(){
        RomanArabic romanArabic = new RomanArabic("IV");
        Assert.assertEquals( romanArabic.getArabic(), 4 );
    }

    @Test
    public void checkValidRoman_VI_Test(){
        RomanArabic romanArabic = new RomanArabic("VI");
        Assert.assertEquals( romanArabic.getArabic(), 6 );
    }

    @Test
    public void checkValidRoman_IX_Test(){
        RomanArabic romanArabic = new RomanArabic("IX");
        Assert.assertEquals( romanArabic.getArabic(), 9 );
    }

    @Test
    public void checkValidRoman_XI_Test(){
        RomanArabic romanArabic = new RomanArabic("XI");
        Assert.assertEquals( romanArabic.getArabic(), 11 );
    }

    @Test
    public void checkValidRoman_XIII_Test(){
        RomanArabic romanArabic = new RomanArabic("XIII");
        Assert.assertEquals( romanArabic.getArabic(), 13 );
    }

    @Test
    public void checkValidRoman_XIV_Test(){
        RomanArabic romanArabic = new RomanArabic("XIV");
        Assert.assertEquals( romanArabic.getArabic(), 14 );
    }

    @Test
    public void checkValidRoman_XVI_Test(){
        RomanArabic romanArabic = new RomanArabic("XVI");
        Assert.assertEquals( romanArabic.getArabic(), 16 );
    }

    @Test
    public void checkValidRoman_XIX_Test(){
        RomanArabic romanArabic = new RomanArabic("XIX");
        Assert.assertEquals( romanArabic.getArabic(), 19 );
    }

    @Test
    public void checkValidRoman_XX_Test(){
        RomanArabic romanArabic = new RomanArabic("XX");
        Assert.assertEquals( romanArabic.getArabic(), 20 );
    }

    @Test
    public void checkValidRoman_XXI_Test(){
        RomanArabic romanArabic = new RomanArabic("XXI");
        Assert.assertEquals( romanArabic.getArabic(), 21 );
    }

    @Test
    public void checkValidRoman_MDLV_Test(){
        RomanArabic romanArabic = new RomanArabic("MDLV");
        Assert.assertEquals( romanArabic.getArabic(), 1555 );
    }

    @Test
    public void checkValidRoman_MCMXCIX_Test(){
        RomanArabic romanArabic = new RomanArabic("MCMXCIX");
        Assert.assertEquals( romanArabic.getArabic(), 1999 );
    }

    @Test
    public void checkValidRoman_MMCXI_Test(){
        RomanArabic romanArabic = new RomanArabic("MMCXI");
        Assert.assertEquals( romanArabic.getArabic(), 2111 );
    }
}
