package test;

import main.GreatestCommonDivisor;
import org.junit.Assert;
import org.junit.Test;

public class GreatestCommonDivisorTest {

    @Test
    public void TestOne(){
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();
        String result=gcd.gcdOfStrings("ABCABC", "ABC");
        Assert.assertEquals("ABC", result);
    }

    @Test
    public void TestTwo(){
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();
        String result=gcd.gcdOfStrings("LEET", "CODE");
        Assert.assertEquals("", result);
    }
}
