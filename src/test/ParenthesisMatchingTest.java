package test;

import main.ParenthesisMatching;
import org.junit.Assert;
import org.junit.Test;

public class ParenthesisMatchingTest {

    @Test
    public void testOne(){
        ParenthesisMatching parenthesisMatching = new ParenthesisMatching();
        Assert.assertTrue(parenthesisMatching.isValid("()"));
    }


}
