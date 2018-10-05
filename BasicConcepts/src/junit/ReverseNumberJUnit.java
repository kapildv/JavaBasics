package junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class ReverseNumberJUnit {

    int num = 321;
    ReverseNumber reverseNumber;

    @Before
    public void getObject() {
        reverseNumber = new ReverseNumber();
    }


    @Test
    public void testReverseNum() {
        Assert.assertEquals(num, reverseNumber.revers());
    }

}
