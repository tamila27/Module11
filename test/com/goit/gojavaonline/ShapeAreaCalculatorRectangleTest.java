package com.goit.gojavaonline;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ShapeAreaCalculatorRectangleTest {
    //private static ShapeAreaCalculator shapeAreaCalculator;

    private int aSide;
    private int bSide;
    private double expectedArea;

    public ShapeAreaCalculatorRectangleTest(int aSide, int bSide, double expectedArea){
        this.aSide = aSide;
        this.bSide = bSide;
        this.expectedArea = expectedArea;
    }
    /*@BeforeClass
    public static void setUpClass() throws Exception{
        shapeAreaCalculator = new ShapeAreaCalculator();
    }*/


    @Parameterized.Parameters(name = "Rectangle : aSide = {0}, bSide = {1} => area = {2}")
    public static Iterable<Object[]> getParametrizedData(){
        return Arrays.asList(new Object[][]{
                {1, 2, 2},
                {1, 1, 1}
        } );
    }

    @Test
    public void testCalculateRectangleArea() throws Exception {
        Assert.assertEquals(expectedArea, ShapeAreaCalculator.calculateRectangleArea(aSide, bSide), 0.0f);
    }
}