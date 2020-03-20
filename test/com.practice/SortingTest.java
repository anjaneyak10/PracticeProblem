package com.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.practice.Sorting.*;


public class SortingTest {

    @Test
    public void testIsSorted() {

        // Failing test
        int[] emptyArray = {};
        Assertions.assertTrue(isSorted(emptyArray));

        int[] array2 = {1, 2};
        Assertions.assertTrue(isSorted(array2));

        // Failing test
        int[] array2Rev = {2, 1};
        Assertions.assertTrue(isSorted(array2Rev));

        int[] array3Sorted = {1, 2, 3};
        Assertions.assertTrue(isSorted(array3Sorted));

        // Failing test
        int[] array3NotSorted = {1, 3, 2};
        Assertions.assertFalse(isSorted(array3NotSorted));

    }

    // This test passes fully good job
    @Test
    public void testSort() {
        int[] emptyArray = {};

        Assertions.assertTrue(Arrays.equals(sort(emptyArray), com.practice.TestUtil.sorted(emptyArray)));


        int[] array1 = {1};
        Assertions.assertTrue(Arrays.equals(sort(array1), TestUtil.sorted(array1)));

        int[] array2 = {1, 2};
        Assertions.assertTrue(Arrays.equals(sort(array2), TestUtil.sorted(array2)));

        // Assuming the sort is akways ascending
        int[] array2_ = {2, 1};
        Assertions.assertTrue(Arrays.equals(sort(array2_), TestUtil.sorted(array2_)));

        // Some fun testing

        int randomTests = 5;

        int[] randomArrayLengths = TestUtil.createRandomArray(randomTests);

        for (int len : randomArrayLengths) {
            int[] arr = TestUtil.createRandomArray(len);
            System.out.println(arr);

            Assertions.assertTrue(isSorted(sort(arr)));
        }
    }

    @Test
    public void testMergeSort() {
        int[] emptyArray = {};
        Assertions.assertTrue(isSorted(mergeSort(emptyArray)));
//
        int[] array1 = {1};
        Assertions.assertTrue(isSorted(mergeSort(array1)));

        int[] array2 = {1, 2};
        Assertions.assertTrue(isSorted(mergeSort(array2)));

        //Assuming the sort is akways ascending
        int[] array2_ = {2, 1, 5, 6, 7, 4, 3, 5, 7};
        Assertions.assertTrue(isSorted(mergeSort(array2_)));

        // Some fun testing

        int randomTests = 5;
        int[] randomArrayLengths = TestUtil.createRandomArray(randomTests);
        for (int len : randomArrayLengths) {
            int[] randomArray = TestUtil.createRandomArray(len);
            for (int i = 0; i < randomArray.length; i++)
                System.out.println(randomArray[i]);
            Assertions.assertTrue(isSorted(mergeSort(randomArray)));
        }
    }
    @Test
    public void testquicksort() {
        int[] emptyArray = {};
        Assertions.assertTrue(isSorted(quicksort(emptyArray)));
//
        int[] array1 = {1};
        Assertions.assertTrue(isSorted(quicksort(array1)));

        int[] array2 = {1, 2};
        Assertions.assertTrue(isSorted(quicksort(array2)));

        //Assuming the sort is akways ascending
        int[] array2_ = {2, 1, 5, 6, 7, 4, 3, 5,7 };
        Assertions.assertTrue(isSorted(quicksort(array2_)));

        // Some fun testing
        System.out.println();
        System.out.println();
        int randomTests = 5;
        int[] randomArrayLengths = TestUtil.createRandomArray(randomTests);
        for (int len : randomArrayLengths) {
            int[] randomArray = TestUtil.createRandomArray(len);
            for (int i = 0; i < randomArray.length; i++)
                System.out.println(randomArray[i]);
            System.out.println();

            Assertions.assertTrue(isSorted(quicksort(randomArray)));
        }
    }
    @Test
    public void testBinarySearch() {
        int randomTests = 2;
        int[] randomArrayLengths = TestUtil.createRandomArray(randomTests);
        int[] searchIn = TestUtil.createRandomArray(randomArrayLengths[0]);
        int searchWhat = searchIn[TestUtil.getRandomInt(randomArrayLengths[0])];
        //Arrays.stream(searchIn).forEach(x -> System.out.print(x +" ,"));
        Assertions.assertTrue(SearchAlgos.binarySearch(searchIn, searchWhat));
        int searchWhat1 = TestUtil.getRandomInt(randomArrayLengths[0], searchIn);
        Assertions.assertFalse(SearchAlgos.binarySearch(searchIn, searchWhat1));
    }

}
