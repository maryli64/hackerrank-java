package test;

import main.FindActiveUsers;
import org.junit.Assert;
import org.junit.Test;

public class FindActiveUsersTest {

    @Test
    public void testOne(){
        FindActiveUsers findActiveUsers = new FindActiveUsers();
        int[][] logs = new int[][]{new int[]{0,5}, new int[]{1,2}, new int[]{0,2}, new int[]{0,5}, new int[]{1,3}};
        int[] expected=new int[]{0,2,0,0,0};
        int[] actual=findActiveUsers.findingUsersActiveMinutes(logs,5);
        Assert.assertEquals(expected.length,actual.length);
        for(int i=0; i<actual.length; i++){
            Assert.assertEquals(expected[i], actual[i]);
        }
    }


}
