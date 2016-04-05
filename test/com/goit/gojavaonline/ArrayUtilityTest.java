package com.goit.gojavaonline;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayUtilityTest {

    private static int[] array;
    private static int expectedMinValue;
    private static int expectedMaxValue;
    private static int[] expectedSortedArray;

    @BeforeClass
    public static void setUpClass(){
        array = new int[]{7, 4, 2, 7, 6};
        expectedMinValue = 2;
        expectedMaxValue = 7;
        expectedSortedArray = new int[]{2, 4, 6, 7, 7};
    }

    @Test(timeout = 1000)
    public void testGetMinInArray() throws Exception {
        Assert.assertEquals(expectedMinValue, ArrayUtility.getMinInArray(array));
    }

    @Test(timeout = 1000)
    public void testGetMaxInArray() throws Exception {
        Assert.assertEquals(expectedMaxValue, ArrayUtility.getMaxInArray(array));
    }

    @Test(timeout = 1000)
    public void testQuickSort() throws Exception {
        ArrayUtility.quickSort(array, 0, array.length - 1);
        Assert.assertArrayEquals(expectedSortedArray, array);
    }
}