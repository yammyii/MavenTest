package com.yammyi.maven;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public void testsay(){
        Demo d =new Demo();
        String ret = d.say("yammyi");
        Assert.assertEquals("hello yammyi",ret);
    }
}
