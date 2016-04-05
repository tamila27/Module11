package com.goit.gojavaonline;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ShapeAreaCalculatorTriangleTest {
    //private static ShapeAreaCalculator shapeAreaCalculator;

    private int aSide;
    private int bSide;
    private int cSide;
    private double expectedTriangleArea;

    public ShapeAreaCalculatorTriangleTest(int aSide, int bSide, int cSide, double expectedTriangleArea){
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
        this.expectedTriangleArea = expectedTriangleArea;
    }

    /*@BeforeClass
    public static void setUpClass() throws Exception{
        shapeAreaCalculator = new ShapeAreaCalculator();
    }*/


    @Parameterized.Parameters(name = "Triangle : aSide = {0}, bSide = {1}, cSide = {2} => area = {3}")
    public static Iterable<Object[]> getParametrizedData(){
        return Arrays.asList(new Object[][]{
                {1, 2, 3, 0},
                {1, 1, 1, 0.4330127018922193}
        } );
    }

    @Test(timeout = 1000)
    public void testCalculateTriangleArea() throws Exception {
        Assert.assertEquals(expectedTriangleArea, ShapeAreaCalculator.calculateTriangleArea(aSide, bSide, cSide), 0.0f);
    }
}