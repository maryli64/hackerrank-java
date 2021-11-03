package test;

import main.MajorityElement;
import org.junit.Assert;
import org.junit.Test;

public class MajorityElementTest {

    @Test
    public void testOne() {
        MajorityElement majorityElement = new MajorityElement();
        int[] numsArr = new int[]{6,6,6,7,7,7,7};

        int res = majorityElement.majorityElement(numsArr);
        Assert.assertEquals(7,res);
    }

    @Test
    public void testTwo() {
        MajorityElement majorityElement = new MajorityElement();
        int[] numsArr = new int[]{2,2,2,3};

        int res = majorityElement.majorityElement(numsArr);
        Assert.assertEquals(2,res);
    }

}

