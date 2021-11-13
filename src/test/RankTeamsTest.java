package test;

import main.RankTeams;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RankTeamsTest {

    private RankTeams rankTeams;
    @Before
    public void init(){
        rankTeams=new RankTeams();
    }

    @Test
    public void testOne(){
        String[] votes = new String[]{"ABC","ACB","ABC","ACB","ACB"};
        Assert.assertEquals("ACB", rankTeams.rankTeams(votes));
    }

    @Test
    public void testTwo(){
        String[] votes = new String[]{"WXYZ","XYZW"};
        Assert.assertEquals("XWYZ", rankTeams.rankTeams(votes));
    }

}
