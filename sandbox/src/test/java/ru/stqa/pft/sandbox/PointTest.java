package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

  public class PointTest {

    @Test
    public void testPoint(){

      Point p=new Point(5,5,10,10);

      Assert.assertEquals(p.distance(),16.583123951777);
    }
}
