package com.goit.gojavaonline;

public class ArrayUtility {
    public static int getMinInArray(int[] array){
        int min = 0;
        if(array != null){
            min = array[0];
            for(int i = 0; i < array.length; i++){
                if(array[i] < min){
                    min = array[i];
                }
            }
        }
        return min;
    }

    public static int getMaxInArray(int[] array){
        int max = 0;
        if(array != null){
            max = array[0];
            for(int i = 0; i < array.length; i++ ){
                if(array[i] > max){
                    max = array[i];
                }
            }
        }
        return max;
    }

    public static void quickSort(int[] array, int minIndex, int maxIndex) {
        int i = minIndex;
        int j = maxIndex;

        int middleElement = array[(minIndex + maxIndex)/2];

        do {
            while (array[i] < middleElement) {
                i++;
            }
            while (middleElement < array[j]) {
                j--;
            }
            if ( i <= j ) {
                if( i < j ) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
                i++;
                j--;
            }
        } while (i <= j);

        if (minIndex < j) {
            quickSort(array, minIndex, j);
        }
        if (i < maxIndex) {
            quickSort(array, i, maxIndex);
        }
    }
}
