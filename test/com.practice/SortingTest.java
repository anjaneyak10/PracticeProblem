package com.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.practice.Sorting.*;


public class SortingTest {

    @Test
    public void testIsSorted(){

        // Failing test
        int[] emptyArray = {};
        Assertions.assertTrue(isSorted(emptyArray));

        int[] array2 = {1,2};
        Assertions.assertTrue(isSorted(array2));

        // Failing test
        int[] array2Rev = {2,1};
        Assertions.assertTrue(isSorted(array2Rev));

        int[] array3Sorted = {1,2,3};
        Assertions.assertTrue(isSorted(array3Sorted));

        // Failing test
        int[] array3NotSorted = {1,3,2};
        Assertions.assertFalse(isSorted(array3NotSorted));

    }


    @Test
    public void testSort(){
        int[] emptyArray = {};
        Assertions.assertTrue(isSorted(sort(emptyArray)));

        int[] array1 = {1};
        Assertions.assertTrue(isSorted(sort(array1)));

        int[] array2 = {1,2};
        Assertions.assertTrue(isSorted(sort(array2)));

        // Assuming the sort is akways ascending
        int[] array2_ = {2,1};
        Assertions.assertTrue(isSorted(sort(array2)));

        // Some fun testing

        int randomTests = 5;

        int[] randomArrayLengths = TestUtil.createRandomArray(randomTests);

        for (int len : randomArrayLengths){
            Assertions.assertTrue(isSorted(sort(TestUtil.createRandomArray(len))));
        }
    }

//    @Test
//    public void testMergeSort(){
//        int[] emptyArray = {};
//        Assertions.assertTrue(isSorted(mergeSort(emptyArray)));
//
//        int[] array1 = {1};
//        Assertions.assertTrue(isSorted(mergeSort(array1)));
//
//        int[] array2 = {1,2};
//        Assertions.assertTrue(isSorted(mergeSort(array2)));
//
//        // Assuming the sort is akways ascending
//        int[] array2_ = {2,1};
//        Assertions.assertTrue(isSorted(mergeSort(array2)));
//
//        // Some fun testing
//
//        int randomTests = 5;
//
//        int[] randomArrayLengths = TestUtil.createRandomArray(randomTests);
//
//        for (int len : randomArrayLengths){
//            Assertions.assertTrue(isSorted(mergeSort(TestUtil.createRandomArray(len))));
//        }
//    }


}
