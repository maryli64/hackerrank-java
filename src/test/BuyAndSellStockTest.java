package test;

import main.BuyAndSellStock;
import org.junit.Assert;
import org.junit.Test;

public class BuyAndSellStockTest {

    @Test
    public void testOne(){
        BuyAndSellStock buyAndSellStock = new BuyAndSellStock();
        buyAndSellStock.maxProfit(new int[]{});
        Assert.assertEquals(5, buyAndSellStock.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
