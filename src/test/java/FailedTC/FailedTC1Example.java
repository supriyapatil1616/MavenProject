package FailedTC;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTC1Example {
    @Test
    public void TC_01(){
        Assert.assertTrue(true);
    }

    @Test
    public void TC_02(){
        Assert.assertTrue(true);

    }
    @Test
    public void TC_03(){

        Assert.assertTrue(true);
    }
    @Test
    public void TC_04(){
        Assert.assertTrue(false);
    }
    @Test
    public void TC_05(){

        Assert.assertTrue(false);
    }

}
