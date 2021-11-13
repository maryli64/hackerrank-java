package test;

import main.ArrangeCoins;
import org.junit.Assert;
import org.junit.Test;

public class ArrangeCoinsTest {
    @Test
    public void TestOne(){
        ArrangeCoins arrangeCoins = new ArrangeCoins();

        Assert.assertEquals(65535, arrangeCoins.arrangeCoins(2147483647));
    }
}
