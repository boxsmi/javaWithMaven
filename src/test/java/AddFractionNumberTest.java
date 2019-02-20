/* Created by Aleksandr 
                       Smirnov
                                */

import org.junit.Assert;
import org.junit.Test;

public class AddFractionNumberTest extends Assert {
    @Test
    public void addFractionNumber1() {
        FractionNumbersImpls num1 = new FractionNumbersImpls();
        num1.setDividend(-3);
        num1.setDivisor(-5);

        FractionNumbersImpls num2 = new FractionNumbersImpls();
        num2.setDividend(-3);
        num2.setDivisor(-7);

        FractionNumbersImpls result = new FractionNumbersImpls();
        result.setDividend(-36);
        result.setDivisor(-35);

        FractionNumbersOperationImpls utils = new FractionNumbersOperationImpls();
        FractionNumber resultFact = utils.add(num1,num2);

        assertEquals(result,resultFact);
    }

    @Test
    public void addFractionNumber2() {
        FractionNumbersImpls num1 = new FractionNumbersImpls();
        num1.setDividend(-300000);
        num1.setDivisor(5);

        FractionNumbersImpls num2 = new FractionNumbersImpls();
        num2.setDividend(3);
        num2.setDivisor(1733);

        FractionNumbersImpls result = new FractionNumbersImpls();
        result.setDividend(-103979997);
        result.setDivisor(1733);

        FractionNumbersOperationImpls utils = new FractionNumbersOperationImpls();
        FractionNumber resultFact = utils.add(num1,num2);

        assertEquals(result,resultFact);
    }


    @Test(expected = NullPointerException.class)
    public void addFractionNumber3(){
        FractionNumbersOperationImpls utils = new FractionNumbersOperationImpls();
        FractionNumbersImpls num1 = new FractionNumbersImpls();
        utils.add(num1,null);

    }
}
