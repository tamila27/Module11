package com.goit.gojavaonline;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class DistanceCalculatorTest {

    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double expectedDistance;

    public DistanceCalculatorTest(double x1, double x2, double y1, double y2, double expectedDistance){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.expectedDistance = expectedDistance;
    }

    @Parameterized.Parameters(name = "DistanceBetween2Points x1 = {0}, y1 = {2}, x2 = {1}, y2 = {3} => expectedDistance = {4}")
    public static Iterable<Object[]> getParametrizedData(){
        return Arrays.asList(new Object[][]{
                {1, 1, 5, 5, 0},
                {1, 3, 1, 4, 3.605551275463989}
        });
    }

    @Test
    public void testCalculateDistanceBetween2Points() throws Exception {
        Assert.assertEquals(expectedDistance, DistanceCalculator.calculateDistanceBetween2Points(x1, x2, y1, y2), 0.0f);
    }
}