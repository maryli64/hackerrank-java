package main;

import org.junit.Assert;
import org.junit.Test;

public class LemonadeChangeTest {
    /**
     * input [5,5,5,10,20]
     */
    @Test
    public void testOne(){
        LemonadeChange lemonadeChange = new LemonadeChange();
        int[] arr = new int[]{5,5,5,10,20};
        Assert.assertEquals(true, lemonadeChange.lemonadeChange(arr));
    }

    /**
     * [5,5,10,10,20]
     */
    @Test
    public void testTwo(){
        LemonadeChange lemonadeChange = new LemonadeChange();
        int[] arr = new int[]{5,5,10,10,20};
        Assert.assertEquals(false, lemonadeChange.lemonadeChange(arr));
    }

    /**
     * [5,5,10]
     */
    @Test
    public void testThree(){
        LemonadeChange lemonadeChange = new LemonadeChange();
        int[] arr = new int[]{5,5,10};
        Assert.assertEquals(true, lemonadeChange.lemonadeChange(arr));
    }

    /**
     * [10,10]
     */
    @Test
    public void testFour(){
        LemonadeChange lemonadeChange = new LemonadeChange();
        int[] arr = new int[]{10,10};
        Assert.assertEquals(false, lemonadeChange.lemonadeChange(arr));
    }
}
