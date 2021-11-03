package main;


import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringTest {
    /*
    "abcabcbb"
    "bbbbb"
    "pwwkew"
    ""
     */
    @Test
    public void testOne() {
     //  String test= "abcabcbb".substring(7,8);

        LongestSubstring longestSubstring = new LongestSubstring();
        Assert.assertEquals(3, longestSubstring.lengthOfLongestSubstring("abcabcbb"));
       System.out.println();
    }

    @Test
    public void testTwo() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assert.assertEquals(1, longestSubstring.lengthOfLongestSubstring("bbbbb"));
        System.out.println();
    }

    @Test
    public void testThree() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assert.assertEquals(3, longestSubstring.lengthOfLongestSubstring("pwwkew"));
        System.out.println();
    }

    @Test
    public void testEmpty() {
        LongestSubstring longestSubstring = new LongestSubstring();
        String str="";
        str.substring(8);
        Assert.assertEquals(0, longestSubstring.lengthOfLongestSubstring(""));
        System.out.println();
    }
}
