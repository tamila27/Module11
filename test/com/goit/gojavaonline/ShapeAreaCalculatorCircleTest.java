package com.goit.gojavaonline;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ShapeAreaCalculatorCircleTest {
    private int radius;
    private double expectedArea;

    public ShapeAreaCalculatorCircleTest(int radius, double expectedArea) {
        this.radius = radius;
        this.expectedArea = expectedArea;
    }

    @Parameterized.Parameters(name = "Circle: radius = {0} => area = {1}")
    public static Iterable<Object[]> getParametrizedData(){
        return Arrays.asList(new Object[][]{
                {1, 3.141592653589793},
                {2, 12.566370614359172}
        });
    }


    @Test(timeout = 1000)
    public void testCalculateCircleArea() throws Exception {
        Assert.assertEquals(expectedArea, ShapeAreaCalculator.calculateCircleArea(radius), 0.0f);
    }
}